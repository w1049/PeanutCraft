package w1049344862.peanutcraft.worldgen;

import net.minecraft.entity.boss.EntityDragon;
import net.minecraft.init.Blocks;
import net.minecraft.world.biome.BiomeDecorator;
import net.minecraft.world.biome.BiomeGenBase;
import net.minecraft.world.gen.feature.WorldGenSpikes;
import net.minecraft.world.gen.feature.WorldGenerator;
import w1049344862.peanutcraft.block.BlockLoader;

public class BiomePeanutShellDecorator extends BiomeDecorator{
    protected WorldGenerator spikeGen = new WorldGenSpikes(BlockLoader.peanutShellBlock);

    @Override
	protected void genDecorations(BiomeGenBase biomeGenBaseIn)
	    {
	        this.generateOres();
	        if (this.randomGenerator.nextInt(5) == 0)
	        {
	            int i = this.randomGenerator.nextInt(16) + 8;
	            int j = this.randomGenerator.nextInt(16) + 8;
	            this.spikeGen.generate(this.currentWorld, this.randomGenerator, this.currentWorld.getTopSolidOrLiquidBlock(this.field_180294_c.add(i, 0, j)));
	        }
	    }
}
