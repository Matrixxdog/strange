
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.smp.additions.init;

import net.smp.additions.StrangeadditionsMod;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.sounds.SoundEvent;
import net.minecraft.resources.ResourceLocation;

public class StrangeadditionsModSounds {
	public static final DeferredRegister<SoundEvent> REGISTRY = DeferredRegister.create(ForgeRegistries.SOUND_EVENTS, StrangeadditionsMod.MODID);
	public static final RegistryObject<SoundEvent> JOYRIDE = REGISTRY.register("joyride", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("strangeadditions", "joyride")));
}
