package net.blackcat64.bigsigns.gui;

import net.minecraft.client.gui.screens.inventory.HangingSignEditScreen;
import net.minecraft.client.gui.screens.inventory.SignEditScreen;
import net.minecraft.world.level.block.entity.SignBlockEntity;
import org.joml.Vector3f;

public class OneLineHangingSignEditScreen extends HangingSignEditScreen {
    private final float SCALE = 3.1666666667F; // this is 3.166667 times the vanilla hanging sign's scale value
    public OneLineHangingSignEditScreen(SignBlockEntity p_277919_, boolean p_277579_, boolean p_277693_) {
        super(p_277919_, p_277579_, p_277693_);
    }

    @Override
    protected Vector3f getSignTextScale() {
        return new Vector3f(SCALE, SCALE, SCALE);
    }
}
