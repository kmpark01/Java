package org.joonzis.test;

import java.util.Scanner;

public class Test03 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("나이를 입력하세요");
		int age = sc.nextInt();
		
		if(age >= 20) {
			System.out.println("성인");
		}else if(age >= 17) {
			System.out.println("고등학생");
		}else if(age >= 14) {
			System.out.println("중학생");
		}else if(age >= 8) {
			System.out.println("초등학생");
		}else {
			System.out.println("미취학");
		}
		// TODO 자동 생성된 메소드 스텁

	}

}
