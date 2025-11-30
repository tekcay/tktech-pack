package material;

import static gregtech.api.unification.material.Materials.*;
import static tkcy.tktech.api.unification.properties.ChemicalStructureProperty.addChemicalStructureProperty;

public class ChemStructureMatProperty {

    public static void register() {
        def materials = [
            AceticAcid,
            Acetone,
            AllylChloride,
            Benzene,
            Biphenyl,
            BisphenolA,
            Butadiene,
            Butene,
            Butyraldehyde,
            Chlorobenzene,
            Cumene,
            Cyclohexane,
            CyclohexanoneOxime,
            Diaminobenzidine,
            Dichlorobenzidine,
            DiphenylIsophtalate,
            Epichlorohydrin,
            Ethylbenzene,
            Glycerol,
            GlycerylTrinitrate,
            Isoprene,
            MethylAcetate,
            Naphthalene,
            Nitrobenzene,
            Nitrochlorobenzene,
            Phenol,
            PhthalicAcid,
            Propene,
            Styrene,
            Tetrafluoroethylene,
            Toluene,
            VinylAcetate,
            VinylChloride
        ]

        materials.each{
            addChemicalStructureProperty(it)
            }
    }



}
