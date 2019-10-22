package com.haozhexu.iterator_pattern;

import java.util.Iterator;

/**
 * Created by haozhexu on 1/9/16.
 */
public interface Menu {
    public void addItem(MenuItem item);
    public Iterator createIterator();
    public String getName();
    public String getDescription();
    public String print();
}
