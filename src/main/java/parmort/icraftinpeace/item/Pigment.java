package parmort.icraftinpeace.item;

import net.minecraft.item.Item;
import net.minecraft.util.IItemProvider;
import net.minecraft.util.LazyLoadBase;
import parmort.icraftinpeace.ICraftInPeace;

import java.util.Locale;

public enum Pigment implements IItemProvider {
  YELLOW,
  LIME,
  ORANGE,
  RED,
  LIGHT_GREEN,
  PURPLE,
  MAGENTA,
  BLACK,
  WHITE,
  GREEN,
  BLUE,
  GRAY;

  private final LazyLoadBase<Item> pigmentItem;

  Pigment() {
    pigmentItem = new LazyLoadBase<>(ModItem::new);
  }

  public String getName() {
    return name().toLowerCase(Locale.ROOT) + "_pigment";
  }

  public Item asItem() {
    return pigmentItem.getValue();
  }
}
