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
        if (getSignTextRenderScale() > 3.0F) { // detect if a big sign is being rendered
            Vec3 current = info.getReturnValue();
            info.setReturnValue(new Vec3(2.0, 0.5, current.z)); // override the x-offset to 0.2
        }
    }
}
