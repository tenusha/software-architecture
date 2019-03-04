package com.sa.lab2.e4;

public class Test {

	public static void main(String[] args) {
		Employee employee = new Engineer();
		employee = new EmployeeCertification(employee);
		employee = new WorkExperience(employee);
		
		System.out.println(employee.getDescription() + " "+ employee.getSalary());
		
		
		Employee employee2 = new Consultant();
		employee2 = new WorkExperience(new EmployeeCertification(employee2));
		
		System.out.println(employee2.getDescription() + " "+ employee2.getSalary());
				
		System.out.println("PM salary = "+ new WorkExperience(new EmployeeCertification(new Manager())).getSalary());		
	}
}
