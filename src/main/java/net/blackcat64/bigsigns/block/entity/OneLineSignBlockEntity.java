package net.blackcat64.bigsigns.block.entity;

import net.minecraft.core.BlockPos;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.entity.SignBlockEntity;
import net.minecraft.world.level.block.state.BlockState;

public class OneLineSignBlockEntity extends SignBlockEntity {

    public OneLineSignBlockEntity(BlockPos pPos, BlockState pBlockState) {
        super(ModBlockEntities.ONE_LINE_SIGN.get(), pPos, pBlockState);
    }

    @Override
    public BlockEntityType<?> getType() {
        return ModBlockEntities.ONE_LINE_SIGN.get();
    }
}