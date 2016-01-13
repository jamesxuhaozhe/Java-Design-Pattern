package com.haozhexu.patternevolve;

/**
 * Created by haozhexu on 1/13/16.
 */
public class DuckSimulator {
    public static void main(final String[] args) {
        DuckSimulator duckSimulator = new DuckSimulator();
        duckSimulator.simulate();

    }

    public void simulate() {
        Quackable mallardDuck = new MallardDuck();
        Quackable duckCall = new DuckCall();
        Quackable redheadDuck = new RedheadDuck();
        Quackable rubberDuck = new RubberDuck();

        System.out.println("\nDuck simulator");
        simulate(mallardDuck);
        simulate(duckCall);
        simulate(redheadDuck);
        simulate(rubberDuck);
    }

    private void simulate(Quackable quackable) {
        quackable.quack();
    }
}
