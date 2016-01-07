package com.haozhexu.factorypattern;

/**
 * Created by haozhexu on 1
 * /7/16.
 */
public class ChangzhouPizzaStore extends PizzaStore {
    IngredientFactory factory;
    public ChangzhouPizzaStore() {
        factory = new ChangzhouIngredientFactory();
    }
    @Override
    protected Pizza createPizza() {
        return new ChangzhouPizza(factory);
    }
}

