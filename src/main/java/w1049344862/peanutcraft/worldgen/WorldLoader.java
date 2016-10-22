package w1049344862.peanutcraft.worldgen;

import net.minecraftforge.common.DimensionManager;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;

public class WorldLoader {
	public static int PEANUTDIMID = 104;
	public WorldLoader() {
		DimensionManager.registerProviderType(PEANUTDIMID, WorldPeanutWorld.class, false);
		DimensionManager.registerDimension(PEANUTDIMID, PEANUTDIMID);
	}


}