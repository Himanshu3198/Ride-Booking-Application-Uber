package hs.ridebooking.core.repository;

import hs.ridebooking.core.entity.Vehicle.VehicleEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface VehicleRepository extends JpaRepository<VehicleEntity, Long> {
    Optional<VehicleEntity> findByNumberPlate(String numberPlate);
}
