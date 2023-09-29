
package net.mcreator.silver.client.screens;

import org.checkerframework.checker.units.qual.h;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.EventPriority;
import net.minecraftforge.client.event.ScreenEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.network.chat.Component;
import net.minecraft.client.gui.screens.multiplayer.JoinMultiplayerScreen;
import net.minecraft.client.Minecraft;

@Mod.EventBusSubscriber({Dist.CLIENT})
public class TitleOverlay {
	@SubscribeEvent(priority = EventPriority.HIGH)
	public static void eventHandler(ScreenEvent.Render.Post event) {
		if (event.getScreen() instanceof JoinMultiplayerScreen) {
			int w = event.getScreen().width;
			int h = event.getScreen().height;
			int posX = w / 2;
			int posY = h / 2;
			Level world = null;
			double x = 0;
			double y = 0;
			double z = 0;
			Player entity = Minecraft.getInstance().player;
			if (entity != null) {
				world = entity.level();
				x = entity.getX();
				y = entity.getY();
				z = entity.getZ();
			}
			if (true) {
				event.getGuiGraphics().drawString(Minecraft.getInstance().font, Component.translatable("gui.silver.warning.label_warning_this_mod_is_clientside"), posX + 42, posY + -119, -3407872, false);
				event.getGuiGraphics().drawString(Minecraft.getInstance().font, Component.translatable("gui.silver.warning.label_meaning_if_you_join_a_server_tha"), posX + 42, posY + -109, -3407872, false);
				event.getGuiGraphics().drawString(Minecraft.getInstance().font, Component.translatable("gui.silver.warning.label_doesnt_have_this_mod_installed"), posX + 42, posY + -99, -3407872, false);
				event.getGuiGraphics().drawString(Minecraft.getInstance().font, Component.translatable("gui.silver.warning.label_you_wont_be_able_to_use_it"), posX + 68, posY + -88, -3407872, false);
			}
		}
	}
}
