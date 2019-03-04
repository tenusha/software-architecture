package com.sa.lab1.e2;

public class Coffee extends Beverage {

	@Override
	void brew() {
		// TODO Auto-generated method stub

	}

	@Override
	void addCondiments() {
		// TODO Auto-generated method stub

	}

	@Override
	void prepareRecipie() {
		super.boilWater();
		System.out.println("Stripping coffee through filter.");
		System.out.println("Add suger and milk.");
		super.pourInCup();

	}

}
