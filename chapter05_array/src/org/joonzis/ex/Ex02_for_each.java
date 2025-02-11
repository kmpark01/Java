package org.joonzis.ex;

import java.util.Arrays;
import java.util.Scanner;

public class Ex02_for_each {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int[] arr = new int[3];
		
		/*
		arr[0] = sc.nextInt();
		arr[1] = sc.nextInt();
		arr[2] = sc.nextInt();
		
		System.out.println(Arrays.toString(arr));
		
		
		for(int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		
		for(int i = 0; i < arr.length; i++) {
			
			System.out.println(arr[i]);
		}
		// TODO 자동 생성된 메소드 스텁
		*/
		
		for(int num : arr) {
			System.out.println(num);
		}
		
		int[] arr2 = new int[3];
		for(int num : arr2) {
			System.out.println("입력 >>");
			num = sc.nextInt();
		}
		for(int num : arr2) {
			System.out.println(num);
		}
	}

}
