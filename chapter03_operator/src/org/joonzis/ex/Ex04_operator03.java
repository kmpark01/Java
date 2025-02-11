package org.joonzis.ex;

import java.util.Scanner;

public class Ex04_operator03 {

	public static void main(String[] args) {
		// TODO 자동 생성된 메소드 스텁
		int a = 10;
		System.out.println(a == 10 && a < 100); //T
		System.out.println(a != 10 || a == 10); // T
		System.out.println(!(a == 10)); //F
		
		int b = 10;
		boolean result = (b++ > 10) && (a == 100);
		System.out.println("result : " + result + ", " + "b : " + b);
		
		int age = 18;
		boolean isAdult = (age >= 20) ? true : false;
		
		int fee = isAdult ? 4000 : 2000;
		System.out.println(fee);
		
		//id가 admin이면 "인증성공" 아니면 "인층실패" 출력
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("id를 입력하세요 >>");
		String id = sc.nextLine();
		
		//System.out.println(System.identityHashCode(id));
		
		String result1 = (id.equals("admin")) ? "인증성공" : "인증실패";
		//System.out.println(System.identityHashCode(result1));
		System.out.println(result1);
		
		
		/*
		String id = "admin";
		
		String isId = (id.equals("admin")) ? "인증성공" : "인증실패";
		System.out.println(isId);
		*/
		
		
		sc.close();

	}

}
