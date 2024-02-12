package net.nullspecter.spectersmechanus.item;

import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;
import net.nullspecter.spectersmechanus.spectersmechanus;

public class ModItemGroup {
    
    public static final ItemGroup MECHANUS = FabricItemGroupBuilder.build(
        new Identifier(spectersmechanus.MOD_ID, "mechanus"), () -> new ItemStack(Moditems.UPGRADE_CORE));

      
}
