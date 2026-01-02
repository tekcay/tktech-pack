package material

import gregtech.api.unification.material.Material

import static gregtech.api.unification.material.Materials.*

import tkcy.tktech.api.utils.ChiralMaterial.ChiralMaterialBuilder;
import static tkcy.tktech.api.utils.ChiralMaterial.chiralMaterialBuilder;

public class ChiralMaterials {

    public static ChiralMaterialBuilder builder(String baseMaterialName, int baseId) {
        return chiralMaterialBuilder()
        .modid("tktex")
        .baseMaterialName(baseMaterialName)
        .baseId(baseId);
    }

    public static void register() {

        builder("binap", 5)
                .racemic(Binap)
                .useLetterPrefix(true)
                .enantiomer1(Binap_r)
                .enantiomer2(Binap_s)
                .components(Gallium * 1, Phosphorus * 1, Oxygen * 4)
                .build()
                .register();

        builder("binol", 8)
                .racemic(Binol)
                .useLetterPrefix(true)
                .enantiomer1(Binol_r)
                .enantiomer2(Binol_s)
                .components(Gallium * 2, Phosphorus * 1, Oxygen * 4)
                .build()
                .register();
    }

    public static Material Binap;
    public static Material Binap_r;
    public static Material Binap_s;

    public static Material Binol;
    public static Material Binol_r;
    public static Material Binol_s;

}
