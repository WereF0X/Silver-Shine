package net.mcreator.silver.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.item.enchantment.Enchantments;
import net.minecraft.world.item.enchantment.EnchantmentHelper;
import net.minecraft.world.item.enchantment.Enchantment;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;
import net.minecraft.client.Minecraft;

import net.mcreator.silver.init.SilverModItems;
import net.mcreator.silver.init.SilverModEnchantments;
import net.mcreator.silver.SilverMod;

import java.util.Map;

public class SilversPickaxeRightclickedProcedure {
	public static void execute(LevelAccessor world, Entity entity, ItemStack itemstack) {
		if (entity == null)
			return;
		if (EnchantmentHelper.getItemEnchantmentLevel(SilverModEnchantments.SILVEREFFICIENCY.get(), itemstack) != 0) {
			if (world.isClientSide())
				Minecraft.getInstance().gameRenderer.displayItemActivation(new ItemStack(SilverModItems.TEXTURE_2.get()));
			if (entity instanceof Player _player)
				_player.getCooldowns().addCooldown(itemstack.getItem(), 6000);
			itemstack.enchant(Enchantments.BLOCK_EFFICIENCY, 3);
			SilverMod.queueServerWork(4000, () -> {
				{
					Map<Enchantment, Integer> _enchantments = EnchantmentHelper.getEnchantments(itemstack);
					if (_enchantments.containsKey(Enchantments.BLOCK_EFFICIENCY)) {
						_enchantments.remove(Enchantments.BLOCK_EFFICIENCY);
						EnchantmentHelper.setEnchantments(_enchantments, itemstack);
					}
				}
			});
		}
	}
}
