package org.joonzis.test2;

import java.util.Scanner;

public class Test02 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int num = 0;
		
		System.out.println("구구단 단 을 입력하세요");
		num = sc.nextInt();
		
		for(int i = 1; i < 10; i++) {
			System.out.println(num + "*" + i + "=" + num*i);
		}
		// TODO 자동 생성된 메소드 스텁

	}

}
