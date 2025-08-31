package net.blackcat64.bigsigns.item;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.SignItem;
import net.minecraft.world.level.block.Block;

public class ThinSignItem extends SignItem {
    private static String type;

    public ThinSignItem(Properties pProperties, Block pStandingBlock, Block pWallBlock, String pType) {
        super(pProperties, pStandingBlock, pWallBlock);
        type = pType;
    }

    @Override
    public String getDescriptionId() { // override item name, so that it doesn't use the thin sign block
        return "block.big_signs.thin_" + type + "_sign";
    }
}
