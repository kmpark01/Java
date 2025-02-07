package org.joonzis.test;

import java.util.Scanner;

public class Test05 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		/*
		System.out.println("하이픈을 제외하고 주민번호를 입력하세요. >> ");
		String jNum = sc.nextLine();
		
		String newNum = jNum.substring(6,7);
		
		System.out.println(newNum);
		
		String gender = (newNum.equals("1") || newNum.equals("3")) ? "남자" : "여자";
		System.out.println(gender);
		*/
		
		System.out.println("하이픈을 제외하고 주민번호를 입력하세요. >> ");
		long jNum = sc.nextLong();
		
		int newNum = (int)(jNum/1000000)%10;
		
		String gender = (newNum == 1 || newNum == 3) ? "남자" : "여자";
		System.out.println(gender);
		// TODO 자동 생성된 메소드 스텁

	}

}
