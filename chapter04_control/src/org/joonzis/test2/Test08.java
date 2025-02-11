package org.joonzis.test2;

import java.util.Scanner;

public class Test08 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int count = 0;
		
		System.out.println("1~100사이의 숫자를 입력하세요");
		int i = sc.nextInt();
		
		while(true) {
			System.out.println("정답을 입력하세요");
			int answer = sc.nextInt();
			if (answer > i) {
				System.out.println("Donw!");
				count++;
			}else if(answer < i) {
				System.out.println("Up!");
				count++;
			}else {
				System.out.println("Answer!");
				System.out.println(count + "번 만에 맞았습니다.");
				break;
			}
		}

	}

}
