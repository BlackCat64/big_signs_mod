package net.blackcat64.bigsigns.util;

import net.blackcat64.bigsigns.BigSignsMod;
import net.minecraft.world.level.block.state.properties.BlockSetType;
import net.minecraft.world.level.block.state.properties.WoodType;

public class ModWoodTypes {
    public static final WoodType BLACK_METAL_SIGN = WoodType.register(new WoodType(BigSignsMod.MOD_ID + ":black_metal_sign", BlockSetType.IRON));
}
