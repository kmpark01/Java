package org.joonzis.test;

import java.util.Scanner;

public class Test02 {

	public static void main(String[] args) {
		
		int age = 0;
		
		Scanner sc = new Scanner(System.in);
		
		do {
			System.out.println("나이를 입력하세요 >>");
			age = sc.nextInt();
			
			if(age > 0) {
				String isAdult = (age >= 20) ? "성인" : "미성년자";
				System.out.println(isAdult);
			} else {
				System.out.println("잘못된 입력입니다");
			}
		} while (age < 0);
		
		// TODO 자동 생성된 메소드 스텁

	}

}
