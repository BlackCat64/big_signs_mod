package net.blackcat64.bigsigns.mixin;

import net.minecraft.client.renderer.blockentity.HangingSignRenderer;
import net.minecraft.world.phys.Vec3;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(HangingSignRenderer.class)
public abstract class HangingSignRendererTextOffsetMixin {

    @Shadow public abstract float getSignTextRenderScale();

    @Inject(method = "getTextOffset", at = @At("HEAD"), cancellable = true)
    protected void injectTextOffset(CallbackInfoReturnable<Vec3> info) {
        final float Z_OFFSET = 0.073F;

        if (getSignTextRenderScale() == 2.85F) { // detect if a one-line hanging sign is being rendered
            info.setReturnValue(new Vec3(0.027F, -0.3F, Z_OFFSET));
        }
    }
}
