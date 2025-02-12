package org.joonzis.test;

import java.util.Scanner;

//Q5.Test05.java
//성(lastName), 이름(firstName)을 각각 입력 받아
//하나의 이름(fullName)을 완성하시오. StringBuffer 클래스를 이용하시오.
//위의 방식으로 두 이름을 입력 받아 두 이름(fullName)의 동등 비교를 진행하시오.

public class Test05 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("첫번째 성을 입력하세요");
		String firstName1 = sc.nextLine();
		System.out.println("첫번째 이름을 입력하세요");
		String lastName1 = sc.nextLine();
		System.out.println("두번째 성을 입력하세요");
		String firstName2 = sc.nextLine();
		System.out.println("두번째 이름을 입력하세요");
		String lastName2 = sc.nextLine();
		
		StringBuffer fullName1 = new StringBuffer();
		StringBuffer fullName2 = new StringBuffer();
		
		fullName1.append(firstName1).append(lastName1);
		fullName2.append(firstName2).append(lastName2);
		
		System.out.println(fullName1.toString());
		System.out.println(fullName2.toString());
		
		if(fullName1.toString().equals(fullName2.toString())) {
			System.out.println("같다");
		}else {
			System.out.println("다르다");
		}
		
		sc.close();
	}

}
