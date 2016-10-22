package w1049344862.peanutcraft.client;

import w1049344862.peanutcraft.block.BlockLoader;
import w1049344862.peanutcraft.item.ItemLoader;

public class ItemRenderLoader {
	public ItemRenderLoader() {
		ItemLoader.registerRenders();
		BlockLoader.registerRenders();
	}
}