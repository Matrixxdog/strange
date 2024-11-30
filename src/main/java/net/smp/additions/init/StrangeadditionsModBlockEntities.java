
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.smp.additions.init;

import net.smp.additions.block.entity.FlowerCraftBlockEntity;
import net.smp.additions.StrangeadditionsMod;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.Block;

public class StrangeadditionsModBlockEntities {
	public static final DeferredRegister<BlockEntityType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCK_ENTITY_TYPES, StrangeadditionsMod.MODID);
	public static final RegistryObject<BlockEntityType<?>> FLOWER_CRAFT = register("flower_craft", StrangeadditionsModBlocks.FLOWER_CRAFT, FlowerCraftBlockEntity::new);

	// Start of user code block custom block entities
	// End of user code block custom block entities
	private static RegistryObject<BlockEntityType<?>> register(String registryname, RegistryObject<Block> block, BlockEntityType.BlockEntitySupplier<?> supplier) {
		return REGISTRY.register(registryname, () -> BlockEntityType.Builder.of(supplier, block.get()).build(null));
	}
}
