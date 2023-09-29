
package net.mcreator.silver.item;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.PickaxeItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.InteractionHand;

import net.mcreator.silver.procedures.SilversPickaxeRightclickedProcedure;
import net.mcreator.silver.init.SilverModItems;

public class SilversPickaxeItem extends PickaxeItem {
	public SilversPickaxeItem() {
		super(new Tier() {
			public int getUses() {
				return 381;
			}

			public float getSpeed() {
				return 7f;
			}

			public float getAttackDamageBonus() {
				return 1f;
			}

			public int getLevel() {
				return 3;
			}

			public int getEnchantmentValue() {
				return 19;
			}

			public Ingredient getRepairIngredient() {
				return Ingredient.of(new ItemStack(SilverModItems.SILVER_INGOT.get()));
			}
		}, 1, -3f, new Item.Properties());
	}

	@Override
	public InteractionResultHolder<ItemStack> use(Level world, Player entity, InteractionHand hand) {
		InteractionResultHolder<ItemStack> ar = super.use(world, entity, hand);
		SilversPickaxeRightclickedProcedure.execute(world, entity, ar.getObject());
		return ar;
	}
}
