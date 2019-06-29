package parmort.icraftinpeace.init;

import parmort.icraftinpeace.ICraftInPeace;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.ItemTags;
import net.minecraft.tags.Tag;
import net.minecraft.util.ResourceLocation;

public class ModTags {
    public static final class Blocks {
        // This will be "forge:ores/example"
        public static final Tag<Block> EXAMPLE = tag("forge", "ores/example");
        // Default namespace is mod ID, so this one will be "icraftinpeace:example_block"
        public static final Tag<Block> EXAMPLE2 = tag("example_block");

        private Blocks() {}

        private static Tag<Block> tag(String name) {
            return new BlockTags.Wrapper(new ResourceLocation(ICraftInPeace.MOD_ID, name));
        }

        private static Tag<Block> tag(String namespace, String name) {
            return new BlockTags.Wrapper(new ResourceLocation(namespace, name));
        }
    }

    public static final class Items {
        // Item tags work the same way as block tags, so this is "icraftinpeace:example_item"
        public static final Tag<Item> EXAMPLE = tag("example_item");

        private Items() {}

        private static Tag<Item> tag(String name) {
            return new ItemTags.Wrapper(new ResourceLocation(ICraftInPeace.MOD_ID, name));
        }

        private static Tag<Item> tag(String namespace, String name) {
            return new ItemTags.Wrapper(new ResourceLocation(namespace, name));
        }
    }
}
