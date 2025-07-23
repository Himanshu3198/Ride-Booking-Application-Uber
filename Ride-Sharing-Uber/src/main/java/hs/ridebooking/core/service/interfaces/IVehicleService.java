package hs.ridebooking.core.service.interfaces;

import hs.ridebooking.core.entity.Vehicle.VehicleEntity;

import java.util.List;

public interface IVehicleService {
    VehicleEntity createVehicle(VehicleEntity vehicle);
    List<VehicleEntity> getAllVehicles();
    VehicleEntity getVehicleByNumberPlate(String numberPlate);
    VehicleEntity updateVehicle(String numberPlate, VehicleEntity updatedVehicle);
}
