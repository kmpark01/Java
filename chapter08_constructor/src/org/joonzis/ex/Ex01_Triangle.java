package org.joonzis.ex;

public class Ex01_Triangle {
	
	int width, height;
	
	public Ex01_Triangle() {
		width = height = 1;
		// TODO 자동 생성된 생성자 스텁
	}
	public Ex01_Triangle(int w, int h) {
		width = w;
		height = h;
		// TODO 자동 생성된 생성자 스텁
	}
	
	double calcArea() {
		return width*height/2.0;
	}
	
	void output() {
		System.out.println("너비 :" + width);
		System.out.println("높이 :" + height);
		System.out.println("넓이 :" + calcArea());
	}
}
