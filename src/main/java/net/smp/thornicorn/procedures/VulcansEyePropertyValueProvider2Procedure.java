package net.smp.thornicorn.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.BlockPos;

public class VulcansEyePropertyValueProvider2Procedure {
	public static double execute(LevelAccessor world, double x, double y, double z) {
		if (world.getBiome(BlockPos.containing(x, y, z)).is(new ResourceLocation("the_end"))) {
			return 1;
		}
		return 0;
	}
}
