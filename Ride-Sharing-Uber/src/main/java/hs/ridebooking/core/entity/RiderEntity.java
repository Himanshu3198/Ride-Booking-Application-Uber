package hs.ridebooking.core.entity;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import java.util.List;

@Entity
@DiscriminatorValue("RIDER")
public class RiderEntity extends UserEntity {

    @OneToMany(mappedBy = "rider") // assuming TripEntity has `@ManyToOne private RiderEntity rider`
    private List<RideEntity> trips;

    // ======= Getter =======
    public List<RideEntity> getTrips() {
        return trips;
    }

    // ======= Setter with Method Chaining =======
    public RiderEntity setTrips(List<RideEntity> trips) {
        this.trips = trips;
        return this;
    }

    @Override
    public String toString() {
        return "RiderEntity{" +
                "trips=" + trips +
                '}';
    }
}
