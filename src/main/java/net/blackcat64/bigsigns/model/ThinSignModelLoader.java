package net.blackcat64.bigsigns.model;

import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import net.minecraftforge.client.model.geometry.IGeometryLoader;

public class ThinSignModelLoader implements IGeometryLoader<ThinSignModel> {
    @Override
    public ThinSignModel read(JsonObject jsonObject, JsonDeserializationContext deserializationContext) throws JsonParseException {
        return new ThinSignModel();
    }
}
