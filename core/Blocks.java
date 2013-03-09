package universalores.core;

import universalores.core.block.OreBlock;
import universalores.core.block.StorageBlock;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraftforge.common.Configuration;
import cpw.mods.fml.common.Mod.Init;
import cpw.mods.fml.common.Mod.PostInit;
import cpw.mods.fml.common.Mod.PreInit;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;

public class Blocks {
	
	public static void registerBlocks() {
		
		Config config = new Config();
		
		int[] IDArray = config.getBlockIds();
		
		int copperID = IDArray[0];
		
		OreBlock oreCopper = new OreBlock(copperID, Material.rock, "/universalores/bleh.PNG");
			
			GameRegistry.registerBlock(oreCopper, "Copper Ore");
			LanguageRegistry.addName(oreCopper, "Copper Ore");
			
	
		StorageBlock test = new StorageBlock(1000, Material.iron);
		
			GameRegistry.registerBlock(test, "Test Block");
		
	}
	

}