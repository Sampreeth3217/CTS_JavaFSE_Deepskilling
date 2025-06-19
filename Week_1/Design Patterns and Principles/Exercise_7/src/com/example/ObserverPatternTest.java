package com.example;

public class ObserverPatternTest {
    public static void main(String[] args) {
        StockMarket stockMarket = new StockMarket();

        Observer mobileUser1 = new MobileApp("Alice");
        Observer mobileUser2 = new MobileApp("Bob");
        Observer webUser1 = new WebApp("Charlie");

        stockMarket.registerObserver(mobileUser1);
        stockMarket.registerObserver(mobileUser2);
        stockMarket.registerObserver(webUser1);

        stockMarket.setStockPrice("GOOGL", 2850.75);
        stockMarket.setStockPrice("AAPL", 172.30);

        stockMarket.removeObserver(mobileUser2);

        stockMarket.setStockPrice("MSFT", 310.15);
    }
}
