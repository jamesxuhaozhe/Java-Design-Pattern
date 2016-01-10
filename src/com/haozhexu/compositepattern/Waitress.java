package com.haozhexu.compositepattern;

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
}
