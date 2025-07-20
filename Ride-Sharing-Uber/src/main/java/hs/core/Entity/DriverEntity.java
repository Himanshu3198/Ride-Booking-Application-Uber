package hs.core.Entity;

import jakarta.persistence.*;
import java.util.List;

@Entity
public class DriverEntity extends UserEntity {

    @Column(name = "license", nullable = false)
    private String licenseNumber;

    @Column(name = "is_available")
    private Boolean isAvailable;

    // Assuming Vehicle is a value object (not a separate entity)
    @Embedded
    private VehicleEntity vehicle;

    @OneToMany(mappedBy = "driver")
    private List<RideEntity> completedRides;

    // ======= Getters =======

    public String getLicenseNumber() {
        return licenseNumber;
    }

    public Boolean getIsAvailable() {
        return isAvailable;
    }

    public VehicleEntity getVehicle() {
        return vehicle;
    }

    public List<RideEntity> getCompletedRides() {
        return completedRides;
    }

    // ======= Setters with Method Chaining =======

    public DriverEntity setLicenseNumber(String licenseNumber) {
        this.licenseNumber = licenseNumber;
        return this;
    }

    public DriverEntity setIsAvailable(Boolean isAvailable) {
        this.isAvailable = isAvailable;
        return this;
    }

    public DriverEntity setVehicle(VehicleEntity vehicle) {
        this.vehicle = vehicle;
        return this;
    }

    public DriverEntity setCompletedRides(List<RideEntity> completedRides) {
        this.completedRides = completedRides;
        return this;
    }

    @Override
    public String toString() {
        return "DriverEntity{" +
                "licenseNumber='" + licenseNumber + '\'' +
                ", isAvailable=" + isAvailable +
                ", vehicle=" + vehicle +
                ", completedRides=" + completedRides +
                '}';
    }
}
