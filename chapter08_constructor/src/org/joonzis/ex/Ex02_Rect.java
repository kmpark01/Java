package org.joonzis.ex;

public class Ex02_Rect {
	
	int width, height;
	boolean isSquare;
	
	public Ex02_Rect() {
		width = height = 1;
		// TODO 자동 생성된 생성자 스텁
	}

	public Ex02_Rect(int side) {
		width = side;
		height = side;
		// TODO 자동 생성된 생성자 스텁
	}
	
	public Ex02_Rect(int w, int h) {
		width = w;
		height = h;
		// TODO 자동 생성된 생성자 스텁
	}
	
	int calcArea() {
		return width*height;
	}
	
	void output() {
		if(width == height) {
			isSquare = true;
		}
		System.out.println("너비 :" + width);
		System.out.println("높이 :" + height);
		System.out.println("넓이 :" + calcArea());
		System.out.println(isSquare ? "정사각형" : "직사각형");
	}
}
