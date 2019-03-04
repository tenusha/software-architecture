package com.sa.lab2.e4;

public abstract class EmployeeQualification extends Employee{
	
	Employee decoratedEmployee;
	
	public EmployeeQualification(Employee decoratedEmployee){
		this.decoratedEmployee = decoratedEmployee;
	}
	
}
