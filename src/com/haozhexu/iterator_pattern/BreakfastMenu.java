package com.haozhexu.iterator_pattern;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Created by haozhexu on 1/9/16.
 */
public class BreakfastMenu implements Menu {
    private List<MenuItem> menuItems;
    private String menuName;
    private String menuDescription;

    public BreakfastMenu(String name, String description) {
        menuItems = new ArrayList<>();
        menuName = name;
        menuDescription = description;
    }
    @Override
    public void addItem(MenuItem item) {
        menuItems.add(item);
    }

    @Override
    public Iterator createIterator() {
        return new BreakfastMenuItemIterator(menuItems);
    }

    @Override
    public String getName() {
        return menuName;
    }

    @Override
    public String getDescription() {
        return menuDescription;
    }

    @Override
    public String print() {
        return menuName + " " + menuDescription;
    }
}
