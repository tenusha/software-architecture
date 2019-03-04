package com.sa.lab2.e3;

public interface Observer {

	String getState();
	
	void notify(Subject subject);
}
