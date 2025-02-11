package org.joonzis.ex;

import java.util.Scanner;

public class Ex06_break {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String id = null;
		
		
		while(true) {
			System.out.println("id를 입력하세요 >> ");
			id = sc.nextLine();
			
			if(id.equals("admin")) {
				System.out.println("id 일치");
				break;
			}else {
				System.out.println("다시 입력하세요");
			}
		}
		
		sc.close();
	}

}
