package universalores.core.block;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

public class StorageBlock extends Block {
	
	private String texture;

	public StorageBlock(int par1, Material par2Material) {
		super(par1, par2Material);
		this.setCreativeTab(CreativeTabs.tabBlock);
	}
	
	public int getBlockTextureFromSide(int side) {
		
		return 1;
		
	}

}
