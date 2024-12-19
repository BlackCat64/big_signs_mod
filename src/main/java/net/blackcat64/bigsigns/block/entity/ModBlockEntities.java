package net.blackcat64.bigsigns.block.entity;

import net.blackcat64.bigsigns.BigSignsMod;
import net.blackcat64.bigsigns.block.ModBlocks;
import net.blackcat64.bigsigns.block.entity.OneLineSignBlockEntity;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModBlockEntities {
    public static final DeferredRegister<BlockEntityType<?>> BLOCK_ENTITIES = DeferredRegister.create(ForgeRegistries.BLOCK_ENTITY_TYPES, BigSignsMod.MOD_ID);

    public static final RegistryObject<BlockEntityType<OneLineSignBlockEntity>> ONE_LINE_SIGN =
            BLOCK_ENTITIES.register("one_line_sign", () ->
                    BlockEntityType.Builder.of(OneLineSignBlockEntity::new,
                            ModBlocks.ONE_LINE_OAK_SIGN.get(), ModBlocks.ONE_LINE_OAK_WALL_SIGN.get(),
                            ModBlocks.ONE_LINE_SPRUCE_SIGN.get(), ModBlocks.ONE_LINE_SPRUCE_WALL_SIGN.get(),
                            ModBlocks.ONE_LINE_BIRCH_SIGN.get(), ModBlocks.ONE_LINE_BIRCH_WALL_SIGN.get(),
                            ModBlocks.ONE_LINE_JUNGLE_SIGN.get(), ModBlocks.ONE_LINE_JUNGLE_WALL_SIGN.get(),
                            ModBlocks.ONE_LINE_ACACIA_SIGN.get(), ModBlocks.ONE_LINE_ACACIA_WALL_SIGN.get(),
                            ModBlocks.ONE_LINE_DARK_OAK_SIGN.get(), ModBlocks.ONE_LINE_DARK_OAK_WALL_SIGN.get(),
                            ModBlocks.ONE_LINE_MANGROVE_SIGN.get(), ModBlocks.ONE_LINE_MANGROVE_WALL_SIGN.get(),
                            ModBlocks.ONE_LINE_CHERRY_SIGN.get(), ModBlocks.ONE_LINE_CHERRY_WALL_SIGN.get(),
                            ModBlocks.ONE_LINE_BAMBOO_SIGN.get(), ModBlocks.ONE_LINE_BAMBOO_WALL_SIGN.get(),
                            ModBlocks.ONE_LINE_CRIMSON_SIGN.get(), ModBlocks.ONE_LINE_CRIMSON_WALL_SIGN.get(),
                            ModBlocks.ONE_LINE_WARPED_SIGN.get(), ModBlocks.ONE_LINE_WARPED_WALL_SIGN.get(),
                            ModBlocks.ONE_LINE_BLACK_METAL_SIGN.get(), ModBlocks.ONE_LINE_BLACK_METAL_WALL_SIGN.get()).build(null));

    public static final RegistryObject<BlockEntityType<OneLineHangingSignBlockEntity>> ONE_LINE_HANGING_SIGN =
            BLOCK_ENTITIES.register("one_line_hanging_sign", () ->
                    BlockEntityType.Builder.of(OneLineHangingSignBlockEntity::new,
                            ModBlocks.ONE_LINE_OAK_HANGING_SIGN.get(), ModBlocks.ONE_LINE_OAK_WALL_HANGING_SIGN.get(),
                            ModBlocks.ONE_LINE_SPRUCE_HANGING_SIGN.get(), ModBlocks.ONE_LINE_SPRUCE_WALL_HANGING_SIGN.get(),
                            ModBlocks.ONE_LINE_BIRCH_HANGING_SIGN.get(), ModBlocks.ONE_LINE_BIRCH_WALL_HANGING_SIGN.get(),
                            ModBlocks.ONE_LINE_JUNGLE_HANGING_SIGN.get(), ModBlocks.ONE_LINE_JUNGLE_WALL_HANGING_SIGN.get(),
                            ModBlocks.ONE_LINE_ACACIA_HANGING_SIGN.get(), ModBlocks.ONE_LINE_ACACIA_WALL_HANGING_SIGN.get(),
                            ModBlocks.ONE_LINE_DARK_OAK_HANGING_SIGN.get(), ModBlocks.ONE_LINE_DARK_OAK_WALL_HANGING_SIGN.get(),
                            ModBlocks.ONE_LINE_MANGROVE_HANGING_SIGN.get(), ModBlocks.ONE_LINE_MANGROVE_WALL_HANGING_SIGN.get(),
                            ModBlocks.ONE_LINE_CHERRY_HANGING_SIGN.get(), ModBlocks.ONE_LINE_CHERRY_WALL_HANGING_SIGN.get(),
                            ModBlocks.ONE_LINE_BAMBOO_HANGING_SIGN.get(), ModBlocks.ONE_LINE_BAMBOO_WALL_HANGING_SIGN.get(),
                            ModBlocks.ONE_LINE_CRIMSON_HANGING_SIGN.get(), ModBlocks.ONE_LINE_CRIMSON_WALL_HANGING_SIGN.get(),
                            ModBlocks.ONE_LINE_WARPED_HANGING_SIGN.get(), ModBlocks.ONE_LINE_WARPED_WALL_HANGING_SIGN.get()).build(null));

    public static void register(IEventBus eventBus) {
        BLOCK_ENTITIES.register(eventBus);
    }
}