package org.joonzis.test;

import java.util.Scanner;

class Rect{
	
	Scanner sc = new Scanner(System.in);
	double width;
	double height;
	
	void init() {
		System.out.println("너비를 입력하세요 >>");
		width = sc.nextDouble();
		System.out.println("높이를 입력하세요 >>");
		height = sc.nextDouble();
		
	}
	
	void info() {
		System.out.println("너비 :" + width);
		System.out.println("높이 :" + height);
	}
	
	void calcArea() {
		System.out.println("사각형의 넓이는 : " + width*height);
	}
}

public class RectMain {

	public static void main(String[] args) {
		
		Rect rect = new Rect();
		
		rect.init();
		rect.info();
		rect.calcArea();
		
		// TODO 자동 생성된 메소드 스텁

	}

}
