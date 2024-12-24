package net.blackcat64.bigsigns.item;

import net.blackcat64.bigsigns.item.ModItems;
import net.blackcat64.bigsigns.BigSignsMod;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class ModCreativeModeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, BigSignsMod.MOD_ID);

    public static final RegistryObject<CreativeModeTab> SIGNS_TAB = CREATIVE_MODE_TABS.register("signs_tab",
            () -> CreativeModeTab.builder()
                    .icon(() -> new ItemStack(ModItems.ONE_LINE_OAK_SIGN.get()))
                    .title(Component.translatable("creativetab.signs_tab"))
                    .displayItems((pParameters, pOutput) -> {
                        // add one-line sign items
                        pOutput.accept(ModItems.ONE_LINE_OAK_SIGN.get());
                        pOutput.accept(ModItems.ONE_LINE_SPRUCE_SIGN.get());
                        pOutput.accept(ModItems.ONE_LINE_BIRCH_SIGN.get());
                        pOutput.accept(ModItems.ONE_LINE_JUNGLE_SIGN.get());
                        pOutput.accept(ModItems.ONE_LINE_ACACIA_SIGN.get());
                        pOutput.accept(ModItems.ONE_LINE_DARK_OAK_SIGN.get());
                        pOutput.accept(ModItems.ONE_LINE_MANGROVE_SIGN.get());
                        pOutput.accept(ModItems.ONE_LINE_CHERRY_SIGN.get());
                        pOutput.accept(ModItems.ONE_LINE_BAMBOO_SIGN.get());
                        pOutput.accept(ModItems.ONE_LINE_CRIMSON_SIGN.get());
                        pOutput.accept(ModItems.ONE_LINE_WARPED_SIGN.get());

                        pOutput.accept(ModItems.ONE_LINE_BLACK_METAL_SIGN.get());
                        pOutput.accept(ModItems.ONE_LINE_BLUE_METAL_SIGN.get());
                        pOutput.accept(ModItems.ONE_LINE_BROWN_METAL_SIGN.get());
                        pOutput.accept(ModItems.ONE_LINE_CREAM_METAL_SIGN.get());
                        pOutput.accept(ModItems.ONE_LINE_CYAN_METAL_SIGN.get());
                        pOutput.accept(ModItems.ONE_LINE_DARK_ORANGE_METAL_SIGN.get());
                        pOutput.accept(ModItems.ONE_LINE_DARK_PINK_METAL_SIGN.get());
                        pOutput.accept(ModItems.ONE_LINE_DARK_RED_METAL_SIGN.get());
                        pOutput.accept(ModItems.ONE_LINE_GRAY_METAL_SIGN.get());
                        pOutput.accept(ModItems.ONE_LINE_GREEN_METAL_SIGN.get());
                        pOutput.accept(ModItems.ONE_LINE_LIGHT_BLUE_METAL_SIGN.get());
                        pOutput.accept(ModItems.ONE_LINE_LIGHT_GRAY_METAL_SIGN.get());
                        pOutput.accept(ModItems.ONE_LINE_LIME_METAL_SIGN.get());
                        pOutput.accept(ModItems.ONE_LINE_MAGENTA_METAL_SIGN.get());
                        pOutput.accept(ModItems.ONE_LINE_ORANGE_METAL_SIGN.get());
                        pOutput.accept(ModItems.ONE_LINE_PINK_METAL_SIGN.get());
                        pOutput.accept(ModItems.ONE_LINE_PURPLE_METAL_SIGN.get());
                        pOutput.accept(ModItems.ONE_LINE_RED_METAL_SIGN.get());
                        pOutput.accept(ModItems.ONE_LINE_WHITE_METAL_SIGN.get());
                        pOutput.accept(ModItems.ONE_LINE_YELLOW_METAL_SIGN.get());

                        // add one-line hanging sign items
                        pOutput.accept(ModItems.ONE_LINE_OAK_HANGING_SIGN.get());
                        pOutput.accept(ModItems.ONE_LINE_SPRUCE_HANGING_SIGN.get());
                        pOutput.accept(ModItems.ONE_LINE_BIRCH_HANGING_SIGN.get());
                        pOutput.accept(ModItems.ONE_LINE_JUNGLE_HANGING_SIGN.get());
                        pOutput.accept(ModItems.ONE_LINE_ACACIA_HANGING_SIGN.get());
                        pOutput.accept(ModItems.ONE_LINE_DARK_OAK_HANGING_SIGN.get());
                        pOutput.accept(ModItems.ONE_LINE_MANGROVE_HANGING_SIGN.get());
                        pOutput.accept(ModItems.ONE_LINE_CHERRY_HANGING_SIGN.get());
                        pOutput.accept(ModItems.ONE_LINE_BAMBOO_HANGING_SIGN.get());
                        pOutput.accept(ModItems.ONE_LINE_CRIMSON_HANGING_SIGN.get());
                        pOutput.accept(ModItems.ONE_LINE_WARPED_HANGING_SIGN.get());

                        pOutput.accept(ModItems.ONE_LINE_BLACK_METAL_HANGING_SIGN.get());
                        pOutput.accept(ModItems.ONE_LINE_BLUE_METAL_HANGING_SIGN.get());
                        pOutput.accept(ModItems.ONE_LINE_BROWN_METAL_HANGING_SIGN.get());
                        pOutput.accept(ModItems.ONE_LINE_CREAM_METAL_HANGING_SIGN.get());
                        pOutput.accept(ModItems.ONE_LINE_CYAN_METAL_HANGING_SIGN.get());
                        pOutput.accept(ModItems.ONE_LINE_DARK_ORANGE_METAL_HANGING_SIGN.get());
                        pOutput.accept(ModItems.ONE_LINE_DARK_PINK_METAL_HANGING_SIGN.get());
                        pOutput.accept(ModItems.ONE_LINE_DARK_RED_METAL_HANGING_SIGN.get());
                        pOutput.accept(ModItems.ONE_LINE_GRAY_METAL_HANGING_SIGN.get());
                        pOutput.accept(ModItems.ONE_LINE_GREEN_METAL_HANGING_SIGN.get());
                        pOutput.accept(ModItems.ONE_LINE_LIGHT_BLUE_METAL_HANGING_SIGN.get());
                        pOutput.accept(ModItems.ONE_LINE_LIGHT_GRAY_METAL_HANGING_SIGN.get());
                        pOutput.accept(ModItems.ONE_LINE_LIME_METAL_HANGING_SIGN.get());
                        pOutput.accept(ModItems.ONE_LINE_MAGENTA_METAL_HANGING_SIGN.get());
                        pOutput.accept(ModItems.ONE_LINE_ORANGE_METAL_HANGING_SIGN.get());
                        pOutput.accept(ModItems.ONE_LINE_PINK_METAL_HANGING_SIGN.get());
                        pOutput.accept(ModItems.ONE_LINE_PURPLE_METAL_HANGING_SIGN.get());
                        pOutput.accept(ModItems.ONE_LINE_RED_METAL_HANGING_SIGN.get());
                        pOutput.accept(ModItems.ONE_LINE_WHITE_METAL_HANGING_SIGN.get());
                        pOutput.accept(ModItems.ONE_LINE_YELLOW_METAL_HANGING_SIGN.get());

                    })
                    .build());


    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
