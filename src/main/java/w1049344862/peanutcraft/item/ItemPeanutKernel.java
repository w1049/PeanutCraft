package w1049344862.peanutcraft.item;

import net.minecraft.init.Blocks;
import net.minecraft.item.ItemSeedFood;
import w1049344862.peanutcraft.block.BlockLoader;
import w1049344862.peanutcraft.creativetab.CreativeTabsLoader;

public class ItemPeanutKernel extends ItemSeedFood {

	public ItemPeanutKernel() {
		super(4, 0.2F, BlockLoader.peanutPlant, Blocks.farmland);
		this.setUnlocalizedName("peanutKernel");
		this.setCreativeTab(CreativeTabsLoader.tabPeanutCraft);
	}

}
