package com.haozhexu.factorypattern;

/**
 * Created by haozhexu on 1/7/16.
 */
public interface IngredientFactory {
    public Source getSource();
    public Dough getDough();
}
