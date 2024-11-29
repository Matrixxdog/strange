package net.smp.thornicorn.procedures;

import net.smp.thornicorn.init.ThornicornModItems;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.item.ItemStack;
import net.minecraft.tags.TagKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;
import net.minecraft.core.registries.Registries;
import net.minecraft.core.BlockPos;

public class VulcansEyePropertyValueProviderProcedure {
	public static double execute(LevelAccessor world, double x, double y, double z) {
		if (world.getBiome(BlockPos.containing(x, y, z)).is(TagKey.create(Registries.BIOME, new ResourceLocation("minecraft:is_nether")))) {
			new ItemStack(ThornicornModItems.VULCANS_EYE.get()).setHoverName(Component.literal("Vulcan's Eye"));
			return 1;
		}
		return 0;
	}
}
