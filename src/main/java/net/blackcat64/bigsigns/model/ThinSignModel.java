package net.blackcat64.bigsigns.model;

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
import java.util.List;
import java.util.function.Function;

public class ThinSignModel implements IUnbakedGeometry<ThinSignModel> {

    @Override
    public BakedModel bake(IGeometryBakingContext context,
                            ModelBaker baker,
                           Function<Material, TextureAtlasSprite> spriteGetter,
                            ModelState modelState,
                            ItemOverrides overrides,
                            ResourceLocation modelLocation) {

        BakedModel part1 = baker.bake(new ResourceLocation("big_signs:block/thin_sign_1"), modelState, spriteGetter);
        BakedModel part2 = baker.bake(new ResourceLocation("big_signs:block/thin_sign_2"), modelState, spriteGetter);
        BakedModel part3 = baker.bake(new ResourceLocation("big_signs:block/thin_sign_3"), modelState, spriteGetter);

        if (part1 == null || part2 == null || part3 == null) { // should never happen, but just to be safe
            throw new IllegalStateException("ThinSign parts failed to bake!");
        }

        return new ThinSignBakedModel(List.of(part1, part2, part3));
    }

    private static class ThinSignBakedModel implements BakedModel {
        private final List<BakedModel> parts;

        public ThinSignBakedModel(List<BakedModel> parts) {
            this.parts = parts;
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
                if (state.getValue(ThinSignBlock.PART1)) // dynamically show model parts based on BlockState
                    quads.addAll(parts.get(0).getQuads(state, side, rand, data, renderType));
                if (state.getValue(ThinSignBlock.PART2))
                    quads.addAll(parts.get(1).getQuads(state, side, rand, data, renderType));
                if (state.getValue(ThinSignBlock.PART3))
                    quads.addAll(parts.get(2).getQuads(state, side, rand, data, renderType));
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
            return parts.get(0).getParticleIcon();
        }

        @Override
        public ItemOverrides getOverrides() {
            return parts.get(0).getOverrides();
        }
    }
}
