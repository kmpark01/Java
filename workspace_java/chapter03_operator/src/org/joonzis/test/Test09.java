package org.joonzis.test;

import java.util.Scanner;

public class Test09 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		/*
		System.out.println("삼각형 높이의 길이를 입력하세요 >>");
		double height = sc.nextDouble();
		
		System.out.println("삼격형 밑변의 길이를 입력하세요 >>");
		double length = sc.nextDouble();
		
		double area = (height*length)/2;
		*/
		System.out.println("삼각형 높이의 길이를 입력하세요 >>");
		String height = sc.nextLine();
		
		System.out.println("삼각형 밑변의 길이를 입력하세요 >>");
		String length = sc.nextLine();
		
		double height1 = Double.parseDouble(height);
		double length1 = Double.parseDouble(length);
		
		double area = (height1*length1)/2;
		
		System.out.println("삼각형의 넓이는 " + area + " 입니다");
		// TODO 자동 생성된 메소드 스텁

	}

}
