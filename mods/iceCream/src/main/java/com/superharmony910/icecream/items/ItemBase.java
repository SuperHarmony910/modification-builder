package com.superharmony910.icecream.items;

import com.superharmony910.icecream.icecream;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;

public class ItemBase extends Item {
    public ItemBase() {
        super(new Item.Properties().group(icecream.TAB));
    }
}
