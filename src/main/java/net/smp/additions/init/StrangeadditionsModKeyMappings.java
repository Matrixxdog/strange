
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.smp.additions.init;

import org.lwjgl.glfw.GLFW;

import net.smp.additions.network.SecondaryAbilityMessage;
import net.smp.additions.StrangeadditionsMod;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.TickEvent;
import net.minecraftforge.client.event.RegisterKeyMappingsEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.client.Minecraft;
import net.minecraft.client.KeyMapping;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = {Dist.CLIENT})
public class StrangeadditionsModKeyMappings {
	public static final KeyMapping SECONDARY_ABILITY = new KeyMapping("key.strangeadditions.secondary_ability", GLFW.GLFW_KEY_R, "key.categories.misc") {
		private boolean isDownOld = false;

		@Override
		public void setDown(boolean isDown) {
			super.setDown(isDown);
			if (isDownOld != isDown && isDown) {
				StrangeadditionsMod.PACKET_HANDLER.sendToServer(new SecondaryAbilityMessage(0, 0));
				SecondaryAbilityMessage.pressAction(Minecraft.getInstance().player, 0, 0);
			}
			isDownOld = isDown;
		}
	};

	@SubscribeEvent
	public static void registerKeyMappings(RegisterKeyMappingsEvent event) {
		event.register(SECONDARY_ABILITY);
	}

	@Mod.EventBusSubscriber({Dist.CLIENT})
	public static class KeyEventListener {
		@SubscribeEvent
		public static void onClientTick(TickEvent.ClientTickEvent event) {
			if (Minecraft.getInstance().screen == null) {
				SECONDARY_ABILITY.consumeClick();
			}
		}
	}
}
