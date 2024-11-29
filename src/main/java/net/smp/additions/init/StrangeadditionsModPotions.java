
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.smp.additions.init;

import net.smp.additions.StrangeadditionsMod;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.item.alchemy.Potion;
import net.minecraft.world.effect.MobEffectInstance;

public class StrangeadditionsModPotions {
	public static final DeferredRegister<Potion> REGISTRY = DeferredRegister.create(ForgeRegistries.POTIONS, StrangeadditionsMod.MODID);
	public static final RegistryObject<Potion> BLAST_RESISTCANCE_POTION = REGISTRY.register("blast_resistcance_potion", () -> new Potion(new MobEffectInstance(StrangeadditionsModMobEffects.BLAST_RESISTANCE.get(), 3600, 0, false, true)));
}
