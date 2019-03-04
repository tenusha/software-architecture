package com.sa.lab1.e2;

public class Test {

	static Beverage beverage = null;

	public static void main(String[] args) {

		Beverage tea = new Tea();
		tea.prepareRecipie();
		System.out.println("====================");
		Beverage coffee = new Coffee();
		coffee.prepareRecipie();

	}

}
