package net.blackcat64.bigsigns.item;

import net.blackcat64.bigsigns.BigSignsMod;
import net.blackcat64.bigsigns.block.ModBlocks;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.SignItem;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, BigSignsMod.MOD_ID);

    public static final RegistryObject<Item> ONE_LINE_OAK_SIGN = ITEMS.register("one_line_oak_sign",
            () -> new SignItem(new Item.Properties().stacksTo(16), ModBlocks.ONE_LINE_OAK_SIGN.get(), ModBlocks.ONE_LINE_OAK_WALL_SIGN.get()));


    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
