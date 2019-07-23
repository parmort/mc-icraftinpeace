package parmort.icraftinpeace.item;

import com.mojang.datafixers.util.Pair;
import net.minecraft.client.renderer.model.ModelBakery;
import net.minecraftforge.client.model.ModelLoader;
import parmort.icraftinpeace.ICraftInPeace;
import net.minecraft.item.Item;
import net.minecraft.item.BlockItem;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.registries.ForgeRegistries;

import java.util.LinkedHashMap;
import java.util.Map;

public final class ModItems {
    public static Item SULFUR;
    public static Item NETHER_ROD;
    public static Item NETHER_POWDER;
    public static Item MEMBRANE_PIECE;
  public static Item RECORD_BLANK;

  public static final Map<String, BlockItem> BLOCKS_TO_REGISTER = new LinkedHashMap<>();

    private ModItems() {}

    public static void registerAll(RegistryEvent.Register<Item> event) {
        // Workaround for Forge event bus bug
        if (!event.getName().equals(ForgeRegistries.ITEMS.getRegistryName())) return;

        // Register each block as an item
        BLOCKS_TO_REGISTER.forEach(ModItems::register);

        SULFUR = register("sulfur", new Item(new Item.Properties().group(ICraftInPeace.itemGroup)));
        NETHER_ROD = register("nether_rod", new Item(new Item.Properties().group(ICraftInPeace.itemGroup)));
        NETHER_POWDER = register("nether_powder", new Item(new Item.Properties().group(ICraftInPeace.itemGroup)));
        MEMBRANE_PIECE = register("membrane_piece", new Item(new Item.Properties().group(ICraftInPeace.itemGroup)));
      RECORD_BLANK = register("record_blank", new Item(new Item.Properties().group(ICraftInPeace.itemGroup)));

      // Register pigment
      for (Pigment pigment : Pigment.values()) {
        register(pigment.getName(), pigment.asItem());
      }
    }

    private static <T extends Item> T register(String name, T item) {
        ResourceLocation id = ICraftInPeace.getId(name);
        item.setRegistryName(id);
        ForgeRegistries.ITEMS.register(item);
        return item;
    }
}
