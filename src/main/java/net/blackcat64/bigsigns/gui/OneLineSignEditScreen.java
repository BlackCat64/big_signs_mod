package net.blackcat64.bigsigns.gui;

import net.minecraft.client.gui.screens.inventory.SignEditScreen;
import net.minecraft.world.level.block.entity.SignBlockEntity;
import org.joml.Vector3f;

public class OneLineSignEditScreen extends SignEditScreen {
    private final float SCALE = 4.83398586F; // this is 4.95 times the vanilla sign's scale value
    public OneLineSignEditScreen(SignBlockEntity p_277919_, boolean p_277579_, boolean p_277693_) {
        super(p_277919_, p_277579_, p_277693_);
    }

    @Override
    protected Vector3f getSignTextScale() {
        return new Vector3f(SCALE, SCALE, SCALE);
    }
}
