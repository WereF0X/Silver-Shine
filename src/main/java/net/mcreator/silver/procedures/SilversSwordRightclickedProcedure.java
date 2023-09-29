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

public class SilversSwordRightclickedProcedure {
	public static void execute(LevelAccessor world, Entity entity, ItemStack itemstack) {
		if (entity == null)
			return;
		if (EnchantmentHelper.getItemEnchantmentLevel(SilverModEnchantments.SILVER_HARSHNESS.get(), itemstack) != 0) {
			if (world.isClientSide())
				Minecraft.getInstance().gameRenderer.displayItemActivation(new ItemStack(SilverModItems.TEXTURE.get()));
			itemstack.enchant(Enchantments.SHARPNESS, 3);
			itemstack.enchant(Enchantments.FIRE_ASPECT, 1);
			if (entity instanceof Player _player)
				_player.getCooldowns().addCooldown(itemstack.getItem(), 8400);
			SilverMod.queueServerWork(1200, () -> {
				{
					Map<Enchantment, Integer> _enchantments = EnchantmentHelper.getEnchantments(itemstack);
					if (_enchantments.containsKey(Enchantments.SHARPNESS)) {
						_enchantments.remove(Enchantments.SHARPNESS);
						EnchantmentHelper.setEnchantments(_enchantments, itemstack);
					}
				}
				{
					Map<Enchantment, Integer> _enchantments = EnchantmentHelper.getEnchantments(itemstack);
					if (_enchantments.containsKey(Enchantments.FIRE_ASPECT)) {
						_enchantments.remove(Enchantments.FIRE_ASPECT);
						EnchantmentHelper.setEnchantments(_enchantments, itemstack);
					}
				}
			});
		}
	}
}
