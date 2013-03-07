package universalores.core;

import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.common.Configuration;

public class Config {
	
	
	public static int copperID;
	public static int tinID;
	
	static Configuration config;
	
	static int[] IdArray;
	
	public static void ConfigSetup(FMLPreInitializationEvent Event) {
		
		config = new Configuration(Event.getSuggestedConfigurationFile());
		
	}
	
	public static void BlockIds() {
		
		config.load();
		
		int OreID = 3000;
		
		copperID = config.getBlock("CopperBlockID", OreID++).getInt();
		tinID = config.getBlock("TinBlockID", OreID++).getInt();
		
		config.save();

	    IdArray = new int[10];
	        
	    IdArray[0] = copperID;
	    IdArray[1] = tinID;
		
	}
	
	public int[] getBlockIds() {
		
		return IdArray;
		
	}
	
    

}
