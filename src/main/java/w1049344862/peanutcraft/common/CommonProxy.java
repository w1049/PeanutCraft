package w1049344862.peanutcraft.common;

import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import w1049344862.peanutcraft.block.BlockLoader;
import w1049344862.peanutcraft.crafting.CraftingLoader;
import w1049344862.peanutcraft.creativetab.CreativeTabsLoader;
import w1049344862.peanutcraft.item.ItemLoader;
import w1049344862.peanutcraft.worldgen.WorldBiomeLoader;
import w1049344862.peanutcraft.worldgen.WorldLoader;

public class CommonProxy {
	public void preInit(FMLPreInitializationEvent event) {
		new CreativeTabsLoader(event);
		new ItemLoader(event);
		new BlockLoader(event);
	}

	public void init(FMLInitializationEvent event) {
		new CraftingLoader();
		new EventLoader();
		new WorldBiomeLoader(event);
		new WorldLoader();
	}

	public void postInit(FMLPostInitializationEvent event) {

	}
}