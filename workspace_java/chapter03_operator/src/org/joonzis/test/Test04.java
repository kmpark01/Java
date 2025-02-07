package org.joonzis.test;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Test04 {

	public static void main(String[] args) {
		
		int a = 0;
		
		Scanner sc = new Scanner(System.in);

		while(true) {
			try {
				System.out.println("성별을 의미하는 정수 값을 입력하세요. ex) 남자 : 1 or 3, 여자 : 2 or 4 >>");
				a = sc.nextInt();
				if(a > 0 && a < 5) {					
					break;
				}else {
					System.out.println("1~4까지 정수를 입력하세요");
				}
			}catch(InputMismatchException e) {
				System.out.println("1~4까지 정수를 입력하세요");
				e.printStackTrace();
				sc.nextLine();
			}
			
		}
		
		String gender = (a == 1 || a == 3) ? "남자" : "여자";
		System.out.println(gender);
		
		sc.close();

	}

}
