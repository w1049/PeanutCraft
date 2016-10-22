package w1049344862.peanutcraft.block;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import w1049344862.peanutcraft.creativetab.CreativeTabsLoader;

public class BlockPeanutShellBlockI extends Block {

	public BlockPeanutShellBlockI() {
		super(Material.iron);
		this.setUnlocalizedName("peanutShellBlockI");
		this.setHardness(5);
		this.setHarvestLevel("pickaxe", 0);
		this.setCreativeTab(CreativeTabsLoader.tabPeanutCraft);
	}
}
