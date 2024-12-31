
/*
*	MCreator note: This file will be REGENERATED on each build.
*/
package net.horseauction.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.village.VillagerTradesEvent;
import net.minecraftforge.common.BasicItemListing;

import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.npc.VillagerProfession;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.FORGE)
public class HorseAuctionModTrades {
	@SubscribeEvent
	public static void registerTrades(VillagerTradesEvent event) {
		if (event.getType() == VillagerProfession.ARMORER) {
			event.getTrades().get(3).add(new BasicItemListing(new ItemStack(Items.LEATHER_HORSE_ARMOR), new ItemStack(Items.IRON_INGOT, 3), new ItemStack(Items.IRON_HORSE_ARMOR), 10, 5, 0.1f));
			event.getTrades().get(3).add(new BasicItemListing(new ItemStack(Items.LEATHER_HORSE_ARMOR), new ItemStack(Items.GOLD_INGOT, 3), new ItemStack(Items.GOLDEN_HORSE_ARMOR), 10, 5, 0.1f));
			event.getTrades().get(4).add(new BasicItemListing(new ItemStack(Items.LEATHER_HORSE_ARMOR), new ItemStack(Items.DIAMOND, 3), new ItemStack(Items.DIAMOND), 10, 5, 0.1f));
		}
		if (event.getType() == VillagerProfession.ARMORER) {
			event.getTrades().get(4).add(new BasicItemListing(new ItemStack(Items.IRON_HORSE_ARMOR),

					new ItemStack(Items.IRON_INGOT, 3), 10, 5, 0.05f));
			event.getTrades().get(4).add(new BasicItemListing(new ItemStack(Items.GOLDEN_HORSE_ARMOR),

					new ItemStack(Items.GOLD_INGOT, 3), 10, 5, 0.05f));
			event.getTrades().get(5).add(new BasicItemListing(new ItemStack(Items.DIAMOND_HORSE_ARMOR),

					new ItemStack(Items.DIAMOND, 3), 10, 5, 0.05f));
		}
		if (event.getType() == VillagerProfession.ARMORER) {
			event.getTrades().get(4).add(new BasicItemListing(new ItemStack(Items.IRON_HORSE_ARMOR),

					new ItemStack(Items.EMERALD, 10), 10, 5, 0.05f));
			event.getTrades().get(4).add(new BasicItemListing(new ItemStack(Items.GOLDEN_HORSE_ARMOR),

					new ItemStack(Items.EMERALD, 15), 10, 5, 0.05f));
			event.getTrades().get(5).add(new BasicItemListing(new ItemStack(Items.DIAMOND),

					new ItemStack(Items.EMERALD, 20), 10, 5, 0.05f));
		}
	}
}
