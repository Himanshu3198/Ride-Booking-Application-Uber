package hs.core.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import java.util.List;

@Entity
public class RiderEntity extends UserEntity {

    @OneToMany(mappedBy = "rider") // assuming TripEntity has `@ManyToOne private RiderEntity rider`
    private List<TripEntity> trips;

    // ======= Getter =======
    public List<TripEntity> getTrips() {
        return trips;
    }

    // ======= Setter with Method Chaining =======
    public RiderEntity setTrips(List<TripEntity> trips) {
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
