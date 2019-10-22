package com.haozhexu.factory_pattern;

/**
 * Created by haozhexu on 1/7/16.
 */
public interface IngredientFactory {
    Source getSource();
    Dough getDough();
}
