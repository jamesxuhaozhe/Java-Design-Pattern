package com.haozhexu.patternevolve;

/**
 * Created by haozhexu on 1/13/16.
 */
public class GooseAdapter implements Quackable {
    private Goose goose;

    public GooseAdapter(Goose goose) {
        this.goose = goose;
    }
    @Override
    public void quack() {
        goose.honk();
    }
}
