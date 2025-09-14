package net.blackcat64.bigsigns.item;

import net.blackcat64.bigsigns.block.SignVariants;
import net.minecraft.world.item.SignItem;
import net.minecraft.world.level.block.Block;

public class ThinSignItem extends SignItem {
    private static SignVariants variant;

    public ThinSignItem(Properties pProperties, Block pStandingBlock, Block pWallBlock, SignVariants pVariant) {
        super(pProperties, pStandingBlock, pWallBlock);
        variant = pVariant;
    }

    @Override
    public String getDescriptionId() { // override item name, so that it doesn't use the thin sign block
        return "block.big_signs.thin_" + variant.getSerializedName() + "_sign";
    }
}
