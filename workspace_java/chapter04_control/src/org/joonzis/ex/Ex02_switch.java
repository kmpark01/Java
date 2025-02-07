package org.joonzis.ex;

import java.util.Scanner;

public class Ex02_switch {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("성별을 입력하세요 >>");
		String gender = sc.nextLine();
		
		if(gender.equals("남")) {
			System.out.println("남자");
		}else {
			System.out.println("여자");
		}
		
		switch(gender) {
		
		case "남" : System.out.println("남자");
		break;
		
		case "여" : System.out.println("여자");
		break;
		}

	}

}
