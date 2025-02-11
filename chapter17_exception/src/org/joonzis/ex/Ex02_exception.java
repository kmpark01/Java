package org.joonzis.ex;

import java.util.Arrays;

public class Ex02_exception {

	public static void main(String[] args) {
		
		int k = 1;
		
		int[] arr = new int[3];
		
		
		try {
			for(int i = 0; i < arr.length; i++) {
				arr[i] = k;
				k++;
			}
			
			System.out.println(Arrays.toString(arr));
			
			arr[3] = 3;
		} catch (ArrayIndexOutOfBoundsException e) {
			e.printStackTrace();
			System.out.println("인덱스 범위를 벗어났습니다");
		}
	}

}
