package org.joonzis.test;

import java.util.Scanner;

public class Test01 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("정수를 입력하세요");
		int num = sc.nextInt();
		
		if(num % 2 == 0) {
			if(num % 3 ==0) {
				System.out.println("3의 배수");
			} else {
				System.out.println("짝수");
			}
		}else {
			if(num % 3 == 0) {
				System.out.println("3의 배수");
			}else {	
				System.out.println("홀수");
			}
		}
		// TODO 자동 생성된 메소드 스텁

	}

}
