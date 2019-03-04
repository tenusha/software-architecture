package com.sa.lab2.e4;

public class WorkExperience extends EmployeeQualification {

	public WorkExperience(Employee decoratedEmployee) {
		super(decoratedEmployee);
	}

	@Override
	String getDescription() {
		return description;
	}

	@Override
	int getSalary() {
		return decoratedEmployee.getSalary() + 20000;
	}

}
