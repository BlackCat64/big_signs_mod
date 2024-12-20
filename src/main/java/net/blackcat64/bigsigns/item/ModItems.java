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

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
