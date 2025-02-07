package org.joonzis.ex;

import java.util.Scanner;

public class Ex01_input {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("이름 입력 >>");
		String name = sc.nextLine();
		
		System.out.println("나이 입력 >>");
		int age = sc.nextInt();
		
		System.out.println("키 입력");
		double height = sc.nextDouble();
		
		System.out.println("이름 : " + name + "\n나이 : " + age + "\n키 : " + height);
	}

}
