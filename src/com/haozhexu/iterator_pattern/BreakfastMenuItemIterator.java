package com.haozhexu.iterator_pattern;

import java.util.Iterator;
import java.util.List;

/**
 * Created by haozhexu on 1/9/16.
 */
public class BreakfastMenuItemIterator implements Iterator {
    private List<MenuItem> menuItems;
    private int position;
    public BreakfastMenuItemIterator(List<MenuItem> items) {
        menuItems = items;
        position = 0;
    }

    @Override
    public boolean hasNext() {
        if (position >= menuItems.size() || menuItems.get(position) == null) {
            return false;
        } else {
            return true;
        }
    }

    @Override
    public Object next() {
        MenuItem item = menuItems.get(position);
        position++;
        return item;
    }

    @Override
    public void remove() {
        throw new UnsupportedOperationException();
    }
}
