package net.blackcat64.bigsigns.item;

import net.blackcat64.bigsigns.BigSignsMod;
import net.blackcat64.bigsigns.block.ModBlocks;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.SignItem;
import net.minecraft.world.item.HangingSignItem;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, BigSignsMod.MOD_ID);

    public static final RegistryObject<Item> ONE_LINE_OAK_SIGN = ITEMS.register("one_line_oak_sign",
            () -> new SignItem(new Item.Properties().stacksTo(16), ModBlocks.ONE_LINE_OAK_SIGN.get(), ModBlocks.ONE_LINE_OAK_WALL_SIGN.get()));
    public static final RegistryObject<Item> ONE_LINE_OAK_HANGING_SIGN = ITEMS.register("one_line_oak_hanging_sign",
            () -> new HangingSignItem(ModBlocks.ONE_LINE_OAK_HANGING_SIGN.get(), ModBlocks.ONE_LINE_OAK_WALL_HANGING_SIGN.get(), new Item.Properties().stacksTo(16)));

    public static final RegistryObject<Item> ONE_LINE_SPRUCE_SIGN = ITEMS.register("one_line_spruce_sign",
            () -> new SignItem(new Item.Properties().stacksTo(16), ModBlocks.ONE_LINE_SPRUCE_SIGN.get(), ModBlocks.ONE_LINE_SPRUCE_WALL_SIGN.get()));
    public static final RegistryObject<Item> ONE_LINE_SPRUCE_HANGING_SIGN = ITEMS.register("one_line_spruce_hanging_sign",
            () -> new HangingSignItem(ModBlocks.ONE_LINE_SPRUCE_HANGING_SIGN.get(), ModBlocks.ONE_LINE_SPRUCE_WALL_HANGING_SIGN.get(), new Item.Properties().stacksTo(16)));

    public static final RegistryObject<Item> ONE_LINE_BIRCH_SIGN = ITEMS.register("one_line_birch_sign",
            () -> new SignItem(new Item.Properties().stacksTo(16), ModBlocks.ONE_LINE_BIRCH_SIGN.get(), ModBlocks.ONE_LINE_BIRCH_WALL_SIGN.get()));
    public static final RegistryObject<Item> ONE_LINE_BIRCH_HANGING_SIGN = ITEMS.register("one_line_birch_hanging_sign",
            () -> new HangingSignItem(ModBlocks.ONE_LINE_BIRCH_HANGING_SIGN.get(), ModBlocks.ONE_LINE_BIRCH_WALL_HANGING_SIGN.get(), new Item.Properties().stacksTo(16)));

    public static final RegistryObject<Item> ONE_LINE_JUNGLE_SIGN = ITEMS.register("one_line_jungle_sign",
            () -> new SignItem(new Item.Properties().stacksTo(16), ModBlocks.ONE_LINE_JUNGLE_SIGN.get(), ModBlocks.ONE_LINE_JUNGLE_WALL_SIGN.get()));
    public static final RegistryObject<Item> ONE_LINE_JUNGLE_HANGING_SIGN = ITEMS.register("one_line_jungle_hanging_sign",
            () -> new HangingSignItem(ModBlocks.ONE_LINE_JUNGLE_HANGING_SIGN.get(), ModBlocks.ONE_LINE_JUNGLE_WALL_HANGING_SIGN.get(), new Item.Properties().stacksTo(16)));

    public static final RegistryObject<Item> ONE_LINE_ACACIA_SIGN = ITEMS.register("one_line_acacia_sign",
            () -> new SignItem(new Item.Properties().stacksTo(16), ModBlocks.ONE_LINE_ACACIA_SIGN.get(), ModBlocks.ONE_LINE_ACACIA_WALL_SIGN.get()));
    public static final RegistryObject<Item> ONE_LINE_ACACIA_HANGING_SIGN = ITEMS.register("one_line_acacia_hanging_sign",
            () -> new HangingSignItem(ModBlocks.ONE_LINE_ACACIA_HANGING_SIGN.get(), ModBlocks.ONE_LINE_ACACIA_WALL_HANGING_SIGN.get(), new Item.Properties().stacksTo(16)));

    public static final RegistryObject<Item> ONE_LINE_DARK_OAK_SIGN = ITEMS.register("one_line_dark_oak_sign",
            () -> new SignItem(new Item.Properties().stacksTo(16), ModBlocks.ONE_LINE_DARK_OAK_SIGN.get(), ModBlocks.ONE_LINE_DARK_OAK_WALL_SIGN.get()));
    public static final RegistryObject<Item> ONE_LINE_DARK_OAK_HANGING_SIGN = ITEMS.register("one_line_dark_oak_hanging_sign",
            () -> new HangingSignItem(ModBlocks.ONE_LINE_DARK_OAK_HANGING_SIGN.get(), ModBlocks.ONE_LINE_DARK_OAK_WALL_HANGING_SIGN.get(), new Item.Properties().stacksTo(16)));

    public static final RegistryObject<Item> ONE_LINE_MANGROVE_SIGN = ITEMS.register("one_line_mangrove_sign",
            () -> new SignItem(new Item.Properties().stacksTo(16), ModBlocks.ONE_LINE_MANGROVE_SIGN.get(), ModBlocks.ONE_LINE_MANGROVE_WALL_SIGN.get()));
    public static final RegistryObject<Item> ONE_LINE_MANGROVE_HANGING_SIGN = ITEMS.register("one_line_mangrove_hanging_sign",
            () -> new HangingSignItem(ModBlocks.ONE_LINE_MANGROVE_HANGING_SIGN.get(), ModBlocks.ONE_LINE_MANGROVE_WALL_HANGING_SIGN.get(), new Item.Properties().stacksTo(16)));

    public static final RegistryObject<Item> ONE_LINE_CHERRY_SIGN = ITEMS.register("one_line_cherry_sign",
            () -> new SignItem(new Item.Properties().stacksTo(16), ModBlocks.ONE_LINE_CHERRY_SIGN.get(), ModBlocks.ONE_LINE_CHERRY_WALL_SIGN.get()));
    public static final RegistryObject<Item> ONE_LINE_CHERRY_HANGING_SIGN = ITEMS.register("one_line_cherry_hanging_sign",
            () -> new HangingSignItem(ModBlocks.ONE_LINE_CHERRY_HANGING_SIGN.get(), ModBlocks.ONE_LINE_CHERRY_WALL_HANGING_SIGN.get(), new Item.Properties().stacksTo(16)));

    public static final RegistryObject<Item> ONE_LINE_BAMBOO_SIGN = ITEMS.register("one_line_bamboo_sign",
            () -> new SignItem(new Item.Properties().stacksTo(16), ModBlocks.ONE_LINE_BAMBOO_SIGN.get(), ModBlocks.ONE_LINE_BAMBOO_WALL_SIGN.get()));
    public static final RegistryObject<Item> ONE_LINE_BAMBOO_HANGING_SIGN = ITEMS.register("one_line_bamboo_hanging_sign",
            () -> new HangingSignItem(ModBlocks.ONE_LINE_BAMBOO_HANGING_SIGN.get(), ModBlocks.ONE_LINE_BAMBOO_WALL_HANGING_SIGN.get(), new Item.Properties().stacksTo(16)));

    public static final RegistryObject<Item> ONE_LINE_CRIMSON_SIGN = ITEMS.register("one_line_crimson_sign",
            () -> new SignItem(new Item.Properties().stacksTo(16), ModBlocks.ONE_LINE_CRIMSON_SIGN.get(), ModBlocks.ONE_LINE_CRIMSON_WALL_SIGN.get()));
    public static final RegistryObject<Item> ONE_LINE_CRIMSON_HANGING_SIGN = ITEMS.register("one_line_crimson_hanging_sign",
            () -> new HangingSignItem(ModBlocks.ONE_LINE_CRIMSON_HANGING_SIGN.get(), ModBlocks.ONE_LINE_CRIMSON_WALL_HANGING_SIGN.get(), new Item.Properties().stacksTo(16)));

    public static final RegistryObject<Item> ONE_LINE_WARPED_SIGN = ITEMS.register("one_line_warped_sign",
            () -> new SignItem(new Item.Properties().stacksTo(16), ModBlocks.ONE_LINE_WARPED_SIGN.get(), ModBlocks.ONE_LINE_WARPED_WALL_SIGN.get()));
    public static final RegistryObject<Item> ONE_LINE_WARPED_HANGING_SIGN = ITEMS.register("one_line_warped_hanging_sign",
            () -> new HangingSignItem(ModBlocks.ONE_LINE_WARPED_HANGING_SIGN.get(), ModBlocks.ONE_LINE_WARPED_WALL_HANGING_SIGN.get(), new Item.Properties().stacksTo(16)));

    public static final RegistryObject<Item> ONE_LINE_BLACK_METAL_SIGN = ITEMS.register("one_line_black_metal_sign",
            () -> new SignItem(new Item.Properties().stacksTo(16), ModBlocks.ONE_LINE_BLACK_METAL_SIGN.get(), ModBlocks.ONE_LINE_BLACK_METAL_WALL_SIGN.get()));
    public static final RegistryObject<Item> ONE_LINE_BLACK_METAL_HANGING_SIGN = ITEMS.register("one_line_black_metal_hanging_sign",
            () -> new HangingSignItem(ModBlocks.ONE_LINE_BLACK_METAL_HANGING_SIGN.get(), ModBlocks.ONE_LINE_BLACK_METAL_WALL_HANGING_SIGN.get(), new Item.Properties().stacksTo(16)));

    public static final RegistryObject<Item> ONE_LINE_GRAY_METAL_SIGN = ITEMS.register("one_line_gray_metal_sign",
            () -> new SignItem(new Item.Properties().stacksTo(16), ModBlocks.ONE_LINE_GRAY_METAL_SIGN.get(), ModBlocks.ONE_LINE_GRAY_METAL_WALL_SIGN.get()));
    public static final RegistryObject<Item> ONE_LINE_GRAY_METAL_HANGING_SIGN = ITEMS.register("one_line_gray_metal_hanging_sign",
            () -> new HangingSignItem(ModBlocks.ONE_LINE_GRAY_METAL_HANGING_SIGN.get(), ModBlocks.ONE_LINE_GRAY_METAL_WALL_HANGING_SIGN.get(), new Item.Properties().stacksTo(16)));

    public static final RegistryObject<Item> ONE_LINE_BLUE_METAL_SIGN = ITEMS.register("one_line_blue_metalsign",
            () -> new SignItem(new Item.Properties().stacksTo(16), ModBlocks.ONE_LINE_BLUE_METAL_SIGN.get(), ModBlocks.ONE_LINE_BLUE_METAL_WALL_SIGN.get()));
    public static final RegistryObject<Item> ONE_LINE_BLUE_METAL_HANGING_SIGN = ITEMS.register("one_line_blue_metalsign",
            () -> new HangingSignItem(ModBlocks.ONE_LINE_BLUE_METAL_HANGING_SIGN.get(), ModBlocks.ONE_LINE_BLUE_METAL_WALL_HANGING_SIGN.get(), new Item.Properties().stacksTo(16)));

    public static final RegistryObject<Item> ONE_LINE_BROWN_METAL_SIGN = ITEMS.register("one_line_brown_metalsign",
            () -> new SignItem(new Item.Properties().stacksTo(16), ModBlocks.ONE_LINE_BROWN_METAL_SIGN.get(), ModBlocks.ONE_LINE_BROWN_METAL_WALL_SIGN.get()));
    public static final RegistryObject<Item> ONE_LINE_BROWN_METAL_HANGING_SIGN = ITEMS.register("one_line_brown_metalsign",
            () -> new HangingSignItem(ModBlocks.ONE_LINE_BROWN_METAL_HANGING_SIGN.get(), ModBlocks.ONE_LINE_BROWN_METAL_WALL_HANGING_SIGN.get(), new Item.Properties().stacksTo(16)));

    public static final RegistryObject<Item> ONE_LINE_CREAM_METAL_SIGN = ITEMS.register("one_line_cream_metalsign",
            () -> new SignItem(new Item.Properties().stacksTo(16), ModBlocks.ONE_LINE_CREAM_METAL_SIGN.get(), ModBlocks.ONE_LINE_CREAM_METAL_WALL_SIGN.get()));
    public static final RegistryObject<Item> ONE_LINE_CREAM_METAL_HANGING_SIGN = ITEMS.register("one_line_cream_metalsign",
            () -> new HangingSignItem(ModBlocks.ONE_LINE_CREAM_METAL_HANGING_SIGN.get(), ModBlocks.ONE_LINE_CREAM_METAL_WALL_HANGING_SIGN.get(), new Item.Properties().stacksTo(16)));

    public static final RegistryObject<Item> ONE_LINE_CYAN_METAL_SIGN = ITEMS.register("one_line_cyan_metalsign",
            () -> new SignItem(new Item.Properties().stacksTo(16), ModBlocks.ONE_LINE_CYAN_METAL_SIGN.get(), ModBlocks.ONE_LINE_CYAN_METAL_WALL_SIGN.get()));
    public static final RegistryObject<Item> ONE_LINE_CYAN_METAL_HANGING_SIGN = ITEMS.register("one_line_cyan_metalsign",
            () -> new HangingSignItem(ModBlocks.ONE_LINE_CYAN_METAL_HANGING_SIGN.get(), ModBlocks.ONE_LINE_CYAN_METAL_WALL_HANGING_SIGN.get(), new Item.Properties().stacksTo(16)));

    public static final RegistryObject<Item> ONE_LINE_DARK_ORANGE_METAL_SIGN = ITEMS.register("one_line_dark_orange_metalsign",
            () -> new SignItem(new Item.Properties().stacksTo(16), ModBlocks.ONE_LINE_DARK_ORANGE_METAL_SIGN.get(), ModBlocks.ONE_LINE_DARK_ORANGE_METAL_WALL_SIGN.get()));
    public static final RegistryObject<Item> ONE_LINE_DARK_ORANGE_METAL_HANGING_SIGN = ITEMS.register("one_line_dark_orange_metalsign",
            () -> new HangingSignItem(ModBlocks.ONE_LINE_DARK_ORANGE_METAL_HANGING_SIGN.get(), ModBlocks.ONE_LINE_DARK_ORANGE_METAL_WALL_HANGING_SIGN.get(), new Item.Properties().stacksTo(16)));

    public static final RegistryObject<Item> ONE_LINE_DARK_PINK_METAL_SIGN = ITEMS.register("one_line_dark_pink_metalsign",
            () -> new SignItem(new Item.Properties().stacksTo(16), ModBlocks.ONE_LINE_DARK_PINK_METAL_SIGN.get(), ModBlocks.ONE_LINE_DARK_PINK_METAL_WALL_SIGN.get()));
    public static final RegistryObject<Item> ONE_LINE_DARK_PINK_METAL_HANGING_SIGN = ITEMS.register("one_line_dark_pink_metalsign",
            () -> new HangingSignItem(ModBlocks.ONE_LINE_DARK_PINK_METAL_HANGING_SIGN.get(), ModBlocks.ONE_LINE_DARK_PINK_METAL_WALL_HANGING_SIGN.get(), new Item.Properties().stacksTo(16)));

    public static final RegistryObject<Item> ONE_LINE_DARK_RED_METAL_SIGN = ITEMS.register("one_line_dark_red_metalsign",
            () -> new SignItem(new Item.Properties().stacksTo(16), ModBlocks.ONE_LINE_DARK_RED_METAL_SIGN.get(), ModBlocks.ONE_LINE_DARK_RED_METAL_WALL_SIGN.get()));
    public static final RegistryObject<Item> ONE_LINE_DARK_RED_METAL_HANGING_SIGN = ITEMS.register("one_line_dark_red_metalsign",
            () -> new HangingSignItem(ModBlocks.ONE_LINE_DARK_RED_METAL_HANGING_SIGN.get(), ModBlocks.ONE_LINE_DARK_RED_METAL_WALL_HANGING_SIGN.get(), new Item.Properties().stacksTo(16)));

    public static final RegistryObject<Item> ONE_LINE_GREEN_METAL_SIGN = ITEMS.register("one_line_green_metalsign",
            () -> new SignItem(new Item.Properties().stacksTo(16), ModBlocks.ONE_LINE_GREEN_METAL_SIGN.get(), ModBlocks.ONE_LINE_GREEN_METAL_WALL_SIGN.get()));
    public static final RegistryObject<Item> ONE_LINE_GREEN_METAL_HANGING_SIGN = ITEMS.register("one_line_green_metalsign",
            () -> new HangingSignItem(ModBlocks.ONE_LINE_GREEN_METAL_HANGING_SIGN.get(), ModBlocks.ONE_LINE_GREEN_METAL_WALL_HANGING_SIGN.get(), new Item.Properties().stacksTo(16)));

    public static final RegistryObject<Item> ONE_LINE_LIME_METAL_SIGN = ITEMS.register("one_line_lime_metalsign",
            () -> new SignItem(new Item.Properties().stacksTo(16), ModBlocks.ONE_LINE_LIME_METAL_SIGN.get(), ModBlocks.ONE_LINE_LIME_METAL_WALL_SIGN.get()));
    public static final RegistryObject<Item> ONE_LINE_LIME_METAL_HANGING_SIGN = ITEMS.register("one_line_lime_metalsign",
            () -> new HangingSignItem(ModBlocks.ONE_LINE_LIME_METAL_HANGING_SIGN.get(), ModBlocks.ONE_LINE_LIME_METAL_WALL_HANGING_SIGN.get(), new Item.Properties().stacksTo(16)));

    public static final RegistryObject<Item> ONE_LINE_LIGHT_BLUE_METAL_SIGN = ITEMS.register("one_line_light_blue_metalsign",
            () -> new SignItem(new Item.Properties().stacksTo(16), ModBlocks.ONE_LINE_LIGHT_BLUE_METAL_SIGN.get(), ModBlocks.ONE_LINE_LIGHT_BLUE_METAL_WALL_SIGN.get()));
    public static final RegistryObject<Item> ONE_LINE_LIGHT_BLUE_METAL_HANGING_SIGN = ITEMS.register("one_line_light_blue_metalsign",
            () -> new HangingSignItem(ModBlocks.ONE_LINE_LIGHT_BLUE_METAL_HANGING_SIGN.get(), ModBlocks.ONE_LINE_LIGHT_BLUE_METAL_WALL_HANGING_SIGN.get(), new Item.Properties().stacksTo(16)));

    public static final RegistryObject<Item> ONE_LINE_LIGHT_GRAY_METAL_SIGN = ITEMS.register("one_line_light_gray_metalsign",
            () -> new SignItem(new Item.Properties().stacksTo(16), ModBlocks.ONE_LINE_LIGHT_GRAY_METAL_SIGN.get(), ModBlocks.ONE_LINE_LIGHT_GRAY_METAL_WALL_SIGN.get()));
    public static final RegistryObject<Item> ONE_LINE_LIGHT_GRAY_METAL_HANGING_SIGN = ITEMS.register("one_line_light_gray_metalsign",
            () -> new HangingSignItem(ModBlocks.ONE_LINE_LIGHT_GRAY_METAL_HANGING_SIGN.get(), ModBlocks.ONE_LINE_LIGHT_GRAY_METAL_WALL_HANGING_SIGN.get(), new Item.Properties().stacksTo(16)));

    public static final RegistryObject<Item> ONE_LINE_MAGENTA_METAL_SIGN = ITEMS.register("one_line_magenta_metalsign",
            () -> new SignItem(new Item.Properties().stacksTo(16), ModBlocks.ONE_LINE_MAGENTA_METAL_SIGN.get(), ModBlocks.ONE_LINE_MAGENTA_METAL_WALL_SIGN.get()));
    public static final RegistryObject<Item> ONE_LINE_MAGENTA_METAL_HANGING_SIGN = ITEMS.register("one_line_magenta_metalsign",
            () -> new HangingSignItem(ModBlocks.ONE_LINE_MAGENTA_METAL_HANGING_SIGN.get(), ModBlocks.ONE_LINE_MAGENTA_METAL_WALL_HANGING_SIGN.get(), new Item.Properties().stacksTo(16)));

    public static final RegistryObject<Item> ONE_LINE_ORANGE_METAL_SIGN = ITEMS.register("one_line_orange_metalsign",
            () -> new SignItem(new Item.Properties().stacksTo(16), ModBlocks.ONE_LINE_ORANGE_METAL_SIGN.get(), ModBlocks.ONE_LINE_ORANGE_METAL_WALL_SIGN.get()));
    public static final RegistryObject<Item> ONE_LINE_ORANGE_METAL_HANGING_SIGN = ITEMS.register("one_line_orange_metalsign",
            () -> new HangingSignItem(ModBlocks.ONE_LINE_ORANGE_METAL_HANGING_SIGN.get(), ModBlocks.ONE_LINE_ORANGE_METAL_WALL_HANGING_SIGN.get(), new Item.Properties().stacksTo(16)));

    public static final RegistryObject<Item> ONE_LINE_PINK_METAL_SIGN = ITEMS.register("one_line_pink_metalsign",
            () -> new SignItem(new Item.Properties().stacksTo(16), ModBlocks.ONE_LINE_PINK_METAL_SIGN.get(), ModBlocks.ONE_LINE_PINK_METAL_WALL_SIGN.get()));
    public static final RegistryObject<Item> ONE_LINE_PINK_METAL_HANGING_SIGN = ITEMS.register("one_line_pink_metalsign",
            () -> new HangingSignItem(ModBlocks.ONE_LINE_PINK_METAL_HANGING_SIGN.get(), ModBlocks.ONE_LINE_PINK_METAL_WALL_HANGING_SIGN.get(), new Item.Properties().stacksTo(16)));

    public static final RegistryObject<Item> ONE_LINE_PURPLE_METAL_SIGN = ITEMS.register("one_line_purple_metalsign",
            () -> new SignItem(new Item.Properties().stacksTo(16), ModBlocks.ONE_LINE_PURPLE_METAL_SIGN.get(), ModBlocks.ONE_LINE_PURPLE_METAL_WALL_SIGN.get()));
    public static final RegistryObject<Item> ONE_LINE_PURPLE_METAL_HANGING_SIGN = ITEMS.register("one_line_purple_metalsign",
            () -> new HangingSignItem(ModBlocks.ONE_LINE_PURPLE_METAL_HANGING_SIGN.get(), ModBlocks.ONE_LINE_PURPLE_METAL_WALL_HANGING_SIGN.get(), new Item.Properties().stacksTo(16)));

    public static final RegistryObject<Item> ONE_LINE_RED_METAL_SIGN = ITEMS.register("one_line_red_metalsign",
            () -> new SignItem(new Item.Properties().stacksTo(16), ModBlocks.ONE_LINE_RED_METAL_SIGN.get(), ModBlocks.ONE_LINE_RED_METAL_WALL_SIGN.get()));
    public static final RegistryObject<Item> ONE_LINE_RED_METAL_HANGING_SIGN = ITEMS.register("one_line_red_metalsign",
            () -> new HangingSignItem(ModBlocks.ONE_LINE_RED_METAL_HANGING_SIGN.get(), ModBlocks.ONE_LINE_RED_METAL_WALL_HANGING_SIGN.get(), new Item.Properties().stacksTo(16)));

    public static final RegistryObject<Item> ONE_LINE_WHITE_METAL_SIGN = ITEMS.register("one_line_white_metalsign",
            () -> new SignItem(new Item.Properties().stacksTo(16), ModBlocks.ONE_LINE_WHITE_METAL_SIGN.get(), ModBlocks.ONE_LINE_WHITE_METAL_WALL_SIGN.get()));
    public static final RegistryObject<Item> ONE_LINE_WHITE_METAL_HANGING_SIGN = ITEMS.register("one_line_white_metalsign",
            () -> new HangingSignItem(ModBlocks.ONE_LINE_WHITE_METAL_HANGING_SIGN.get(), ModBlocks.ONE_LINE_WHITE_METAL_WALL_HANGING_SIGN.get(), new Item.Properties().stacksTo(16)));

    public static final RegistryObject<Item> ONE_LINE_YELLOW_METAL_SIGN = ITEMS.register("one_line_yellow_metalsign",
            () -> new SignItem(new Item.Properties().stacksTo(16), ModBlocks.ONE_LINE_YELLOW_METAL_SIGN.get(), ModBlocks.ONE_LINE_YELLOW_METAL_WALL_SIGN.get()));
    public static final RegistryObject<Item> ONE_LINE_YELLOW_METAL_HANGING_SIGN = ITEMS.register("one_line_yellow_metalsign",
            () -> new HangingSignItem(ModBlocks.ONE_LINE_YELLOW_METAL_HANGING_SIGN.get(), ModBlocks.ONE_LINE_YELLOW_METAL_WALL_HANGING_SIGN.get(), new Item.Properties().stacksTo(16)));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
