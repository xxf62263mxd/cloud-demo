package com.peck.cloud.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

@RestController
public class OrderController {

    private static final String PAYMENT_HOST = "http://cloud-payment-service";
    @Resource
    private RestTemplate restTemplate;

    @GetMapping("/consumer/payment/lb")
    public String lb(){
        return restTemplate.getForObject(PAYMENT_HOST+"/payment/lb",String.class);
    }

}
