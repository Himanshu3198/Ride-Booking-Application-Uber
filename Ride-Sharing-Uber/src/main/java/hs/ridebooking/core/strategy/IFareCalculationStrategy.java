package hs.ridebooking.core.strategy;

public interface IFareCalculationStrategy {
      double calculateFare(double distance, long  durationInMinutes);
}
