package hs.ridebooking.core.service.interfaces;

import hs.ridebooking.core.entity.DriverEntity;

import java.util.List;

public interface IDriverMatchingService {

    List<DriverEntity> findNearestDriverByCoordinates(Double lat, Double lon);
//    DriverEntity findDriverByPincode(Double lat, Double lon);
    List<DriverEntity> findAvailableDriver();
}
