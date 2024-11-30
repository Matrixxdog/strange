
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.smp.additions.init;

import net.smp.additions.world.inventory.FlowerCraftingMenu;
import net.smp.additions.StrangeadditionsMod;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.common.extensions.IForgeMenuType;

import net.minecraft.world.inventory.MenuType;

public class StrangeadditionsModMenus {
	public static final DeferredRegister<MenuType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.MENU_TYPES, StrangeadditionsMod.MODID);
	public static final RegistryObject<MenuType<FlowerCraftingMenu>> FLOWER_CRAFTING = REGISTRY.register("flower_crafting", () -> IForgeMenuType.create(FlowerCraftingMenu::new));
}
