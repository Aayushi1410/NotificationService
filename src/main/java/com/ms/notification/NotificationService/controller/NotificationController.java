package com.ms.notification.NotificationService.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ms.notification.NotificationService.model.Notification;

@RestController
@RequestMapping("/notification")
public class NotificationController {
    
	@GetMapping("/{notificationId}")
	public Notification NotificationOne(@PathVariable("notificationId") String notificationId) {
		
		Notification notificationOne= new Notification(notificationId,"This is the description of notification" +notificationId);
		
		return notificationOne;
		
	}
}
