package w1049344862.peanutcraft.block;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import w1049344862.peanutcraft.creativetab.CreativeTabsLoader;

public class BlockPeanutShellBlock extends Block {

	public BlockPeanutShellBlock() {
		super(Material.wood);
		this.setUnlocalizedName("peanutShellBlock");
		this.setHardness(1);
		this.setCreativeTab(CreativeTabsLoader.tabPeanutCraft);
	}
}
