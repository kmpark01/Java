package org.joonzis.test;

import java.util.Scanner;

public class Test04 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("성별을 의미하는 정수 값을 입력하세요. ex) 남자 : 1 or 3, 여자 : 2 or 4 >>");
		int a = sc.nextInt();
		
		System.out.println(a);
		
		if(a < 5) {
			String gender = (a == 1 || a == 3) ? "남자" : "여자";
			System.out.println(gender);
		} else {
			System.out.println("잘못된 입력입니다");
		}
		
		// TODO 자동 생성된 메소드 스텁
		sc.close();
	}

}
