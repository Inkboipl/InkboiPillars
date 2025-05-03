
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.pillarsdime.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredItem;

import net.minecraft.world.item.Item;

import net.mcreator.pillarsdime.item.PillarsDiM2Item;
import net.mcreator.pillarsdime.PillarsdimeMod;

public class PillarsdimeModItems {
	public static final DeferredRegister.Items REGISTRY = DeferredRegister.createItems(PillarsdimeMod.MODID);
	public static final DeferredItem<Item> PILLARS_DI_M_2 = REGISTRY.register("pillars_di_m_2", PillarsDiM2Item::new);
	// Start of user code block custom items
	// End of user code block custom items
}
