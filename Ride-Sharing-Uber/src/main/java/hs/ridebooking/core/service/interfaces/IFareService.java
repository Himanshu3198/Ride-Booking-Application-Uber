package hs.ridebooking.core.service.interfaces;

public interface IFareService {

    double calculateFare(double distanceInKm, long timeInMinutes);
}
