
package net.mcreator.grassweapons.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.world.World;
import net.minecraft.util.text.StringTextComponent;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.item.crafting.Ingredient;
import net.minecraft.item.SwordItem;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.Item;
import net.minecraft.item.IItemTier;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.block.Blocks;

import net.mcreator.grassweapons.GrassWeaponsModElements;

import java.util.List;

@GrassWeaponsModElements.ModElement.Tag
public class DirtswordItem extends GrassWeaponsModElements.ModElement {
	@ObjectHolder("grass_weapons:dirtsword")
	public static final Item block = null;
	public DirtswordItem(GrassWeaponsModElements instance) {
		super(instance, 1);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new SwordItem(new IItemTier() {
			public int getMaxUses() {
				return 100;
			}

			public float getEfficiency() {
				return 0f;
			}

			public float getAttackDamage() {
				return 0.5f;
			}

			public int getHarvestLevel() {
				return 0;
			}

			public int getEnchantability() {
				return 1;
			}

			public Ingredient getRepairMaterial() {
				return Ingredient.fromStacks(new ItemStack(Blocks.DIRT, (int) (1)));
			}
		}, 3, -2.1f, new Item.Properties().group(ItemGroup.COMBAT).isImmuneToFire()) {
			@Override
			public void addInformation(ItemStack itemstack, World world, List<ITextComponent> list, ITooltipFlag flag) {
				super.addInformation(itemstack, world, list, flag);
				list.add(new StringTextComponent("\u042D\u0442\u043E \u043C\u0435\u0447 \u0438\u0437 \u0437\u0435\u043C\u043B\u0438 :/"));
			}
		}.setRegistryName("dirtsword"));
	}
}
