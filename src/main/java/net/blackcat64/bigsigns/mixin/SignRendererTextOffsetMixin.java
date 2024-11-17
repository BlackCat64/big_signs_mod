package net.blackcat64.bigsigns.mixin;

import net.minecraft.client.renderer.blockentity.SignRenderer;
import net.minecraft.world.phys.Vec3;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(SignRenderer.class)
public abstract class SignRendererTextOffsetMixin {

    @Shadow public abstract float getSignTextRenderScale();

    @Inject(method = "getTextOffset", at = @At("HEAD"), cancellable = true)
    protected void injectTextOffset(CallbackInfoReturnable<Vec3> info) {
        final float Z_OFFSET = 0.046666667F;

        if (getSignTextRenderScale() == 3.3F) { // detect if a one-line sign is being rendered
            info.setReturnValue(new Vec3(0.031F, 0.31F, Z_OFFSET));
        }
    }
}
