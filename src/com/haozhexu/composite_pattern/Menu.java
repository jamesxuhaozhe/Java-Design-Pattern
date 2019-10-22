package com.haozhexu.composite_pattern;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Created by haozhexu on 1/10/16.
 */
public class Menu extends MenuComponent {
    private String menuName;
    private String desc;
    private List<MenuComponent> menuComponents;
    private Iterator<MenuComponent> iterator = null;

    public Menu(String name, String description) {
        menuName = name;
        desc = description;
        menuComponents = new ArrayList<>();
    }

    @Override
    public String getName() {
        return menuName;
    }

    @Override
    public void print() {
        System.out.print("\n" + getName());
        System.out.println(", " + getDescription());
        System.out.println("-----------------------");
        Iterator<MenuComponent> iterator = menuComponents.iterator();

        while (iterator.hasNext()) {
            MenuComponent menuComponent = iterator.next();
            menuComponent.print();
        }

    }

    @Override
    public String getDescription() {
        return desc;
    }

    @Override
    public void add(MenuComponent component) {
        menuComponents.add(component);
    }

    @Override
    public void remove(MenuComponent component) {
        int index = menuComponents.indexOf(component);
        menuComponents.remove(index);
    }

    @Override
    public Iterator<MenuComponent> createIterator() {
        if (iterator == null) {
            return new CompositeIterator(menuComponents.iterator());
        }
        return iterator;
    }
}
