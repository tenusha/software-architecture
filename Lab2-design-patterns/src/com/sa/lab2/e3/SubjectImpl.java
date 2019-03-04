package com.sa.lab2.e3;

import java.util.ArrayList;
import java.util.List;

public class SubjectImpl implements Subject{

	String status;
	List<Observer> observers = new ArrayList<>();
	
	@Override
	public void registerObserver(Observer observer) {
		observers.add(observer);
		
	}

	@Override
	public void removeObserver(Observer observer) {
		observers.remove(observer);
		
	}

	@Override
	public void setStatus(String status) {
		this.status = status;
		for(Observer observer : observers){
			observer.notify(this);
		}
	}

	@Override
	public String getStatus() {
		return status;
		
	}
	
	

}
