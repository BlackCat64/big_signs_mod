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
