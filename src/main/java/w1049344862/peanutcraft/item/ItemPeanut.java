package w1049344862.peanutcraft.item;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import w1049344862.peanutcraft.creativetab.CreativeTabsLoader;

public class ItemPeanut extends Item {

	public ItemPeanut() {
		super();
		this.setUnlocalizedName("peanut");
		this.setCreativeTab(CreativeTabsLoader.tabPeanutCraft);
	}

	@Override
	public ItemStack onItemRightClick(ItemStack itemStackIn, World worldIn, EntityPlayer playerIn) {

		if (!playerIn.capabilities.isCreativeMode) {
			--itemStackIn.stackSize;
		}
		playerIn.inventory.addItemStackToInventory(new ItemStack(ItemLoader.peanutKernel, 1));
		playerIn.inventory.addItemStackToInventory(new ItemStack(ItemLoader.peanutShell, 1));
		return itemStackIn;

	}
}
