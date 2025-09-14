package net.blackcat64.bigsigns.block;

import net.minecraft.util.StringRepresentable;

import javax.annotation.Nullable;
import java.util.HashMap;

public enum SignVariants implements StringRepresentable {
    ACACIA("acacia"),
    BAMBOO("bamboo"),
    BIRCH("birch"),
    CHERRY("cherry"),
    CRIMSON("crimson"),
    DARK_OAK("dark_oak"),
    JUNGLE("jungle"),
    MANGROVE("mangrove"),
    OAK("oak"),
    SPRUCE("spruce"),
    WARPED("warped"),

    BLACK_METAL("black_metal"),
    BLUE_METAL("blue_metal"),
    BROWN_METAL("brown_metal"),
    CREAM_METAL("cream_metal"),
    CYAN_METAL("cyan_metal"),
    DARK_ORANGE_METAL("dark_orange_metal"),
    DARK_PINK_METAL("dark_pink_metal"),
    DARK_RED_METAL("dark_red_metal"),
    GRAY_METAL("gray_metal"),
    GREEN_METAL("green_metal"),
    LIGHT_BLUE_METAL("light_blue_metal"),
    LIGHT_GRAY_METAL("light_gray_metal"),
    LIME_METAL("lime_metal"),
    MAGENTA_METAL("magenta_metal"),
    ORANGE_METAL("orange_metal"),
    PINK_METAL("pink_metal"),
    PURPLE_METAL("purple_metal"),
    RED_METAL("red_metal"),
    WHITE_METAL("white_metal"),
    YELLOW_METAL("yellow_metal");

    private final String name;
    private static final HashMap<String, SignVariants> BY_NAME_MAP = new HashMap<>();

    SignVariants(String name) {
        this.name = name;
    }

    @Override
    public String getSerializedName() {
        return this.name;
    }

    public static @Nullable SignVariants byName(String name) {
        if (BY_NAME_MAP.isEmpty()) {
            for (SignVariants v : values()) { // cache key-value pairs for efficient lookup
                BY_NAME_MAP.put(v.name, v);
            }
        }
        if (BY_NAME_MAP.containsKey(name.toLowerCase())) { // if the key exists (ignoring case), return the enum value
            return BY_NAME_MAP.get(name);
        }
        return null;
    }
}