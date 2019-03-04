package com.sa.lab2.e2;

import java.util.Date;

public class Person {
	String nic;
	String firstName;
	String lastName;
	Date dob;
	String contactNo;
	
	public Person(String nic, String firstName, String lastName, Date dob, String contactNo){
		this.nic = nic;
		this.firstName = firstName;
		this.lastName = lastName;
		this.dob = dob;
		this.contactNo = contactNo;
	}
	
	String getNIC(){
		return nic;
	}
	
	String getFirstName(){
		return firstName;
	}
	
	String getLastName(){
		return lastName;
	}
	
	Date getDOB(){
		return dob;
	}
	
	String getContacyNo(){
		
		return contactNo;
	}
}
