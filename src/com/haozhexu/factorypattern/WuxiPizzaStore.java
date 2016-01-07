package com.haozhexu.factorypattern;

/**
 * Created by haozhexu on 1/7/16.
 */
public class WuxiPizzaStore extends PizzaStore {

    @Override
    protected Pizza createPizza() {
        return new WuxiPizza();
    }
}
