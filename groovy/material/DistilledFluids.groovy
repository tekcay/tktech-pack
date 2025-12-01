package material;

import static gregtech.api.unification.material.Materials.*;

import static tkcy.tktech.api.fluid.FluidRegistration.addDistilledFluid;

public class DistilledFluids {

    public static void register() {

        addDistilledFluid(Toluene);
    }

}