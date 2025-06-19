package com.example;

public class MobileApp implements Observer {
    private final String user;

    public MobileApp(String user) {
        this.user = user;
    }

    @Override
    public void update(String stockSymbol, double stockPrice) {
        System.out.println("[MobileApp - " + user + "] Stock " + stockSymbol + " updated to $" + stockPrice);
    }

    @Override
    public String toString() {
        return "MobileApp(" + user + ")";
    }
}
