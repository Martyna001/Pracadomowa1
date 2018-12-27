package com.company;

public class Position {
    String name;
    int number;
    double price;

    public Position(String name, int number, double price) {
        this.name = name;
        this.number = number;
        this.price = price;

    }

    public Position() {
    }

    public double CalculateValue() {
        return this.number * this.price;

    }

    @Override
    public String toString() {
        return
                name + '\'' +
                  number +
                "szt. " + price + "zł" + "Razem :"+CalculateValue() + "zł," +
                '}';
    }
}
