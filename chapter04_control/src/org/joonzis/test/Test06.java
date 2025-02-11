package org.joonzis.test;

import java.util.Scanner;

public class Test06 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int a = 0;
		
		System.out.println("권한 번호를 입력하세요");
		a = sc.nextInt();
		
		/*
		switch(a) {
		case 1 :
			System.out.println("읽기");
			break;
			
		case 2 : 
			System.out.println("쓰기, 읽기");
			break;
			
		case 3 :
			System.out.println("실행, 쓰기, 읽기");
		}
		*/
		
		switch(a) {
		case 3 : System.out.print("실행, ");
		case 2 : System.out.print("쓰기, ");
		case 1 : System.out.println(("읽기"));
		}
		// TODO 자동 생성된 메소드 스텁

	}

}
