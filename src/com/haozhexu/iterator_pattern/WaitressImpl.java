package com.haozhexu.iterator_pattern;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Created by haozhexu on 1/9/16.
 */
public class WaitressImpl implements Waitress {
    private List<Menu> menus;

    public WaitressImpl() {
        menus = new ArrayList<>();
    }
    @Override
    public void addMenu(Menu menu) {
        menus.add(menu);
    }

    @Override
    public void printMenu() {
        for (Menu menu : menus) {
            Iterator menuIterator = menu.createIterator();
            System.out.println("Items from " + menu.getName() + " are: ");
            printMenu(menuIterator);
            System.out.println();
        }
    }

    private void printMenu(Iterator menuIterator) {
        while(menuIterator.hasNext()) {
            MenuItem item = (MenuItem) menuIterator.next();
            item.print();
        }
    }
}
