package net.mcreator.grassweapons.procedures;

import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.entity.player.CriticalHitEvent;
import net.minecraftforge.common.MinecraftForge;

import net.minecraft.world.World;
import net.minecraft.item.ItemStack;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.Entity;

import net.mcreator.grassweapons.item.SharpoflightningItem;
import net.mcreator.grassweapons.GrassWeaponsModElements;
import net.mcreator.grassweapons.GrassWeaponsMod;

import java.util.Map;
import java.util.HashMap;

@GrassWeaponsModElements.ModElement.Tag
public class FulllightningswordLivingEntityIsHitWithToolProcedure extends GrassWeaponsModElements.ModElement {
	public FulllightningswordLivingEntityIsHitWithToolProcedure(GrassWeaponsModElements instance) {
		super(instance, 15);
		MinecraftForge.EVENT_BUS.register(this);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				GrassWeaponsMod.LOGGER.warn("Failed to load dependency entity for procedure FulllightningswordLivingEntityIsHitWithTool!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		if (((entity instanceof PlayerEntity)
				? ((PlayerEntity) entity).inventory.hasItemStack(new ItemStack(SharpoflightningItem.block, (int) (1)))
				: false)) {
			entity.setFire((int) 7);
		}
	}

	@SubscribeEvent
	public void onPlayerCriticalHit(CriticalHitEvent event) {
		Entity entity = event.getTarget();
		PlayerEntity sourceentity = event.getPlayer();
		double i = sourceentity.getPosX();
		double j = sourceentity.getPosY();
		double k = sourceentity.getPosZ();
		World world = sourceentity.world;
		Map<String, Object> dependencies = new HashMap<>();
		dependencies.put("x", i);
		dependencies.put("y", j);
		dependencies.put("z", k);
		dependencies.put("world", world);
		dependencies.put("entity", entity);
		dependencies.put("sourceentity", sourceentity);
		dependencies.put("damagemodifier", event.getDamageModifier());
		dependencies.put("isvanillacritical", event.isVanillaCritical());
		dependencies.put("event", event);
		this.executeProcedure(dependencies);
	}
}
