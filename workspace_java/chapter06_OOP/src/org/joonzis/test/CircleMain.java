package org.joonzis.test;

import java.util.Scanner;

class Circle{
	int radius;
	//double PI;
	String name;
	
	void info() {
		System.out.println("반지름 :" + radius);
		System.out.println("이름 :" + name);
		System.out.println("크기 :" + Math.PI*radius*radius );
		System.out.println("둘레 :" + 2*Math.PI*radius );
	}
	
}
public class CircleMain {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Circle circle = new Circle();
		
		//circle.PI = 3.14;
		System.out.println("반지름을 입력하세요 >>");
		circle.radius = sc.nextInt();
		sc.nextLine();
		System.out.println("이름을 입력하세요 >>");
		circle.name = sc.nextLine();
		
		circle.info();
		// TODO 자동 생성된 메소드 스텁

	}

}
