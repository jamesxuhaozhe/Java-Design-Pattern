package com.haozhexu.iteratorpattern;

import java.util.Iterator;

/**
 * Created by haozhexu on 1/9/16.
 */
public class DinerMenuItemIterator implements Iterator {
    private MenuItem[] menuItems;
    private int position;
    public DinerMenuItemIterator(MenuItem[] items) {
        menuItems = items;
        position = 0;
    }

    @Override
    public boolean hasNext() {
        if (position >= menuItems.length || menuItems[position] == null) {
            return false;
        } else {
            return true;
        }

    }

    @Override
    public Object next() {
        MenuItem item = menuItems[position];
        position++;
        return item;
    }

    @Override
    public void remove() {
        throw new UnsupportedOperationException("Client can not remove item from DinerMenu!");
    }
}
