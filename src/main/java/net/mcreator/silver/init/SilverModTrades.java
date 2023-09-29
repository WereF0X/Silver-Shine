
/*
*	MCreator note: This file will be REGENERATED on each build.
*/
package net.mcreator.silver.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.village.VillagerTradesEvent;
import net.minecraftforge.common.BasicItemListing;

import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.npc.VillagerProfession;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.FORGE)
public class SilverModTrades {
	@SubscribeEvent
	public static void registerTrades(VillagerTradesEvent event) {
		if (event.getType() == VillagerProfession.ARMORER) {
			event.getTrades().get(1).add(new BasicItemListing(new ItemStack(Items.EMERALD, 5),

					new ItemStack(SilverModItems.SILVERS_ARMOR_CHESTPLATE.get()), 10, 5, 0.05f));
		}
		if (event.getType() == VillagerProfession.WEAPONSMITH) {
			event.getTrades().get(1).add(new BasicItemListing(new ItemStack(Items.EMERALD, 3),

					new ItemStack(SilverModItems.SILVERS_SWORD.get()), 10, 5, 0.05f));
		}
		if (event.getType() == VillagerProfession.TOOLSMITH) {
			event.getTrades().get(1).add(new BasicItemListing(new ItemStack(Items.EMERALD, 6),

					new ItemStack(SilverModItems.SILVERS_PICKAXE.get()), 10, 5, 0.05f));
		}
	}
}
