package w1049344862.peanutcraft.block;

import java.util.List;

import net.minecraft.block.BlockCrops;
import net.minecraft.block.state.IBlockState;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.BlockPos;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import w1049344862.peanutcraft.creativetab.CreativeTabsLoader;
import w1049344862.peanutcraft.item.ItemLoader;

public class BlockPeanutPlant extends BlockCrops {

	public BlockPeanutPlant() {
		super();
		this.setUnlocalizedName("peanutPlant");
		this.setCreativeTab(CreativeTabsLoader.tabPeanutCraft);
	}

	@Override
	protected Item getSeed() {
		return ItemLoader.peanutKernel;
	}

	@Override
	protected Item getCrop() {
		return ItemLoader.plantPeanut;
	}

	@Override
	public void dropBlockAsItemWithChance(World worldIn, BlockPos pos, IBlockState state, float chance, int fortune) {
		super.dropBlockAsItemWithChance(worldIn, pos, state, chance, fortune);
	}

	@Override
	public List<ItemStack> getDrops(IBlockAccess world, BlockPos pos, IBlockState state, int fortune) {
		List<ItemStack> ret = super.getDrops(world, pos, state, fortune);
		ret.clear();
		if (((Integer) state.getValue(AGE)).intValue() >= 7) {
			ret.add(new ItemStack(ItemLoader.plantPeanut, 1));
		} else {
			ret.add(new ItemStack(this.getSeed(), 1));
		}
		return ret;
	}
}
