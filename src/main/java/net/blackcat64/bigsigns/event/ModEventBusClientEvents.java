package net.blackcat64.bigsigns.event;

import net.blackcat64.bigsigns.BigSignsMod;
import net.blackcat64.bigsigns.block.entity.ModBlockEntities;
import net.blackcat64.bigsigns.block.entity.OneLineHangingSignRenderer;
import net.blackcat64.bigsigns.block.entity.OneLineSignRenderer;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = BigSignsMod.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class ModEventBusClientEvents {
    @SubscribeEvent
    public static void registerBER(EntityRenderersEvent.RegisterRenderers event) {
        event.registerBlockEntityRenderer(ModBlockEntities.ONE_LINE_SIGN.get(), OneLineSignRenderer::new);
        event.registerBlockEntityRenderer(ModBlockEntities.ONE_LINE_HANGING_SIGN.get(), OneLineHangingSignRenderer::new);
    }
}
