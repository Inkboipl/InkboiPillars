
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.pillarsdime.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredBlock;

import net.minecraft.world.level.block.Block;

import net.mcreator.pillarsdime.block.PillarsDiM2PortalBlock;
import net.mcreator.pillarsdime.PillarsdimeMod;

public class PillarsdimeModBlocks {
	public static final DeferredRegister.Blocks REGISTRY = DeferredRegister.createBlocks(PillarsdimeMod.MODID);
	public static final DeferredBlock<Block> PILLARS_DI_M_2_PORTAL = REGISTRY.register("pillars_di_m_2_portal", PillarsDiM2PortalBlock::new);
	// Start of user code block custom blocks
	// End of user code block custom blocks
}
