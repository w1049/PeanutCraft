package w1049344862.peanutcraft.creativetab;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import w1049344862.peanutcraft.item.ItemLoader;

public class CreativeTabsPeanutCraft extends CreativeTabs {

	public CreativeTabsPeanutCraft() {
		super("peanutCraft");
	}

	@Override
	public Item getTabIconItem() {
		return ItemLoader.peanut;
	}
}
