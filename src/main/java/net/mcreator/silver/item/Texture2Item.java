
package net.mcreator.silver.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class Texture2Item extends Item {
	public Texture2Item() {
		super(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON));
	}
}
