package com.haozhexu.factorypattern;

/**
 * Created by haozhexu on 1/7/16.
 */
public class ChangzhouIngredientFactory implements IngredientFactory {
    @Override
    public Source getSource() {
        return new ChangzhouSource();
    }

    @Override
    public Dough getDough() {
        return new ChangzhouDough();
    }
}
