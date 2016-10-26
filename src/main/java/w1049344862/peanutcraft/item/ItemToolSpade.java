package w1049344862.peanutcraft.item;

import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemSpade;
import w1049344862.peanutcraft.creativetab.CreativeTabsLoader;

public class ItemToolSpade extends ItemSpade {

	public ItemToolSpade(ToolMaterial material) {
		super(material);
	}

	public static class S extends ItemToolSpade {
		public S() {
			super(ToolMaterial.STONE);
			this.setUnlocalizedName("sSpade");
			this.setCreativeTab(CreativeTabsLoader.tabPeanutCraft);
		}
	}

	public static class I extends ItemToolSpade {
		public I() {
			super(ToolMaterial.IRON);
			this.setUnlocalizedName("iSpade");
			this.setCreativeTab(CreativeTabsLoader.tabPeanutCraft);
		}
	}
	public static class F extends ItemToolSpade {
		public F() {
			super(ItemLoader.FUHEBAN);
			this.setUnlocalizedName("fSpade");
			this.setCreativeTab(CreativeTabsLoader.tabPeanutCraft);
		}
	}

}
