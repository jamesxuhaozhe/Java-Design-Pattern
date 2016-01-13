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
        Quackable mallardDuck = new CountingMallardDuckFactory().createQuackable();
        Quackable duckCall = new CountingDuckCallFactory().createQuackable();
        Quackable redheadDuck = new CountingRedheadDuckFactory().createQuackable();
        Quackable rubberDuck = new CountingRubberDuckFactory().createQuackable();
        Quackable gooseDuck = new GooseAdapter(new Goose());

        System.out.println("\nDuck simulator\n");
        simulate(mallardDuck);
        simulate(duckCall);
        simulate(redheadDuck);
        simulate(rubberDuck);
        simulate(gooseDuck);

        System.out.println("\nThe ducks quacked " + QuackCounter.getQuackCount() + " times");
    }

    private void simulate(Quackable quackable) {
        quackable.quack();
    }
}
