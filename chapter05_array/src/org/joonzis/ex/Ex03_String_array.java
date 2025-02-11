package org.joonzis.ex;

import java.util.Scanner;

public class Ex03_String_array {

	public static void main(String[] args) {
		
		String[] names = new String[3];
		
		Scanner sc = new Scanner(System.in);
		
		//일반for문
		for(int i = 0; i < names.length; i++) {
			System.out.println((i+1) + "번 째 이름 입력 >> ");
			names[i] = sc.nextLine();
		}
		
		
		for (int i = 0; i < names.length; i++) {
			System.out.println(names[i]);
		}
		
		//향상 for문
		for(String name : names) {
			System.out.println("입력한 이름 : " + name);
		}

	}

}
