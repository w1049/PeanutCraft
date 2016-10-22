package w1049344862.peanutcraft.common;

import net.minecraftforge.common.MinecraftForge;

public class EventLoader {
	public EventLoader() {
		MinecraftForge.EVENT_BUS.register(this);
	}

	/*
	 * @SubscribeEvent public void onLivingHurt(LivingHurtEvent event) { if
	 * (event.source.getDamageType().equals("fall")) { if
	 * (event.entityLiving.getEquipmentInSlot(1) != null) { Item I =
	 * event.entityLiving.getEquipmentInSlot(1).getItem(); if (I ==
	 * ItemLoader.timBoots) { event.ammount /= 5; }
	 * 
	 * } } }
	 */
}