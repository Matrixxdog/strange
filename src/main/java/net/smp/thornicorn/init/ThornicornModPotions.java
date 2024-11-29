
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.smp.thornicorn.init;

import net.smp.thornicorn.ThornicornMod;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.item.alchemy.Potion;
import net.minecraft.world.effect.MobEffectInstance;

public class ThornicornModPotions {
	public static final DeferredRegister<Potion> REGISTRY = DeferredRegister.create(ForgeRegistries.POTIONS, ThornicornMod.MODID);
	public static final RegistryObject<Potion> BLAST_RESISTCANCE_POTION = REGISTRY.register("blast_resistcance_potion", () -> new Potion(new MobEffectInstance(ThornicornModMobEffects.BLAST_RESISTANCE.get(), 3600, 0, false, true)));
}
