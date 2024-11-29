
package net.smp.additions.potion;

import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.effect.MobEffect;

public class BlastResistanceMobEffect extends MobEffect {
	public BlastResistanceMobEffect() {
		super(MobEffectCategory.BENEFICIAL, -6750203);
	}

	@Override
	public boolean isDurationEffectTick(int duration, int amplifier) {
		return true;
	}
}
