package com.project.paymentservice.service;

import com.project.paymentservice.PaymentGateways.PaymentGateWayStrategyChooser;
import com.project.paymentservice.PaymentGateways.PaymentGateway;
import org.springframework.stereotype.Service;

@Service
public class PaymentService {

    private PaymentGateWayStrategyChooser paymentGateWayStrategyChooser;

    public PaymentService(PaymentGateWayStrategyChooser paymentGateWayStrategyChooser) {
        this.paymentGateWayStrategyChooser = paymentGateWayStrategyChooser;
    }

    public String initiatePayment(String orderId, String email, String phoneNumber, Long amount)
    {

        PaymentGateway paymentGateway=paymentGateWayStrategyChooser.getBestPaymentGateway();

        return paymentGateway.generatePaymentLink(orderId,email, phoneNumber, amount);
    }
}
