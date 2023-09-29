
package net.mcreator.silver.enchantment;

import net.minecraft.world.item.enchantment.EnchantmentCategory;
import net.minecraft.world.item.enchantment.Enchantment;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.damagesource.DamageSource;

import net.mcreator.silver.init.SilverModItems;

public class SilverShineEnchantment extends Enchantment {
	public SilverShineEnchantment(EquipmentSlot... slots) {
		super(Enchantment.Rarity.UNCOMMON, EnchantmentCategory.BREAKABLE, slots);
	}

	@Override
	public int getMaxLevel() {
		return 2;
	}

	@Override
	public int getDamageProtection(int level, DamageSource source) {
		return level * 1;
	}

	@Override
	public boolean canApplyAtEnchantingTable(ItemStack itemstack) {
		return !Ingredient.of(new ItemStack(SilverModItems.SILVERS_SWORD.get()), new ItemStack(SilverModItems.SILVERS_PICKAXE.get()), new ItemStack(SilverModItems.SILVERS_AXE.get()), new ItemStack(SilverModItems.SILVERS_SHOVEL.get()),
				new ItemStack(SilverModItems.SILVERS_HOE.get()), new ItemStack(Items.WOODEN_SWORD), new ItemStack(Items.WOODEN_SHOVEL), new ItemStack(Items.WOODEN_PICKAXE), new ItemStack(Items.WOODEN_AXE), new ItemStack(Items.WOODEN_HOE),
				new ItemStack(Items.STONE_SWORD), new ItemStack(Items.STONE_SHOVEL), new ItemStack(Items.STONE_PICKAXE), new ItemStack(Items.STONE_AXE), new ItemStack(Items.STONE_HOE), new ItemStack(Items.IRON_SWORD),
				new ItemStack(Items.IRON_SHOVEL), new ItemStack(Items.IRON_PICKAXE), new ItemStack(Items.IRON_AXE), new ItemStack(Items.IRON_HOE), new ItemStack(Items.FLINT_AND_STEEL), new ItemStack(Items.SHEARS), new ItemStack(Items.GOLDEN_SWORD),
				new ItemStack(Items.GOLDEN_SHOVEL), new ItemStack(Items.GOLDEN_PICKAXE), new ItemStack(Items.GOLDEN_AXE), new ItemStack(Items.GOLDEN_HOE), new ItemStack(Items.DIAMOND_SWORD), new ItemStack(Items.DIAMOND_SHOVEL),
				new ItemStack(Items.DIAMOND_PICKAXE), new ItemStack(Items.DIAMOND_AXE), new ItemStack(Items.DIAMOND_HOE), new ItemStack(Items.NETHERITE_SWORD), new ItemStack(Items.NETHERITE_SHOVEL), new ItemStack(Items.NETHERITE_PICKAXE),
				new ItemStack(Items.NETHERITE_AXE), new ItemStack(Items.NETHERITE_HOE), new ItemStack(Items.TRIDENT)).test(itemstack);
	}
}
