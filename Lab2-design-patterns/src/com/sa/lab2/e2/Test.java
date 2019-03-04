package com.sa.lab2.e2;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Test {

	public static void main(String[] args) throws ParseException {
		DateFormat df = new SimpleDateFormat("mm/dd/yyyy");
		Date dob = df.parse("21/10/1995");

		Person person = new Person("952929118V", "Tenusha", "Guruge", dob, "0777456789");

		Student student = new Adaptor(person).getStudent();

		System.out.println("Name       : " + student.getFullName());
		System.out.println("Contact No : " + student.getContactNumber());
		System.out.println("Age        : " + student.getAge());

	}
}
