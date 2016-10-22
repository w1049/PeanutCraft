package w1049344862.peanutcraft.item;

import net.minecraft.client.resources.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.item.ItemAxe;
import net.minecraft.item.ItemPickaxe;
import net.minecraft.item.ItemSpade;
import net.minecraft.item.ItemSword;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.registry.GameData;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class ItemLoader {
	public static Item peanut = new ItemPeanut();
	public static Item peanutKernel = new ItemPeanutKernel();
	public static Item peanutShell = new ItemPeanutShell();
	public static Item cookedPeanut = new ItemCookedPeanut();
	public static Item cookedPeanutKernel = new ItemCookedPeanutKernel();
	public static Item plantPeanut = new ItemPlantPeanut();
	public static Item peanutVine = new ItemPeanutVine();
	public static ItemSpade jue = new ItemToolJue();
	public static ItemAxe sAxe = new ItemToolAxe.S();
	public static ItemAxe iAxe = new ItemToolAxe.I();
	public static ItemPickaxe sPickaxe = new ItemToolPickaxe.S();
	public static ItemPickaxe iPickaxe = new ItemToolPickaxe.I();
	public static ItemSword sSword = new ItemToolSword.S();
	public static ItemSword iSword = new ItemToolSword.I();
	public static ItemSpade sSpade = new ItemToolSpade.S();
	public static ItemSpade iSpade = new ItemToolSpade.I();

	public ItemLoader(FMLPreInitializationEvent event) {
		register(peanut, "peanut");
		register(peanutKernel, "peanut_kernel");
		register(peanutShell, "peanut_shell");
		register(cookedPeanut, "cooked_peanut");
		register(cookedPeanutKernel, "cooked_peanut_kernel");
		register(plantPeanut, "plant_peanut");
		register(peanutVine, "peanut_vine");
		register(jue, "jue");
		register(sAxe, "s_axe");
		register(sPickaxe, "s_pickaxe");
		register(sSword, "s_sword");
		register(sSpade, "s_spade");
		register(iAxe, "i_axe");
		register(iPickaxe, "i_pickaxe");
		register(iSword, "i_sword");
		register(iSpade, "i_spade");

	}

	@SideOnly(Side.CLIENT)
	public static void registerRenders() {
		registerRender(peanut);
		registerRender(peanutKernel);
		registerRender(peanutShell);
		registerRender(cookedPeanut);
		registerRender(cookedPeanutKernel);
		registerRender(plantPeanut);
		registerRender(peanutVine);
		registerRender(jue);
		registerRender(sAxe);
		registerRender(iAxe);
		registerRender(sPickaxe);
		registerRender(iPickaxe);
		registerRender(sSword);
		registerRender(iSword);
		registerRender(sSpade);
		registerRender(iSpade);
	}

	private static void register(Item item, String name) {
		GameRegistry.registerItem(item, name);
	}

	@SideOnly(Side.CLIENT)
	private static void registerRender(Item item) {
		String name = GameData.getItemRegistry().getNameForObject(item).toString();
		ModelLoader.setCustomModelResourceLocation(item, 0, new ModelResourceLocation(name, "inventory"));
	}
}