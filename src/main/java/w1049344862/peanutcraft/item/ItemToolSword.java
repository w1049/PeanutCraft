package w1049344862.peanutcraft.item;

import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemSword;
import w1049344862.peanutcraft.creativetab.CreativeTabsLoader;

public class ItemToolSword extends ItemSword {

	public ItemToolSword(ToolMaterial material) {
		super(material);
	}

	public static class S extends ItemToolSword {
		public S() {
			super(ToolMaterial.STONE);
			this.setUnlocalizedName("sSword");
			this.setCreativeTab(CreativeTabsLoader.tabPeanutCraft);
		}
	}

	public static class I extends ItemToolSword {
		public I() {
			super(ToolMaterial.IRON);
			this.setUnlocalizedName("iSword");
			this.setCreativeTab(CreativeTabsLoader.tabPeanutCraft);
		}
	}
	public static class F extends ItemToolSword {
		public F() {
			super(ItemLoader.FUHEBAN);
			this.setUnlocalizedName("fSword");
			this.setCreativeTab(CreativeTabsLoader.tabPeanutCraft);
		}
	}

}
