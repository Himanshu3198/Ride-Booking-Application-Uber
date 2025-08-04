package hs.ridebooking.core.observer.Impl;

import hs.ridebooking.core.model.RideRequest;
import hs.ridebooking.core.observer.IDriverObserver;
import hs.ridebooking.core.observer.IDriverSubject;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;


@Service
public class DriverObserverImpl implements IDriverSubject {


    List<IDriverObserver> observers = new ArrayList<>();

    @Override
    public void registerDriver(IDriverObserver driver) {

        observers.add(driver);
    }

    @Override
    public void removeDriver(IDriverObserver driver) {

        observers.remove(driver);
    }

    @Override
    public void notifyDriver(RideRequest rideRequest) {
        observers.forEach(driver->driver.update(rideRequest));
    }
}
