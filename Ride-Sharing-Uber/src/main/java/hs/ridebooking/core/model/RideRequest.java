package hs.ridebooking.core.model;

public record RideRequest(
        Long riderId,
        String pickupLocation,
        String dropLocation,
        Double distance,
        Double fare
) {
}
