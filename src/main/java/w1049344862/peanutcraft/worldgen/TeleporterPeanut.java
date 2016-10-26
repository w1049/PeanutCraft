package w1049344862.peanutcraft.worldgen;

import net.minecraft.entity.Entity;
import net.minecraft.util.BlockPos;
import net.minecraft.world.Teleporter;
import net.minecraft.world.World;
import net.minecraft.world.WorldServer;
import w1049344862.peanutcraft.block.BlockLoader;

public class TeleporterPeanut extends Teleporter{

	public TeleporterPeanut(WorldServer worldIn) {
		super(worldIn);
	}
	@Override
	 public void placeInPortal(Entity entityIn, float rotationYaw){
		 
	 }
	@Override
    public boolean placeInExistingPortal(Entity entityIn, float rotationYaw){
    	return false;
    }
	@Override
	public boolean makePortal(Entity entityIn){
		return true;
	}
}
