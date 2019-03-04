package com.sa.lab2.e3;

public class ObserverImpl implements Observer{

	String observerID;
	Subject subject;
	
	public ObserverImpl(String observerID){
		this.observerID = observerID;
	}
	
	public void notify(Subject subject){
		this.subject = subject;
		System.out.println("Observer recieved state change of subject, ID is = " + observerID + " Status = "+ getState());
	}
	
	@Override
	public String getState() {
		return subject.getStatus();
		
	}

}
