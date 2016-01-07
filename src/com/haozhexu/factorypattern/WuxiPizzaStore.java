package com.haozhexu.factorypattern;

/**
 * Created by haozhexu on 1/7/16.
 */
public class WuxiPizzaStore extends PizzaStore {
    IngredientFactory factory;

    public WuxiPizzaStore() {
        factory = new WuxiIngredientFactory();
    }

    @Override
    protected Pizza createPizza() {
        return new WuxiPizza(factory);
    }
}
