package net.blackcat64.bigsigns;

import com.mojang.logging.LogUtils;
import net.blackcat64.bigsigns.block.ModBlocks;
import net.blackcat64.bigsigns.item.ModCreativeModeTabs;
import net.blackcat64.bigsigns.item.ModItems;
import net.blackcat64.bigsigns.block.entity.ModBlockEntities;
import net.blackcat64.bigsigns.util.ModWoodTypes;
import net.minecraft.client.renderer.Sheets;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.BuildCreativeModeTabContentsEvent;
import net.minecraftforge.event.server.ServerStartingEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.slf4j.Logger;

// The value here should match an entry in the META-INF/mods.toml file
@Mod(BigSignsMod.MOD_ID)
public class BigSignsMod {
    public static final String MOD_ID = "big_signs";
    private static final Logger LOGGER = LogUtils.getLogger();

    public BigSignsMod() {
        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();

        ModCreativeModeTabs.register(modEventBus);
        ModItems.register(modEventBus);
        ModBlocks.register(modEventBus);
        ModBlockEntities.register(modEventBus);

        modEventBus.addListener(this::commonSetup);

        // Register ourselves for server and other game events we are interested in
        MinecraftForge.EVENT_BUS.register(this);

        // Register the item to a creative tab
        modEventBus.addListener(this::addCreative);
    }

    private void commonSetup(final FMLCommonSetupEvent event) {
    }

    private void addCreative(BuildCreativeModeTabContentsEvent event) {
    }

    // You can use SubscribeEvent and let the Event Bus discover methods to call
    @SubscribeEvent
    public void onServerStarting(ServerStartingEvent event) {

    }

    // You can use EventBusSubscriber to automatically register all static methods in the class annotated with @SubscribeEvent
    @Mod.EventBusSubscriber(modid = MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
    public static class ClientModEvents {
        @SubscribeEvent
        public static void onClientSetup(FMLClientSetupEvent event) {
            Sheets.addWoodType(ModWoodTypes.BLACK_METAL_SIGN);
            Sheets.addWoodType(ModWoodTypes.GRAY_METAL_SIGN);
            Sheets.addWoodType(ModWoodTypes.LIGHT_GRAY_METAL_SIGN);
            Sheets.addWoodType(ModWoodTypes.WHITE_METAL_SIGN);
            Sheets.addWoodType(ModWoodTypes.DARK_RED_METAL_SIGN);
            Sheets.addWoodType(ModWoodTypes.RED_METAL_SIGN);
            Sheets.addWoodType(ModWoodTypes.DARK_PINK_METAL_SIGN);
            Sheets.addWoodType(ModWoodTypes.PINK_METAL_SIGN);
            Sheets.addWoodType(ModWoodTypes.MAGENTA_METAL_SIGN);
            Sheets.addWoodType(ModWoodTypes.PURPLE_METAL_SIGN);
            Sheets.addWoodType(ModWoodTypes.BLUE_METAL_SIGN);
            Sheets.addWoodType(ModWoodTypes.CYAN_METAL_SIGN);
            Sheets.addWoodType(ModWoodTypes.LIGHT_BLUE_METAL_SIGN);
            Sheets.addWoodType(ModWoodTypes.LIME_METAL_SIGN);
            Sheets.addWoodType(ModWoodTypes.GREEN_METAL_SIGN);
            Sheets.addWoodType(ModWoodTypes.BROWN_METAL_SIGN);
            Sheets.addWoodType(ModWoodTypes.DARK_ORANGE_METAL_SIGN);
            Sheets.addWoodType(ModWoodTypes.ORANGE_METAL_SIGN);
            Sheets.addWoodType(ModWoodTypes.YELLOW_METAL_SIGN);
            Sheets.addWoodType(ModWoodTypes.CREAM_METAL_SIGN);
        }
    }
}
