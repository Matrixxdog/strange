
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.smp.thornicorn.init;

import net.smp.thornicorn.potion.BlastResistanceMobEffect;
import net.smp.thornicorn.ThornicornMod;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.effect.MobEffect;

public class ThornicornModMobEffects {
	public static final DeferredRegister<MobEffect> REGISTRY = DeferredRegister.create(ForgeRegistries.MOB_EFFECTS, ThornicornMod.MODID);
	public static final RegistryObject<MobEffect> BLAST_RESISTANCE = REGISTRY.register("blast_resistance", () -> new BlastResistanceMobEffect());
}
