package hs.core.Entity;

import hs.core.Enum.VehicleStatus;
import hs.core.Enum.VehicleType;
import jakarta.persistence.*;
import jakarta.validation.constraints.Min;

@MappedSuperclass // since it's abstract and likely extended by other entities
public abstract class VehicleEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "number_plate", nullable = false, unique = true)
    private String numberPlate;

    @Column(name = "model", nullable = false)
    private String model;

    @Column(name = "color", nullable = false)
    private String color;

    @Min(value = 1, message = "Capacity at least should be 1")
    @Column(name = "capacity")
    private Integer capacity;

    @Enumerated(EnumType.STRING)
    @Column(name = "vehicle_type")
    private VehicleType vehicleType;

    @Enumerated(EnumType.STRING)
    @Column(name = "vehicle_status")
    private VehicleStatus status;

    // ====== Getters ======

    public Long getId() {
        return id;
    }

    public String getNumberPlate() {
        return numberPlate;
    }

    public String getModel() {
        return model;
    }

    public String getColor() {
        return color;
    }

    public Integer getCapacity() {
        return capacity;
    }

    public VehicleType getVehicleType() {
        return vehicleType;
    }

    public VehicleStatus getStatus() {
        return status;
    }

    // ====== Setters (with method chaining) ======

    public VehicleEntity setId(Long id) {
        this.id = id;
        return this;
    }

    public VehicleEntity setNumberPlate(String numberPlate) {
        this.numberPlate = numberPlate;
        return this;
    }

    public VehicleEntity setModel(String model) {
        this.model = model;
        return this;
    }

    public VehicleEntity setColor(String color) {
        this.color = color;
        return this;
    }

    public VehicleEntity setCapacity(Integer capacity) {
        this.capacity = capacity;
        return this;
    }

    public VehicleEntity setVehicleType(VehicleType vehicleType) {
        this.vehicleType = vehicleType;
        return this;
    }

    public VehicleEntity setStatus(VehicleStatus status) {
        this.status = status;
        return this;
    }

    // ====== toString() ======

    @Override
    public String toString() {
        return "VehicleEntity{" +
                "id=" + id +
                ", numberPlate='" + numberPlate + '\'' +
                ", model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", capacity=" + capacity +
                ", vehicleType=" + vehicleType +
                ", status=" + status +
                '}';
    }
}
