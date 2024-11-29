
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.smp.thornicorn.init;

import net.smp.thornicorn.ThornicornMod;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.entity.decoration.PaintingVariant;

public class ThornicornModPaintings {
	public static final DeferredRegister<PaintingVariant> REGISTRY = DeferredRegister.create(ForgeRegistries.PAINTING_VARIANTS, ThornicornMod.MODID);
	public static final RegistryObject<PaintingVariant> EVERLASTING_FUN = REGISTRY.register("everlasting_fun", () -> new PaintingVariant(16, 16));
}
