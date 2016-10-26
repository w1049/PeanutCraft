package w1049344862.peanutcraft.block;

import net.minecraft.block.Block;
import net.minecraft.block.BlockPortal;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.item.Item;
import net.minecraft.server.MinecraftServer;
import net.minecraft.util.BlockPos;
import net.minecraft.util.EnumFacing;
import net.minecraft.world.Teleporter;
import net.minecraft.world.World;
import net.minecraft.world.WorldServer;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import w1049344862.peanutcraft.creativetab.CreativeTabsLoader;
import w1049344862.peanutcraft.worldgen.TeleporterPeanut;
import w1049344862.peanutcraft.worldgen.WorldLoader;

public class BlockPeanutPortal extends Block {
	public static int DIMID = WorldLoader.PEANUTDIMID;

	public BlockPeanutPortal() {
		super(Material.portal);
		this.setUnlocalizedName("peanutPortal");
		this.setCreativeTab(CreativeTabsLoader.tabPeanutCraft);
	}

	@Override
	@SideOnly(Side.CLIENT)
	public Item getItem(World worldIn, BlockPos pos) {
		return null;
	}

	public boolean onBlockActivated(World worldIn, BlockPos pos, IBlockState state, EntityPlayer playerIn,
			EnumFacing side, float hitX, float hitY, float hitZ) {
		if (playerIn.ridingEntity == null && playerIn.riddenByEntity == null && playerIn instanceof EntityPlayerMP) {
			EntityPlayerMP thePlayer = (EntityPlayerMP) playerIn;
			if (thePlayer.dimension == 0) {
				thePlayer.mcServer.getConfigurationManager().transferPlayerToDimension(thePlayer, DIMID,
						new TeleporterPeanut(thePlayer.mcServer.worldServerForDimension(DIMID)));
				thePlayer.mcServer.worldServerForDimension(DIMID).setBlockToAir(new BlockPos(pos.getX(), pos.getY()-1, pos.getZ()));
				thePlayer.mcServer.worldServerForDimension(DIMID).setBlockState(new BlockPos(pos.getX(), pos.getY()-2, pos.getZ()), BlockLoader.peanutPortal.getDefaultState());
			} else if(thePlayer.dimension == DIMID){
				thePlayer.mcServer.getConfigurationManager().transferPlayerToDimension(thePlayer, 0,
						new TeleporterPeanut(thePlayer.mcServer.worldServerForDimension(0)));
			}
		}
		return true;
	}
}
