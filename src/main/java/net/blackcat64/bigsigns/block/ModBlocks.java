package net.blackcat64.bigsigns.block;

import net.blackcat64.bigsigns.BigSignsMod;
import net.blackcat64.bigsigns.item.ModItems;
import net.blackcat64.bigsigns.util.ModWoodTypes;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.StandingSignBlock;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.properties.WoodType;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Supplier;

public class ModBlocks {
    /*
    *   METAL SIGN BLOCK PROPERTIES
     */
    public static final BlockBehaviour.Properties METAL_SIGN_PROPERTIES =
            BlockBehaviour.Properties.copy(Blocks.OAK_SIGN)
                    .explosionResistance(6).destroyTime(2);
    public static final BlockBehaviour.Properties METAL_WALL_SIGN_PROPERTIES =
            BlockBehaviour.Properties.copy(Blocks.OAK_WALL_SIGN)
                    .explosionResistance(6).destroyTime(2);
    public static final BlockBehaviour.Properties METAL_HANGING_SIGN_PROPERTIES =
            BlockBehaviour.Properties.copy(Blocks.OAK_HANGING_SIGN)
                    .explosionResistance(6).destroyTime(2);
    public static final BlockBehaviour.Properties METAL_WALL_HANGING_SIGN_PROPERTIES =
            BlockBehaviour.Properties.copy(Blocks.OAK_WALL_HANGING_SIGN)
                    .explosionResistance(6).destroyTime(2);
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, BigSignsMod.MOD_ID);

    /*
    *   ONE-LINE SIGN BLOCKS
     */
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

    public static final RegistryObject<Block> ONE_LINE_CHERRY_SIGN = BLOCKS.register("one_line_cherry_sign",
            () -> new OneLineSignBlock(BlockBehaviour.Properties.copy(Blocks.CHERRY_SIGN), WoodType.CHERRY));
    public static final RegistryObject<Block> ONE_LINE_CHERRY_WALL_SIGN = BLOCKS.register("one_line_cherry_wall_sign",
            () -> new OneLineWallSignBlock(BlockBehaviour.Properties.copy(Blocks.CHERRY_WALL_SIGN), WoodType.CHERRY));
    public static final RegistryObject<Block> ONE_LINE_CHERRY_HANGING_SIGN = BLOCKS.register("one_line_cherry_hanging_sign",
            () -> new OneLineHangingSignBlock(BlockBehaviour.Properties.copy(Blocks.CHERRY_HANGING_SIGN), WoodType.CHERRY));
    public static final RegistryObject<Block> ONE_LINE_CHERRY_WALL_HANGING_SIGN = BLOCKS.register("one_line_cherry_wall_hanging_sign",
            () -> new OneLineWallHangingSignBlock(BlockBehaviour.Properties.copy(Blocks.CHERRY_WALL_HANGING_SIGN), WoodType.CHERRY));

    public static final RegistryObject<Block> ONE_LINE_BAMBOO_SIGN = BLOCKS.register("one_line_bamboo_sign",
            () -> new OneLineSignBlock(BlockBehaviour.Properties.copy(Blocks.BAMBOO_SIGN), WoodType.BAMBOO));
    public static final RegistryObject<Block> ONE_LINE_BAMBOO_WALL_SIGN = BLOCKS.register("one_line_bamboo_wall_sign",
            () -> new OneLineWallSignBlock(BlockBehaviour.Properties.copy(Blocks.BAMBOO_WALL_SIGN), WoodType.BAMBOO));
    public static final RegistryObject<Block> ONE_LINE_BAMBOO_HANGING_SIGN = BLOCKS.register("one_line_bamboo_hanging_sign",
            () -> new OneLineHangingSignBlock(BlockBehaviour.Properties.copy(Blocks.BAMBOO_HANGING_SIGN), WoodType.BAMBOO));
    public static final RegistryObject<Block> ONE_LINE_BAMBOO_WALL_HANGING_SIGN = BLOCKS.register("one_line_bamboo_wall_hanging_sign",
            () -> new OneLineWallHangingSignBlock(BlockBehaviour.Properties.copy(Blocks.BAMBOO_WALL_HANGING_SIGN), WoodType.BAMBOO));

    public static final RegistryObject<Block> ONE_LINE_CRIMSON_SIGN = BLOCKS.register("one_line_crimson_sign",
            () -> new OneLineSignBlock(BlockBehaviour.Properties.copy(Blocks.CRIMSON_SIGN), WoodType.CRIMSON));
    public static final RegistryObject<Block> ONE_LINE_CRIMSON_WALL_SIGN = BLOCKS.register("one_line_crimson_wall_sign",
            () -> new OneLineWallSignBlock(BlockBehaviour.Properties.copy(Blocks.CRIMSON_WALL_SIGN), WoodType.CRIMSON));
    public static final RegistryObject<Block> ONE_LINE_CRIMSON_HANGING_SIGN = BLOCKS.register("one_line_crimson_hanging_sign",
            () -> new OneLineHangingSignBlock(BlockBehaviour.Properties.copy(Blocks.CRIMSON_HANGING_SIGN), WoodType.CRIMSON));
    public static final RegistryObject<Block> ONE_LINE_CRIMSON_WALL_HANGING_SIGN = BLOCKS.register("one_line_crimson_wall_hanging_sign",
            () -> new OneLineWallHangingSignBlock(BlockBehaviour.Properties.copy(Blocks.CRIMSON_WALL_HANGING_SIGN), WoodType.CRIMSON));

    public static final RegistryObject<Block> ONE_LINE_WARPED_SIGN = BLOCKS.register("one_line_warped_sign",
            () -> new OneLineSignBlock(BlockBehaviour.Properties.copy(Blocks.WARPED_SIGN), WoodType.WARPED));
    public static final RegistryObject<Block> ONE_LINE_WARPED_WALL_SIGN = BLOCKS.register("one_line_warped_wall_sign",
            () -> new OneLineWallSignBlock(BlockBehaviour.Properties.copy(Blocks.WARPED_WALL_SIGN), WoodType.WARPED));
    public static final RegistryObject<Block> ONE_LINE_WARPED_HANGING_SIGN = BLOCKS.register("one_line_warped_hanging_sign",
            () -> new OneLineHangingSignBlock(BlockBehaviour.Properties.copy(Blocks.WARPED_HANGING_SIGN), WoodType.WARPED));
    public static final RegistryObject<Block> ONE_LINE_WARPED_WALL_HANGING_SIGN = BLOCKS.register("one_line_warped_wall_hanging_sign",
            () -> new OneLineWallHangingSignBlock(BlockBehaviour.Properties.copy(Blocks.WARPED_WALL_HANGING_SIGN), WoodType.WARPED));

    public static final RegistryObject<Block> ONE_LINE_BLACK_METAL_SIGN = BLOCKS.register("one_line_black_metal_sign",
            () -> new OneLineSignBlock(METAL_SIGN_PROPERTIES, ModWoodTypes.BLACK_METAL_SIGN));
    public static final RegistryObject<Block> ONE_LINE_BLACK_METAL_WALL_SIGN = BLOCKS.register("one_line_black_metal_wall_sign",
            () -> new OneLineWallSignBlock(METAL_WALL_SIGN_PROPERTIES, ModWoodTypes.BLACK_METAL_SIGN));
    public static final RegistryObject<Block> ONE_LINE_BLACK_METAL_HANGING_SIGN = BLOCKS.register("one_line_black_metal_hanging_sign",
            () -> new OneLineHangingSignBlock(METAL_HANGING_SIGN_PROPERTIES, ModWoodTypes.BLACK_METAL_SIGN));
    public static final RegistryObject<Block> ONE_LINE_BLACK_METAL_WALL_HANGING_SIGN = BLOCKS.register("one_line_black_metal_wall_hanging_sign",
            () -> new OneLineWallHangingSignBlock(METAL_WALL_HANGING_SIGN_PROPERTIES, ModWoodTypes.BLACK_METAL_SIGN));

    public static final RegistryObject<Block> ONE_LINE_BLUE_METAL_SIGN = BLOCKS.register("one_line_blue_metal_sign",
            () -> new OneLineSignBlock(METAL_SIGN_PROPERTIES, ModWoodTypes.BLUE_METAL_SIGN));
    public static final RegistryObject<Block> ONE_LINE_BLUE_METAL_WALL_SIGN = BLOCKS.register("one_line_blue_metal_wall_sign",
            () -> new OneLineWallSignBlock(METAL_WALL_SIGN_PROPERTIES, ModWoodTypes.BLUE_METAL_SIGN));
    public static final RegistryObject<Block> ONE_LINE_BLUE_METAL_HANGING_SIGN = BLOCKS.register("one_line_blue_metal_hanging_sign",
            () -> new OneLineHangingSignBlock(METAL_HANGING_SIGN_PROPERTIES, ModWoodTypes.BLUE_METAL_SIGN));
    public static final RegistryObject<Block> ONE_LINE_BLUE_METAL_WALL_HANGING_SIGN = BLOCKS.register("one_line_blue_metal_wall_hanging_sign",
            () -> new OneLineWallHangingSignBlock(METAL_WALL_HANGING_SIGN_PROPERTIES, ModWoodTypes.BLUE_METAL_SIGN));

    public static final RegistryObject<Block> ONE_LINE_BROWN_METAL_SIGN = BLOCKS.register("one_line_brown_metal_sign",
            () -> new OneLineSignBlock(METAL_SIGN_PROPERTIES, ModWoodTypes.BROWN_METAL_SIGN));
    public static final RegistryObject<Block> ONE_LINE_BROWN_METAL_WALL_SIGN = BLOCKS.register("one_line_brown_metal_wall_sign",
            () -> new OneLineWallSignBlock(METAL_WALL_SIGN_PROPERTIES, ModWoodTypes.BROWN_METAL_SIGN));
    public static final RegistryObject<Block> ONE_LINE_BROWN_METAL_HANGING_SIGN = BLOCKS.register("one_line_brown_metal_hanging_sign",
            () -> new OneLineHangingSignBlock(METAL_HANGING_SIGN_PROPERTIES, ModWoodTypes.BROWN_METAL_SIGN));
    public static final RegistryObject<Block> ONE_LINE_BROWN_METAL_WALL_HANGING_SIGN = BLOCKS.register("one_line_brown_metal_wall_hanging_sign",
            () -> new OneLineWallHangingSignBlock(METAL_WALL_HANGING_SIGN_PROPERTIES, ModWoodTypes.BROWN_METAL_SIGN));

    public static final RegistryObject<Block> ONE_LINE_CREAM_METAL_SIGN = BLOCKS.register("one_line_cream_metal_sign",
            () -> new OneLineSignBlock(METAL_SIGN_PROPERTIES, ModWoodTypes.CREAM_METAL_SIGN));
    public static final RegistryObject<Block> ONE_LINE_CREAM_METAL_WALL_SIGN = BLOCKS.register("one_line_cream_metal_wall_sign",
            () -> new OneLineWallSignBlock(METAL_WALL_SIGN_PROPERTIES, ModWoodTypes.CREAM_METAL_SIGN));
    public static final RegistryObject<Block> ONE_LINE_CREAM_METAL_HANGING_SIGN = BLOCKS.register("one_line_cream_metal_hanging_sign",
            () -> new OneLineHangingSignBlock(METAL_HANGING_SIGN_PROPERTIES, ModWoodTypes.CREAM_METAL_SIGN));
    public static final RegistryObject<Block> ONE_LINE_CREAM_METAL_WALL_HANGING_SIGN = BLOCKS.register("one_line_cream_metal_wall_hanging_sign",
            () -> new OneLineWallHangingSignBlock(METAL_WALL_HANGING_SIGN_PROPERTIES, ModWoodTypes.CREAM_METAL_SIGN));

    public static final RegistryObject<Block> ONE_LINE_CYAN_METAL_SIGN = BLOCKS.register("one_line_cyan_metal_sign",
            () -> new OneLineSignBlock(METAL_SIGN_PROPERTIES, ModWoodTypes.CYAN_METAL_SIGN));
    public static final RegistryObject<Block> ONE_LINE_CYAN_METAL_WALL_SIGN = BLOCKS.register("one_line_cyan_metal_wall_sign",
            () -> new OneLineWallSignBlock(METAL_WALL_SIGN_PROPERTIES, ModWoodTypes.CYAN_METAL_SIGN));
    public static final RegistryObject<Block> ONE_LINE_CYAN_METAL_HANGING_SIGN = BLOCKS.register("one_line_cyan_metal_hanging_sign",
            () -> new OneLineHangingSignBlock(METAL_HANGING_SIGN_PROPERTIES, ModWoodTypes.CYAN_METAL_SIGN));
    public static final RegistryObject<Block> ONE_LINE_CYAN_METAL_WALL_HANGING_SIGN = BLOCKS.register("one_line_cyan_metal_wall_hanging_sign",
            () -> new OneLineWallHangingSignBlock(METAL_WALL_HANGING_SIGN_PROPERTIES, ModWoodTypes.CYAN_METAL_SIGN));

    public static final RegistryObject<Block> ONE_LINE_DARK_ORANGE_METAL_SIGN = BLOCKS.register("one_line_dark_orange_metal_sign",
            () -> new OneLineSignBlock(METAL_SIGN_PROPERTIES, ModWoodTypes.DARK_ORANGE_METAL_SIGN));
    public static final RegistryObject<Block> ONE_LINE_DARK_ORANGE_METAL_WALL_SIGN = BLOCKS.register("one_line_dark_orange_metal_wall_sign",
            () -> new OneLineWallSignBlock(METAL_WALL_SIGN_PROPERTIES, ModWoodTypes.DARK_ORANGE_METAL_SIGN));
    public static final RegistryObject<Block> ONE_LINE_DARK_ORANGE_METAL_HANGING_SIGN = BLOCKS.register("one_line_dark_orange_metal_hanging_sign",
            () -> new OneLineHangingSignBlock(METAL_HANGING_SIGN_PROPERTIES, ModWoodTypes.DARK_ORANGE_METAL_SIGN));
    public static final RegistryObject<Block> ONE_LINE_DARK_ORANGE_METAL_WALL_HANGING_SIGN = BLOCKS.register("one_line_dark_orange_metal_wall_hanging_sign",
            () -> new OneLineWallHangingSignBlock(METAL_WALL_HANGING_SIGN_PROPERTIES, ModWoodTypes.DARK_ORANGE_METAL_SIGN));

    public static final RegistryObject<Block> ONE_LINE_DARK_PINK_METAL_SIGN = BLOCKS.register("one_line_dark_pink_metal_sign",
            () -> new OneLineSignBlock(METAL_SIGN_PROPERTIES, ModWoodTypes.DARK_PINK_METAL_SIGN));
    public static final RegistryObject<Block> ONE_LINE_DARK_PINK_METAL_WALL_SIGN = BLOCKS.register("one_line_dark_pink_metal_wall_sign",
            () -> new OneLineWallSignBlock(METAL_WALL_SIGN_PROPERTIES, ModWoodTypes.DARK_PINK_METAL_SIGN));
    public static final RegistryObject<Block> ONE_LINE_DARK_PINK_METAL_HANGING_SIGN = BLOCKS.register("one_line_dark_pink_metal_hanging_sign",
            () -> new OneLineHangingSignBlock(METAL_HANGING_SIGN_PROPERTIES, ModWoodTypes.DARK_PINK_METAL_SIGN));
    public static final RegistryObject<Block> ONE_LINE_DARK_PINK_METAL_WALL_HANGING_SIGN = BLOCKS.register("one_line_dark_pink_metal_wall_hanging_sign",
            () -> new OneLineWallHangingSignBlock(METAL_WALL_HANGING_SIGN_PROPERTIES, ModWoodTypes.DARK_PINK_METAL_SIGN));

    public static final RegistryObject<Block> ONE_LINE_DARK_RED_METAL_SIGN = BLOCKS.register("one_line_dark_red_metal_sign",
            () -> new OneLineSignBlock(METAL_SIGN_PROPERTIES, ModWoodTypes.DARK_RED_METAL_SIGN));
    public static final RegistryObject<Block> ONE_LINE_DARK_RED_METAL_WALL_SIGN = BLOCKS.register("one_line_dark_red_metal_wall_sign",
            () -> new OneLineWallSignBlock(METAL_WALL_SIGN_PROPERTIES, ModWoodTypes.DARK_RED_METAL_SIGN));
    public static final RegistryObject<Block> ONE_LINE_DARK_RED_METAL_HANGING_SIGN = BLOCKS.register("one_line_dark_red_metal_hanging_sign",
            () -> new OneLineHangingSignBlock(METAL_HANGING_SIGN_PROPERTIES, ModWoodTypes.DARK_RED_METAL_SIGN));
    public static final RegistryObject<Block> ONE_LINE_DARK_RED_METAL_WALL_HANGING_SIGN = BLOCKS.register("one_line_dark_red_metal_wall_hanging_sign",
            () -> new OneLineWallHangingSignBlock(METAL_WALL_HANGING_SIGN_PROPERTIES, ModWoodTypes.DARK_RED_METAL_SIGN));

    public static final RegistryObject<Block> ONE_LINE_GRAY_METAL_SIGN = BLOCKS.register("one_line_gray_metal_sign",
            () -> new OneLineSignBlock(METAL_SIGN_PROPERTIES, ModWoodTypes.GRAY_METAL_SIGN));
    public static final RegistryObject<Block> ONE_LINE_GRAY_METAL_WALL_SIGN = BLOCKS.register("one_line_gray_metal_wall_sign",
            () -> new OneLineWallSignBlock(METAL_WALL_SIGN_PROPERTIES, ModWoodTypes.GRAY_METAL_SIGN));
    public static final RegistryObject<Block> ONE_LINE_GRAY_METAL_HANGING_SIGN = BLOCKS.register("one_line_gray_metal_hanging_sign",
            () -> new OneLineHangingSignBlock(METAL_HANGING_SIGN_PROPERTIES, ModWoodTypes.GRAY_METAL_SIGN));
    public static final RegistryObject<Block> ONE_LINE_GRAY_METAL_WALL_HANGING_SIGN = BLOCKS.register("one_line_gray_metal_wall_hanging_sign",
            () -> new OneLineWallHangingSignBlock(METAL_WALL_HANGING_SIGN_PROPERTIES, ModWoodTypes.GRAY_METAL_SIGN));

    public static final RegistryObject<Block> ONE_LINE_GREEN_METAL_SIGN = BLOCKS.register("one_line_green_metal_sign",
            () -> new OneLineSignBlock(METAL_SIGN_PROPERTIES, ModWoodTypes.GREEN_METAL_SIGN));
    public static final RegistryObject<Block> ONE_LINE_GREEN_METAL_WALL_SIGN = BLOCKS.register("one_line_green_metal_wall_sign",
            () -> new OneLineWallSignBlock(METAL_WALL_SIGN_PROPERTIES, ModWoodTypes.GREEN_METAL_SIGN));
    public static final RegistryObject<Block> ONE_LINE_GREEN_METAL_HANGING_SIGN = BLOCKS.register("one_line_green_metal_hanging_sign",
            () -> new OneLineHangingSignBlock(METAL_HANGING_SIGN_PROPERTIES, ModWoodTypes.GREEN_METAL_SIGN));
    public static final RegistryObject<Block> ONE_LINE_GREEN_METAL_WALL_HANGING_SIGN = BLOCKS.register("one_line_green_metal_wall_hanging_sign",
            () -> new OneLineWallHangingSignBlock(METAL_WALL_HANGING_SIGN_PROPERTIES, ModWoodTypes.GREEN_METAL_SIGN));

    public static final RegistryObject<Block> ONE_LINE_LIGHT_BLUE_METAL_SIGN = BLOCKS.register("one_line_light_blue_metal_sign",
            () -> new OneLineSignBlock(METAL_SIGN_PROPERTIES, ModWoodTypes.LIGHT_BLUE_METAL_SIGN));
    public static final RegistryObject<Block> ONE_LINE_LIGHT_BLUE_METAL_WALL_SIGN = BLOCKS.register("one_line_light_blue_metal_wall_sign",
            () -> new OneLineWallSignBlock(METAL_WALL_SIGN_PROPERTIES, ModWoodTypes.LIGHT_BLUE_METAL_SIGN));
    public static final RegistryObject<Block> ONE_LINE_LIGHT_BLUE_METAL_HANGING_SIGN = BLOCKS.register("one_line_light_blue_metal_hanging_sign",
            () -> new OneLineHangingSignBlock(METAL_HANGING_SIGN_PROPERTIES, ModWoodTypes.LIGHT_BLUE_METAL_SIGN));
    public static final RegistryObject<Block> ONE_LINE_LIGHT_BLUE_METAL_WALL_HANGING_SIGN = BLOCKS.register("one_line_light_blue_metal_wall_hanging_sign",
            () -> new OneLineWallHangingSignBlock(METAL_WALL_HANGING_SIGN_PROPERTIES, ModWoodTypes.LIGHT_BLUE_METAL_SIGN));

    public static final RegistryObject<Block> ONE_LINE_LIGHT_GRAY_METAL_SIGN = BLOCKS.register("one_line_light_gray_metal_sign",
            () -> new OneLineSignBlock(METAL_SIGN_PROPERTIES, ModWoodTypes.LIGHT_GRAY_METAL_SIGN));
    public static final RegistryObject<Block> ONE_LINE_LIGHT_GRAY_METAL_WALL_SIGN = BLOCKS.register("one_line_light_gray_metal_wall_sign",
            () -> new OneLineWallSignBlock(METAL_WALL_SIGN_PROPERTIES, ModWoodTypes.LIGHT_GRAY_METAL_SIGN));
    public static final RegistryObject<Block> ONE_LINE_LIGHT_GRAY_METAL_HANGING_SIGN = BLOCKS.register("one_line_light_gray_metal_hanging_sign",
            () -> new OneLineHangingSignBlock(METAL_HANGING_SIGN_PROPERTIES, ModWoodTypes.LIGHT_GRAY_METAL_SIGN));
    public static final RegistryObject<Block> ONE_LINE_LIGHT_GRAY_METAL_WALL_HANGING_SIGN = BLOCKS.register("one_line_light_gray_metal_wall_hanging_sign",
            () -> new OneLineWallHangingSignBlock(METAL_WALL_HANGING_SIGN_PROPERTIES, ModWoodTypes.LIGHT_GRAY_METAL_SIGN));

    public static final RegistryObject<Block> ONE_LINE_LIME_METAL_SIGN = BLOCKS.register("one_line_lime_metal_sign",
            () -> new OneLineSignBlock(METAL_SIGN_PROPERTIES, ModWoodTypes.LIME_METAL_SIGN));
    public static final RegistryObject<Block> ONE_LINE_LIME_METAL_WALL_SIGN = BLOCKS.register("one_line_lime_metal_wall_sign",
            () -> new OneLineWallSignBlock(METAL_WALL_SIGN_PROPERTIES, ModWoodTypes.LIME_METAL_SIGN));
    public static final RegistryObject<Block> ONE_LINE_LIME_METAL_HANGING_SIGN = BLOCKS.register("one_line_lime_metal_hanging_sign",
            () -> new OneLineHangingSignBlock(METAL_HANGING_SIGN_PROPERTIES, ModWoodTypes.LIME_METAL_SIGN));
    public static final RegistryObject<Block> ONE_LINE_LIME_METAL_WALL_HANGING_SIGN = BLOCKS.register("one_line_lime_metal_wall_hanging_sign",
            () -> new OneLineWallHangingSignBlock(METAL_WALL_HANGING_SIGN_PROPERTIES, ModWoodTypes.LIME_METAL_SIGN));

    public static final RegistryObject<Block> ONE_LINE_MAGENTA_METAL_SIGN = BLOCKS.register("one_line_magenta_metal_sign",
            () -> new OneLineSignBlock(METAL_SIGN_PROPERTIES, ModWoodTypes.MAGENTA_METAL_SIGN));
    public static final RegistryObject<Block> ONE_LINE_MAGENTA_METAL_WALL_SIGN = BLOCKS.register("one_line_magenta_metal_wall_sign",
            () -> new OneLineWallSignBlock(METAL_WALL_SIGN_PROPERTIES, ModWoodTypes.MAGENTA_METAL_SIGN));
    public static final RegistryObject<Block> ONE_LINE_MAGENTA_METAL_HANGING_SIGN = BLOCKS.register("one_line_magenta_metal_hanging_sign",
            () -> new OneLineHangingSignBlock(METAL_HANGING_SIGN_PROPERTIES, ModWoodTypes.MAGENTA_METAL_SIGN));
    public static final RegistryObject<Block> ONE_LINE_MAGENTA_METAL_WALL_HANGING_SIGN = BLOCKS.register("one_line_magenta_metal_wall_hanging_sign",
            () -> new OneLineWallHangingSignBlock(METAL_WALL_HANGING_SIGN_PROPERTIES, ModWoodTypes.MAGENTA_METAL_SIGN));

    public static final RegistryObject<Block> ONE_LINE_ORANGE_METAL_SIGN = BLOCKS.register("one_line_orange_metal_sign",
            () -> new OneLineSignBlock(METAL_SIGN_PROPERTIES, ModWoodTypes.ORANGE_METAL_SIGN));
    public static final RegistryObject<Block> ONE_LINE_ORANGE_METAL_WALL_SIGN = BLOCKS.register("one_line_orange_metal_wall_sign",
            () -> new OneLineWallSignBlock(METAL_WALL_SIGN_PROPERTIES, ModWoodTypes.ORANGE_METAL_SIGN));
    public static final RegistryObject<Block> ONE_LINE_ORANGE_METAL_HANGING_SIGN = BLOCKS.register("one_line_orange_metal_hanging_sign",
            () -> new OneLineHangingSignBlock(METAL_HANGING_SIGN_PROPERTIES, ModWoodTypes.ORANGE_METAL_SIGN));
    public static final RegistryObject<Block> ONE_LINE_ORANGE_METAL_WALL_HANGING_SIGN = BLOCKS.register("one_line_orange_metal_wall_hanging_sign",
            () -> new OneLineWallHangingSignBlock(METAL_WALL_HANGING_SIGN_PROPERTIES, ModWoodTypes.ORANGE_METAL_SIGN));

    public static final RegistryObject<Block> ONE_LINE_PINK_METAL_SIGN = BLOCKS.register("one_line_pink_metal_sign",
            () -> new OneLineSignBlock(METAL_SIGN_PROPERTIES, ModWoodTypes.PINK_METAL_SIGN));
    public static final RegistryObject<Block> ONE_LINE_PINK_METAL_WALL_SIGN = BLOCKS.register("one_line_pink_metal_wall_sign",
            () -> new OneLineWallSignBlock(METAL_WALL_SIGN_PROPERTIES, ModWoodTypes.PINK_METAL_SIGN));
    public static final RegistryObject<Block> ONE_LINE_PINK_METAL_HANGING_SIGN = BLOCKS.register("one_line_pink_metal_hanging_sign",
            () -> new OneLineHangingSignBlock(METAL_HANGING_SIGN_PROPERTIES, ModWoodTypes.PINK_METAL_SIGN));
    public static final RegistryObject<Block> ONE_LINE_PINK_METAL_WALL_HANGING_SIGN = BLOCKS.register("one_line_pink_metal_wall_hanging_sign",
            () -> new OneLineWallHangingSignBlock(METAL_WALL_HANGING_SIGN_PROPERTIES, ModWoodTypes.PINK_METAL_SIGN));

    public static final RegistryObject<Block> ONE_LINE_PURPLE_METAL_SIGN = BLOCKS.register("one_line_purple_metal_sign",
            () -> new OneLineSignBlock(METAL_SIGN_PROPERTIES, ModWoodTypes.PURPLE_METAL_SIGN));
    public static final RegistryObject<Block> ONE_LINE_PURPLE_METAL_WALL_SIGN = BLOCKS.register("one_line_purple_metal_wall_sign",
            () -> new OneLineWallSignBlock(METAL_WALL_SIGN_PROPERTIES, ModWoodTypes.PURPLE_METAL_SIGN));
    public static final RegistryObject<Block> ONE_LINE_PURPLE_METAL_HANGING_SIGN = BLOCKS.register("one_line_purple_metal_hanging_sign",
            () -> new OneLineHangingSignBlock(METAL_HANGING_SIGN_PROPERTIES, ModWoodTypes.PURPLE_METAL_SIGN));
    public static final RegistryObject<Block> ONE_LINE_PURPLE_METAL_WALL_HANGING_SIGN = BLOCKS.register("one_line_purple_metal_wall_hanging_sign",
            () -> new OneLineWallHangingSignBlock(METAL_WALL_HANGING_SIGN_PROPERTIES, ModWoodTypes.PURPLE_METAL_SIGN));

    public static final RegistryObject<Block> ONE_LINE_RED_METAL_SIGN = BLOCKS.register("one_line_red_metal_sign",
            () -> new OneLineSignBlock(METAL_SIGN_PROPERTIES, ModWoodTypes.RED_METAL_SIGN));
    public static final RegistryObject<Block> ONE_LINE_RED_METAL_WALL_SIGN = BLOCKS.register("one_line_red_metal_wall_sign",
            () -> new OneLineWallSignBlock(METAL_WALL_SIGN_PROPERTIES, ModWoodTypes.RED_METAL_SIGN));
    public static final RegistryObject<Block> ONE_LINE_RED_METAL_HANGING_SIGN = BLOCKS.register("one_line_red_metal_hanging_sign",
            () -> new OneLineHangingSignBlock(METAL_HANGING_SIGN_PROPERTIES, ModWoodTypes.RED_METAL_SIGN));
    public static final RegistryObject<Block> ONE_LINE_RED_METAL_WALL_HANGING_SIGN = BLOCKS.register("one_line_red_metal_wall_hanging_sign",
            () -> new OneLineWallHangingSignBlock(METAL_WALL_HANGING_SIGN_PROPERTIES, ModWoodTypes.RED_METAL_SIGN));

    public static final RegistryObject<Block> ONE_LINE_WHITE_METAL_SIGN = BLOCKS.register("one_line_white_metal_sign",
            () -> new OneLineSignBlock(METAL_SIGN_PROPERTIES, ModWoodTypes.WHITE_METAL_SIGN));
    public static final RegistryObject<Block> ONE_LINE_WHITE_METAL_WALL_SIGN = BLOCKS.register("one_line_white_metal_wall_sign",
            () -> new OneLineWallSignBlock(METAL_WALL_SIGN_PROPERTIES, ModWoodTypes.WHITE_METAL_SIGN));
    public static final RegistryObject<Block> ONE_LINE_WHITE_METAL_HANGING_SIGN = BLOCKS.register("one_line_white_metal_hanging_sign",
            () -> new OneLineHangingSignBlock(METAL_HANGING_SIGN_PROPERTIES, ModWoodTypes.WHITE_METAL_SIGN));
    public static final RegistryObject<Block> ONE_LINE_WHITE_METAL_WALL_HANGING_SIGN = BLOCKS.register("one_line_white_metal_wall_hanging_sign",
            () -> new OneLineWallHangingSignBlock(METAL_WALL_HANGING_SIGN_PROPERTIES, ModWoodTypes.WHITE_METAL_SIGN));

    public static final RegistryObject<Block> ONE_LINE_YELLOW_METAL_SIGN = BLOCKS.register("one_line_yellow_metal_sign",
            () -> new OneLineSignBlock(METAL_SIGN_PROPERTIES, ModWoodTypes.YELLOW_METAL_SIGN));
    public static final RegistryObject<Block> ONE_LINE_YELLOW_METAL_WALL_SIGN = BLOCKS.register("one_line_yellow_metal_wall_sign",
            () -> new OneLineWallSignBlock(METAL_WALL_SIGN_PROPERTIES, ModWoodTypes.YELLOW_METAL_SIGN));
    public static final RegistryObject<Block> ONE_LINE_YELLOW_METAL_HANGING_SIGN = BLOCKS.register("one_line_yellow_metal_hanging_sign",
            () -> new OneLineHangingSignBlock(METAL_HANGING_SIGN_PROPERTIES, ModWoodTypes.YELLOW_METAL_SIGN));
    public static final RegistryObject<Block> ONE_LINE_YELLOW_METAL_WALL_HANGING_SIGN = BLOCKS.register("one_line_yellow_metal_wall_hanging_sign",
            () -> new OneLineWallHangingSignBlock(METAL_WALL_HANGING_SIGN_PROPERTIES, ModWoodTypes.YELLOW_METAL_SIGN));

    /*
    *   THIN SIGNS
     */
    public static final RegistryObject<Block> THIN_SIGN = BLOCKS.register("thin_sign",
            () -> new ThinSignBlock(METAL_WALL_SIGN_PROPERTIES, ModWoodTypes.BLACK_METAL_SIGN));
    public static final RegistryObject<Block> THIN_SIGN_FLOOR = BLOCKS.register("thin_sign_floor",
            () -> new StandingSignBlock(METAL_SIGN_PROPERTIES, ModWoodTypes.BLACK_METAL_SIGN));

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
