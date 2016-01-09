package com.haozhexu.iteratorpattern;

/**
 * Created by haozhexu on 1/9/16.
 */
public class ConcreteMenuItem implements MenuItem {
    private String itemDescription;
    private int itemPrice;
    private String itemName;

    public ConcreteMenuItem(String description, int price, String name) {
        itemDescription = description;
        itemPrice = price;
        itemName = name;
    }
    @Override
    public String getDescription() {
        return itemDescription;
    }

    @Override
    public int getPrice() {
        return itemPrice;
    }

    @Override
    public String getName() {
        return itemName;
    }

    @Override
    public void print() {
        System.out.println("Name: " + itemName + " Price: " + itemPrice + " Description: " + itemDescription);
    }
}
