
package net.mcreator.grassweapons.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.world.World;
import net.minecraft.util.text.StringTextComponent;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.item.crafting.Ingredient;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.Item;
import net.minecraft.item.IItemTier;
import net.minecraft.item.AxeItem;
import net.minecraft.client.util.ITooltipFlag;

import net.mcreator.grassweapons.GrassWeaponsModElements;

import java.util.List;

@GrassWeaponsModElements.ModElement.Tag
public class LightningdirtaxeItem extends GrassWeaponsModElements.ModElement {
	@ObjectHolder("grass_weapons:lightningdirtaxe")
	public static final Item block = null;
	public LightningdirtaxeItem(GrassWeaponsModElements instance) {
		super(instance, 28);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new AxeItem(new IItemTier() {
			public int getMaxUses() {
				return 600;
			}

			public float getEfficiency() {
				return 5f;
			}

			public float getAttackDamage() {
				return 4f;
			}

			public int getHarvestLevel() {
				return 1;
			}

			public int getEnchantability() {
				return 5;
			}

			public Ingredient getRepairMaterial() {
				return Ingredient.fromStacks(new ItemStack(SharpoflightningItem.block, (int) (1)));
			}
		}, 1, -3.1f, new Item.Properties().group(ItemGroup.TOOLS).isImmuneToFire()) {
			@Override
			public void addInformation(ItemStack itemstack, World world, List<ITextComponent> list, ITooltipFlag flag) {
				super.addInformation(itemstack, world, list, flag);
				list.add(new StringTextComponent(
						"\u042D\u0442\u043E \u044D\u043B\u043A\u0442\u0440\u0438\u0447\u0435\u0441\u043A\u0438\u0439 \u0437\u0435\u043C\u043B\u044F\u043D\u043E\u0439 \u0442\u043E\u043F\u043E\u0440."));
			}
		}.setRegistryName("lightningdirtaxe"));
	}
}
