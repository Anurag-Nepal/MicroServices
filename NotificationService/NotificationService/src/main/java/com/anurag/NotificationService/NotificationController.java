package com.anurag.NotificationService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/getnotification")
public class NotificationController {
    @Autowired
    private NotificationService notificationService;


    private String hey()
    {
        return notificationService.orderFetch();
    }


}
