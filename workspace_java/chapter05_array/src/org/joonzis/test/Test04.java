package org.joonzis.test;

import java.util.Scanner;

public class Test04 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int[] arr = new int[5];
		int sum = 0;
		
		for(int i = 0; i < arr.length; i++) {
			System.out.println("배열에 넣을 값을 입력하세요");
			arr[i] = sc.nextInt();
		}
		
		for(int i = 0; i < arr.length; i++) {
			sum = sum + arr[i];
		}
		
		System.out.println(sum);
		
		// TODO 자동 생성된 메소드 스텁

	}

}
