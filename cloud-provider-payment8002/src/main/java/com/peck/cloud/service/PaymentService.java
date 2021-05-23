package com.peck.cloud.service;

import com.peck.cloud.pojo.Payment;

public interface PaymentService {
    int create(Payment payment);
    Payment getPaymentById(Long id);
}