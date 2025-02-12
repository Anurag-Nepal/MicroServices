package com.anurag.NotificationService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class NotificationService {
    @Autowired
    private OrderClient orderClient;

    public String orderFetch()
    {
        return orderClient.getOrder();
    }
}
