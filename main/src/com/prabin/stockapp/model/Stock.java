package com.prabin.stockapp.model;

public class Stock {

    private String symbol;
    private double price;

    public Stock(String symbol, double price) {
        this.symbol = symbol;
        this.price = price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
    public String getSymbol(){
        return this.symbol;
    }
    public double getPrice() {
        return this.price;
    }
}
