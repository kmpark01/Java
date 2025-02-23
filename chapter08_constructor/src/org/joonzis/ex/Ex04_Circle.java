package org.joonzis.ex;

public class Ex04_Circle {
	
	int x, y;
	double radius;
	
	public Ex04_Circle() {
		//x = y = 0;
		radius = 1;
		// TODO 자동 생성된 생성자 스텁
	}

	public Ex04_Circle(double radius) {
		//x = y = 0;
		this.radius = radius;
		// TODO 자동 생성된 생성자 스텁
	}

	public Ex04_Circle(int x, int y, double radius) {
		super();
		this.x = x;
		this.y = y;
		this.radius = radius;
	}
	
	double calcArea() {
		return Math.PI*radius*radius;
	}
	
	double calcCircum() {
		return Math.PI*2*radius;
	}
	
	void output() {
		System.out.println("원의 중심 좌표 : (" + x + "," + y + ")");
		System.out.println("원의 반지름 :" + radius);
		System.out.println("원의 넓이 :" + calcArea());
		System.out.println("원의 둘레 :" + calcCircum());
	}

}
