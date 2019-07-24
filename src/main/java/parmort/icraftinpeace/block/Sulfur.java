package parmort.icraftinpeace.block;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.material.MaterialColor;

public class Sulfur extends Block {

  static String ID = "sulfur_block";

  public Sulfur() {
    super(Block.Properties
            .create(Material.ROCK, MaterialColor.YELLOW)
            .hardnessAndResistance(3f, 3f)
            .sound(SoundType.STONE)
    );
  }
}
