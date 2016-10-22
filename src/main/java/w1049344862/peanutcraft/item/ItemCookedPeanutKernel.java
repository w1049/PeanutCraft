package w1049344862.peanutcraft.item;

import net.minecraft.item.ItemFood;
import w1049344862.peanutcraft.creativetab.CreativeTabsLoader;

public class ItemCookedPeanutKernel extends ItemFood {

	public ItemCookedPeanutKernel() {
		super(6, 0.8F, false);
		this.setUnlocalizedName("cookedPeanutKernel");
		this.setCreativeTab(CreativeTabsLoader.tabPeanutCraft);
	}
}
