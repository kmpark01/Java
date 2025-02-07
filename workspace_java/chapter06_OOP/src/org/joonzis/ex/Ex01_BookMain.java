package org.joonzis.ex;

import java.util.Scanner;

public class Ex01_BookMain {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Ex01_Book book = new Ex01_Book();
		
		System.out.println("책 제목 : ");
		book.title = sc.nextLine();
		System.out.println("책 저자 : ");
		book.writer = sc.nextLine();
		System.out.println("책 가격 : ");
		book.price = sc.nextInt();
		
		if(book.price >= 15000) {
			book.isBestSeller = true;
		}
		
		book.info();
		
		Ex01_Book book2 = new  Ex01_Book();
		
		book2.title = "백설공주";
		
		book2.info();
		
		System.out.println(book2);
		
		// TODO 자동 생성된 메소드 스텁

	}

}
