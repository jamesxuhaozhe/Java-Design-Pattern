package com.haozhexu.factory_pattern;

/**
 * Created by haozhexu on 1/7/16.
 */
public class FactoryPatternDemo {
    public static void main(final String[] args) {
        PizzaStore changzhouPizzaStore = new ChangzhouPizzaStore();
        Pizza changzhouPizza = changzhouPizzaStore.orderPizza();
        System.out.println(changzhouPizza);

        PizzaStore wuxiPizzaStore = new WuxiPizzaStore();
        Pizza wuxiPizza = wuxiPizzaStore.orderPizza();
        System.out.println(wuxiPizza);

    }
}
