package com.haozhexu.factory_pattern;

/**
 * Created by haozhexu on 1/7/16.
 */
public class ChangzhouPizza extends Pizza {
    IngredientFactory ingredientFactory;
    public ChangzhouPizza(IngredientFactory ingredientFactory) {
        name = "Changzhou Pizza";
        this.ingredientFactory = ingredientFactory;
    }

    @Override
    public void prepare() {
        source = ingredientFactory.getSource();
        dough = ingredientFactory.getDough();
    }
}
