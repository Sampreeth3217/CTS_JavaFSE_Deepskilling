package com.example;

public class StripeGateway {
    public void makePayment(double amount) {
        System.out.println("Stripe: Successfully charged $" + amount);
    }
}
