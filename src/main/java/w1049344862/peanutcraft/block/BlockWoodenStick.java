package w1049344862.peanutcraft.block;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.properties.IProperty;
import net.minecraft.block.properties.PropertyInteger;
import net.minecraft.block.state.BlockState;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.util.BlockPos;
import net.minecraft.util.EnumFacing;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import w1049344862.peanutcraft.creativetab.CreativeTabsLoader;

public class BlockWoodenStick extends Block {

	public BlockWoodenStick() {
		super(Material.wood);
		this.setUnlocalizedName("woodenStick");
		this.setHardness(1);
		this.setCreativeTab(CreativeTabsLoader.tabPeanutCraft);
		this.setDefaultState(this.blockState.getBaseState().withProperty(FILL, 0));
	}

	@Override
	public boolean onBlockActivated(World worldIn, BlockPos pos, IBlockState state, EntityPlayer playerIn,
			EnumFacing side, float hitX, float hitY, float hitZ) {
		ItemStack itemStackIn = playerIn.getHeldItem();
		if (state.getValue(FILL) >= 4) {
			worldIn.setBlockState(pos, state.withProperty(FILL, 0));
			playerIn.inventory.addItemStackToInventory(new ItemStack(BlockLoader.peanutShellBlockW));
		} else {
			if (itemStackIn != null) {
				if (itemStackIn.getItem() == new ItemStack(BlockLoader.peanutShellBlock).getItem()) {
					if (!playerIn.capabilities.isCreativeMode) {
						--itemStackIn.stackSize;
					}
					if (state.getValue(FILL) < 4) {
						worldIn.setBlockState(pos, state.withProperty(FILL, state.getValue(FILL) + 1));
					}
				}
			}
		}
		return true;
	}

	public static final PropertyInteger FILL = PropertyInteger.create("fill", 0, 4);

	@Override
	protected BlockState createBlockState() {
		return new BlockState(this, new IProperty[] { FILL });
	}

	@Override
	public IBlockState getStateFromMeta(int meta) {
		return this.getDefaultState().withProperty(FILL, Integer.valueOf(meta));
	}

	@Override
	public int getMetaFromState(IBlockState state) {
		return ((Integer) state.getValue(FILL)).intValue();
	}

	@Override
	public java.util.List<ItemStack> getDrops(IBlockAccess world, BlockPos pos, IBlockState state, int fortune) {
		java.util.List<ItemStack> ret = super.getDrops(world, pos, state, fortune);
		if (state.getValue(FILL) <= 3)
			ret.add(new ItemStack(BlockLoader.peanutShellBlock, state.getValue(FILL)));
		if (state.getValue(FILL) == 4)
			ret.add(new ItemStack(BlockLoader.peanutShellBlockW));
		return ret;
	}
}
