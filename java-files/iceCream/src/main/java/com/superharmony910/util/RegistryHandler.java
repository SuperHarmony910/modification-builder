package com.superharmony910.util;

import com.superharmony910.icecream.icecream;
import net.minecraft.item.Item;
import net.minecraftforge.registries.ForgeRegistries;


public class RegistryHandler {

    public static final DeferredRegister<Item> ITEMS = new DeferredRegistry<>(ForgeRegistries.ITEMS, icecream.MOD_ID);

}
