package hs.ridebooking.core.dto.request;

import hs.ridebooking.core.entity.Vehicle.VehicleEntity;
import jakarta.validation.constraints.NotBlank;

public record RideRequestDTO(

        @NotBlank(message = "riderId cannot be blank")
        Long riderId,
        Long driverId,
        LocationDTO pickupLocation,
        LocationDTO dropLocation,
        VehicleEntity vehicle


) {
}
