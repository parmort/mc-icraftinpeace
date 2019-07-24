package parmort.icraftinpeace.item;

import net.minecraft.item.Item;
import parmort.icraftinpeace.ICraftInPeace;

public class ModItem extends Item {
  public ModItem() {
    super(new Item.Properties().group(ICraftInPeace.itemGroup));
  }

  public ModItem(Properties props) {
    super(props.group(ICraftInPeace.itemGroup));
  }
}
