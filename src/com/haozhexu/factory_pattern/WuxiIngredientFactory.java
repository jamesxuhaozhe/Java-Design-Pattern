package com.haozhexu.factory_pattern;

/**
 * Created by haozhexu on 1/7/16.
 */
public class WuxiIngredientFactory implements IngredientFactory {
    @Override
    public Source getSource() {
        return new WuxiSource();
    }

    @Override
    public Dough getDough() {
        return new WuxiDough();
    }
}
