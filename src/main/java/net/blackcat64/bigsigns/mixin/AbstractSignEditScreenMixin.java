package net.blackcat64.bigsigns.mixin;

import net.blackcat64.bigsigns.block.entity.OneLineHangingSignBlockEntity;
import net.blackcat64.bigsigns.block.entity.OneLineSignBlockEntity;
import net.minecraft.client.gui.GuiGraphics;
import net.minecraft.client.gui.font.TextFieldHelper;
import net.minecraft.client.gui.screens.inventory.AbstractSignEditScreen;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.network.chat.Component;
import net.minecraft.world.level.block.entity.SignBlockEntity;
import org.checkerframework.checker.units.qual.A;
import org.joml.Vector3f;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;
import org.spongepowered.asm.mixin.injection.callback.LocalCapture;

@Mixin(AbstractSignEditScreen.class)
public class AbstractSignEditScreenMixin {
    @Shadow private int line;

    @Shadow @Final private SignBlockEntity sign;

    @Inject(method = "<init>(Lnet/minecraft/world/level/block/entity/SignBlockEntity;ZZLnet/minecraft/network/chat/Component;)V", at = @At("TAIL"))
    private void injectConstructor(SignBlockEntity pSign, boolean pIsFrontText, boolean pIsFiltered, Component pTitle, CallbackInfo info) {
        if (sign instanceof OneLineSignBlockEntity || sign instanceof OneLineHangingSignBlockEntity)
            this.line = 1;
    }

    @Inject(method = "init", at = @At("HEAD"))
    private void injectInit(CallbackInfo info) {
        if (sign instanceof OneLineSignBlockEntity || sign instanceof OneLineHangingSignBlockEntity)
            this.line = 1;
    }

    @Inject(method = "keyPressed", at = @At("HEAD"), cancellable = true)
    private void injectOnKeyPress(int pKeyCode, int pScanCode, int pModifiers, CallbackInfoReturnable<Boolean> info) {
        if (sign instanceof OneLineSignBlockEntity || sign instanceof OneLineHangingSignBlockEntity) {
            this.line = 1;
            if (pKeyCode != 265 && pKeyCode != 264 && pKeyCode != 257 && pKeyCode != 335) // If the key pressed is NOT Up arrow, down arrow or Enter, handle it normally
                return;

            info.setReturnValue(true);
            info.cancel();
        }
    }

    private final int ONE_LINE_SIGN_CURSOR_HEIGHT = 8;

    @Inject(method = "renderSignText",
            at = @At(value = "INVOKE",
                     target = "Lnet/minecraft/client/gui/GuiGraphics;fill(IIIII)V", ordinal = 0),
            locals = LocalCapture.CAPTURE_FAILSOFT
            )
    private void injectTextCursor(GuiGraphics pGuiGraphics, CallbackInfo ci, Vector3f vector3f, int i, boolean flag, int j, int k, int l, int i1, int k3, String s1, int l3, int i4) {
        if (sign instanceof OneLineSignBlockEntity || sign instanceof OneLineHangingSignBlockEntity) {
            this.line = 1;
            pGuiGraphics.fill(i4, i1 - 1, i4 + 1, i1 + ONE_LINE_SIGN_CURSOR_HEIGHT, -16777216 | i);
        }
    }

    @Inject(method = "renderSignText",
            at = @At(value = "INVOKE",
                    target = "Lnet/minecraft/client/gui/GuiGraphics;fill(Lnet/minecraft/client/renderer/RenderType;IIIII)V", ordinal = 0),
            locals = LocalCapture.CAPTURE_FAILSOFT
    )
    private void injectTextHighlight(GuiGraphics pGuiGraphics, CallbackInfo ci, Vector3f vector3f, int i, boolean flag, int j, int k, int l, int i1, int k3, String s1, int l3, int i4, int j4, int j2, int k2, int l2, int i3, int j3) {
        if (sign instanceof OneLineSignBlockEntity || sign instanceof OneLineHangingSignBlockEntity) {
            this.line = 1;
            pGuiGraphics.fill(RenderType.guiTextHighlight(), i3, i1, j3, i1 + ONE_LINE_SIGN_CURSOR_HEIGHT, -16776961);
        }
    }

}
