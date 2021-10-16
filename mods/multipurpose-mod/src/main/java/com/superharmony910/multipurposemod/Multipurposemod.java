// To launch the project, press the green arrow next to "Minecraft Client", or type `gradlew idea` into the console.

package com.superharmony910.multipurposemod;

import com.superharmony910.multipurposemod.registry.ModItems;
import net.fabricmc.api.ModInitializer;

public class Multipurposemod implements ModInitializer {

    public static final String MOD_ID = "multip";

    @Override
    public void onInitialize() {
        ModItems.registerItems();
    }
}
