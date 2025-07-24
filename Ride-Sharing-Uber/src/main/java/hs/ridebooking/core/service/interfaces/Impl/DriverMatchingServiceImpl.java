package hs.ridebooking.core.service.interfaces.Impl;

import hs.ridebooking.core.constant.DriverMatchingConstant;
import hs.ridebooking.core.entity.DriverEntity;
import hs.ridebooking.core.exception.DriverNotFoundException;
import hs.ridebooking.core.repository.DriverRepository;
import hs.ridebooking.core.service.interfaces.IDriverMatchingService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;



@Service
public class DriverMatchingServiceImpl implements IDriverMatchingService {

    private static final Logger LOGGER = LoggerFactory.getLogger(DriverMatchingServiceImpl.class);


    private final DriverRepository driverRepository;

    public DriverMatchingServiceImpl(DriverRepository driverRepository) {
        this.driverRepository = driverRepository;
    }

    /**
     * Finds nearest available drivers based on the given latitude and longitude.
     *
     * @param riderLat latitude of the rider
     * @param riderLon longitude of the rider
     * @return List of nearest DriverEntity (max 6 drivers)
     */
    @Override
    public List<DriverEntity> findNearestDriverByCoordinates(Double riderLat, Double riderLon) {
        LOGGER.info("Finding nearest drivers for coordinates: lat={}, lon={}", riderLat, riderLon);

        try {
            List<DriverEntity> availableDrivers = driverRepository.findByIsAvailableTrue();

            if (availableDrivers == null || availableDrivers.isEmpty()) {
                LOGGER.warn("No available drivers found in the system.");
                throw new DriverNotFoundException("No available drivers found.");
            }

            List<DriverEntity> nearestDrivers = new ArrayList<>();

            for (DriverEntity driver : availableDrivers) {
                if (driver.getCurrentLocation() == null) continue;

                double distance = calculateDistance(
                        driver.getCurrentLocation().getLatitude(),
                        driver.getCurrentLocation().getLongitude(),
                        riderLat, riderLon
                );

                LOGGER.debug("Driver ID: {}, Distance: {} km", driver.getId(), distance);

                if (distance >= DriverMatchingConstant.MIN_DISTANCE_KM && distance <= DriverMatchingConstant.MAX_DISTANCE_KM) {
                    nearestDrivers.add(driver);
                }

                if (nearestDrivers.size() >= DriverMatchingConstant.MAX_MATCHED_DRIVERS) {
                    break;
                }
            }

            LOGGER.info("Found {} nearest drivers", nearestDrivers.size());
            return nearestDrivers;

        } catch (DataAccessException dae) {
            LOGGER.error("Database access error while finding nearest drivers: {}", dae.getMessage(), dae);
            throw new RuntimeException("Database access error occurred while finding nearest drivers.", dae);
        } catch (Exception ex) {
            LOGGER.error("Unexpected error in findNearestDriverByCoordinates: {}", ex.getMessage(), ex);
            throw new RuntimeException("Unexpected error occurred in driver matching service.", ex);
        }
    }

    /**
     * Placeholder for future implementation.
     */
    @Override
    public List<DriverEntity> findAvailableDriver() {
        LOGGER.warn("findAvailableDriver method not yet implemented.");
        return Collections.emptyList();
    }

    /**
     * Uses Haversine formula to calculate distance between two coordinates in kilometers.
     */
    private static double calculateDistance(double lat1, double lon1, double lat2, double lon2) {
        double earthRadius = 6371.0;

        double dLat = Math.toRadians(lat2 - lat1);
        double dLon = Math.toRadians(lon2 - lon1);

        double a = Math.sin(dLat / 2) * Math.sin(dLat / 2) +
                Math.cos(Math.toRadians(lat1)) * Math.cos(Math.toRadians(lat2)) *
                        Math.sin(dLon / 2) * Math.sin(dLon / 2);

        double c = 2 * Math.atan2(Math.sqrt(a), Math.sqrt(1 - a));
        return earthRadius * c;
    }
}
