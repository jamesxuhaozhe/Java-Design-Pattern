package com.abtract.factory.pattern;

public class Tester {
	public static void main(final String[] args) throws Exception {
		DishFactory dishFactory = (DishFactory) FactoryProducer.getFactory("dish");
		DrinkFactory drinkFactory = (DrinkFactory) FactoryProducer.getFactory("drink");
		Cola cola = (Cola) drinkFactory.getDrink("cola");
		Sprite sprite = (Sprite) drinkFactory.getDrink("sprite");
		Fish fish = (Fish) dishFactory.getDish("fish");
		Rib rib = (Rib) dishFactory.getDish("rib");
		cola.serve();
		sprite.serve();
		fish.serve();
		rib.serve();
	}
}
