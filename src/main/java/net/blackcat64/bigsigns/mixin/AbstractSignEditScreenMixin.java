package net.blackcat64.bigsigns.mixin;

import net.blackcat64.bigsigns.block.entity.OneLineSignBlockEntity;
import net.minecraft.client.gui.screens.inventory.AbstractSignEditScreen;
import net.minecraft.network.chat.Component;
import net.minecraft.world.level.block.entity.SignBlockEntity;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(AbstractSignEditScreen.class)
public class AbstractSignEditScreenMixin {
    @Shadow private int line;

    @Shadow @Final private SignBlockEntity sign;

    @Inject(method = "<init>(Lnet/minecraft/world/level/block/entity/SignBlockEntity;ZZLnet/minecraft/network/chat/Component;)V", at = @At("TAIL"))
    private void injectConstructor(SignBlockEntity pSign, boolean pIsFrontText, boolean pIsFiltered, Component pTitle, CallbackInfo info) {
        if (sign instanceof OneLineSignBlockEntity)
            this.line = 1;
    }

    @Inject(method = "keyPressed", at = @At("HEAD"), cancellable = true)
    private void injectOnKeyPress(int pKeyCode, int pScanCode, int pModifiers, CallbackInfoReturnable<Boolean> info) {
        if (sign instanceof OneLineSignBlockEntity) {
            this.line = 1;
            info.setReturnValue(true);
        }
    }

}
