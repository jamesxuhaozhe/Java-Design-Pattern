package com.haozhexu.factory_pattern;

/**
 * Created by haozhexu on 1/7/16.
 */
public class WuxiPizza extends Pizza {
    IngredientFactory ingredientFactory;
    public WuxiPizza(IngredientFactory ingredientFactory) {
        name = "Wuxi Pizza";
        this.ingredientFactory = ingredientFactory;
    }

    @Override
    public void prepare() {
        source = ingredientFactory.getSource();
        dough = ingredientFactory.getDough();
    }
}
