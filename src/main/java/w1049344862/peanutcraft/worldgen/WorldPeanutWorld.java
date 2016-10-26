package w1049344862.peanutcraft.worldgen;

import java.util.Random;

import net.minecraft.block.BlockPortal;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.Entity;
import net.minecraft.init.Blocks;
import net.minecraft.util.BlockPos;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.MathHelper;
import net.minecraft.world.Teleporter;
import net.minecraft.world.WorldProvider;
import net.minecraft.world.WorldServer;
import net.minecraft.world.biome.WorldChunkManagerHell;
import net.minecraft.world.chunk.IChunkProvider;

public class WorldPeanutWorld extends WorldProvider {

	@Override
	public String getDimensionName() {
		// TODO 自动生成的方法存根
		return "Peanut World";
	}

	@Override
	public String getInternalNameSuffix() {
		// TODO 自动生成的方法存根
		return null;
	}

	@Override
	public void registerWorldChunkManager() {
		this.worldChunkMgr = new WorldChunkManagerHell(WorldBiomeLoader.peanutShellPlains, 0);
		this.dimensionId = WorldLoader.PEANUTDIMID;
	}
	
	@Override
    public IChunkProvider createChunkGenerator(){
		return worldObj.getWorldInfo().getTerrainType().getChunkGenerator(worldObj, worldObj.getWorldInfo().getGeneratorOptions());
    }

	@Override
	protected void generateLightBrightnessTable() {
		float f = 0.5F;
		for (int i = 0; i <= 15; ++i) {
			float f1 = 1.0F - (float) i / 15.0F;
			this.lightBrightnessTable[i] = (1.0F - f1) / (f1 * 3.0F + 1.0F) * (1.0F - f) + f;
		}
	}

}
