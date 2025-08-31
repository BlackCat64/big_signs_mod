package net.blackcat64.bigsigns.model;

import net.blackcat64.bigsigns.block.SignVariants;
import net.blackcat64.bigsigns.block.ThinSignBlock;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.block.model.BakedQuad;
import net.minecraft.client.renderer.block.model.ItemOverrides;
import net.minecraft.client.renderer.texture.TextureAtlasSprite;
import net.minecraft.client.resources.model.BakedModel;
import net.minecraft.client.resources.model.Material;
import net.minecraft.client.resources.model.ModelBaker;
import net.minecraft.client.resources.model.ModelState;
import net.minecraft.core.Direction;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.util.RandomSource;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraftforge.client.model.data.ModelData;
import net.minecraftforge.client.model.geometry.IGeometryBakingContext;
import net.minecraftforge.client.model.geometry.IUnbakedGeometry;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.ArrayList;
import java.util.EnumMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;

public class ThinSignModel implements IUnbakedGeometry<ThinSignModel> {

    private final Map<SignVariants, BakedModel> part1Variants = new EnumMap<>(SignVariants.class);
    private final Map<SignVariants, BakedModel> part2Variants = new EnumMap<>(SignVariants.class);
    private final Map<SignVariants, BakedModel> part3Variants = new EnumMap<>(SignVariants.class);

    @Override
    public BakedModel bake(IGeometryBakingContext context,
                            ModelBaker baker,
                           Function<Material, TextureAtlasSprite> spriteGetter,
                            ModelState modelState,
                            ItemOverrides overrides,
                            ResourceLocation modelLocation) {
        for (SignVariants variant : SignVariants.values()) { // compile Maps from sign variant to model file, for each part of the sign
            part1Variants.put(variant, baker.bake(
                    new ResourceLocation("big_signs:block/thin_" + variant.getSerializedName() + "_sign_1"),
                    modelState, spriteGetter));

            part2Variants.put(variant, baker.bake(
                    new ResourceLocation("big_signs:block/thin_" + variant.getSerializedName() + "_sign_2"),
                    modelState, spriteGetter));

            part3Variants.put(variant, baker.bake(
                    new ResourceLocation("big_signs:block/thin_" + variant.getSerializedName() + "_sign_3"),
                    modelState, spriteGetter));
        }

        return new ThinSignBakedModel(part1Variants, part2Variants, part3Variants);
    }

    private static class ThinSignBakedModel implements BakedModel {
        private final Map<SignVariants, BakedModel> part1Variants;
        private final Map<SignVariants, BakedModel> part2Variants;
        private final Map<SignVariants, BakedModel> part3Variants;

        public ThinSignBakedModel(Map<SignVariants, BakedModel> part1,
                                  Map<SignVariants, BakedModel> part2,
                                  Map<SignVariants, BakedModel> part3) {
            this.part1Variants = part1;
            this.part2Variants = part2;
            this.part3Variants = part3;
        }

        @Deprecated
        @Override
        public List<BakedQuad> getQuads(BlockState pState, Direction pDirection, RandomSource pRandom) {
            return new ArrayList<>(); // method not used - return empty list
        }

        @Override
        public List<BakedQuad> getQuads(BlockState state, Direction side, RandomSource rand, ModelData data, RenderType renderType) {
            List<BakedQuad> quads = new ArrayList<>();
            if (state != null) {
                if (state.getValue(ThinSignBlock.PART1)) { // dynamically switch on/off the model parts, depending on which block states are true
                    SignVariants variant1 = state.getValue(ThinSignBlock.VARIANT1);
                    BakedModel model = part1Variants.get(variant1); // get the correct model for the block state
                    if (model != null) {
                        quads.addAll(model.getQuads(state, side, rand, data, renderType));
                    }
                }

                if (state.getValue(ThinSignBlock.PART2)) {
                    SignVariants variant2 = state.getValue(ThinSignBlock.VARIANT2);
                    BakedModel model = part2Variants.get(variant2);
                    if (model != null) {
                        quads.addAll(model.getQuads(state, side, rand, data, renderType));
                    }
                }

                if (state.getValue(ThinSignBlock.PART3)) {
                    SignVariants variant3 = state.getValue(ThinSignBlock.VARIANT3);
                    BakedModel model = part3Variants.get(variant3);
                    if (model != null) {
                        quads.addAll(model.getQuads(state, side, rand, data, renderType));
                    }
                }
            }
            return quads;
        }

        @Override
        public boolean useAmbientOcclusion() {
            return true;
        }

        @Override
        public boolean isGui3d() {
            return true;
        }

        @Override
        public boolean usesBlockLight() {
            return true;
        }

        @Override
        public boolean isCustomRenderer() {
            return false;
        }

        @Override
        public TextureAtlasSprite getParticleIcon() {
            return part1Variants.get(SignVariants.BLACK_METAL).getParticleIcon();
        }

        @Override
        public ItemOverrides getOverrides() {
            return ItemOverrides.EMPTY;
        }
    }
}
