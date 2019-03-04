package com.sa.lab2.e4;

public class EmployeeCertification extends EmployeeQualification {

	public EmployeeCertification(Employee decoratedEmployee) {
		super(decoratedEmployee);
	}

	@Override
	String getDescription() {
		return description;
	}

	@Override
	int getSalary() {
		return decoratedEmployee.getSalary()+30000;
	}

}
