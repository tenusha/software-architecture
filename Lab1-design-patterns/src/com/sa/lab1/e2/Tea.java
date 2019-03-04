package com.sa.lab1.e2;

public class Tea extends Beverage {

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
		System.out.println("Stepping the Tea.");
		System.out.println("Adding Lemon.");
		super.pourInCup();
	}

}
