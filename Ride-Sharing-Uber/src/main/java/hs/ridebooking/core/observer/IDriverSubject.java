package hs.ridebooking.core.observer;

import hs.ridebooking.core.model.RideRequest;

public interface IDriverSubject {

    void registerDriver(IDriverObserver driver);
    void removeDriver(IDriverObserver driver);
    void notifyDriver(RideRequest rideRequest);
}
