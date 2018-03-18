package com.feng.main;

import com.feng.main.impl.ChickenBurger;
import com.feng.main.impl.Coke;
import com.feng.main.impl.Pepsi;
import com.feng.main.impl.VegBurger;

public class MealBuilder {
	public Meal prepareVegMeal() {
		Meal meal = new Meal();
		meal.addItem(new VegBurger());
		meal.addItem(new Coke());
		return meal;
	}

	public Meal prepareNonVegMeal() {
		Meal meal = new Meal();
		meal.addItem(new ChickenBurger());
		meal.addItem(new Pepsi());
		return meal;
	}
}
