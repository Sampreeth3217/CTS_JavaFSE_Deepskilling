package com.example;

public class WebApp implements Observer {
    private final String user;

    public WebApp(String user) {
        this.user = user;
    }

    @Override
    public void update(String stockSymbol, double stockPrice) {
        System.out.println("[WebApp - " + user + "] Stock " + stockSymbol + " updated to $" + stockPrice);
    }

    @Override
    public String toString() {
        return "WebApp(" + user + ")";
    }
}
