package com.haozhexu.iteratorpattern;

import sun.plugin.dom.exception.InvalidStateException;

import java.util.Iterator;

/**
 * Created by haozhexu on 1/9/16.
 */
public class DinerMenu implements Menu {
    private MenuItem[] menuItems;
    private String menuName;
    private String menuDescription;
    private int position;
    private static final int MAX_ITEM_SIZE = 10;
    public DinerMenu(String name, String description) {
        menuItems = new MenuItem[MAX_ITEM_SIZE];
        menuName = name;
        menuDescription = description;
        position = 0;
    }
    @Override
    public void addItem(MenuItem item) {
        if (!canAddMoreItem()) {
            throw new InvalidStateException("DinerMenu can only have up to 10 items");
        }
        menuItems[position] = item;
        position++;
    }

    @Override
    public Iterator createIterator() {
        return new DinerMenuItemIterator(menuItems);
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

    private boolean canAddMoreItem() {
        return !(position >= MAX_ITEM_SIZE);
    }
}
