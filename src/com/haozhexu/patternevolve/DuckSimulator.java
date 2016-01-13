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
        Quackable mallardDuck = new QuackCounter(new MallardDuck());
        Quackable duckCall = new QuackCounter(new DuckCall());
        Quackable redheadDuck = new QuackCounter(new RedheadDuck());
        Quackable rubberDuck = new QuackCounter(new RubberDuck());
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
