package w1049344862.peanutcraft.item;

import net.minecraft.item.ItemAxe;
import w1049344862.peanutcraft.creativetab.CreativeTabsLoader;

public class ItemToolAxe extends ItemAxe {

	public ItemToolAxe(ToolMaterial material) {
		super(material);
	}

	public static class S extends ItemToolAxe {
		public S() {
			super(ToolMaterial.STONE);
			this.setUnlocalizedName("sAxe");
			this.setCreativeTab(CreativeTabsLoader.tabPeanutCraft);
		}
	}

	public static class I extends ItemToolAxe {
		public I() {
			super(ToolMaterial.IRON);
			this.setUnlocalizedName("iAxe");
			this.setCreativeTab(CreativeTabsLoader.tabPeanutCraft);
		}
	}
	public static class F extends ItemToolAxe {
		public F() {
			super(ItemLoader.FUHEBAN);
			this.setUnlocalizedName("fAxe");
			this.setCreativeTab(CreativeTabsLoader.tabPeanutCraft);
		}
	}

}
