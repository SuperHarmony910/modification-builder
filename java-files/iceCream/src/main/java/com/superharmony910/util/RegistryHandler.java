package com.superharmony910.util;

import com.superharmony910.icecream.Items.ItemBase;
import com.superharmony910.icecream.icecream;
import net.minecraft.item.Item;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;


public class RegistryHandler {

    public static final DeferredRegister<Item> ITEMS = new DeferredRegister<>(ForgeRegistries.ITEMS, icecream.MOD_ID);

    public static void init() {
        ITEMS.register(FMLJavaModLoadingContext.get().getModEventBus());
    }

    // Items only!
    public static final RegistryObject<Item> ICE_CREAM_BLOCK = ITEMS.register("ice_cream_block", ItemBase::new);
}
