package com.anurag.OrderService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderService {


    public String printOrder()
    {
        OrderDetails orderDetails=new OrderDetails();
        orderDetails.setOrderName("Order1");
        orderDetails.setEmail("abc@gmail.com");
        return orderDetails.getOrderName()+orderDetails.getEmail();
    }
}
