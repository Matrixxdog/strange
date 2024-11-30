
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.smp.additions.init;

import net.smp.additions.client.gui.FlowerCraftingScreen;

import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.client.gui.screens.MenuScreens;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class StrangeadditionsModScreens {
	@SubscribeEvent
	public static void clientLoad(FMLClientSetupEvent event) {
		event.enqueueWork(() -> {
			MenuScreens.register(StrangeadditionsModMenus.FLOWER_CRAFTING.get(), FlowerCraftingScreen::new);
		});
	}
}
