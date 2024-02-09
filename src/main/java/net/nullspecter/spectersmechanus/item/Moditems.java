package net.nullspecter.spectersmechanus.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.nullspecter.spectersmechanus.spectersmechanus;

public class Moditems {
    
    public static final Item UPGRADE_CORE = registerItem("upgrade_core", 
        new Item(new FabricItemSettings().group(ItemGroup.MISC) .maxCount(64)));

        public static final Item MECHANICAL_BOOTS = registerItem("mechanical_boots", 
        new Item(new FabricItemSettings().group(ItemGroup.COMBAT) .maxCount(1) ));
    
    
        private static Item registerItem( String name, Item item) {
        return Registry.register(Registry.ITEM, new Identifier(spectersmechanus.MOD_ID, name), item);
    }



    public static void registerModitems(){
   
        spectersmechanus.LOGGER.debug("registering mod items" + spectersmechanus.MOD_ID);
    }
}
