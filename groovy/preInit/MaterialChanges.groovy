package preInit;

import net.minecraftforge.fml.common.eventhandler.EventPriority;
import gregtech.api.unification.material.event.MaterialEvent;
import gregtech.api.unification.material.event.MaterialRegistryEvent;

import gregtech.api.GregTechAPI;

import tkcy.tktech.api.render.ChemicalStructureRenderUtils;

import material.ChemStructureMatProperty;
import material.PhysicalMatProperty;
import material.DistilledFluids;
import material.ChiralMaterials;

log.infoMC("Registering new material event listener")

eventManager.listen(EventPriority.LOWEST) {
    MaterialRegistryEvent event ->
        GregTechAPI.materialManager.createRegistry('tktex');
}

eventManager.listen(EventPriority.LOWEST) {

    MaterialEvent event ->

        log.infoMC("Registering chemical structure material property")
        ChemStructureMatProperty.register();

        log.infoMC("Registering chemical structure textures")
        ChemicalStructureRenderUtils.registerChemicalStructuresTexture();

        log.infoMC("Registering chiral materials")
        ChiralMaterials.register();

        log.infoMC("Registering physical material properties")
        PhysicalMatProperty.register();

        log.infoMC("Adding distilled fluids")
        DistilledFluids.register();
    
}
