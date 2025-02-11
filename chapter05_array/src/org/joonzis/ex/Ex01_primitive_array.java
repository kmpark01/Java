package org.joonzis.ex;

import java.util.Arrays;

public class Ex01_primitive_array {

	public static void main(String[] args) {
		
		int[] arr = new int[3];
		
		int[] arr2 = {10, 20, 30};
		
		System.out.println(Arrays.toString(arr));
		
		for(int i = 0; i < 3; i++) {
			System.out.println(arr2[i]);
		}
		
		System.out.println(arr[3]);
	} 

}
