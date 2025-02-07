package org.joonzis.test;

import java.util.Arrays;
import java.util.Scanner;

public class Test05 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int[] arr = {13, 22, -3, 92, 55, 5};
		
		int temp;
		
		System.out.println("바꿀 첫번째 인덱스를 입력하세요");
		int a = sc.nextInt();
		System.out.println("바꿀 두번째 인덱스를 입력하세요");
		int b = sc.nextInt();
		
		temp = arr[a];
		arr[a] = arr[b];
		arr[b] = temp;
		
		for(int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}

}
