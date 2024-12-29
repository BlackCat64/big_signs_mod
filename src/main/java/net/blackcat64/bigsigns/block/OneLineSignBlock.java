package net.blackcat64.bigsigns.block;

import net.blackcat64.bigsigns.block.entity.OneLineSignBlockEntity;
import net.minecraft.core.BlockPos;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.level.LevelReader;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.StandingSignBlock;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.properties.WoodType;
import org.jetbrains.annotations.Nullable;

public class OneLineSignBlock extends StandingSignBlock {

    public OneLineSignBlock(Properties pProperties, WoodType pType) {
        super(pProperties, pType);
    }

    @Override
    public BlockEntity newBlockEntity(BlockPos pPos, BlockState pState) {
        return new OneLineSignBlockEntity(pPos, pState);
    }

    @Override
    public SoundType getSoundType(BlockState state, LevelReader level, BlockPos pos, @Nullable Entity entity) {
        if (getExplosionResistance(state, level, pos, null) > 1) // if this is a metal sign, return the correct sound type
            return SoundType.METAL;
        else return super.getSoundType(state, level, pos, entity);
    }
}
