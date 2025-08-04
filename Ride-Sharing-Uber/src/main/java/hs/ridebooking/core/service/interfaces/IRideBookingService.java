package hs.ridebooking.core.service.interfaces;

import hs.ridebooking.core.dto.request.RideRequestDTO;
import hs.ridebooking.core.dto.response.RideResponseDTO;

public interface IRideBookingService {

    /**
     * placeBooking service to book a ride
     * @param dto
     * @return
     */
     RideResponseDTO placeBooking(RideRequestDTO dto);

    /**
     * cancelBooking service to cancel a ride
     * @param bookingId
     * @return RideResponseDTO
     */
     RideResponseDTO cancelBooking(Long bookingId);
}
