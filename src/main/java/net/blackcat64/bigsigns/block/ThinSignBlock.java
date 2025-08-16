package net.blackcat64.bigsigns.block;

import net.blackcat64.bigsigns.block.entity.ThinSignBlockEntity;
import net.minecraft.core.BlockPos;
import net.minecraft.world.level.block.WallSignBlock;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.properties.WoodType;

public class ThinSignBlock extends WallSignBlock {
    public ThinSignBlock(Properties pProperties, WoodType pType) {
        super(pProperties, pType);
    }

    @Override
    public BlockEntity newBlockEntity(BlockPos pPos, BlockState pState) {
        return new ThinSignBlockEntity(pPos, pState);
    }
}
