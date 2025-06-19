package com.example;

public class AdapterPatternTest {
    public static void main(String[] args) {
        // PayPal adapter usage
        PayPalGateway payPalGateway = new PayPalGateway();
        PaymentProcessor payPalProcessor = new PayPalAdapter(payPalGateway);
        payPalProcessor.processPayment(100.00);

        System.out.println();

        // Stripe adapter usage
        StripeGateway stripeGateway = new StripeGateway();
        PaymentProcessor stripeProcessor = new StripeAdapter(stripeGateway);
        stripeProcessor.processPayment(200.00);
    }
}
