package net.blackcat64.bigsigns.renderer;

import net.minecraft.client.renderer.blockentity.BlockEntityRendererProvider;
import net.minecraft.client.renderer.blockentity.SignRenderer;
import net.minecraft.world.phys.Vec3;

public class OneLineSignRenderer extends SignRenderer {

    public OneLineSignRenderer(BlockEntityRendererProvider.Context pContext) {
        super(pContext);
    }

    @Override
    public float getSignTextRenderScale() {
        return 3.3F; // This is exactly 4.95 times larger than a regular sign's text
    }
}
