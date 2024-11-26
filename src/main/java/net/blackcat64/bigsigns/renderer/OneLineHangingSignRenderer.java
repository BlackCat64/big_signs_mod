package net.blackcat64.bigsigns.renderer;

import net.minecraft.client.renderer.blockentity.BlockEntityRendererProvider;
import net.minecraft.client.renderer.blockentity.HangingSignRenderer;
import net.minecraft.client.renderer.blockentity.SignRenderer;

public class OneLineHangingSignRenderer extends HangingSignRenderer {

    public OneLineHangingSignRenderer(BlockEntityRendererProvider.Context pContext) {
        super(pContext);
    }

    @Override
    public float getSignTextRenderScale() {
        return 2.85F; // This is exactly 3.16667 times larger than a regular hanging sign's text
    }
}
