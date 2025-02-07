package org.joonzis.test;

public class Test03 {

	public static void main(String[] args) {
		
		int sum = 0;
		int[] arr = {10, 20, 50, 60, 13, 25, 97};
		
		for(int i = 0; i < arr.length; i++) {
			sum = sum + arr[i];
		}
		System.out.println(sum);

	}

}
