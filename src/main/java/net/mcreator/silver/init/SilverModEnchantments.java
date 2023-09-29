
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.silver.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.item.enchantment.Enchantment;

import net.mcreator.silver.enchantment.SilverefficiencyEnchantment;
import net.mcreator.silver.enchantment.SilverShineEnchantment;
import net.mcreator.silver.enchantment.SilverHarshnessEnchantment;
import net.mcreator.silver.SilverMod;

public class SilverModEnchantments {
	public static final DeferredRegister<Enchantment> REGISTRY = DeferredRegister.create(ForgeRegistries.ENCHANTMENTS, SilverMod.MODID);
	public static final RegistryObject<Enchantment> SILVER_SHINE = REGISTRY.register("silver_shine", () -> new SilverShineEnchantment());
	public static final RegistryObject<Enchantment> SILVER_HARSHNESS = REGISTRY.register("silver_harshness", () -> new SilverHarshnessEnchantment());
	public static final RegistryObject<Enchantment> SILVEREFFICIENCY = REGISTRY.register("silverefficiency", () -> new SilverefficiencyEnchantment());
}
