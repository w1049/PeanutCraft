package w1049344862.peanutcraft.worldgen;

import net.minecraft.world.biome.BiomeGenBase;
import net.minecraft.world.biome.BiomeGenPlains;
import net.minecraftforge.common.BiomeDictionary;
import net.minecraftforge.common.BiomeManager;

import net.minecraftforge.common.DimensionManager;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;

public class WorldBiomeLoader {
    	public static BiomeGenBase peanutShellPlains = new BiomeGenPeanutShellPlains();
		public WorldBiomeLoader(FMLInitializationEvent event) {
			BiomeDictionary.registerBiomeType(peanutShellPlains, BiomeDictionary.Type.PLAINS);
			//可能少BiomeManager
		}
}