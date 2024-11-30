
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.smp.additions.init;

import net.smp.additions.StrangeadditionsMod;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.entity.decoration.PaintingVariant;

public class StrangeadditionsModPaintings {
	public static final DeferredRegister<PaintingVariant> REGISTRY = DeferredRegister.create(ForgeRegistries.PAINTING_VARIANTS, StrangeadditionsMod.MODID);
	public static final RegistryObject<PaintingVariant> EVERLASTING_FUN = REGISTRY.register("everlasting_fun", () -> new PaintingVariant(16, 16));
}
