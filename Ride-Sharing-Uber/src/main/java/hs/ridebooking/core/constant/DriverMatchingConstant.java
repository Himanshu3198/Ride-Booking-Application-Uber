package hs.ridebooking.core.constant;

import org.springframework.stereotype.Component;

@Component
public class DriverMatchingConstant {
    public static final double MIN_DISTANCE_KM = 0.1;
    public static final double MAX_DISTANCE_KM = 10.0;
    public static final int MAX_MATCHED_DRIVERS = 6;
}
