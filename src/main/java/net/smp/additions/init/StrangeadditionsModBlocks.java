
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.smp.additions.init;

import net.smp.additions.block.FlowerCraftBlock;
import net.smp.additions.StrangeadditionsMod;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;

public class StrangeadditionsModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, StrangeadditionsMod.MODID);
	public static final RegistryObject<Block> FLOWER_CRAFT = REGISTRY.register("flower_craft", () -> new FlowerCraftBlock());
	// Start of user code block custom blocks
	// End of user code block custom blocks
}
