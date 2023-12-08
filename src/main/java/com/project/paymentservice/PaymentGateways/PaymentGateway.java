package com.project.paymentservice.PaymentGateways;

public interface PaymentGateway {
   String generatePaymentLink(String orderId, String email, String phoneNumber, Long amount);
}
