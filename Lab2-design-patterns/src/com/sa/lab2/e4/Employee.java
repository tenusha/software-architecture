package com.sa.lab2.e4;

public abstract class Employee {
	
	int salary;
	
	String description = "General employee details";

	abstract int getSalary();
	
	abstract String getDescription();
}
