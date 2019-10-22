package com.haozhexu.pattern_evolve;

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
        Flock flockOfDucks = new Flock();
        flockOfDucks.addQuackableAndReturnSelf(mallardDuck).
                addQuackableAndReturnSelf(duckCall).
                addQuackableAndReturnSelf(redheadDuck).
                addQuackableAndReturnSelf(rubberDuck).
                addQuackableAndReturnSelf(gooseDuck);

        Flock flockOfMallard = new Flock();
        Quackable mallard1 = new CountingMallardDuckFactory().createQuackable();
        Quackable mallard2 = new CountingMallardDuckFactory().createQuackable();
        Quackable mallard3 = new CountingMallardDuckFactory().createQuackable();
        Quackable mallard4 = new CountingMallardDuckFactory().createQuackable();
        flockOfMallard.addQuackableAndReturnSelf(mallard1).
                addQuackableAndReturnSelf(mallard2).
                addQuackableAndReturnSelf(mallard3).
                addQuackableAndReturnSelf(mallard4);
        flockOfDucks.addQuackable(flockOfMallard);

        System.out.println("\nDuck Simulator: With Observer:\n");
        Quackologist quackologist = new Quackologist();
        flockOfDucks.registerObserver(quackologist);
        simulate(flockOfDucks);
        System.out.println("\nThe ducks quacked " + QuackCounter.getQuackCount() + " times");
    }

    private void simulate(Quackable quackable) {
        quackable.quack();
    }
}
