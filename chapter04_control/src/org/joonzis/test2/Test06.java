package org.joonzis.test2;

import java.util.Scanner;

public class Test06 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int i = 0;
		int sum = 0;
	
		
		while(true) {
			System.out.println("2이상의 양의 정수를 입력하세요");
			i = sc.nextInt();
			
			if(i >= 2){
				for(int k = 1; k < i; k++) {
					sum = sum + k;					
				}
				System.out.println(sum);
				break;
			}else {
				System.out.println("다시 입력하세요");
			}
		}
	}

}
