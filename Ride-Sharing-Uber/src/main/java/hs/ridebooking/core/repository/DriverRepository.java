package hs.ridebooking.core.repository;

import hs.ridebooking.core.entity.DriverEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface DriverRepository extends JpaRepository<DriverEntity,Long> {

    List<DriverEntity> findByIsAvailableTrue();
}
