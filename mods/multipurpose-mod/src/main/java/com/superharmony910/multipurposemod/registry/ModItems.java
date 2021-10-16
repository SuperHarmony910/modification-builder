package com.superharmony910.multipurposemod.registry;

import com.superharmony910.multipurposemod.Multipurposemod;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModItems {

    public static final Item GOLDEN_POTATO = new Item(new Item.Settings().group(ItemGroup.FOOD));

    public static void registerItems() {
        Registry.register(Registry.ITEM, new Identifier(Multipurposemod.MOD_ID, "golden_potato"), GOLDEN_POTATO);
    }
}
