package org.joonzis.test;

import java.util.Scanner;

class Triangle{
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
		System.out.println("넓이 : " + calcArea());
	}
	
	double calcArea() {
		return (width*height)/2;
	}
}

public class TriangleMain {

	public static void main(String[] args) {
		
		Triangle triangle = new Triangle();
		
		triangle.init();
		triangle.info();
	}

}
