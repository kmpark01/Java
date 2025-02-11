package org.joonzis.test;

import java.util.Scanner;

public class Test01 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("a값을 입력하세요 >>");
		int a = sc.nextInt();
		
		System.out.println("b값을 입력하세요 >>");
		int b = sc.nextInt();
		
		int temp;
		
		temp = a;
		a = b;
		b = temp;
		
		System.out.println("바뀐 a값은 : " + a);
		System.out.println("바뀐 b값은 : " + b);
		// TODO 자동 생성된 메소드 스텁
		sc.close();
	}

}
