package w1049344862.peanutcraft.block;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import w1049344862.peanutcraft.creativetab.CreativeTabsLoader;

public class BlockPeanutShellBlockW extends Block {

	public BlockPeanutShellBlockW() {
		super(Material.wood);
		this.setUnlocalizedName("peanutShellBlockW");
		this.setHardness(1.2F);
		this.setCreativeTab(CreativeTabsLoader.tabPeanutCraft);
	}
}
