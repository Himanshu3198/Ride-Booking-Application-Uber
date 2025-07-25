package hs.ridebooking.notification.websocket.controller;

import hs.ridebooking.notification.websocket.dto.RideNotification;
import org.springframework.stereotype.Controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.simp.SimpMessagingTemplate;


@Controller
public class NotificationWebSocketController {

    private final SimpMessagingTemplate messagingTemplate;

    @Autowired
    public NotificationWebSocketController(SimpMessagingTemplate messagingTemplate) {
        this.messagingTemplate = messagingTemplate;
    }

    public void notifyDriver(Long driverId, RideNotification notification) {
        String destination = "/topic/driver/" + driverId;
        messagingTemplate.convertAndSend(destination, notification);
    }
}
