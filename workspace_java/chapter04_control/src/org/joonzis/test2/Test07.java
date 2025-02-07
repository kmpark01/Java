package org.joonzis.test2;

import java.util.Scanner;

public class Test07 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("첫 번째 정수를 입력하세요");
		int i = sc.nextInt();
		System.out.println("두 번째 정수를 입력하세요");
		int k = sc.nextInt();
		int sum = 0;
		int temp = 0;
		
		/*
		if(i < k) {
			while(i < k-1) {
				i++;
				sum = sum + i;
			}
			System.out.println(sum);
		}else {
			while(k < i-1) {
				k++;
				sum = sum + k;
			}
			System.out.println(sum);
		}
		*/
		
		if (i > k) {
			temp = i;
			i = k;
			k = temp;
		}				
		
		for(i = 0; i < k; i ++) {
				sum = sum + i;
			}
		System.out.println(sum);
		
		}
		
	}



