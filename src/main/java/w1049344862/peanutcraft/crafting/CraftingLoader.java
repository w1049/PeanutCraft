package w1049344862.peanutcraft.crafting;

import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.IFuelHandler;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.oredict.OreDictionary;
import w1049344862.peanutcraft.block.BlockLoader;
import w1049344862.peanutcraft.item.ItemLoader;

public class CraftingLoader {
	public CraftingLoader() {
		registerRecipe();
		registerSmelting();
		registerFuel();
	}

	private static void registerRecipe() {

		GameRegistry.addShapedRecipe(new ItemStack(ItemLoader.jue),
				new Object[] { "###", "#* ", "#* ", '#', Items.iron_ingot, '*', Items.stick });
		GameRegistry.addShapedRecipe(new ItemStack(BlockLoader.peanutShellBlock),
				new Object[] { "##", "##", '#', ItemLoader.peanutShell });
		GameRegistry.addShapedRecipe(new ItemStack(BlockLoader.woodenStick), new Object[] { "#", "*", '#',
				new ItemStack(ItemLoader.jue, 1, OreDictionary.WILDCARD_VALUE), '*', Blocks.planks });
		GameRegistry.addShapelessRecipe(new ItemStack(ItemLoader.peanutShell, 4), BlockLoader.peanutShellBlock);
	}

	private static void registerSmelting() {
		GameRegistry.addSmelting(ItemLoader.peanut, new ItemStack(ItemLoader.cookedPeanut), 1);
		GameRegistry.addSmelting(ItemLoader.peanutKernel, new ItemStack(ItemLoader.cookedPeanutKernel), 1);
	}

	private static void registerFuel() {
		GameRegistry.registerFuelHandler(new IFuelHandler() {
			@Override
			public int getBurnTime(ItemStack fuel) {
				return ItemLoader.peanutShell != fuel.getItem() ? 0 : 200;
			}
		});
		GameRegistry.registerFuelHandler(new IFuelHandler() {
			@Override
			public int getBurnTime(ItemStack fuel) {
				return ItemLoader.peanutVine != fuel.getItem() ? 0 : 800;
			}
		});
	}
}