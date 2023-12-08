package com.project.paymentservice.PaymentGateways;

import org.springframework.stereotype.Service;

@Service
public class PaymentGateWayStrategyChooser {
    private RazorPayPaymentGateway razorPayPaymentGateway;
    private StripePaymentGateway stripePaymentGateway;

    public PaymentGateWayStrategyChooser(RazorPayPaymentGateway razorPayPaymentGateway,
                                         StripePaymentGateway stripePaymentGateway)
    {
        this.razorPayPaymentGateway=razorPayPaymentGateway;
        this.stripePaymentGateway=stripePaymentGateway;
    }


    public PaymentGateway getBestPaymentGateway()
    {
        //        int randomInt = new Random().nextInt();
        //
        //        if (randomInt % 2 == 0) {
        //            return razorpayPaymentGateway;
        //        }
        //
        //        return stripePaymentGateway;

        return stripePaymentGateway;
    }
}
