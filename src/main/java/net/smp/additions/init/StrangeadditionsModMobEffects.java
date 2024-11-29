
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.smp.additions.init;

import net.smp.additions.potion.BlastResistanceMobEffect;
import net.smp.additions.StrangeadditionsMod;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.effect.MobEffect;

public class StrangeadditionsModMobEffects {
	public static final DeferredRegister<MobEffect> REGISTRY = DeferredRegister.create(ForgeRegistries.MOB_EFFECTS, StrangeadditionsMod.MODID);
	public static final RegistryObject<MobEffect> BLAST_RESISTANCE = REGISTRY.register("blast_resistance", () -> new BlastResistanceMobEffect());
}
