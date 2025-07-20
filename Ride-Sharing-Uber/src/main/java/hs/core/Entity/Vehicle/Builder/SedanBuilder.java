package hs.core.Entity.Vehicle.Builder;

import hs.core.Entity.Vehicle.Sedan;
import hs.core.Entity.Vehicle.VehicleEntity;

public class SedanBuilder extends VehicleBuilder<Sedan>{
    public SedanBuilder(VehicleEntity vehicle) {
        super((Sedan) vehicle);
    }
}
