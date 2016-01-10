package com.haozhexu.compositepattern;

import java.util.Iterator;

/**
 * Created by haozhexu on 1/10/16.
 */
public class MenuItem extends MenuComponent {
    private String itemName;
    private String itemDescription;
    private int itemPrice;
    private boolean isItemVegie;

    public MenuItem(String name, String desc, int price, boolean isVegie) {
        itemName = name;
        itemDescription = desc;
        itemPrice = price;
        isItemVegie = isVegie;
    }

    @Override
    public String getName() {
        return itemName;
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
    public boolean isVegetarian() {
        return isItemVegie;
    }

    @Override
    public void print() {
        System.out.println(itemName + " " + itemDescription + " " + itemPrice + " " + isItemVegie);
    }

    @Override
    public Iterator<MenuComponent> createIterator() {
        return new NullIterator();
    }
}
