package net.blackcat64.bigsigns.item;

import net.blackcat64.bigsigns.block.SignVariants;
import net.blackcat64.bigsigns.block.entity.ThinSignBlockEntity;
import net.minecraft.core.BlockPos;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.SignItem;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;

import javax.annotation.Nullable;

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

    @Override
    protected boolean updateCustomBlockEntityTag(BlockPos pos, Level level,
                                                 @Nullable Player player, ItemStack stack, BlockState state) {
        boolean result = super.updateCustomBlockEntityTag(pos, level, player, stack, state);

        // sets the sign variant when it is placed
        if (level.getBlockEntity(pos) instanceof ThinSignBlockEntity be) {
            be.setVariant1(variant); // TODO - Set variant depending on height the player is looking at on the block face.
        }
        return result;
    }
}
