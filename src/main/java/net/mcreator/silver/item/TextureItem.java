
package net.mcreator.silver.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

public class TextureItem extends Item {
	public TextureItem() {
		super(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON));
	}
}
