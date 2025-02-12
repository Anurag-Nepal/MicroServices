package com.anurag.NotificationService;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name = "ORDERSERVICE")
public interface OrderClient {
    @GetMapping("/order")
    public String getOrder();


}
