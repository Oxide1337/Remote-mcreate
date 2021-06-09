
package net.mcreator.grassweapons.block;

import net.minecraftforge.registries.ObjectHolder;
import net.minecraftforge.common.ToolType;

import net.minecraft.world.IBlockReader;
import net.minecraft.util.math.BlockPos;
import net.minecraft.loot.LootContext;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.Item;
import net.minecraft.item.BlockItem;
import net.minecraft.block.material.Material;
import net.minecraft.block.SoundType;
import net.minecraft.block.BlockState;
import net.minecraft.block.Block;

import net.mcreator.grassweapons.GrassWeaponsModElements;

import java.util.List;
import java.util.Collections;

@GrassWeaponsModElements.ModElement.Tag
public class LightningcobblestoneBlock extends GrassWeaponsModElements.ModElement {
	@ObjectHolder("grass_weapons:lightningcobblestone")
	public static final Block block = null;
	public LightningcobblestoneBlock(GrassWeaponsModElements instance) {
		super(instance, 6);
	}

	@Override
	public void initElements() {
		elements.blocks.add(() -> new CustomBlock());
		elements.items
				.add(() -> new BlockItem(block, new Item.Properties().group(ItemGroup.BUILDING_BLOCKS)).setRegistryName(block.getRegistryName()));
	}
	public static class CustomBlock extends Block {
		public CustomBlock() {
			super(Block.Properties.create(Material.ROCK).sound(SoundType.STONE).hardnessAndResistance(1.7f, 10.5f).setLightLevel(s -> 2)
					.harvestLevel(2).harvestTool(ToolType.PICKAXE).setRequiresTool().speedFactor(1.1f).jumpFactor(1.1f));
			setRegistryName("lightningcobblestone");
		}

		@Override
		public boolean propagatesSkylightDown(BlockState state, IBlockReader reader, BlockPos pos) {
			return true;
		}

		@Override
		public List<ItemStack> getDrops(BlockState state, LootContext.Builder builder) {
			List<ItemStack> dropsOriginal = super.getDrops(state, builder);
			if (!dropsOriginal.isEmpty())
				return dropsOriginal;
			return Collections.singletonList(new ItemStack(this, 1));
		}
	}
}
