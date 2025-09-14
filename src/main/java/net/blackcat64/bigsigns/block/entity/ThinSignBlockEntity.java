package net.blackcat64.bigsigns.block.entity;

import net.blackcat64.bigsigns.block.SignVariants;
import net.blackcat64.bigsigns.model.ThinSignModel;
import net.minecraft.core.BlockPos;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.entity.SignBlockEntity;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraftforge.client.model.data.ModelData;
import org.jetbrains.annotations.NotNull;

import javax.annotation.Nullable;

public class ThinSignBlockEntity extends SignBlockEntity {
    private @Nullable SignVariants variant1;
    private @Nullable SignVariants variant2;
    private @Nullable SignVariants variant3; // a value of null represents that part of the sign not being present

    public ThinSignBlockEntity(BlockPos pPos, BlockState pBlockState) {
        super(ModBlockEntities.THIN_SIGN.get(), pPos, pBlockState);
    }

    @Override
    public BlockEntityType<?> getType() {
        return ModBlockEntities.THIN_SIGN.get();
    }

    public void setVariant1(@Nullable SignVariants v) {
        this.variant1 = v;
        update();
    }
    public void setVariant2(@Nullable SignVariants v) {
        this.variant2 = v;
        update();
    }
    public void setVariant3(@Nullable SignVariants v) {
        this.variant3 = v;
        update();
    }

    // Cause a block update whenever the variant is changed, and update model shown
    private void update() {
        setChanged();
        if (level != null) {
            requestModelDataUpdate();
            level.sendBlockUpdated(worldPosition, getBlockState(), getBlockState(), Block.UPDATE_ALL);
        }
    }

    public @Nullable SignVariants getVariant1() {
        return variant1;
    }
    public @Nullable SignVariants getVariant2() {
        return variant2;
    }
    public @Nullable SignVariants getVariant3() {
        return variant3;
    }

    @Override
    public void load(CompoundTag tag) {
        super.load(tag);
        variant1 = tag.contains("Variant1") ? SignVariants.byName(tag.getString("Variant1")) : null;
        variant2 = tag.contains("Variant2") ? SignVariants.byName(tag.getString("Variant2")) : null;
        variant3 = tag.contains("Variant3") ? SignVariants.byName(tag.getString("Variant3")) : null;
    }

    @Override
    protected void saveAdditional(CompoundTag tag) {
        super.saveAdditional(tag);
        if (variant1 != null) tag.putString("Variant1", variant1.getSerializedName());
        if (variant2 != null) tag.putString("Variant2", variant2.getSerializedName());
        if (variant3 != null) tag.putString("Variant3", variant3.getSerializedName());
    }

    @Override
    public @NotNull ModelData getModelData() {
        return ModelData.builder()
                .with(ThinSignModel.VARIANT1_PROP, getVariant1())
                .with(ThinSignModel.VARIANT2_PROP, getVariant2())
                .with(ThinSignModel.VARIANT3_PROP, getVariant3())
                .build();
    }

}
