package parmort.icraftinpeace.item;

import parmort.icraftinpeace.ICraftInPeace;
import net.minecraft.item.Item;
import net.minecraft.item.BlockItem;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.registries.ForgeRegistries;

import java.util.LinkedHashMap;
import java.util.Map;

public final class ModItems {
  public static ModItem SULFUR;
  public static ModItem NETHER_ROD;
  public static ModItem NETHER_POWDER;
  public static ModItem MEMBRANE_PIECE;
  public static ModItem RECORD_BLANK;
  public static ModItem PRISMARINE_STAFF;
  public static ModItem QUARTZ_BLADE;

  public static final Map<String, BlockItem> BLOCKS_TO_REGISTER = new LinkedHashMap<>();

  private ModItems() {
  }

  public static void registerAll(RegistryEvent.Register<Item> event) {
    // Workaround for Forge event bus bug
    if (!event.getName().equals(ForgeRegistries.ITEMS.getRegistryName())) return;

    // Register each block as an item
    BLOCKS_TO_REGISTER.forEach(ModItems::register);

    SULFUR = register("sulfur", new ModItem());
    NETHER_ROD = register("nether_rod", new ModItem());
    NETHER_POWDER = register("nether_powder", new ModItem());
    MEMBRANE_PIECE = register("membrane_piece", new ModItem());
    RECORD_BLANK = register("record_blank", new ModItem());
    PRISMARINE_STAFF = register("prismarine_staff", new ModItem());
    QUARTZ_BLADE = register("quartz_blade", new ModItem());

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
