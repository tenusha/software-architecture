package com.sa.lab2.e2;

public class UniversityStudent implements Student {

	String fullName;
	int age;
	String contactNo;
	
	@Override
	public String getFullName() {
		return fullName;
	}

	@Override
	public int getAge() {
		return age;
	}

	@Override
	public String getContactNumber() {
		return contactNo;
	}
	
	@Override
	public void setFullName(String fullName){
		this.fullName = fullName;
	}
	
	@Override
	public void setAge(int age){
		this.age = age;
	}
	
	@Override
	public void setContactNo(String contactNo){
		this.contactNo = contactNo;
	}

}
