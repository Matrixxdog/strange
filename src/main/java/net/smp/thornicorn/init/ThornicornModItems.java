
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.smp.thornicorn.init;

import net.smp.thornicorn.procedures.VulcansEyePropertyValueProviderProcedure;
import net.smp.thornicorn.procedures.VulcansEyePropertyValueProvider2Procedure;
import net.smp.thornicorn.item.VulcansEyeItem;
import net.smp.thornicorn.item.JoyrideItem;
import net.smp.thornicorn.ThornicornMod;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.item.Item;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.item.ItemProperties;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class ThornicornModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, ThornicornMod.MODID);
	public static final RegistryObject<Item> VULCANS_EYE = REGISTRY.register("vulcans_eye", () -> new VulcansEyeItem());
	public static final RegistryObject<Item> JOYRIDE = REGISTRY.register("joyride", () -> new JoyrideItem());

	// Start of user code block custom items
	// End of user code block custom items
	@SubscribeEvent
	public static void clientLoad(FMLClientSetupEvent event) {
		event.enqueueWork(() -> {
			ItemProperties.register(VULCANS_EYE.get(), new ResourceLocation("thornicorn:vulcans_eye_isinnether"), (itemStackToRender, clientWorld, entity,
					itemEntityId) -> (float) VulcansEyePropertyValueProviderProcedure.execute(entity != null ? entity.level() : clientWorld, entity != null ? entity.getX() : 0, entity != null ? entity.getY() : 0, entity != null ? entity.getZ() : 0));
			ItemProperties.register(VULCANS_EYE.get(), new ResourceLocation("thornicorn:vulcans_eye_isinend"), (itemStackToRender, clientWorld, entity, itemEntityId) -> (float) VulcansEyePropertyValueProvider2Procedure
					.execute(entity != null ? entity.level() : clientWorld, entity != null ? entity.getX() : 0, entity != null ? entity.getY() : 0, entity != null ? entity.getZ() : 0));
		});
	}
}
