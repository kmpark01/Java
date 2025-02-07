package org.joonzis.test;

import java.util.Scanner;

public class Test08 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("연도를 입력하세요 >>");
		int year = sc.nextInt();
		
		String isYear = (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) ? "윤년" : "평년";
		
		System.out.println("입력하신 연도는 " + isYear + " 입니다");
		// TODO 자동 생성된 메소드 스텁

	}

}
