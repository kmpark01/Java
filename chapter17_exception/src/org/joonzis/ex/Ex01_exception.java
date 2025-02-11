package org.joonzis.ex;

import java.util.Scanner;

public class Ex01_exception {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int num1, num2;
		
		System.out.println("정수 1 입력 : ");
		num1 = sc.nextInt();
		
		System.out.println("정수 2 입력 : ");
		num2 = sc.nextInt();
		
		System.out.println("덧셈 결과 : " + (num1 + num2));
		System.out.println("뺄셈 결과 : " + (num1 - num2));
		System.out.println("곱셈 결과 : " + (num1 * num2));
		System.out.println("나눗셈 결과 : " + (num1 / num2));
		
		
		// TODO 자동 생성된 메소드 스텁

	}

}
