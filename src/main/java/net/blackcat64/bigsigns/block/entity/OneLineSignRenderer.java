package net.blackcat64.bigsigns.block.entity;

import net.minecraft.client.renderer.blockentity.BlockEntityRendererProvider;
import net.minecraft.client.renderer.blockentity.SignRenderer;

public class OneLineSignRenderer extends SignRenderer {

    public OneLineSignRenderer(BlockEntityRendererProvider.Context pContext) {
        super(pContext);
    }

    @Override
    public float getSignTextRenderScale() {
        return 3.3F; // This is exactly 4.95 times larger than a regular sign's text
    }
}
