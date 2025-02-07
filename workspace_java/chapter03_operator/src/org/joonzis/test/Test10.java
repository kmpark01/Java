package org.joonzis.test;

import java.util.Scanner;

public class Test10 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("각 자리수를 더할 숫자를 입력하세요 >>");
		int num = sc.nextInt();
		int sum = 0;
		
		while( num !=0 ) {
			sum = num % 10 + sum;
			
			num = num / 10;
		}
		
		System.out.println(sum);
		// TODO 자동 생성된 메소드 스텁

	}

}
