package net.mcreator.grassweapons.procedures;

import net.minecraft.util.DamageSource;
import net.minecraft.entity.projectile.ShulkerBulletEntity;
import net.minecraft.entity.projectile.LlamaSpitEntity;
import net.minecraft.entity.player.ServerPlayerEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.passive.horse.ZombieHorseEntity;
import net.minecraft.entity.passive.horse.TraderLlamaEntity;
import net.minecraft.entity.passive.horse.SkeletonHorseEntity;
import net.minecraft.entity.passive.horse.MuleEntity;
import net.minecraft.entity.passive.horse.LlamaEntity;
import net.minecraft.entity.passive.horse.HorseEntity;
import net.minecraft.entity.passive.horse.DonkeyEntity;
import net.minecraft.entity.passive.fish.TropicalFishEntity;
import net.minecraft.entity.passive.fish.SalmonEntity;
import net.minecraft.entity.passive.fish.PufferfishEntity;
import net.minecraft.entity.passive.fish.CodEntity;
import net.minecraft.entity.passive.WolfEntity;
import net.minecraft.entity.passive.TurtleEntity;
import net.minecraft.entity.passive.StriderEntity;
import net.minecraft.entity.passive.SquidEntity;
import net.minecraft.entity.passive.SnowGolemEntity;
import net.minecraft.entity.passive.SheepEntity;
import net.minecraft.entity.passive.RabbitEntity;
import net.minecraft.entity.passive.PolarBearEntity;
import net.minecraft.entity.passive.PigEntity;
import net.minecraft.entity.passive.ParrotEntity;
import net.minecraft.entity.passive.PandaEntity;
import net.minecraft.entity.passive.OcelotEntity;
import net.minecraft.entity.passive.IronGolemEntity;
import net.minecraft.entity.passive.GolemEntity;
import net.minecraft.entity.passive.FoxEntity;
import net.minecraft.entity.passive.DolphinEntity;
import net.minecraft.entity.passive.CowEntity;
import net.minecraft.entity.passive.ChickenEntity;
import net.minecraft.entity.passive.CatEntity;
import net.minecraft.entity.passive.BeeEntity;
import net.minecraft.entity.passive.BatEntity;
import net.minecraft.entity.monster.piglin.PiglinEntity;
import net.minecraft.entity.monster.piglin.PiglinBruteEntity;
import net.minecraft.entity.monster.ZombifiedPiglinEntity;
import net.minecraft.entity.monster.ZombieVillagerEntity;
import net.minecraft.entity.monster.ZombieEntity;
import net.minecraft.entity.monster.ZoglinEntity;
import net.minecraft.entity.monster.WitherSkeletonEntity;
import net.minecraft.entity.monster.WitchEntity;
import net.minecraft.entity.monster.VindicatorEntity;
import net.minecraft.entity.monster.VexEntity;
import net.minecraft.entity.monster.StrayEntity;
import net.minecraft.entity.monster.SpiderEntity;
import net.minecraft.entity.monster.SpellcastingIllagerEntity;
import net.minecraft.entity.monster.SlimeEntity;
import net.minecraft.entity.monster.SkeletonEntity;
import net.minecraft.entity.monster.SilverfishEntity;
import net.minecraft.entity.monster.ShulkerEntity;
import net.minecraft.entity.monster.RavagerEntity;
import net.minecraft.entity.monster.PillagerEntity;
import net.minecraft.entity.monster.PhantomEntity;
import net.minecraft.entity.monster.MonsterEntity;
import net.minecraft.entity.monster.MagmaCubeEntity;
import net.minecraft.entity.monster.IllusionerEntity;
import net.minecraft.entity.monster.HuskEntity;
import net.minecraft.entity.monster.HoglinEntity;
import net.minecraft.entity.monster.GuardianEntity;
import net.minecraft.entity.monster.GhastEntity;
import net.minecraft.entity.monster.EvokerEntity;
import net.minecraft.entity.monster.EndermiteEntity;
import net.minecraft.entity.monster.EndermanEntity;
import net.minecraft.entity.monster.ElderGuardianEntity;
import net.minecraft.entity.monster.DrownedEntity;
import net.minecraft.entity.monster.CreeperEntity;
import net.minecraft.entity.monster.CaveSpiderEntity;
import net.minecraft.entity.monster.BlazeEntity;
import net.minecraft.entity.merchant.villager.VillagerEntity;
import net.minecraft.entity.item.minecart.MinecartEntity;
import net.minecraft.entity.item.minecart.HopperMinecartEntity;
import net.minecraft.entity.item.minecart.FurnaceMinecartEntity;
import net.minecraft.entity.item.minecart.ContainerMinecartEntity;
import net.minecraft.entity.item.minecart.CommandBlockMinecartEntity;
import net.minecraft.entity.item.minecart.ChestMinecartEntity;
import net.minecraft.entity.item.PaintingEntity;
import net.minecraft.entity.item.EnderCrystalEntity;
import net.minecraft.entity.item.BoatEntity;
import net.minecraft.entity.boss.dragon.EnderDragonEntity;
import net.minecraft.entity.boss.WitherEntity;
import net.minecraft.entity.Entity;
import net.minecraft.entity.CreatureEntity;

