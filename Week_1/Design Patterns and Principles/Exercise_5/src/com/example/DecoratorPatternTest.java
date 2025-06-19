package com.example;

public class DecoratorPatternTest {
    public static void main(String[] args) {
        Notifier basicNotifier = new EmailNotifier();

        System.out.println("=== Email Notification ===");
        basicNotifier.send("Hello User!");

        System.out.println("\n=== Email + SMS Notification ===");
        Notifier smsDecorator = new SMSNotifierDecorator(basicNotifier);
        smsDecorator.send("Your OTP is 1234");

        System.out.println("\n=== Email + SMS + Slack Notification ===");
        Notifier fullNotifier = new SlackNotifierDecorator(smsDecorator);
        fullNotifier.send("Critical alert: Server down!");
    }
}
