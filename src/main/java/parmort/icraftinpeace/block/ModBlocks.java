package parmort.icraftinpeace.block;

import net.minecraft.block.SoundType;
import parmort.icraftinpeace.ICraftInPeace;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;
import net.minecraft.item.BlockItem;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.registries.ForgeRegistries;
import parmort.icraftinpeace.item.ModItems;

import javax.annotation.Nullable;

public final class ModBlocks {
  public static Block SULFUR;

  private ModBlocks() {
  }

  public static void registerAll(RegistryEvent.Register<Block> event) {
    // Workaround for Forge event bus bug
    if (!event.getName().equals(ForgeRegistries.BLOCKS.getRegistryName())) return;

    SULFUR = register("sulfur_block", new Block(Block.Properties
            .create(Material.IRON)
            .hardnessAndResistance(5F, 6F)
            .sound(SoundType.METAL)
    ));
  }

  private static <T extends Block> T register(String name, T block) {
    BlockItem item = new BlockItem(block, new Item.Properties().group(ICraftInPeace.itemGroup));
    return register(name, block, item);
  }

  private static <T extends Block> T register(String name, T block, @Nullable BlockItem item) {
    ResourceLocation id = ICraftInPeace.getId(name);
    block.setRegistryName(id);
    ForgeRegistries.BLOCKS.register(block);

    if (item != null) {
      ModItems.BLOCKS_TO_REGISTER.put(name, item);
    }

    return block;
  }
}
