package org.joonzis.test;

import java.util.Scanner;

public class CircleMain {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Circle circle1, circle2, circle3;
		
		
		System.out.println("첫 번재 원의 반지름을 입력하세요 >>");
		circle1 = new Circle(sc.nextDouble());
		
		System.out.println("두 번재 원의 반지름을 입력하세요 >>");
		circle2 = new Circle(sc.nextDouble());
		
		System.out.println("세 번재 원의 반지름을 입력하세요 >>");
		circle3 = new Circle(sc.nextDouble());
		
		Circle largestCircle = circle1;
		
		if(circle2.calcArea() > largestCircle.calcArea()) {
			largestCircle = circle2;
		}
		
		if(circle3.calcArea() > largestCircle.calcArea()) {
			largestCircle = circle3;
		}
		
		System.out.println("가장 큰 원");
		largestCircle.output();

	}

}
