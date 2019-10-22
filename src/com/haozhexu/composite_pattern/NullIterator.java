package com.haozhexu.composite_pattern;

import java.util.Iterator;

/**
 * Created by haozhexu on 1/10/16.
 */
public class NullIterator implements Iterator {
    @Override
    public boolean hasNext() {
        return false;
    }

    @Override
    public Object next() {
        return null;
    }

    @Override
    public void remove() {
        throw new UnsupportedOperationException();
    }
}
