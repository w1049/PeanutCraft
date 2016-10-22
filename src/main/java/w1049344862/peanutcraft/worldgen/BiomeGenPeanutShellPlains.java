package w1049344862.peanutcraft.worldgen;

import java.util.Random;

import net.minecraft.util.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.biome.BiomeGenPlains;
import w1049344862.peanutcraft.block.BlockLoader;

public class BiomeGenPeanutShellPlains extends BiomeGenPlains{

	public BiomeGenPeanutShellPlains() {
		super(104);
    	this.biomeName="Peanut Shell Plains";
        this.setTemperatureRainfall(0.8F, 0);
        this.theBiomeDecorator.generateLakes = false;
        this.theBiomeDecorator.treesPerChunk = -999;
    	this.theBiomeDecorator.flowersPerChunk = -999;
    	this.theBiomeDecorator.grassPerChunk = -999;
    	this.theBiomeDecorator.deadBushPerChunk = -999;
    	this.theBiomeDecorator.mushroomsPerChunk = -999;
    	this.theBiomeDecorator.reedsPerChunk = -999;
    	this.theBiomeDecorator.cactiPerChunk = -999;
    	this.theBiomeDecorator.sandPerChunk = -999;
    	this.spawnableCreatureList.clear();
    	this.topBlock=BlockLoader.peanutShellBlock.getDefaultState();
    	this.fillerBlock=BlockLoader.peanutShellBlock.getDefaultState();
       	this.setHeight(height_LowPlains);
	}
    public void decorate(World worldIn, Random rand, BlockPos pos)
    {
    	
    }

}
