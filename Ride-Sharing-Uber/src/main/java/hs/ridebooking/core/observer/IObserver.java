package hs.ridebooking.core.observer;

import hs.ridebooking.core.entity.RideEntity;

public interface IObserver {
    void update(RideEntity rideRequest);
}
