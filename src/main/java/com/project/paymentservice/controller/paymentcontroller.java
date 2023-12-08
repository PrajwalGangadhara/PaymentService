package com.project.paymentservice.controller;

import com.project.paymentservice.dtos.InitiatePaymentDTO;
import com.project.paymentservice.service.PaymentService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/payments")
public class paymentcontroller {

    private PaymentService paymentService;
    public paymentcontroller(PaymentService paymentService)
    {
        this.paymentService=paymentService;
    }

    @PostMapping("/link")
    public String initiatePayment(@RequestBody InitiatePaymentDTO reqdto)
    {
        String link= paymentService.initiatePayment(reqdto.getOrderId(), reqdto.getEmail(),
                                                reqdto.getPhoneNumber(), reqdto.getAmount());

        System.out.println(link);
        return link;
    }
}
