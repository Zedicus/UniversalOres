package universalores.core;

import net.minecraftforge.common.Configuration;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

// THINGS TO DO

/*
 *  ORES
 */
// 1) Make seperate instances for ALL block 'types' in the config (Is done = NOPE)
// 2) Check the block IDs for the blocks, 2 per instance (ore & storage) (Is done = NOPE)
// 3) Check the textures for each block - remember to take care of special cases (Uranium IC2) (Is done = NOPE)

/*
 * ITEMS
 */
// 1) Add the item IDs to seperate instances (Is done = NOPE)
// 2) Check textures (dusts & nuggets) (Is done = NOPE)

/*
 * WORLDGEN
 */

// 1) Check whether to generate ores (don't initilzie the ores/nugget/ignot if false) (Is done = NOPE)
// 2) Add the ability to set max - min generation height (Is done = NOPE)
// 3) Add the ability to set the rarity (Is done = NOPE)
// 4) Add the ability to set the max cluster size (Is done = NOPE)

/*
 * ADVANCED
 */
// 1) Add coremod functions to allow changing of vanilla ores (or find non-coremod solution) (Is done = NOPE)



public class ConfigHandler {
	
	static Configuration config;
	
	public static void ConfigSetup(FMLPreInitializationEvent Event) {
		
		config = new Configuration(Event.getSuggestedConfigurationFile());
		
	}
	
	public void configureBlocks() {
		
		
		int bbID = 3000; // bb = base block
	
		
	}
	
}
