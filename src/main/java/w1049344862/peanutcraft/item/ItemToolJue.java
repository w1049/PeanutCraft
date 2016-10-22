package w1049344862.peanutcraft.item;

import java.util.Random;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemSpade;
import net.minecraft.item.ItemStack;
import net.minecraft.util.BlockPos;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.MovingObjectPosition;
import net.minecraft.world.World;
import w1049344862.peanutcraft.creativetab.CreativeTabsLoader;

public class ItemToolJue extends ItemSpade {

	public ItemToolJue() {
		super(ToolMaterial.IRON);
		this.setUnlocalizedName("jue");
		this.setCreativeTab(CreativeTabsLoader.tabPeanutCraft);

	}

	@Override
	public boolean onItemUse(ItemStack stack, EntityPlayer playerIn, World worldIn, BlockPos pos, EnumFacing side,
			float hitX, float hitY, float hitZ) {
		MovingObjectPosition m = this.getMovingObjectPositionFromPlayer(worldIn, playerIn, false);
		Random r = new Random();
		if (m != null) {
			if (stack.getItem() == ItemLoader.jue) {
				if (worldIn.getBlockState(m.getBlockPos()).getBlock() == Blocks.farmland) {
					worldIn.setBlockToAir(m.getBlockPos());
					if (!playerIn.capabilities.isCreativeMode) {
						stack.damageItem(5, playerIn);
					}
					if (r.nextInt(10) == 3) {
						playerIn.inventory.addItemStackToInventory(new ItemStack(ItemLoader.peanut, 1));
					}
				}
			}
		}
		return true;
	}

	@Override
	public boolean isRepairable() {
		return true;
	}

	@Override
	public boolean getShareTag() {
		return true;
	}

	@Override
	public boolean hasContainerItem(ItemStack stack) {
		return true;
	}

	@Override
	public boolean isItemTool(ItemStack stack) {
		return true;
	}

	@Override
	public ItemStack getContainerItem(ItemStack stack) {
		stack.setItemDamage(stack.getItemDamage() + 2);
		return stack;
	}

}
