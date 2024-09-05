package net.blackcat64.bigsigns.block;

import net.blackcat64.bigsigns.block.entity.OneLineSignBlockEntity;
import net.minecraft.core.BlockPos;
import net.minecraft.world.level.block.WallSignBlock;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.properties.WoodType;

public class OneLineWallSignBlock extends WallSignBlock {
    public OneLineWallSignBlock(Properties pProperties, WoodType pType) {
        super(pProperties, pType);
    }

    @Override
    public BlockEntity newBlockEntity(BlockPos pPos, BlockState pState) {
        return new OneLineSignBlockEntity(pPos, pState);
    }
}
