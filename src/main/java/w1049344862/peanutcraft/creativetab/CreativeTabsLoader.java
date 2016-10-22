package w1049344862.peanutcraft.creativetab;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

public class CreativeTabsLoader {
	public static CreativeTabs tabPeanutCraft;

	public CreativeTabsLoader(FMLPreInitializationEvent event) {
		tabPeanutCraft = new CreativeTabsPeanutCraft();
	}
}