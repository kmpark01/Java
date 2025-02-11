package org.joonzis.test;

import java.util.Scanner;

public class Test04 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String a = null;
		
		System.out.println("문자를 하나 입력하세요");
		a = sc.nextLine();
		
		char b = a.charAt(0);
		
		System.out.println((int)b);
		
		if(Character.isUpperCase(b)) {
			System.out.println("대문자");
		}else if(Character.isLowerCase(b)) {
			System.out.println("소문자");
		}else if(Character.isDigit(b)) {
			System.out.println("아라비아 숫자");
		}else{
			System.out.println("일반문자");
		}
	}

}
