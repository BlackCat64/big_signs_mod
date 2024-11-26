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
                    .icon(() -> new ItemStack(Items.OAK_SIGN))
                    .title(Component.translatable("creativetab.signs_tab"))
                    .displayItems((pParameters, pOutput) -> {
                        // add regular sign items
                        pOutput.accept(Items.OAK_SIGN);
                        pOutput.accept(Items.SPRUCE_SIGN);
                        pOutput.accept(Items.BIRCH_SIGN);
                        pOutput.accept(Items.JUNGLE_SIGN);
                        pOutput.accept(Items.ACACIA_SIGN);
                        pOutput.accept(Items.DARK_OAK_SIGN);
                        pOutput.accept(Items.MANGROVE_SIGN);
                        pOutput.accept(Items.CHERRY_SIGN);
                        pOutput.accept(Items.BAMBOO_SIGN);
                        pOutput.accept(Items.CRIMSON_SIGN);
                        pOutput.accept(Items.WARPED_SIGN);

                        // add hanging sign items
                        pOutput.accept(Items.OAK_HANGING_SIGN);
                        pOutput.accept(Items.SPRUCE_HANGING_SIGN);
                        pOutput.accept(Items.BIRCH_HANGING_SIGN);
                        pOutput.accept(Items.JUNGLE_HANGING_SIGN);
                        pOutput.accept(Items.ACACIA_HANGING_SIGN);
                        pOutput.accept(Items.DARK_OAK_HANGING_SIGN);
                        pOutput.accept(Items.MANGROVE_HANGING_SIGN);
                        pOutput.accept(Items.CHERRY_HANGING_SIGN);
                        pOutput.accept(Items.BAMBOO_HANGING_SIGN);
                        pOutput.accept(Items.CRIMSON_HANGING_SIGN);
                        pOutput.accept(Items.WARPED_HANGING_SIGN);

                        // add one-line sign items
                        pOutput.accept(ModItems.ONE_LINE_OAK_SIGN.get());
                        pOutput.accept(ModItems.ONE_LINE_SPRUCE_SIGN.get());
                        pOutput.accept(ModItems.ONE_LINE_BIRCH_SIGN.get());

                        // add one-line hanging sign items
                        pOutput.accept(ModItems.ONE_LINE_OAK_HANGING_SIGN.get());
                        pOutput.accept(ModItems.ONE_LINE_SPRUCE_HANGING_SIGN.get());
                        pOutput.accept(ModItems.ONE_LINE_BIRCH_HANGING_SIGN.get());
                    })
                    .build());


    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
