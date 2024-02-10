package net.nullspecter.spectersmechanus;

import net.fabricmc.api.ModInitializer;
import net.nullspecter.spectersmechanus.block.ModBlocks;
import net.nullspecter.spectersmechanus.item.Moditems;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class spectersmechanus implements ModInitializer {
	
	
	public static final String MOD_ID = "spectersmechanus";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
			Moditems.registerModitems();
			ModBlocks.registerModBlocks();
	}
}
