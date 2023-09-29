
package net.mcreator.silver.enchantment;

import net.minecraft.world.item.enchantment.EnchantmentCategory;
import net.minecraft.world.item.enchantment.Enchantment;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.EquipmentSlot;

import net.mcreator.silver.init.SilverModItems;

public class SilverefficiencyEnchantment extends Enchantment {
	public SilverefficiencyEnchantment(EquipmentSlot... slots) {
		super(Enchantment.Rarity.RARE, EnchantmentCategory.DIGGER, slots);
	}

	@Override
	public boolean canApplyAtEnchantingTable(ItemStack itemstack) {
		return !Ingredient.of(new ItemStack(SilverModItems.SILVERS_ARMOR_HELMET.get()), new ItemStack(SilverModItems.SILVERS_ARMOR_CHESTPLATE.get()), new ItemStack(SilverModItems.SILVERS_ARMOR_LEGGINGS.get()),
				new ItemStack(SilverModItems.SILVERS_ARMOR_BOOTS.get()), new ItemStack(SilverModItems.SILVERS_AXE.get()), new ItemStack(SilverModItems.SILVERS_SWORD.get()), new ItemStack(SilverModItems.SILVERS_HOE.get()),
				new ItemStack(Items.WOODEN_SWORD), new ItemStack(Items.WOODEN_AXE), new ItemStack(Items.WOODEN_HOE), new ItemStack(Items.STONE_SWORD), new ItemStack(Items.STONE_AXE), new ItemStack(Items.STONE_HOE), new ItemStack(Items.IRON_SWORD),
				new ItemStack(Items.IRON_AXE), new ItemStack(Items.IRON_HOE), new ItemStack(Items.GOLDEN_SWORD), new ItemStack(Items.GOLDEN_AXE), new ItemStack(Items.GOLDEN_HOE), new ItemStack(Items.DIAMOND_SWORD), new ItemStack(Items.DIAMOND_AXE),
				new ItemStack(Items.DIAMOND_HOE), new ItemStack(Items.NETHERITE_SWORD), new ItemStack(Items.NETHERITE_AXE), new ItemStack(Items.NETHERITE_HOE), new ItemStack(Items.TRIDENT), new ItemStack(Items.LEATHER_HELMET),
				new ItemStack(Items.LEATHER_CHESTPLATE), new ItemStack(Items.LEATHER_LEGGINGS), new ItemStack(Items.LEATHER_BOOTS), new ItemStack(Items.CHAINMAIL_HELMET), new ItemStack(Items.CHAINMAIL_CHESTPLATE),
				new ItemStack(Items.CHAINMAIL_LEGGINGS), new ItemStack(Items.CHAINMAIL_BOOTS), new ItemStack(Items.TURTLE_HELMET), new ItemStack(Items.IRON_HELMET), new ItemStack(Items.IRON_CHESTPLATE), new ItemStack(Items.IRON_LEGGINGS),
				new ItemStack(Items.IRON_BOOTS), new ItemStack(Items.GOLDEN_HELMET), new ItemStack(Items.GOLDEN_CHESTPLATE), new ItemStack(Items.GOLDEN_LEGGINGS), new ItemStack(Items.GOLDEN_BOOTS), new ItemStack(Items.DIAMOND_HELMET),
				new ItemStack(Items.DIAMOND_CHESTPLATE), new ItemStack(Items.DIAMOND_LEGGINGS), new ItemStack(Items.DIAMOND_BOOTS), new ItemStack(Items.NETHERITE_HELMET), new ItemStack(Items.NETHERITE_CHESTPLATE),
				new ItemStack(Items.NETHERITE_LEGGINGS), new ItemStack(Items.NETHERITE_BOOTS), new ItemStack(Items.ELYTRA)).test(itemstack);
	}
}
