package com.sa.lab2.e1;

public class LGTV implements TV{

	@Override
	public void on() {
		System.out.println("Switch on LG TV");
		
	}

	@Override
	public void off() {
		System.out.println("Switch off LG TV");
		
	}

	@Override
	public void tune(int channel) {
		System.out.println("Switch on channel in LG TV is : "+channel);
		
	}

}
