package net.mcreator.grassweapons.procedures;

import net.minecraft.util.DamageSource;
import net.minecraft.entity.Entity;

import net.mcreator.grassweapons.GrassWeaponsModElements;
import net.mcreator.grassweapons.GrassWeaponsMod;

import java.util.Map;

@GrassWeaponsModElements.ModElement.Tag
public class LightningdirtswordLivingEntityIsHitWithToolProcedure extends GrassWeaponsModElements.ModElement {
	public LightningdirtswordLivingEntityIsHitWithToolProcedure(GrassWeaponsModElements instance) {
		super(instance, 8);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				GrassWeaponsMod.LOGGER.warn("Failed to load dependency entity for procedure LightningdirtswordLivingEntityIsHitWithTool!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		entity.attackEntityFrom(DamageSource.GENERIC, (float) 1);
		entity.setFire((int) 6);
	}
}
