package w1049344862.peanutcraft.block;

import net.minecraft.block.Block;
import net.minecraft.client.resources.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.registry.GameData;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class BlockLoader {
	public static Block peanutPlant = new BlockPeanutPlant();
	public static Block woodenStick = new BlockWoodenStick();
	public static Block peanutShellBlock = new BlockPeanutShellBlock();
	public static Block peanutShellBlockW = new BlockPeanutShellBlockW();
	public static Block peanutShellBlockS = new BlockPeanutShellBlockS();
	public static Block peanutShellBlockI = new BlockPeanutShellBlockI();
	public static Block peanutPortal = new BlockPeanutPortal();

	public BlockLoader(FMLPreInitializationEvent event) {
		register(peanutPlant, "peanut_plant");
		register(woodenStick, "wooden_stick");
		register(peanutShellBlock, "peanut_shell_block");
		register(peanutShellBlockW, "peanut_shell_blockw");
		register(peanutShellBlockS, "peanut_shell_blocks");
		register(peanutShellBlockI, "peanut_shell_blocki");
		register(peanutPortal, "peanut_portal");
	}

	@SideOnly(Side.CLIENT)
	public static void registerRenders() {
		registerRender(peanutPlant);
		registerRender(woodenStick);
		registerRender(peanutShellBlock);
		registerRender(peanutShellBlockW);
		registerRender(peanutShellBlockS);
		registerRender(peanutShellBlockI);
		registerRender(peanutPortal);
	}

	private static void register(Block block, String name) {
		GameRegistry.registerBlock(block, name);
	}

	@SideOnly(Side.CLIENT)
	private static void registerRender(Block block) {
		Item item = Item.getItemFromBlock(block);
		String name = GameData.getBlockRegistry().getNameForObject(block).toString();
		ModelLoader.setCustomModelResourceLocation(item, 0, new ModelResourceLocation(name, "inventory"));
	}
}