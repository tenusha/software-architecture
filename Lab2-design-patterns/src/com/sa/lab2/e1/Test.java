package com.sa.lab2.e1;

public class Test {

	public static void main(String[] args) {
		TV lgTv = new LGTV();
		TV sonyTv = new SonyTV();
		
		new RemoteControllerImpl(lgTv).on();
		new RemoteControllerImpl(lgTv).off();
		new RemoteControllerImpl(lgTv).tune(10);
		new RemoteControllerImpl(sonyTv).on();
		new RemoteControllerImpl(sonyTv).off();
		new RemoteControllerImpl(sonyTv).tune(20);
	}
	
}
