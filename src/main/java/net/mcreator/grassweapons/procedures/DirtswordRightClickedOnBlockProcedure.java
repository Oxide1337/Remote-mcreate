package net.mcreator.grassweapons.procedures;

import net.minecraft.world.IWorld;
import net.minecraft.util.math.BlockPos;
import net.minecraft.item.ItemStack;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.Entity;
import net.minecraft.block.Blocks;

import net.mcreator.grassweapons.GrassWeaponsModElements;
import net.mcreator.grassweapons.GrassWeaponsMod;

import java.util.Map;

@GrassWeaponsModElements.ModElement.Tag
public class DirtswordRightClickedOnBlockProcedure extends GrassWeaponsModElements.ModElement {
	public DirtswordRightClickedOnBlockProcedure(GrassWeaponsModElements instance) {
		super(instance, 3);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				GrassWeaponsMod.LOGGER.warn("Failed to load dependency entity for procedure DirtswordRightClickedOnBlock!");
			return;
		}
		if (dependencies.get("x") == null) {
			if (!dependencies.containsKey("x"))
				GrassWeaponsMod.LOGGER.warn("Failed to load dependency x for procedure DirtswordRightClickedOnBlock!");
			return;
		}
		if (dependencies.get("y") == null) {
			if (!dependencies.containsKey("y"))
				GrassWeaponsMod.LOGGER.warn("Failed to load dependency y for procedure DirtswordRightClickedOnBlock!");
			return;
		}
		if (dependencies.get("z") == null) {
			if (!dependencies.containsKey("z"))
				GrassWeaponsMod.LOGGER.warn("Failed to load dependency z for procedure DirtswordRightClickedOnBlock!");
			return;
		}
		if (dependencies.get("world") == null) {
			if (!dependencies.containsKey("world"))
				GrassWeaponsMod.LOGGER.warn("Failed to load dependency world for procedure DirtswordRightClickedOnBlock!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		double x = dependencies.get("x") instanceof Integer ? (int) dependencies.get("x") : (double) dependencies.get("x");
		double y = dependencies.get("y") instanceof Integer ? (int) dependencies.get("y") : (double) dependencies.get("y");
		double z = dependencies.get("z") instanceof Integer ? (int) dependencies.get("z") : (double) dependencies.get("z");
		IWorld world = (IWorld) dependencies.get("world");
		world.setBlockState(new BlockPos((int) x, (int) y, (int) z), Blocks.DIRT.getDefaultState(), 3);
		if (entity instanceof PlayerEntity) {
			ItemStack _stktoremove = new ItemStack(Blocks.DIRT, (int) (1));
			((PlayerEntity) entity).inventory.func_234564_a_(p -> _stktoremove.getItem() == p.getItem(), (int) 1,
					((PlayerEntity) entity).container.func_234641_j_());
		}
	}
}
