package parmort.icraftinpeace;

import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.DistExecutor;
import net.minecraftforge.fml.ModContainer;
import net.minecraftforge.fml.ModList;
import net.minecraftforge.fml.common.Mod;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Optional;
import java.util.Random;

@Mod(ICraftInPeace.MOD_ID)
public final class ICraftInPeace {
    public static final String MOD_ID = "icraftinpeace";
    public static final String MOD_NAME = "I Craft in Peace";

    public static final Logger LOGGER = LogManager.getLogger(MOD_NAME);
    public static final Random RANDOM = new Random();

    public static ICraftInPeace INSTANCE;
    public static SideProxy PROXY;

    public ICraftInPeace() {
        INSTANCE = this;
        PROXY = DistExecutor.runForDist(() -> () -> new SideProxy.Client(), () -> () -> new SideProxy.Server());
    }

    public static String getVersion() {
        Optional<? extends ModContainer> o = ModList.get().getModContainerById(MOD_ID);
        if (o.isPresent()) {
            return o.get().getModInfo().getVersion().toString();
        }
        return "NONE";
    }

    public static boolean isDevBuild() {
        return "NONE".equals(getVersion());
    }

    public static ResourceLocation getId(String path) {
        return new ResourceLocation(MOD_ID, path);
    }
}
