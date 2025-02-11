package org.joonzis.ex;

import java.util.Scanner;

public class Ex05_Book {
	
	String title, writer;
	int price, salesVolume;
	boolean isBestSeller;
	
	public Ex05_Book() {
		title = "해리포터";
		writer = "J.K 롤링";
		price = 15000;
	}
	
	public Ex05_Book(String title, int price) {
		this.title = title;
		this.price = price;
		writer = "작자 미상";
		// TODO 자동 생성된 생성자 스텁
	}
	
	public Ex05_Book(String title, String writer, int price) {
		super();
		this.title = title;
		this.writer = writer;
		this.price = price;
	}
	
	void setSalesVolume() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("판매량을 입력하세요 >>");
		salesVolume = sc.nextInt();
		
		if(salesVolume >= 1000) {
			isBestSeller = true;
		}
		
		sc.close();
	}
	
	void output() {
		System.out.println("제목 :" + title);
		System.out.println("저자 :" + writer);
		System.out.println("가격 :" + price);
		System.out.println("판매량 :" + salesVolume);
		System.out.println(isBestSeller ? "베스트셀러" : "일반도서");
//		제목 저자 가격 판매량 베스트 셀러 유무
	}

}
