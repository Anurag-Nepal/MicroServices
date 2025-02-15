package com.anurag.NotificationService;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.function.Function;

@Configuration
public class NotificationConfig {

    @Bean
    public Function<OrderDetails,String>getNotification(){
        return (orderDetails -> {
            logicToSend(orderDetails.getEmail());
            return "Order Notification Sent to user";
        });

    }

    private void logicToSend(String email) {
        System.out.println("email sent to"+email);
        System.out.println("---------------------");
    }
}
