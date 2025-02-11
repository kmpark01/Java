package org.joonzis.test;

import java.util.Scanner;

public class Test03 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("매출액을 입력하세요 >>");
		double tPrice = sc.nextInt();
		sc.nextLine();
		
		System.out.println("등급을 입력하세요 >>");
		String state = sc.nextLine();
		
		if(state.equals("VIP")){
			System.out.println("할인된 가격은" + tPrice*0.8);
		} else if(state.equals("일반")) {
			System.out.println("할인된 가격은" + tPrice*0.95);
		} else {
			System.out.println("잘못된 입력입니다");
		}// TODO 자동 생성된 메소드 스텁
		sc.close();
	}

}
