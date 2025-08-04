package hs.ridebooking.core.service.Impl;

import hs.ridebooking.core.dto.request.RideRequestDTO;
import hs.ridebooking.core.dto.response.RideResponseDTO;
import hs.ridebooking.core.service.interfaces.IRideBookingService;
import org.springframework.stereotype.Service;

@Service
public class IRideBookingImpl implements IRideBookingService {
    @Override
    public RideResponseDTO placeBooking(RideRequestDTO dto) {
        return null;
    }

    @Override
    public RideResponseDTO cancelBooking(Long bookingId) {
        return null;
    }
}
