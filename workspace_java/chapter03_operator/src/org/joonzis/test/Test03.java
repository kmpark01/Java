package org.joonzis.test;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Test03 {

	public static void main(String[] args) {
		
		double tPrice = 0;
		String state = null;
		
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			try {
				System.out.println("매출액을 입력하세요 >>");
				tPrice = sc.nextInt();				
				sc.nextLine();
				break;
			}catch(InputMismatchException e) {
				System.out.println("잘못된 입력입닌다. 숫자만 입력하세요");
				e.printStackTrace();
				sc.nextLine();
			}		
		}
		
		while(true) {
				System.out.println("등급을 입력하세요 >>");
				state = sc.nextLine();
				
				if (state.equalsIgnoreCase("VIP") || state.equals("일반")) {
					break;
				}else {
					System.out.println("잘못된 입력입니다. 'VIP' 또는 '일반'만 입력해 주세요");
				}
			}
		if(state.equals("VIP")){
			System.out.println("할인된 가격은" + tPrice*0.8);
		} else {
			System.out.println("할인된 가격은" + tPrice*0.95);
		}
		
		sc.close();
	}
}

