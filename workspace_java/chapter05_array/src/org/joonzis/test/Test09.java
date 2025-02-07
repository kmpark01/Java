package org.joonzis.test;

import java.util.Scanner;

public class Test09 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String[] subjectArr = {"Java", "Python", "Android", "JSP", "Javascript"};
		String str;
		int scoreArr[] = {95, 88, 78, 62, 55};
		
		
		while(true) {
			System.out.println("과목명 >>");
			str = sc.nextLine();
			
			if(str.equals("그만")) {
				break;
			}
			for(int i = 0; i < subjectArr.length; i++) {
				if(str.equals(subjectArr[i])) {
					System.out.println(subjectArr[i] + "의 점수는 :" + scoreArr[i]);
				}
			}
		}
		
	}

}


