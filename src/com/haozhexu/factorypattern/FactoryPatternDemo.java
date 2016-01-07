package com.haozhexu.factorypattern;

/**
 * Created by haozhexu on 1/7/16.
 */
public class FactoryPatternDemo {
    public static void main(final String[] args) {
        PizzaStore changzhouPizzaStore = new ChangzhouPizzaStore();
        Pizza changzhouPizza = changzhouPizzaStore.orderPizza();


        PizzaStore wuxiPizzaStore = new WuxiPizzaStore();
        Pizza wuxiPizza = wuxiPizzaStore.orderPizza();

    }
}
