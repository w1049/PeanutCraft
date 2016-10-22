package w1049344862.peanutcraft.item;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import w1049344862.peanutcraft.creativetab.CreativeTabsLoader;

public class ItemPlantPeanut extends Item {

	public ItemPlantPeanut() {
		super();
		this.setUnlocalizedName("plantPeanut");
		this.setCreativeTab(CreativeTabsLoader.tabPeanutCraft);
	}

	@Override
	public ItemStack onItemRightClick(ItemStack itemStackIn, World worldIn, EntityPlayer playerIn) {
		if (!playerIn.capabilities.isCreativeMode) {
			--itemStackIn.stackSize;
		}
		playerIn.inventory.addItemStackToInventory(new ItemStack(ItemLoader.peanut, 4));
		playerIn.inventory.addItemStackToInventory(new ItemStack(ItemLoader.peanutVine, 1));
		return itemStackIn;
	}
}
