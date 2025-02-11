package org.joonzis.test;

import java.util.Scanner;

public class Test05 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String str = null;
		
		System.out.println("알파벳을 하나 입력하세요");
		str = sc.nextLine();
		
		char a = str.charAt(0);
		
		if(Character.isUpperCase(a)) {
			System.out.println(Character.toLowerCase(a));
		}else if(Character.isLowerCase(a)) {
			System.out.println(Character.toUpperCase(a));
		}else {
			System.out.println(str);
		}
		// TODO 자동 생성된 메소드 스텁

	}

}
