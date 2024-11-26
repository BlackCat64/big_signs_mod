package net.blackcat64.bigsigns.block.entity;

import net.minecraft.core.BlockPos;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.entity.SignBlockEntity;
import net.minecraft.world.level.block.state.BlockState;

public class OneLineHangingSignBlockEntity extends SignBlockEntity {

    public OneLineHangingSignBlockEntity(BlockPos pPos, BlockState pBlockState) {
        super(ModBlockEntities.ONE_LINE_HANGING_SIGN.get(), pPos, pBlockState);
    }

    @Override
    public BlockEntityType<?> getType() {
        return ModBlockEntities.ONE_LINE_HANGING_SIGN.get();
    }

    @Override
    public int getMaxTextLineWidth() {
        return 19;
    }

    @Override
    public int getTextLineHeight() {
        return 4;
    }
}
