package hs.core.Entity;

public class Location {

    private Double latitude;
    private Double longitude;


    public Double getLatitude() {
        return latitude;
    }

    public Double getLongitude() {
        return longitude;
    }

    public Location setLatitude(Double latitude) {
        this.latitude = latitude;
        return this;
    }

    public Location setLongitude(Double longitude) {
        this.longitude = longitude;
        return this;
    }

    @Override
    public String toString() {
        return "Location{" +
                "latitude=" + latitude +
                ", longitude=" + longitude +
                '}';
    }
}
