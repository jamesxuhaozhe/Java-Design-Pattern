package com.haozhexu.templatemethodpattern;

/**
 * Created by haozhexu on 1/9/16.
 */
public class TemplateMethodPatternDemo {
    public static void main(final String[] args) {
        CaffineBeverage tea = new Tea();
        CaffineBeverage coffee = new Coffee();
        tea.prepareBeverage();
        coffee.prepareBeverage();
        CaffineBeverage teaWithoutCondiments = new Tea() {
            @Override
            boolean needToAddCondiments() {
                return false;
            }
        };
        teaWithoutCondiments.prepareBeverage();
    }
}
