package w1049344862.peanutcraft;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import w1049344862.peanutcraft.common.CommonProxy;

@Mod(modid = PeanutCraft.MODID, name = PeanutCraft.NAME, version = PeanutCraft.VERSION, acceptedMinecraftVersions = "1.8.9")
public class PeanutCraft {
	public static final String MODID = "peanutcraft";
	public static final String NAME = "Peanut Craft";
	public static final String VERSION = "@version@";

	@Instance(PeanutCraft.MODID)
	public static PeanutCraft instance;

	@SidedProxy(clientSide = "w1049344862.peanutcraft.client.ClientProxy", serverSide = "w1049344862.peanutcraft.common.CommonProxy")
	public static CommonProxy p;

	@EventHandler
	public void preInit(FMLPreInitializationEvent event) {
		p.preInit(event);
	}

	@EventHandler
	public void init(FMLInitializationEvent event) {
		p.init(event);
	}

	@EventHandler
	public void postInit(FMLPostInitializationEvent event) {
		p.postInit(event);
	}
}