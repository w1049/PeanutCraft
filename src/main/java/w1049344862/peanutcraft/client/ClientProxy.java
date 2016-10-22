package w1049344862.peanutcraft.client;

import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import w1049344862.peanutcraft.common.CommonProxy;

public class ClientProxy extends CommonProxy {
	@Override
	public void preInit(FMLPreInitializationEvent event) {
		super.preInit(event);
		new ItemRenderLoader();
	}

	@Override
	public void init(FMLInitializationEvent event) {
		super.init(event);
	}

	@Override
	public void postInit(FMLPostInitializationEvent event) {
		super.postInit(event);
	}
}