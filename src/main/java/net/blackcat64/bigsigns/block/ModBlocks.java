package net.blackcat64.bigsigns.block;

import net.blackcat64.bigsigns.BigSignsMod;
import net.blackcat64.bigsigns.item.ModItems;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.properties.WoodType;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Supplier;

public class ModBlocks {
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, BigSignsMod.MOD_ID);

    public static final RegistryObject<Block> ONE_LINE_OAK_SIGN = BLOCKS.register("one_line_oak_sign",
            () -> new OneLineSignBlock(BlockBehaviour.Properties.copy(Blocks.OAK_SIGN), WoodType.OAK));
    public static final RegistryObject<Block> ONE_LINE_OAK_WALL_SIGN = BLOCKS.register("one_line_oak_wall_sign",
            () -> new OneLineWallSignBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WALL_SIGN), WoodType.OAK));
    public static final RegistryObject<Block> ONE_LINE_OAK_HANGING_SIGN = BLOCKS.register("one_line_oak_hanging_sign",
            () -> new OneLineHangingSignBlock(BlockBehaviour.Properties.copy(Blocks.OAK_HANGING_SIGN), WoodType.OAK));
    public static final RegistryObject<Block> ONE_LINE_OAK_WALL_HANGING_SIGN = BLOCKS.register("one_line_oak_wall_hanging_sign",
            () -> new OneLineWallHangingSignBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WALL_HANGING_SIGN), WoodType.OAK));

    public static final RegistryObject<Block> ONE_LINE_SPRUCE_SIGN = BLOCKS.register("one_line_spruce_sign",
            () -> new OneLineSignBlock(BlockBehaviour.Properties.copy(Blocks.SPRUCE_SIGN), WoodType.SPRUCE));
    public static final RegistryObject<Block> ONE_LINE_SPRUCE_WALL_SIGN = BLOCKS.register("one_line_spruce_wall_sign",
            () -> new OneLineWallSignBlock(BlockBehaviour.Properties.copy(Blocks.SPRUCE_WALL_SIGN), WoodType.SPRUCE));
    public static final RegistryObject<Block> ONE_LINE_SPRUCE_HANGING_SIGN = BLOCKS.register("one_line_spruce_hanging_sign",
            () -> new OneLineHangingSignBlock(BlockBehaviour.Properties.copy(Blocks.SPRUCE_HANGING_SIGN), WoodType.SPRUCE));
    public static final RegistryObject<Block> ONE_LINE_SPRUCE_WALL_HANGING_SIGN = BLOCKS.register("one_line_spruce_wall_hanging_sign",
            () -> new OneLineWallHangingSignBlock(BlockBehaviour.Properties.copy(Blocks.SPRUCE_WALL_HANGING_SIGN), WoodType.SPRUCE));

    public static final RegistryObject<Block> ONE_LINE_BIRCH_SIGN = BLOCKS.register("one_line_birch_sign",
            () -> new OneLineSignBlock(BlockBehaviour.Properties.copy(Blocks.BIRCH_SIGN), WoodType.BIRCH));
    public static final RegistryObject<Block> ONE_LINE_BIRCH_WALL_SIGN = BLOCKS.register("one_line_birch_wall_sign",
            () -> new OneLineWallSignBlock(BlockBehaviour.Properties.copy(Blocks.BIRCH_WALL_SIGN), WoodType.BIRCH));
    public static final RegistryObject<Block> ONE_LINE_BIRCH_HANGING_SIGN = BLOCKS.register("one_line_birch_hanging_sign",
            () -> new OneLineHangingSignBlock(BlockBehaviour.Properties.copy(Blocks.BIRCH_HANGING_SIGN), WoodType.BIRCH));
    public static final RegistryObject<Block> ONE_LINE_BIRCH_WALL_HANGING_SIGN = BLOCKS.register("one_line_birch_wall_hanging_sign",
            () -> new OneLineWallHangingSignBlock(BlockBehaviour.Properties.copy(Blocks.BIRCH_WALL_HANGING_SIGN), WoodType.BIRCH));

    public static final RegistryObject<Block> ONE_LINE_JUNGLE_SIGN = BLOCKS.register("one_line_jungle_sign",
            () -> new OneLineSignBlock(BlockBehaviour.Properties.copy(Blocks.JUNGLE_SIGN), WoodType.JUNGLE));
    public static final RegistryObject<Block> ONE_LINE_JUNGLE_WALL_SIGN = BLOCKS.register("one_line_jungle_wall_sign",
            () -> new OneLineWallSignBlock(BlockBehaviour.Properties.copy(Blocks.JUNGLE_WALL_SIGN), WoodType.JUNGLE));
    public static final RegistryObject<Block> ONE_LINE_JUNGLE_HANGING_SIGN = BLOCKS.register("one_line_jungle_hanging_sign",
            () -> new OneLineHangingSignBlock(BlockBehaviour.Properties.copy(Blocks.JUNGLE_HANGING_SIGN), WoodType.JUNGLE));
    public static final RegistryObject<Block> ONE_LINE_JUNGLE_WALL_HANGING_SIGN = BLOCKS.register("one_line_jungle_wall_hanging_sign",
            () -> new OneLineWallHangingSignBlock(BlockBehaviour.Properties.copy(Blocks.JUNGLE_WALL_HANGING_SIGN), WoodType.JUNGLE));

    public static final RegistryObject<Block> ONE_LINE_ACACIA_SIGN = BLOCKS.register("one_line_acacia_sign",
            () -> new OneLineSignBlock(BlockBehaviour.Properties.copy(Blocks.ACACIA_SIGN), WoodType.ACACIA));
    public static final RegistryObject<Block> ONE_LINE_ACACIA_WALL_SIGN = BLOCKS.register("one_line_acacia_wall_sign",
            () -> new OneLineWallSignBlock(BlockBehaviour.Properties.copy(Blocks.ACACIA_WALL_SIGN), WoodType.ACACIA));
    public static final RegistryObject<Block> ONE_LINE_ACACIA_HANGING_SIGN = BLOCKS.register("one_line_acacia_hanging_sign",
            () -> new OneLineHangingSignBlock(BlockBehaviour.Properties.copy(Blocks.ACACIA_HANGING_SIGN), WoodType.ACACIA));
    public static final RegistryObject<Block> ONE_LINE_ACACIA_WALL_HANGING_SIGN = BLOCKS.register("one_line_acacia_wall_hanging_sign",
            () -> new OneLineWallHangingSignBlock(BlockBehaviour.Properties.copy(Blocks.ACACIA_WALL_HANGING_SIGN), WoodType.ACACIA));

    public static final RegistryObject<Block> ONE_LINE_DARK_OAK_SIGN = BLOCKS.register("one_line_dark_oak_sign",
            () -> new OneLineSignBlock(BlockBehaviour.Properties.copy(Blocks.DARK_OAK_SIGN), WoodType.DARK_OAK));
    public static final RegistryObject<Block> ONE_LINE_DARK_OAK_WALL_SIGN = BLOCKS.register("one_line_dark_oak_wall_sign",
            () -> new OneLineWallSignBlock(BlockBehaviour.Properties.copy(Blocks.DARK_OAK_WALL_SIGN), WoodType.DARK_OAK));
    public static final RegistryObject<Block> ONE_LINE_DARK_OAK_HANGING_SIGN = BLOCKS.register("one_line_dark_oak_hanging_sign",
            () -> new OneLineHangingSignBlock(BlockBehaviour.Properties.copy(Blocks.DARK_OAK_HANGING_SIGN), WoodType.DARK_OAK));
    public static final RegistryObject<Block> ONE_LINE_DARK_OAK_WALL_HANGING_SIGN = BLOCKS.register("one_line_dark_oak_wall_hanging_sign",
            () -> new OneLineWallHangingSignBlock(BlockBehaviour.Properties.copy(Blocks.DARK_OAK_WALL_HANGING_SIGN), WoodType.DARK_OAK));

    public static final RegistryObject<Block> ONE_LINE_MANGROVE_SIGN = BLOCKS.register("one_line_mangrove_sign",
            () -> new OneLineSignBlock(BlockBehaviour.Properties.copy(Blocks.MANGROVE_SIGN), WoodType.MANGROVE));
    public static final RegistryObject<Block> ONE_LINE_MANGROVE_WALL_SIGN = BLOCKS.register("one_line_mangrove_wall_sign",
            () -> new OneLineWallSignBlock(BlockBehaviour.Properties.copy(Blocks.MANGROVE_WALL_SIGN), WoodType.MANGROVE));
    public static final RegistryObject<Block> ONE_LINE_MANGROVE_HANGING_SIGN = BLOCKS.register("one_line_mangrove_hanging_sign",
            () -> new OneLineHangingSignBlock(BlockBehaviour.Properties.copy(Blocks.MANGROVE_HANGING_SIGN), WoodType.MANGROVE));
    public static final RegistryObject<Block> ONE_LINE_MANGROVE_WALL_HANGING_SIGN = BLOCKS.register("one_line_mangrove_wall_hanging_sign",
            () -> new OneLineWallHangingSignBlock(BlockBehaviour.Properties.copy(Blocks.MANGROVE_WALL_HANGING_SIGN), WoodType.MANGROVE));


    private static <T extends Block> RegistryObject<Item> registerBlockItem(String name, RegistryObject<T> block) {
        return ModItems.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties()));
    }

    private static <T extends Block> RegistryObject<T> registerBlock(String name, Supplier<T> block) {
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn);
        return toReturn;
    }

    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }
}
