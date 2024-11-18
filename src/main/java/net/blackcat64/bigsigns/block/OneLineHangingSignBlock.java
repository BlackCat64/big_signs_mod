package net.blackcat64.bigsigns.block;

import net.blackcat64.bigsigns.block.entity.OneLineHangingSignBlockEntity;
import net.minecraft.core.BlockPos;
import net.minecraft.world.level.block.CeilingHangingSignBlock;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.properties.WoodType;

public class OneLineHangingSignBlock extends CeilingHangingSignBlock {

    public OneLineHangingSignBlock(Properties pProperties, WoodType pType) {
        super(pProperties, pType);
    }

    @Override
    public BlockEntity newBlockEntity(BlockPos pPos, BlockState pState) {
        return new OneLineHangingSignBlockEntity(pPos, pState);
    }
}
