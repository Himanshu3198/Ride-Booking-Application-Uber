package hs.ridebooking.core.observer;

import hs.ridebooking.core.model.RideRequest;

public interface IDriverObserver {
    void update(RideRequest rideRequest);
}
