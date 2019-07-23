package parmort.icraftinpeace;

import parmort.icraftinpeace.block.ModBlocks;
import net.minecraftforge.fml.event.lifecycle.*;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import parmort.icraftinpeace.item.ModItems;

class SideProxy {
    SideProxy() {
        ICraftInPeace.LOGGER.debug("SideProxy init");

        // Add listeners for common events
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::commonSetup);
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::imcEnqueue);
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::imcProcess);

        // Add listeners for registry events
        FMLJavaModLoadingContext.get().getModEventBus().addListener(ModBlocks::registerAll);
        FMLJavaModLoadingContext.get().getModEventBus().addListener(ModItems::registerAll);
    }

    private void commonSetup(FMLCommonSetupEvent event) {
        ICraftInPeace.LOGGER.debug("SideProxy commonSetup");
    }

    private void imcEnqueue(InterModEnqueueEvent event) {
        ICraftInPeace.LOGGER.debug("SideProxy imcEnqueue");
    }

    private void imcProcess(InterModProcessEvent event) {
        ICraftInPeace.LOGGER.debug("SideProxy imcProcess");
    }

    static class Client extends SideProxy {
        Client() {
            ICraftInPeace.LOGGER.debug("SideProxy.Client init");
            FMLJavaModLoadingContext.get().getModEventBus().addListener(this::clientSetup);
        }

        private void clientSetup(FMLClientSetupEvent event) {
            ICraftInPeace.LOGGER.debug("SideProxy.Client clientSetup");
        }
    }

    static class Server extends SideProxy {
        Server() {
            ICraftInPeace.LOGGER.debug("SideProxy.Server init");
            FMLJavaModLoadingContext.get().getModEventBus().addListener(this::serverSetup);
        }

        private void serverSetup(FMLDedicatedServerSetupEvent event) {
            ICraftInPeace.LOGGER.debug("SideProxy.Server serverSetup");
        }
    }
}
