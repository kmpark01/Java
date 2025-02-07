package org.joonzis.test;

public class Test06 {

	public static void main(String[] args) {
		
		int[] arr = {13, 22, -3, 92, 55, 5};
		int max = 0;
		int min = 0;
		
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] > max) {
				max = arr[i];
			}
			
			if(arr[i] < min) {
				min = arr[i];
			}
		}
		
		System.out.println(max);
		System.out.println(min);
		
	}
}
