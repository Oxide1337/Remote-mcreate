
package net.mcreator.grassweapons.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.world.World;
import net.minecraft.util.text.StringTextComponent;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.item.Rarity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.Item;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.block.BlockState;

import net.mcreator.grassweapons.GrassWeaponsModElements;

import java.util.List;

@GrassWeaponsModElements.ModElement.Tag
public class ObsidianstickItem extends GrassWeaponsModElements.ModElement {
	@ObjectHolder("grass_weapons:obsidianstick")
	public static final Item block = null;
	public ObsidianstickItem(GrassWeaponsModElements instance) {
		super(instance, 38);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new ItemCustom());
	}
	public static class ItemCustom extends Item {
		public ItemCustom() {
			super(new Item.Properties().group(ItemGroup.MATERIALS).maxStackSize(64).isImmuneToFire().rarity(Rarity.COMMON));
			setRegistryName("obsidianstick");
		}

		@Override
		public int getItemEnchantability() {
			return 0;
		}

		@Override
		public int getUseDuration(ItemStack itemstack) {
			return 0;
		}

		@Override
		public float getDestroySpeed(ItemStack par1ItemStack, BlockState par2Block) {
			return 1F;
		}

		@Override
		public void addInformation(ItemStack itemstack, World world, List<ITextComponent> list, ITooltipFlag flag) {
			super.addInformation(itemstack, world, list, flag);
			list.add(new StringTextComponent(
					"\u041F\u0430\u043B\u043A\u0430 \u0438\u0437 \u043E\u0431\u0441\u0438\u0434\u0438\u0430\u043D\u0430. \u042D\u0442\u043E \u0432\u0441\u0451 \u0447\u0442\u043E \u0432\u0430\u043C \u043D\u0443\u0436\u043D\u043E \u0437\u043D\u0430\u0442\u044C."));
		}
	}
}
