package net.blackcat64.bigsigns.block;

import net.blackcat64.bigsigns.block.entity.ThinSignBlockEntity;
import net.minecraft.core.BlockPos;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.util.RandomSource;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.WallSignBlock;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.properties.BooleanProperty;
import net.minecraft.world.level.block.state.properties.WoodType;

public class ThinSignBlock extends WallSignBlock {
    public static final BooleanProperty PART1 = BooleanProperty.create("part1"); // block state keeps track of which model parts are shown
    public static final BooleanProperty PART2 = BooleanProperty.create("part2");
    public static final BooleanProperty PART3 = BooleanProperty.create("part3");

    public ThinSignBlock(Properties pProperties, WoodType pType) {
        super(pProperties, pType);

        this.registerDefaultState(this.stateDefinition.any()
                .setValue(PART1, true)
                .setValue(PART2, true)
                .setValue(PART3, true));
    }

    @Override
    protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> builder) {
        super.createBlockStateDefinition(builder);

        builder.add(PART1, PART2, PART3);
    }

    @Override
    public void tick(BlockState state, ServerLevel level, BlockPos pos, RandomSource rand) { // all parts cannot be false - break block if this is the case
        if (!state.getValue(PART1) && !state.getValue(PART2) && !state.getValue(PART3)) {
            level.destroyBlock(pos, false); // false - do not drop anything (handled elsewhere)
        }
    }

    @Override
    public BlockEntity newBlockEntity(BlockPos pPos, BlockState pState) {
        return new ThinSignBlockEntity(pPos, pState);
    }
}
