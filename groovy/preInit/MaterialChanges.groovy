package preInit;

import net.minecraftforge.fml.common.eventhandler.EventPriority;
import gregtech.api.unification.material.event.MaterialEvent;

import tkcy.tktech.api.render.ChemicalStructureRenderUtils;

import material.ChemStructureMatProperty;
import material.PhysicalMatProperty;
import material.DistilledFluids;

log.infoMC("Registering new material event listener")

eventManager.listen(EventPriority.LOWEST) {
    MaterialEvent event ->

        log.infoMC("Registering chemical structure material property")
        ChemStructureMatProperty.register();

        log.infoMC("Registering chemical structure textures")
        ChemicalStructureRenderUtils.registerChemicalStructuresTexture();

        log.infoMC("Registering physical material properties")
        PhysicalMatProperty.register();

        log.infoMC("Adding distilled fluids")
        DistilledFluids.register();
    
}
