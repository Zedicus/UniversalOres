package universalores.core;

import net.minecraftforge.common.Configuration;
import universalores.core.server.ServerProxy;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.network.NetworkMod;
import cpw.mods.fml.common.Mod.*;


@Mod(modid = "UniversalOres", name = "UniversalOres", version = "1.0")
@NetworkMod(clientSideRequired = true, serverSideRequired = false)

public class UniversalOres {
	
	static int CopperOreId;
    
    @SidedProxy(clientSide="universalores.core.client.ClientProxy", serverSide="universalores.core.server.ServerProxy")
    public static ServerProxy proxy;
	
	@PreInit
	public static void PreInit(FMLPreInitializationEvent Event) {
		
		Config.ConfigSetup(Event);
		
	}
	
	@Init
	public static void Init(FMLInitializationEvent Event) {
		
		Config.BlockIds();
		Blocks.registerBlocks();
		
	}
	
	@PostInit
	public  static void PostInit(FMLPostInitializationEvent Event) {
		
	}
	
}
