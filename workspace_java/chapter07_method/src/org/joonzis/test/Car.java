package org.joonzis.test;

import java.util.Calendar;

public class Car {
	
	String model, color;
	int year;
	
	void setFields(String model, String color){
		this.model = model;
		this.color = color;
		
		Calendar calendar = Calendar.getInstance();
		year = calendar.get(Calendar.YEAR);
		
	}
	
	void setFields(String model, String color, int year) {
		this.model = model;
		this.color = color;
		this.year = year;
		
	}
	
	void output() {
			System.out.println("모델 :" + model);
			System.out.println("색상 :" + color);			
			System.out.println("년도 :" + year);
	}

}
