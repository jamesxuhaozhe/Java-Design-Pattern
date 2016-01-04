package com.haozhexu.decoratorpattern;

/**
 * Created by haozhexu on 1/4/16.
 */
public class DecoratorPatternDemo {
    public static void main(final String[] args) {
        Beverage frenchRoast = new FrenchRoast();
        frenchRoast = new Mocha(frenchRoast);
        frenchRoast = new Mocha(frenchRoast);
        frenchRoast = new Whip(frenchRoast);
        System.out.println(frenchRoast.getDescription() + " " + frenchRoast.cost());

        Beverage darkRoast = new DarkRoast();
        darkRoast = new Whip(darkRoast);
        System.out.println(darkRoast.getDescription() + " " + darkRoast.cost());
    }
}
