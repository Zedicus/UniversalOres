package universalores.core;

import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.common.Configuration;

public class Config {
	
	// The initiliaztion of the ore Ids
	public static int copperID;
	public static int tinID;
	
	static Configuration config;
	
	static int[] IdArray;
	

	
	// A method to setup the orginal config file
	public static void ConfigSetup(FMLPreInitializationEvent Event) {
		
		config = new Configuration(Event.getSuggestedConfigurationFile());
		
	}
	
	public static void BlockIds() {
		
		// The base Ore block ID
		int OreID = 3000;
		
		// Loading the config
		config.load();
		
		// Assigning the block ID via the config
		copperID = config.getBlock("CopperBlockID", OreID).getInt();
		
		
		// Assigning the block ID via the config
		tinID = config.getBlock("TinBlockID", OreID + 1).getInt();
		
		// Saving the config for block IDs
		config.save();
		
		// Setting the max Array size
	    IdArray = new int[10]; 
	    
	    // Adding copper's ID to the IDArray
	    IdArray[0] = copperID;
	    
	    // Adding tin's ID to the IDArray
	    IdArray[1] = tinID;
		
	}
	
	// A method to recieve the block ID array from other classes
	public int[] getBlockIds() {
		
		return IdArray;
		
	}

}
