package net.blackcat64.bigsigns.event;

import net.blackcat64.bigsigns.BigSignsMod;
import net.blackcat64.bigsigns.block.entity.ModBlockEntities;
import net.blackcat64.bigsigns.model.ThinSignModelLoader;
import net.blackcat64.bigsigns.renderer.OneLineHangingSignRenderer;
import net.blackcat64.bigsigns.renderer.OneLineSignRenderer;
import net.minecraft.client.renderer.blockentity.SignRenderer;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.client.event.ModelEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = BigSignsMod.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class ModEventBusClientEvents {
    @SubscribeEvent
    public static void registerBER(EntityRenderersEvent.RegisterRenderers event) {
        event.registerBlockEntityRenderer(ModBlockEntities.ONE_LINE_SIGN.get(), OneLineSignRenderer::new);
        event.registerBlockEntityRenderer(ModBlockEntities.ONE_LINE_HANGING_SIGN.get(), OneLineHangingSignRenderer::new);
        event.registerBlockEntityRenderer(ModBlockEntities.THIN_SIGN.get(), SignRenderer::new);
    }

    @SubscribeEvent
    public static void registerModels(ModelEvent.RegisterGeometryLoaders event) {
        event.register("thin_sign", new ThinSignModelLoader());
    }
}
