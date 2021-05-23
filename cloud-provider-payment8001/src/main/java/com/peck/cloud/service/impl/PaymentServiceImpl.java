package com.peck.cloud.service.impl;

import com.peck.cloud.dao.PaymentDao;
import com.peck.cloud.pojo.Payment;
import com.peck.cloud.service.PaymentService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class PaymentServiceImpl implements PaymentService {
    @Resource
    private PaymentDao paymentDao;

    public int create(Payment payment){
        return paymentDao.create(payment);
    }
    public Payment getPaymentById(Long id){
        return paymentDao.getPaymentById(id);
    }
}