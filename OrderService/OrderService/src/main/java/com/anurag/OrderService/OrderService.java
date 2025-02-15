package com.anurag.OrderService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.stream.function.StreamBridge;
import org.springframework.stereotype.Service;

@Service
public class OrderService {

@Autowired
    private StreamBridge streamBridge;

//Sending to the Broker(Kafka)
    public void sendNotification()
    {
        OrderDetails orderDetails=new OrderDetails();
        orderDetails.setOrderName("Order1");
        orderDetails.setEmail("abc@gmail.com");
        streamBridge.send("sendNotification-out-0",orderDetails);

    }
}
