package hs.ridebooking.notification.websocket.dto;

public record RideNotification(
        Long rideId,
        String pickupLocation,
        String message
) {
}
