package com.haozhexu.compositepattern;

/**
 * Created by haozhexu on 1/10/16.
 */
public class CompositeIteratorDemo {

    public static void main(final String[] args) {
        MenuComponent allMenus = new Menu("All Menus", "All menus combined.");

        MenuComponent menu1 = new Menu("Menu 1", "First Menu");
        MenuComponent menu2 = new Menu("Menu 2", "Second Menu");
        MenuComponent menu3 = new Menu("Menu 3", "Third Menu");

        MenuComponent item11 = new MenuItem("item11", "from first menu", 1, true);
        MenuComponent item12 = new MenuItem("item12", "from first menu", 2, true);

        MenuComponent item21 = new MenuItem("item21", "from second menu", 3, false);
        MenuComponent item22 = new MenuItem("item22", "from second menu", 4, true);

        MenuComponent item31 = new MenuItem("item31", "from third menu", 4, false);
        MenuComponent item32 = new MenuItem("item32", "from third menu", 2, true);

        menu1.add(item11);
        menu1.add(item12);

        menu2.add(item21);
        menu2.add(item22);

        menu3.add(item31);
        menu3.add(item32);

        MenuComponent subMenu = new Menu("Sub Menu", "node menu");
        subMenu.add(new MenuItem("sub item", "from sub menu", 1, false));

        menu3.add(subMenu);
        allMenus.add(menu1);
        allMenus.add(menu2);
        allMenus.add(menu3);

        Waitress waitress = new Waitress(allMenus);
        waitress.print();
    }
}
