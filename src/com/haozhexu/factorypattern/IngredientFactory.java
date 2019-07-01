package com.haozhexu.factorypattern;

/**
 * Created by haozhexu on 1/7/16.
 */
public interface IngredientFactory {
    Source getSource();
    Dough getDough();
}
