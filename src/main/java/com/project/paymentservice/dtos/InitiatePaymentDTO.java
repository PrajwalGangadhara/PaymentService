package com.project.paymentservice.dtos;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class InitiatePaymentDTO {
    private String email;
    private String orderId;
    private String phoneNumber;
    private Long amount;
}
