
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.silver.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.network.chat.Component;
import net.minecraft.core.registries.Registries;

import net.mcreator.silver.SilverMod;

public class SilverModTabs {
	public static final DeferredRegister<CreativeModeTab> REGISTRY = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, SilverMod.MODID);
	public static final RegistryObject<CreativeModeTab> SILVER = REGISTRY.register("silver",
			() -> CreativeModeTab.builder().title(Component.translatable("item_group.silver.silver")).icon(() -> new ItemStack(SilverModItems.SILVER_INGOT.get())).displayItems((parameters, tabData) -> {
				tabData.accept(SilverModItems.SILVER_INGOT.get());
				tabData.accept(SilverModItems.RAW_SILVER.get());
				tabData.accept(SilverModBlocks.SILVER_ORE.get().asItem());
				tabData.accept(SilverModItems.SILVERS_SWORD.get());
				tabData.accept(SilverModItems.SILVERS_PICKAXE.get());
				tabData.accept(SilverModItems.SILVERS_AXE.get());
				tabData.accept(SilverModItems.SILVERS_SHOVEL.get());
				tabData.accept(SilverModItems.SILVERS_HOE.get());
				tabData.accept(SilverModItems.SILVERS_ARMOR_HELMET.get());
				tabData.accept(SilverModItems.SILVERS_ARMOR_CHESTPLATE.get());
				tabData.accept(SilverModItems.SILVERS_ARMOR_LEGGINGS.get());
				tabData.accept(SilverModItems.SILVERS_ARMOR_BOOTS.get());
			})

					.build());
}
