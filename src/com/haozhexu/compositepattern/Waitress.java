package com.haozhexu.compositepattern;

import java.util.Iterator;
import java.util.List;

/**
 * Created by haozhexu on 1/10/16.
 */
public class Waitress {
    private MenuComponent component;
    public Waitress(MenuComponent menuComponent) {
        component = menuComponent;
    }

    public void print() {
        component.print();
    }

    public void printVeggie() {
        Iterator<MenuComponent> iterator = component.createIterator();
        System.out.println("\nVegetarian menu\n------");

        while (iterator.hasNext()) {
            MenuComponent component = iterator.next();
            try {
                if (component.isVegetarian()) {
                    component.print();
                }
            } catch (UnsupportedOperationException e) {

            }
        }
    }
}
