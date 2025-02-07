package org.joonzis.test;

import java.util.Calendar;

public class Car {
	
	String model, color;
	int year;
	boolean isNewCar;
	
	Calendar calendar = Calendar.getInstance();
	
	public Car() {
		model = "BMW X7";
		color = "회색";
		year = 2018;
		// TODO 자동 생성된 생성자 스텁
	}
	
	public Car(String model, String color) {
		this.model = model;
		this.color = color;
		year = 2020;
		// TODO 자동 생성된 생성자 스텁
	}
	
	public Car(String model, String color, int year) {
		super();
		this.model = model;
		this.color = color;
		this.year = year;
	}
	
	void output() {
		System.out.println("모델 :" + model);
		System.out.println("색상 :" + color);
		System.out.println("연식 :" + year);
		if(year == calendar.get(Calendar.YEAR)) {
			isNewCar = true;
		}
		System.out.println(isNewCar ? "신형" : "구형");
	}

}
