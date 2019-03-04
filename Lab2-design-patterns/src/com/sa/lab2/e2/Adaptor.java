package com.sa.lab2.e2;

import java.util.Calendar;
import java.util.Locale;
import static java.util.Calendar.*;
import java.util.Date;

public class Adaptor {
	
	Student student;
	
	public Adaptor(Person person){
		student = new UniversityStudent();
		student.setFullName(person.getFirstName()+" "+person.getLastName());
		student.setContactNo(person.getContacyNo());
		student.setAge(getDiffYears(person.getDOB(), new Date()));
	}
	
	Student getStudent(){
		return student;
	}
	
	public static int getDiffYears(Date first, Date last) {
	    Calendar a = getCalendar(first);
	    Calendar b = getCalendar(last);
	    int diff = b.get(YEAR) - a.get(YEAR);
	    if (a.get(MONTH) > b.get(MONTH) || 
	        (a.get(MONTH) == b.get(MONTH) && a.get(DATE) > b.get(DATE))) {
	        diff--;
	    }
	    return diff;
	}

	public static Calendar getCalendar(Date date) {
	    Calendar cal = Calendar.getInstance(Locale.US);
	    cal.setTime(date);
	    return cal;
	}
	
}
