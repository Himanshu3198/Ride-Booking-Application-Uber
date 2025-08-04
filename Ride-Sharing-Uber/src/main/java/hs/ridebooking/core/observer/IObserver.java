package hs.ridebooking.core.observer;

import hs.ridebooking.core.model.RideRequest;

public interface IObserver {
    void update(RideRequest rideRequest);
}
