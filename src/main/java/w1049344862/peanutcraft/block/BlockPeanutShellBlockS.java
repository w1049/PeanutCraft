package w1049344862.peanutcraft.block;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import w1049344862.peanutcraft.creativetab.CreativeTabsLoader;

public class BlockPeanutShellBlockS extends Block {

	public BlockPeanutShellBlockS() {
		super(Material.rock);
		this.setUnlocalizedName("peanutShellBlockS");
		this.setHardness(2);
		this.setHarvestLevel("pickaxe", 0);
		this.setCreativeTab(CreativeTabsLoader.tabPeanutCraft);
	}
}
