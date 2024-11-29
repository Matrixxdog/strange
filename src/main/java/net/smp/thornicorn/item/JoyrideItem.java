
package net.smp.thornicorn.item;

import net.minecraftforge.registries.ForgeRegistries;

import net.minecraft.world.item.RecordItem;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;
import net.minecraft.resources.ResourceLocation;

public class JoyrideItem extends RecordItem {
	public JoyrideItem() {
		super(0, () -> ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("thornicorn:joyride")), new Item.Properties().stacksTo(1).rarity(Rarity.RARE), 1860);
	}
}
