package net.smp.additions.procedures;

import net.smp.additions.init.StrangeadditionsModItems;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.inventory.Slot;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;

import java.util.function.Supplier;
import java.util.Map;

public class FlowerCraftingWhileThisGUIIsOpenTickProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		double outputslot = 0;
		outputslot = 3;
		if (BlindnessPotionCustomProcedure.execute(entity)) {
			if (entity instanceof Player _player && _player.containerMenu instanceof Supplier _current && _current.get() instanceof Map _slots) {
				ItemStack _setstack = new ItemStack(StrangeadditionsModItems.BLINDNESS_POTION_FLOW.get()).copy();
				_setstack.setCount(1);
				((Slot) _slots.get((int) outputslot)).set(_setstack);
				_player.containerMenu.broadcastChanges();
			}
		} else if (FireResistancePotionCustomProcedure.execute(entity)) {
			if (entity instanceof Player _player && _player.containerMenu instanceof Supplier _current && _current.get() instanceof Map _slots) {
				ItemStack _setstack = new ItemStack(StrangeadditionsModItems.FIRE_RESISTANCE_POTION_FLOW.get()).copy();
				_setstack.setCount(1);
				((Slot) _slots.get((int) outputslot)).set(_setstack);
				_player.containerMenu.broadcastChanges();
			}
		} else if (SaturationPotionCustomProcedure.execute(entity)) {
			if (entity instanceof Player _player && _player.containerMenu instanceof Supplier _current && _current.get() instanceof Map _slots) {
				ItemStack _setstack = new ItemStack(StrangeadditionsModItems.SATURATION_POTION_FLOW.get()).copy();
				_setstack.setCount(1);
				((Slot) _slots.get((int) outputslot)).set(_setstack);
				_player.containerMenu.broadcastChanges();
			}
		} else if (JumpBoostPotionCustomProcedure.execute(entity)) {
			if (entity instanceof Player _player && _player.containerMenu instanceof Supplier _current && _current.get() instanceof Map _slots) {
				ItemStack _setstack = new ItemStack(StrangeadditionsModItems.JUMP_BOOST_POTION_FLOW.get()).copy();
				_setstack.setCount(1);
				((Slot) _slots.get((int) outputslot)).set(_setstack);
				_player.containerMenu.broadcastChanges();
			}
		} else if (PoisonPotionCustomProcedure.execute(entity)) {
			if (entity instanceof Player _player && _player.containerMenu instanceof Supplier _current && _current.get() instanceof Map _slots) {
				ItemStack _setstack = new ItemStack(StrangeadditionsModItems.POISON_POTION_FLOW.get()).copy();
				_setstack.setCount(1);
				((Slot) _slots.get((int) outputslot)).set(_setstack);
				_player.containerMenu.broadcastChanges();
			}
		} else if (RegenerationPotionCustomProcedure.execute(entity)) {
			if (entity instanceof Player _player && _player.containerMenu instanceof Supplier _current && _current.get() instanceof Map _slots) {
				ItemStack _setstack = new ItemStack(StrangeadditionsModItems.REGENERATION_POTION_FLOW.get()).copy();
				_setstack.setCount(1);
				((Slot) _slots.get((int) outputslot)).set(_setstack);
				_player.containerMenu.broadcastChanges();
			}
		} else if (NightVisionPotionCustomProcedure.execute(entity)) {
			if (entity instanceof Player _player && _player.containerMenu instanceof Supplier _current && _current.get() instanceof Map _slots) {
				ItemStack _setstack = new ItemStack(StrangeadditionsModItems.NIGHT_VISION_POTION_FLOW.get()).copy();
				_setstack.setCount(1);
				((Slot) _slots.get((int) outputslot)).set(_setstack);
				_player.containerMenu.broadcastChanges();
			}
		} else {
			if (entity instanceof Player _player && _player.containerMenu instanceof Supplier _current && _current.get() instanceof Map _slots) {
				((Slot) _slots.get((int) outputslot)).set(ItemStack.EMPTY);
				_player.containerMenu.broadcastChanges();
			}
		}
	}
}
