
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.smp.thornicorn.init;

import net.smp.thornicorn.ThornicornMod;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.sounds.SoundEvent;
import net.minecraft.resources.ResourceLocation;

public class ThornicornModSounds {
	public static final DeferredRegister<SoundEvent> REGISTRY = DeferredRegister.create(ForgeRegistries.SOUND_EVENTS, ThornicornMod.MODID);
	public static final RegistryObject<SoundEvent> JOYRIDE = REGISTRY.register("joyride", () -> SoundEvent.createVariableRangeEvent(new ResourceLocation("thornicorn", "joyride")));
}
