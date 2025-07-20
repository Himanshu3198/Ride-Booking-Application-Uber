package hs.core.Entity;

import hs.core.Enum.TripStatus;
import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
@Table(name = "ride")
public class RideEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne()
    @JoinColumn()
    private RiderEntity rider;

    @ManyToOne()
    @JoinColumn
    private DriverEntity driver;

    @Column(name = "pickup_location")
    private Location pickupLocation;

    @Column(name = "drop_location")
    private Location dropLocation;

    @Column(name = "fare")
    private Double fare;

    @Column(name = "ride_status")
    private TripStatus status;

    @Column(name = "vehicle")
    private VehicleEntity vehicle;

    @Column(name = "pickup_otp")
    private Integer pickupOTP;

    @Column(name = "drop_otp")
    private Integer dropOTP;

    @Column(name = "ride_started_at")
    private LocalDateTime rideStartedAt;

    @Column(name = "ride_completed_at")
    private LocalDateTime rideCompletedAt;

    public Long getId() {
        return id;
    }

    public RiderEntity getRider() {
        return rider;
    }

    public DriverEntity getDriver() {
        return driver;
    }

    public Location getPickupLocation() {
        return pickupLocation;
    }

    public Location getDropLocation() {
        return dropLocation;
    }

    public Double getFare() {
        return fare;
    }

    public TripStatus getStatus() {
        return status;
    }

    public VehicleEntity getVehicle() {
        return vehicle;
    }

    public Integer getPickupOTP() {
        return pickupOTP;
    }

    public Integer getDropOTP() {
        return dropOTP;
    }

    public LocalDateTime getRideStartedAt() {
        return rideStartedAt;
    }

    public LocalDateTime getRideCompletedAt() {
        return rideCompletedAt;
    }

    // === Setters with Method Chaining ===

    public RideEntity setId(Long id) {
        this.id = id;
        return this;
    }

    public RideEntity setRider(RiderEntity rider) {
        this.rider = rider;
        return this;
    }

    public RideEntity setDriver(DriverEntity driver) {
        this.driver = driver;
        return this;
    }

    public RideEntity setPickupLocation(Location pickupLocation) {
        this.pickupLocation = pickupLocation;
        return this;
    }

    public RideEntity setDropLocation(Location dropLocation) {
        this.dropLocation = dropLocation;
        return this;
    }

    public RideEntity setFare(Double fare) {
        this.fare = fare;
        return this;
    }

    public RideEntity setStatus(TripStatus status) {
        this.status = status;
        return this;
    }

    public RideEntity setVehicle(VehicleEntity vehicle) {
        this.vehicle = vehicle;
        return this;
    }

    public RideEntity setPickupOTP(Integer pickupOTP) {
        this.pickupOTP = pickupOTP;
        return this;
    }

    public RideEntity setDropOTP(Integer dropOTP) {
        this.dropOTP = dropOTP;
        return this;
    }

    public RideEntity setRideStartedAt(LocalDateTime rideStartedAt) {
        this.rideStartedAt = rideStartedAt;
        return this;
    }

    public RideEntity setRideCompletedAt(LocalDateTime rideCompletedAt) {
        this.rideCompletedAt = rideCompletedAt;
        return this;
    }

    @Override
    public String toString() {
        return "RideEntity{" +
                "id=" + id +
                ", rider=" + rider +
                ", driver=" + driver +
                ", pickupLocation=" + pickupLocation +
                ", dropLocation=" + dropLocation +
                ", fare=" + fare +
                ", status=" + status +
                ", vehicle=" + vehicle +
                ", pickupOTP=" + pickupOTP +
                ", dropOTP=" + dropOTP +
                ", rideStartedAt=" + rideStartedAt +
                ", rideCompletedAt=" + rideCompletedAt +
                '}';
    }
}
