package me.fusiondev.fusionpixelmon.api.items;

import me.fusiondev.fusionpixelmon.api.Raw;

import java.util.List;

public abstract class AbstractItemStack implements Raw {
    public abstract AbstractItemStack from(AbstractItemType itemType);

    public abstract void setName(String name);

    public abstract List<String> getLore();

    public abstract void setLore(List<String> itemLore);

    public void setColour(Object colour) {
    }
}