
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.silver.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.common.Mod;

import net.minecraft.world.level.levelgen.feature.Feature;

import net.mcreator.silver.world.features.ores.SilverOreFeature;
import net.mcreator.silver.SilverMod;

@Mod.EventBusSubscriber
public class SilverModFeatures {
	public static final DeferredRegister<Feature<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.FEATURES, SilverMod.MODID);
	public static final RegistryObject<Feature<?>> SILVER_ORE = REGISTRY.register("silver_ore", SilverOreFeature::new);
}
