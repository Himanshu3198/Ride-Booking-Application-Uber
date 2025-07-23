package hs.ridebooking.core.service;

import hs.ridebooking.core.entity.Vehicle.VehicleEntity;
import hs.ridebooking.core.exception.CustomException;
import hs.ridebooking.core.exception.VehicleNotFoundException;
import hs.ridebooking.core.repository.VehicleRepository;


import hs.ridebooking.core.service.interfaces.IVehicleService;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class VehicleServiceImpl implements IVehicleService {

    private final VehicleRepository vehicleRepository;
    public VehicleServiceImpl(VehicleRepository vehicleRepository){
        this.vehicleRepository = vehicleRepository;
    }

    @Override
    public VehicleEntity createVehicle(VehicleEntity vehicle) {
        try {
            Optional<VehicleEntity> existing = vehicleRepository.findByNumberPlate(vehicle.getNumberPlate());
            if (existing.isPresent()) {
                throw new CustomException("Vehicle already exists with number plate: " + vehicle.getNumberPlate());
            }
            return vehicleRepository.save(vehicle);
        } catch (DataAccessException e) {
            // Let it bubble up to ControllerAdvice
            throw e;
        }
    }
    @Override
    public List<VehicleEntity> getAllVehicles() {
        return vehicleRepository.findAll();
    }
    @Override
    public VehicleEntity getVehicleByNumberPlate(String numberPlate) {
        return vehicleRepository.findByNumberPlate(numberPlate)
                .orElseThrow(() -> new VehicleNotFoundException("Vehicle not found with number plate: " + numberPlate));
    }
    @Override
    public VehicleEntity updateVehicle(String numberPlate, VehicleEntity updatedVehicle) {
        VehicleEntity existing = vehicleRepository.findByNumberPlate(numberPlate)
                .orElseThrow(() -> new CustomException("Vehicle not found: " + numberPlate));
        existing.setColor(updatedVehicle.getColor());
        return vehicleRepository.save(existing);
    }
}
