package hs.ridebooking.core.entity.Vehicle.Builder;

import hs.ridebooking.core.entity.Vehicle.Sedan;
import hs.ridebooking.core.entity.Vehicle.VehicleEntity;

public class SedanBuilder extends VehicleBuilder<Sedan> {
    public SedanBuilder(VehicleEntity vehicle) {
        super((Sedan) vehicle);
    }
}
