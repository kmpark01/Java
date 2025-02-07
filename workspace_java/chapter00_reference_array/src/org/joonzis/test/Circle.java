package org.joonzis.test;

public class Circle {
	double radius;

	public Circle(double radius) {
		super();
		this.radius = radius;
	}
	
	double calcArea() {
		return Math.PI*Math.pow(radius, 2);
	}
	
	void output() {
		System.out.println("반지름 : " + radius);
		System.out.println("크기 : " + calcArea());
	}
}
