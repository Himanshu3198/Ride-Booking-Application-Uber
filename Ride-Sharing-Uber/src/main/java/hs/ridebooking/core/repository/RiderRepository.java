package hs.ridebooking.core.repository;

import hs.ridebooking.core.entity.RiderEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RiderRepository extends JpaRepository<RiderEntity,Long> {
}
