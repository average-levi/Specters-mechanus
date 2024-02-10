package net.nullspecter.spectersmechanus.block;


import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.nullspecter.spectersmechanus.spectersmechanus;
import net.nullspecter.spectersmechanus.item.ModItemGroup;

public class ModBlocks {
    

   //Added Block Mechanus Core
     public static final Block MECHANUS_CORE_BLOCK = registerBlock("mechanus_core_block", 
        new Block(FabricBlockSettings.of(Material.METAL).hardness(4).luminance(2)
        .strength(4).requiresTool()), ModItemGroup.MECHANUS);
   

    //Block Augment table
    public static final Block AUGMENT_TABLE_BLOCK = registerBlock("augement_table_block", 
        new Block(FabricBlockSettings.of(Material.METAL).hardness(2).strength(2)
        .requiresTool()), ModItemGroup.MECHANUS);






   
   //Block set up not added block yet
    private static Block registerBlock(String name, Block block, ItemGroup tab) {

        return Registry.register(Registry.BLOCK, new Identifier(spectersmechanus.MOD_ID, name), block);
    }

    public static void registerModBlocks(){
        spectersmechanus.LOGGER.debug("Registering new block for" + spectersmechanus.MOD_ID);
    }
        
    }

