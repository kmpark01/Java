package org.joonzis.test;

public class Circle {
	
	Coordinate center;
	double radius;
	
	public Circle(double radius, Coordinate center) {
		this.radius = radius;
		this.center = center;
		// TODO 자동 생성된 생성자 스텁
	}
	
	void output() {
		System.out.print("원 중심 :");
		center.output();
		System.out.println("반지름 :" + radius);
	}

}
