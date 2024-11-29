
package net.smp.additions.item;

import net.minecraftforge.registries.ForgeRegistries;

import net.minecraft.world.item.RecordItem;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;
import net.minecraft.resources.ResourceLocation;

public class JoyrideItem extends RecordItem {
	public JoyrideItem() {
		super(0, () -> ForgeRegistries.SOUND_EVENTS.getValue(new ResourceLocation("strangeadditions:joyride")), new Item.Properties().stacksTo(1).rarity(Rarity.RARE), 1860);
	}
}
