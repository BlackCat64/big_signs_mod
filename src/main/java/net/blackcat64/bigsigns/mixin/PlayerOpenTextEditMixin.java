package net.blackcat64.bigsigns.mixin;

import net.blackcat64.bigsigns.block.entity.OneLineHangingSignBlockEntity;
import net.blackcat64.bigsigns.block.entity.OneLineHangingSignEditScreen;
import net.blackcat64.bigsigns.block.entity.OneLineSignBlockEntity;
import net.blackcat64.bigsigns.block.entity.OneLineSignEditScreen;
import net.minecraft.client.Minecraft;
import net.minecraft.client.player.LocalPlayer;
import net.minecraft.world.level.block.entity.SignBlockEntity;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(LocalPlayer.class)
public class PlayerOpenTextEditMixin {

    @Shadow @Final protected Minecraft minecraft;

    @Inject(method = "openTextEdit", at = @At("HEAD"), cancellable = true)
    protected void injectOpenTextEdit(SignBlockEntity pSignEntity, boolean pIsFrontText, CallbackInfo ci) {
        if (pSignEntity instanceof OneLineSignBlockEntity oneLineSignBlockEntity) {
            this.minecraft.setScreen(new OneLineSignEditScreen(oneLineSignBlockEntity, pIsFrontText, this.minecraft.isTextFilteringEnabled()));
            ci.cancel(); // end the target method early
        }
        else if (pSignEntity instanceof OneLineHangingSignBlockEntity oneLineHangingSignBlockEntity) {
            this.minecraft.setScreen(new OneLineHangingSignEditScreen(oneLineHangingSignBlockEntity, pIsFrontText, this.minecraft.isTextFilteringEnabled()));
            ci.cancel();
        }
    }
}
