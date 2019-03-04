package com.sa.lab1.e2;

public abstract class Beverage {

	abstract void brew();

	abstract void addCondiments();

	void boilWater() {
		System.out.println("Boiling Water.");
	}

	void pourInCup() {
		System.out.println("Pour into cup.");
	}

	abstract void prepareRecipie();

}