import net.mcreator.grassweapons.GrassWeaponsModElements;
import net.mcreator.grassweapons.GrassWeaponsMod;

import java.util.Map;

@GrassWeaponsModElements.ModElement.Tag
public class DirtswordRightClickedInAirProcedure extends GrassWeaponsModElements.ModElement {
	public DirtswordRightClickedInAirProcedure(GrassWeaponsModElements instance) {
		super(instance, 2);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				GrassWeaponsMod.LOGGER.warn("Failed to load dependency entity for procedure DirtswordRightClickedInAir!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		if ((entity instanceof BatEntity)) {
			entity.attackEntityFrom(DamageSource.GENERIC, (float) 3);
		}
		if ((entity instanceof BeeEntity)) {
			entity.attackEntityFrom(DamageSource.GENERIC, (float) 3);
		}
		if ((entity instanceof BlazeEntity)) {
			entity.attackEntityFrom(DamageSource.GENERIC, (float) 3);
		}
		if ((entity instanceof BoatEntity)) {
			entity.attackEntityFrom(DamageSource.GENERIC, (float) 3);
		}
		if ((entity instanceof CatEntity)) {
			entity.attackEntityFrom(DamageSource.GENERIC, (float) 3);
		}
		if ((entity instanceof CaveSpiderEntity)) {
			entity.attackEntityFrom(DamageSource.GENERIC, (float) 3);
		}
		if ((entity instanceof ChickenEntity)) {
			entity.attackEntityFrom(DamageSource.GENERIC, (float) 3);
		}
		if ((entity instanceof CodEntity)) {
			entity.attackEntityFrom(DamageSource.GENERIC, (float) 3);
		}
		if ((entity instanceof CowEntity)) {
			entity.attackEntityFrom(DamageSource.GENERIC, (float) 3);
		}
		if ((entity instanceof CreatureEntity)) {
			entity.attackEntityFrom(DamageSource.GENERIC, (float) 3);
		}
		if ((entity instanceof CreeperEntity)) {
			entity.attackEntityFrom(DamageSource.GENERIC, (float) 3);
		}
		if ((entity instanceof DonkeyEntity)) {
			entity.attackEntityFrom(DamageSource.GENERIC, (float) 3);
		}
		if ((entity instanceof DolphinEntity)) {
			entity.attackEntityFrom(DamageSource.GENERIC, (float) 3);
		}
		if ((entity instanceof DrownedEntity)) {
			entity.attackEntityFrom(DamageSource.GENERIC, (float) 3);
		}
		if ((entity instanceof EnderDragonEntity)) {
			entity.attackEntityFrom(DamageSource.GENERIC, (float) 3);
		}
		if ((entity instanceof ElderGuardianEntity)) {
			entity.attackEntityFrom(DamageSource.GENERIC, (float) 3);
		}
		if ((entity instanceof EnderCrystalEntity)) {
			entity.attackEntityFrom(DamageSource.GENERIC, (float) 3);
		}
		if ((entity instanceof EndermanEntity)) {
			entity.attackEntityFrom(DamageSource.GENERIC, (float) 3);
		}
		if ((entity instanceof EndermiteEntity)) {
			entity.attackEntityFrom(DamageSource.GENERIC, (float) 3);
		}
		if ((entity instanceof EvokerEntity)) {
			entity.attackEntityFrom(DamageSource.GENERIC, (float) 3);
		}
		if ((entity instanceof FoxEntity)) {
			entity.attackEntityFrom(DamageSource.GENERIC, (float) 3);
		}
		if ((entity instanceof GhastEntity)) {
			entity.attackEntityFrom(DamageSource.GENERIC, (float) 3);
		}
		if ((entity instanceof GolemEntity)) {
			entity.attackEntityFrom(DamageSource.GENERIC, (float) 3);
		}
		if ((entity instanceof GuardianEntity)) {
			entity.attackEntityFrom(DamageSource.GENERIC, (float) 3);
		}
		if ((entity instanceof HoglinEntity)) {
			entity.attackEntityFrom(DamageSource.GENERIC, (float) 3);
		}
		if ((entity instanceof HorseEntity)) {
			entity.attackEntityFrom(DamageSource.GENERIC, (float) 3);
		}
		if ((entity instanceof HuskEntity)) {
			entity.attackEntityFrom(DamageSource.GENERIC, (float) 3);
		}
		if ((entity instanceof IllusionerEntity)) {
			entity.attackEntityFrom(DamageSource.GENERIC, (float) 3);
		}
		if ((entity instanceof IronGolemEntity)) {
			entity.attackEntityFrom(DamageSource.GENERIC, (float) 3);
		}
		if ((entity instanceof LlamaEntity)) {
			entity.attackEntityFrom(DamageSource.GENERIC, (float) 3);
		}
		if ((entity instanceof LlamaSpitEntity)) {
			entity.attackEntityFrom(DamageSource.GENERIC, (float) 3);
		}
		if ((entity instanceof MagmaCubeEntity)) {
			entity.attackEntityFrom(DamageSource.GENERIC, (float) 3);
		}
		if ((entity instanceof MinecartEntity)) {
			entity.attackEntityFrom(DamageSource.GENERIC, (float) 3);
		}
		if ((entity instanceof ChestMinecartEntity)) {
			entity.attackEntityFrom(DamageSource.GENERIC, (float) 3);
		}
		if ((entity instanceof CommandBlockMinecartEntity)) {
			entity.attackEntityFrom(DamageSource.GENERIC, (float) 3);
		}
		if ((entity instanceof ContainerMinecartEntity)) {
			entity.attackEntityFrom(DamageSource.GENERIC, (float) 3);
		}
		if ((entity instanceof FurnaceMinecartEntity)) {
			entity.attackEntityFrom(DamageSource.GENERIC, (float) 3);
		}
		if ((entity instanceof HopperMinecartEntity)) {
			entity.attackEntityFrom(DamageSource.GENERIC, (float) 3);
		}
		if ((entity instanceof MuleEntity)) {
			entity.attackEntityFrom(DamageSource.GENERIC, (float) 3);
		}
		if ((entity instanceof OcelotEntity)) {
			entity.attackEntityFrom(DamageSource.GENERIC, (float) 3);
		}
		if ((entity instanceof PaintingEntity)) {
			entity.attackEntityFrom(DamageSource.GENERIC, (float) 3);
		}
		if ((entity instanceof PandaEntity)) {
			entity.attackEntityFrom(DamageSource.GENERIC, (float) 3);
		}
		if ((entity instanceof ParrotEntity)) {
			entity.attackEntityFrom(DamageSource.GENERIC, (float) 3);
		}
		if ((entity instanceof PigEntity)) {
			entity.attackEntityFrom(DamageSource.GENERIC, (float) 3);
		}
		if ((entity instanceof PillagerEntity)) {
			entity.attackEntityFrom(DamageSource.GENERIC, (float) 3);
		}
		if ((entity instanceof PufferfishEntity)) {
			entity.attackEntityFrom(DamageSource.GENERIC, (float) 3);
		}
		if ((entity instanceof ZombifiedPiglinEntity)) {
			entity.attackEntityFrom(DamageSource.GENERIC, (float) 3);
		}
		if ((entity instanceof PolarBearEntity)) {
			entity.attackEntityFrom(DamageSource.GENERIC, (float) 3);
		}
		if ((entity instanceof PlayerEntity)) {
			entity.attackEntityFrom(DamageSource.GENERIC, (float) 3);
		}
		if ((entity instanceof ServerPlayerEntity)) {
			entity.attackEntityFrom(DamageSource.GENERIC, (float) 3);
		}
		if ((entity instanceof RabbitEntity)) {
			entity.attackEntityFrom(DamageSource.GENERIC, (float) 3);
		}
		if ((entity instanceof SalmonEntity)) {
			entity.attackEntityFrom(DamageSource.GENERIC, (float) 3);
		}
		if ((entity instanceof SheepEntity)) {
			entity.attackEntityFrom(DamageSource.GENERIC, (float) 3);
		}
		if ((entity instanceof ShulkerEntity)) {
			entity.attackEntityFrom(DamageSource.GENERIC, (float) 3);
		}
		if ((entity instanceof ShulkerBulletEntity)) {
			entity.attackEntityFrom(DamageSource.GENERIC, (float) 3);
		}
		if ((entity instanceof SilverfishEntity)) {
			entity.attackEntityFrom(DamageSource.GENERIC, (float) 3);
		}
		if ((entity instanceof SkeletonEntity)) {
			entity.attackEntityFrom(DamageSource.GENERIC, (float) 3);
		}
		if ((entity instanceof SkeletonHorseEntity)) {
			entity.attackEntityFrom(DamageSource.GENERIC, (float) 3);
		}
		if ((entity instanceof SlimeEntity)) {
			entity.attackEntityFrom(DamageSource.GENERIC, (float) 3);
		}
		if ((entity instanceof SnowGolemEntity)) {
			entity.attackEntityFrom(DamageSource.GENERIC, (float) 3);
		}
		if ((entity instanceof SpellcastingIllagerEntity)) {
			entity.attackEntityFrom(DamageSource.GENERIC, (float) 3);
		}
		if ((entity instanceof SpiderEntity)) {
			entity.attackEntityFrom(DamageSource.GENERIC, (float) 3);
		}
		if ((entity instanceof SquidEntity)) {
			entity.attackEntityFrom(DamageSource.GENERIC, (float) 3);
		}
		if ((entity instanceof StrayEntity)) {
			entity.attackEntityFrom(DamageSource.GENERIC, (float) 3);
		}
		if ((entity instanceof TraderLlamaEntity)) {
			entity.attackEntityFrom(DamageSource.GENERIC, (float) 3);
		}
		if ((entity instanceof TropicalFishEntity)) {
			entity.attackEntityFrom(DamageSource.GENERIC, (float) 3);
		}
		if ((entity instanceof TurtleEntity)) {
			entity.attackEntityFrom(DamageSource.GENERIC, (float) 3);
		}
		if ((entity instanceof VexEntity)) {
			entity.attackEntityFrom(DamageSource.GENERIC, (float) 3);
		}
		if ((entity instanceof VillagerEntity)) {
			entity.attackEntityFrom(DamageSource.GENERIC, (float) 3);
		}
		if ((entity instanceof VindicatorEntity)) {
			entity.attackEntityFrom(DamageSource.GENERIC, (float) 3);
		}
		if ((entity instanceof WitchEntity)) {
			entity.attackEntityFrom(DamageSource.GENERIC, (float) 3);
		}
		if ((entity instanceof WitherEntity)) {
			entity.attackEntityFrom(DamageSource.GENERIC, (float) 3);
		}
		if ((entity instanceof WitherSkeletonEntity)) {
			entity.attackEntityFrom(DamageSource.GENERIC, (float) 3);
		}
		if ((entity instanceof WolfEntity)) {
			entity.attackEntityFrom(DamageSource.GENERIC, (float) 3);
		}
		if ((entity instanceof ZombieEntity)) {
			entity.attackEntityFrom(DamageSource.GENERIC, (float) 3);
		}
		if ((entity instanceof ZombieHorseEntity)) {
			entity.attackEntityFrom(DamageSource.GENERIC, (float) 3);
		}
		if ((entity instanceof ZombieVillagerEntity)) {
			entity.attackEntityFrom(DamageSource.GENERIC, (float) 3);
		}
		if ((entity instanceof PhantomEntity)) {
			entity.attackEntityFrom(DamageSource.GENERIC, (float) 3);
		}
		if ((entity instanceof RavagerEntity)) {
			entity.attackEntityFrom(DamageSource.GENERIC, (float) 3);
		}
		if ((entity instanceof MonsterEntity)) {
			entity.attackEntityFrom(DamageSource.GENERIC, (float) 3);
		}
		if ((entity instanceof PiglinEntity)) {
			entity.attackEntityFrom(DamageSource.GENERIC, (float) 3);
		}
		if ((entity instanceof PiglinBruteEntity)) {
			entity.attackEntityFrom(DamageSource.GENERIC, (float) 3);
		}
		if ((entity instanceof StriderEntity)) {
			entity.attackEntityFrom(DamageSource.GENERIC, (float) 3);
		}
		if ((entity instanceof ZoglinEntity)) {
			entity.attackEntityFrom(DamageSource.GENERIC, (float) 3);
		}
	}
}
