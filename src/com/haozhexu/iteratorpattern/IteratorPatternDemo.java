package com.haozhexu.iteratorpattern;

/**
 * Created by haozhexu on 1/9/16.
 */
public class IteratorPatternDemo {
    public static void main(final String[] args) {
        // Breakfast item
        MenuItem eggPancake = new ConcreteMenuItem("Pancake made from eggs", 2, "Egg Pancake");
        MenuItem coffee = new ConcreteMenuItem("Normal American style coffee", 1, "Americano");

        // Diner item
        MenuItem burger = new ConcreteMenuItem("Hamburger with two slices of Cheese", 5, "Double Cheeseburger");
        MenuItem meatBall = new ConcreteMenuItem("Balls made out of meat", 6, "Italian-style-meatballs");

        // Create BreakfastMenu
        Menu breakfastMenu = new BreakfastMenu("James' break menu", "Menu used in James' breakfast joint");

        // Create DinerMenu
        Menu dinerMenu = new DinerMenu("James' diner menu", "Menu used in James' diner place");

        // Create waitress
        Waitress waitress = new WaitressImpl();
        waitress.addMenu(breakfastMenu);
        waitress.addMenu(dinerMenu);

        // add items to corresponding menu
        breakfastMenu.addItem(eggPancake);
        breakfastMenu.addItem(coffee);
        dinerMenu.addItem(burger);
        dinerMenu.addItem(meatBall);


        // waitress object print menu
        waitress.printMenu();
    }
}
