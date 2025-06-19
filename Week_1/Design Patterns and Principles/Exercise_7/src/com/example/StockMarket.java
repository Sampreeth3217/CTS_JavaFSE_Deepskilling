package com.example;

import java.util.ArrayList;
import java.util.List;

public class StockMarket implements Stock {
    private final List<Observer> observers = new ArrayList<>();
    private String stockSymbol;
    private double stockPrice;

    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
        System.out.println(observer + " registered.");
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
        System.out.println(observer + " removed.");
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(stockSymbol, stockPrice);
        }
    }

    public void setStockPrice(String stockSymbol, double stockPrice) {
        this.stockSymbol = stockSymbol;
        this.stockPrice = stockPrice;
        System.out.println("\nStock updated: " + stockSymbol + " = $" + stockPrice);
        notifyObservers();
    }
}
