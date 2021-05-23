package com.peck.cloud.service;

import com.peck.cloud.pojo.Payment;
import org.apache.ibatis.annotations.Param;

public interface PaymentService {
    int create(Payment payment);
    Payment getPaymentById(Long id);
}