package hs.ridebooking.core.factory;

import hs.ridebooking.core.entity.Vehicle.Builder.BikeBuilder;
import hs.ridebooking.core.entity.Vehicle.Builder.SedanBuilder;
import hs.ridebooking.core.entity.Vehicle.Builder.SuvBuilder;
import hs.ridebooking.core.entity.Vehicle.Builder.VehicleBuilder;
import hs.ridebooking.core.entity.Vehicle.Suv;
import hs.ridebooking.core.entity.Vehicle.VehicleEntity;
import hs.ridebooking.core.enums.VehicleType;
import hs.ridebooking.core.exception.VehicleNotFoundException;
import org.springframework.stereotype.Component;

@Component
public class VehicleFactory {

       private static VehicleType vehicleType = null;

       public VehicleFactory(VehicleType vehicleType){
           VehicleFactory.vehicleType = vehicleType;
       }

       public static VehicleEntity getVehicle(){
           switch (vehicleType){
               case SUV -> {
                   return new VehicleBuilder<>(new SuvBuilder()).build();
               }

               case SEDAN -> {
                   return new VehicleBuilder<>(new SedanBuilder()).build();
               }
               case BIKE -> {
                   return new VehicleBuilder<>(new BikeBuilder()).build();
               }
               default -> {
                   return new VehicleNotFoundException("Invalid Vehicle requested");
               }
           }
           throw new VehicleNotFoundException("Invalid Vehicle");
       }
}
