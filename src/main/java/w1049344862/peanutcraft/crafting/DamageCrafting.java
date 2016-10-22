package w1049344862.peanutcraft.crafting;

import net.minecraft.inventory.InventoryCrafting;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.IRecipe;
import net.minecraft.world.World;

public class DamageCrafting implements IRecipe {
	protected ItemStack output = null;
	protected Object[] input = null;

	@Override
	public boolean matches(InventoryCrafting inv, World worldIn) {
		// TODO 自动生成的方法存根
		return false;
	}

	public ItemStack getCraftingResult(InventoryCrafting inv) {
		return output.copy();
	}

	@Override
	public int getRecipeSize() {
		return input.length;
	}

	@Override
	public ItemStack getRecipeOutput() {
		return output;
	}

	@Override
	public ItemStack[] getRemainingItems(InventoryCrafting inv) {
		// TODO 自动生成的方法存根
		return null;
	}

}
