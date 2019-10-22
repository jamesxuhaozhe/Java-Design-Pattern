package com.haozhexu.composite_pattern;

import java.util.Iterator;
import java.util.Stack;

/**
 * Created by haozhexu on 1/10/16.
 */
public class CompositeIterator implements Iterator {
    private Stack<Iterator<MenuComponent>> stack = new Stack<>();

    public CompositeIterator(Iterator iterator) {
        stack.push(iterator);
    }

    @Override
    public boolean hasNext() {
        if (stack.isEmpty()) {
            return false;
        } else {
            Iterator<MenuComponent> iterator = stack.peek();
            if (!iterator.hasNext()) {
                stack.pop();
                return hasNext();
            } else {
                return true;
            }
        }
    }

    @Override
    public Object next() {
        if (!hasNext()) {
            return null;
        }
        Iterator<MenuComponent> iterator = stack.peek();
        MenuComponent component = iterator.next();
        stack.push(iterator);
        return component;
    }

    @Override
    public void remove() {
        throw new UnsupportedOperationException();
    }
}
