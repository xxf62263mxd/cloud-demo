package com.peck.cloud.controller;

import com.peck.cloud.pojo.CommonResult;
import com.peck.cloud.pojo.Payment;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

@RestController
@Slf4j
public class OrderController {

    private static final String PAYMENT_HOST = "http://localhost:8001";

    @Resource
    private RestTemplate restTemplate;


    @PostMapping("/consumer/payment/create")
    public CommonResult<Payment> create(@RequestBody Payment payment){
        return restTemplate.postForObject(PAYMENT_HOST+"/payment/create",payment,CommonResult.class);
    }




}
