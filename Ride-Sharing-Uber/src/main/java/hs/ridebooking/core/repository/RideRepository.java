package hs.ridebooking.core.repository;

import hs.core.entity.RideEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RideRepository extends JpaRepository<RideEntity,Long> {
}
