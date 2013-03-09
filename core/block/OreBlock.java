package universalores.core.block;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

public class OreBlock extends Block {
	
	private String texture;

	public OreBlock(int par1, Material par2Material, String par3) {
		super(par1, par2Material);
		texture = par3;
		this.setCreativeTab(CreativeTabs.tabBlock);
	}
	
	public String getTextureFile() {
	    return texture;
	  }

}
