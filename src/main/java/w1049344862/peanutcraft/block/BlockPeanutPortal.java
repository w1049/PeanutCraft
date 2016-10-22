package w1049344862.peanutcraft.block;

import net.minecraft.block.BlockPortal;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.item.Item;
import net.minecraft.util.BlockPos;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import w1049344862.peanutcraft.creativetab.CreativeTabsLoader;
import w1049344862.peanutcraft.worldgen.WorldLoader;
import w1049344862.peanutcraft.worldgen.WorldPeanutWorld;

public class BlockPeanutPortal extends BlockPortal {
	public static int DIMID = WorldLoader.PEANUTDIMID;
	public BlockPeanutPortal() {
		super();
		this.setUnlocalizedName("peanutPortal");
		this.setCreativeTab(CreativeTabsLoader.tabPeanutCraft);
	}

	@Override
	@SideOnly(Side.CLIENT)
	public Item getItem(World worldIn, BlockPos pos) {
		return null;
	}
	public void onEntityCollidedWithBlock(World worldIn, BlockPos pos, IBlockState state, Entity entityIn)
	{
	if (entityIn.ridingEntity == null && entityIn.riddenByEntity == null && entityIn instanceof EntityPlayerMP){
				 
	         EntityPlayerMP thePlayer = (EntityPlayerMP)entityIn;
	         if (thePlayer.timeUntilPortal > 0)
	         {
	                 thePlayer.timeUntilPortal = 10;
	         }
	         else if (thePlayer.dimension != DIMID)
	         {
	                 thePlayer.timeUntilPortal = 10;
	                 thePlayer.mcServer.getConfigurationManager().transferPlayerToDimension(thePlayer, DIMID, new WorldPeanutWorld.TeleporterPeanut(thePlayer.mcServer.worldServerForDimension(DIMID)));
	         }
	         else {
	                 thePlayer.timeUntilPortal = 10;
	                 thePlayer.mcServer.getConfigurationManager().transferPlayerToDimension(thePlayer, 0, new WorldPeanutWorld.TeleporterPeanut(thePlayer.mcServer.worldServerForDimension(0)));
	         }
	         }
	}
}
