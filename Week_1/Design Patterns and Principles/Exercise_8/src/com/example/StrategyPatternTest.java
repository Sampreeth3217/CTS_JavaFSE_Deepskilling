package com.example;

public class StrategyPatternTest {
    public static void main(String[] args) {
        PaymentContext context = new PaymentContext();

        // Use Credit Card
        PaymentStrategy creditCard = new CreditCardPayment("1234-5678-9012-3456", "Alice");
        context.setPaymentStrategy(creditCard);
        context.executePayment(150.00);

        // Use PayPal
        PaymentStrategy payPal = new PayPalPayment("alice@example.com");
        context.setPaymentStrategy(payPal);
        context.executePayment(75.50);
    }
}
