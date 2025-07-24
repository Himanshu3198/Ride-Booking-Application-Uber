package hs.ridebooking.core.strategy.Impl;

import hs.ridebooking.core.constant.FareCalculationConstant;
import hs.ridebooking.core.strategy.IFareCalculationStrategy;

public class DefaultFareCalculationStrategy implements IFareCalculationStrategy {
    @Override
    public double calculateFare(double distance, long durationInMinutes) {

        double distanceFare = distance*FareCalculationConstant.BASE_COST_PER_KM;
        double timeFare = durationInMinutes*FareCalculationConstant.BASE_COST_PER_MINUTE;
        return distanceFare+timeFare;
    }
}
