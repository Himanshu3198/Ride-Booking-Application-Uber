package hs.ridebooking.core.service.Impl;

import hs.ridebooking.core.service.interfaces.IFareService;
import hs.ridebooking.core.strategy.IFareCalculationStrategy;
import hs.ridebooking.core.strategy.Impl.DefaultFareCalculationStrategy;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;



@Service
public class FareServiceImpl implements IFareService {

    private static final Logger LOGGER = LoggerFactory.getLogger(FareServiceImpl.class);
    private final IFareCalculationStrategy fareCalculationStrategy;

    public FareServiceImpl(IFareCalculationStrategy fareCalculationStrategy){
        this.fareCalculationStrategy = new DefaultFareCalculationStrategy();
    }

    @Override
    public double calculateFare(double distanceInKm, long timeInMinutes) {
        return fareCalculationStrategy.calculateFare(distanceInKm,timeInMinutes);
    }
}
