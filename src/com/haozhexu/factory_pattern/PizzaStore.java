package com.haozhexu.factory_pattern;

/**
 * Created by haozhexu on 1/7/16.
 */
public abstract class PizzaStore {
    public Pizza orderPizza() {
        Pizza pizza = createPizza();
        pizza.prepare();
        pizza.cook();
        pizza.cut();
        return pizza;
    }
    protected abstract Pizza createPizza();
}
