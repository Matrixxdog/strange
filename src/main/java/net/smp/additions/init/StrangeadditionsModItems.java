
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.smp.additions.init;

import net.smp.additions.procedures.VulcansEyePropertyValueProviderProcedure;
import net.smp.additions.procedures.VulcansEyePropertyValueProvider2Procedure;
import net.smp.additions.item.VulcansEyeItem;
import net.smp.additions.item.SaturationPotionFlowItem;
import net.smp.additions.item.RegenerationPotionFlowItem;
import net.smp.additions.item.PoisonPotionFlowItem;
import net.smp.additions.item.NightVisionPotionFlowItem;
import net.smp.additions.item.JumpBoostPotionFlowItem;
import net.smp.additions.item.JoyrideItem;
import net.smp.additions.item.GardenersBlessingItem;
import net.smp.additions.item.FireResistancePotionFlowItem;
import net.smp.additions.item.BlindnessPotionFlowItem;
import net.smp.additions.StrangeadditionsMod;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.BlockItem;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.item.ItemProperties;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class StrangeadditionsModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, StrangeadditionsMod.MODID);
	public static final RegistryObject<Item> VULCANS_EYE = REGISTRY.register("vulcans_eye", () -> new VulcansEyeItem());
	public static final RegistryObject<Item> JOYRIDE = REGISTRY.register("joyride", () -> new JoyrideItem());
	public static final RegistryObject<Item> GARDENERS_BLESSING = REGISTRY.register("gardeners_blessing", () -> new GardenersBlessingItem());
	public static final RegistryObject<Item> FLOWER_CRAFT = block(StrangeadditionsModBlocks.FLOWER_CRAFT);
	public static final RegistryObject<Item> BLINDNESS_POTION_FLOW = REGISTRY.register("blindness_potion_flow", () -> new BlindnessPotionFlowItem());
	public static final RegistryObject<Item> FIRE_RESISTANCE_POTION_FLOW = REGISTRY.register("fire_resistance_potion_flow", () -> new FireResistancePotionFlowItem());
	public static final RegistryObject<Item> SATURATION_POTION_FLOW = REGISTRY.register("saturation_potion_flow", () -> new SaturationPotionFlowItem());
	public static final RegistryObject<Item> JUMP_BOOST_POTION_FLOW = REGISTRY.register("jump_boost_potion_flow", () -> new JumpBoostPotionFlowItem());
	public static final RegistryObject<Item> POISON_POTION_FLOW = REGISTRY.register("poison_potion_flow", () -> new PoisonPotionFlowItem());
	public static final RegistryObject<Item> REGENERATION_POTION_FLOW = REGISTRY.register("regeneration_potion_flow", () -> new RegenerationPotionFlowItem());
	public static final RegistryObject<Item> NIGHT_VISION_POTION_FLOW = REGISTRY.register("night_vision_potion_flow", () -> new NightVisionPotionFlowItem());

	// Start of user code block custom items
	// End of user code block custom items
	private static RegistryObject<Item> block(RegistryObject<Block> block) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties()));
	}

	@SubscribeEvent
	public static void clientLoad(FMLClientSetupEvent event) {
		event.enqueueWork(() -> {
			ItemProperties.register(VULCANS_EYE.get(), new ResourceLocation("strangeadditions:vulcans_eye_isinnether"), (itemStackToRender, clientWorld, entity,
					itemEntityId) -> (float) VulcansEyePropertyValueProviderProcedure.execute(entity != null ? entity.level() : clientWorld, entity != null ? entity.getX() : 0, entity != null ? entity.getY() : 0, entity != null ? entity.getZ() : 0));
			ItemProperties.register(VULCANS_EYE.get(), new ResourceLocation("strangeadditions:vulcans_eye_isinend"), (itemStackToRender, clientWorld, entity, itemEntityId) -> (float) VulcansEyePropertyValueProvider2Procedure
					.execute(entity != null ? entity.level() : clientWorld, entity != null ? entity.getX() : 0, entity != null ? entity.getY() : 0, entity != null ? entity.getZ() : 0));
		});
	}
}
