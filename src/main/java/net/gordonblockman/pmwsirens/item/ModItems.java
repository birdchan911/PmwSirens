package net.gordonblockman.pmwsirens.item;

import net.gordonblockman.pmwsirens.PmwSirens;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ModItems {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(PmwSirens.MODID);


    public static void  register(IEventBus eventBus)  {
          ITEMS.register(eventBus);
    }

}
