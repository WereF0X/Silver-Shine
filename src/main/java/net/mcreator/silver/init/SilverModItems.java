
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.silver.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.BlockItem;

import net.mcreator.silver.item.TextureItem;
import net.mcreator.silver.item.Texture2Item;
import net.mcreator.silver.item.SilversSwordItem;
import net.mcreator.silver.item.SilversShovelItem;
import net.mcreator.silver.item.SilversPickaxeItem;
import net.mcreator.silver.item.SilversHoeItem;
import net.mcreator.silver.item.SilversAxeItem;
import net.mcreator.silver.item.SilversArmorItem;
import net.mcreator.silver.item.SilverIngotItem;
import net.mcreator.silver.item.RawSilverItem;
import net.mcreator.silver.SilverMod;

public class SilverModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, SilverMod.MODID);
	public static final RegistryObject<Item> SILVER_INGOT = REGISTRY.register("silver_ingot", () -> new SilverIngotItem());
	public static final RegistryObject<Item> RAW_SILVER = REGISTRY.register("raw_silver", () -> new RawSilverItem());
	public static final RegistryObject<Item> SILVER_ORE = block(SilverModBlocks.SILVER_ORE);
	public static final RegistryObject<Item> SILVERS_SWORD = REGISTRY.register("silvers_sword", () -> new SilversSwordItem());
	public static final RegistryObject<Item> SILVERS_PICKAXE = REGISTRY.register("silvers_pickaxe", () -> new SilversPickaxeItem());
	public static final RegistryObject<Item> SILVERS_AXE = REGISTRY.register("silvers_axe", () -> new SilversAxeItem());
	public static final RegistryObject<Item> SILVERS_SHOVEL = REGISTRY.register("silvers_shovel", () -> new SilversShovelItem());
	public static final RegistryObject<Item> SILVERS_HOE = REGISTRY.register("silvers_hoe", () -> new SilversHoeItem());
	public static final RegistryObject<Item> SILVERS_ARMOR_HELMET = REGISTRY.register("silvers_armor_helmet", () -> new SilversArmorItem.Helmet());
	public static final RegistryObject<Item> SILVERS_ARMOR_CHESTPLATE = REGISTRY.register("silvers_armor_chestplate", () -> new SilversArmorItem.Chestplate());
	public static final RegistryObject<Item> SILVERS_ARMOR_LEGGINGS = REGISTRY.register("silvers_armor_leggings", () -> new SilversArmorItem.Leggings());
	public static final RegistryObject<Item> SILVERS_ARMOR_BOOTS = REGISTRY.register("silvers_armor_boots", () -> new SilversArmorItem.Boots());
	public static final RegistryObject<Item> SILVER_BLOCK = block(SilverModBlocks.SILVER_BLOCK);
	public static final RegistryObject<Item> TEXTURE = REGISTRY.register("texture", () -> new TextureItem());
	public static final RegistryObject<Item> TEXTURE_2 = REGISTRY.register("texture_2", () -> new Texture2Item());

	private static RegistryObject<Item> block(RegistryObject<Block> block) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties()));
	}
}
