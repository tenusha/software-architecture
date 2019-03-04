package com.sa.lab1.e1;

public class LivingRoomLight implements Light{

	@Override
	public void on() {
		
		System.out.println("Switch on() LivingRoom Light");
		
	}

	@Override
	public void off() {
		
		System.out.println("Switch off() LivingRoom Light");
		
	}

}
