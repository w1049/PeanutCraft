package w1049344862.peanutcraft.item;

import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemPickaxe;
import w1049344862.peanutcraft.creativetab.CreativeTabsLoader;

public class ItemToolPickaxe extends ItemPickaxe {

	public ItemToolPickaxe(ToolMaterial material) {
		super(material);
	}

	public static class S extends ItemToolPickaxe {
		public S() {
			super(ToolMaterial.STONE);
			this.setUnlocalizedName("sPickaxe");
			this.setCreativeTab(CreativeTabsLoader.tabPeanutCraft);
		}
	}

	public static class I extends ItemToolPickaxe {
		public I() {
			super(ToolMaterial.IRON);
			this.setUnlocalizedName("iPickaxe");
			this.setCreativeTab(CreativeTabsLoader.tabPeanutCraft);
		}
	}
	public static class F extends ItemToolPickaxe {
		public F() {
			super(ItemLoader.FUHEBAN);
			this.setUnlocalizedName("fPickaxe");
			this.setCreativeTab(CreativeTabsLoader.tabPeanutCraft);
		}
	}

}
