package hs.core.Entity.Vehicle.Builder;

import hs.core.Entity.Vehicle.VehicleEntity;
import hs.core.Enum.VehicleStatus;
import hs.core.Enum.VehicleType;

public class VehicleBuilder<T extends VehicleEntity> {

    protected final T vehicle;

    public VehicleBuilder(VehicleEntity vehicle) {
        this.vehicle = vehicle;
    }

    public VehicleBuilder<T> id(Long id) {
        vehicle.setId(id);
        return this;
    }

    public VehicleBuilder<T> numberPlate(String numberPlate){
        vehicle.setNumberPlate(numberPlate);
        return this;
    }

    public VehicleBuilder<T> model(String model){
        vehicle.setModel(model);
        return this;
    }
    public VehicleBuilder<T> color(String color){
        vehicle.setColor(color);
        return this;
    }
    public VehicleBuilder<T> capacity(Integer capacity){
        vehicle.setCapacity(capacity);
        return this;
    }

   public VehicleBuilder<T> vehicleType(VehicleType vehicleType){
        vehicle.setVehicleType(vehicleType);
        return this;
   }
   public VehicleBuilder<T> vehicleStatus(VehicleStatus vehicleStatus){
        vehicle.setStatus(vehicleStatus);
        return this;
   }

    public T build() {
        validate();
        return vehicle;
    }

    private void validate() {
        if (vehicle.getNumberPlate() == null || vehicle.getNumberPlate().isBlank())
            throw new IllegalArgumentException("Number plate cannot be empty");

        if (vehicle.getModel() == null || vehicle.getModel().length() < 2)
            throw new IllegalArgumentException("Model name must be at least 2 characters");

        if (vehicle.getCapacity() == null || vehicle.getCapacity() < 1)
            throw new IllegalArgumentException("Capacity must be at least 1");
    }

}
