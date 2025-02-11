package org.joonzis.test;

import java.util.Scanner;

public class Test08 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int[] scores = new int[5];
		int max = Integer.MIN_VALUE;
		int min = Integer.MAX_VALUE;
		int sum = 0;
		double avg = 0;
		String[] names = {"김씨", "이씨", "박씨", "최씨", "정씨"};
		
		for(int i = 0; i < scores.length; i++) {
			System.out.println(names[i] + "의 점수 입력 >>");
			for(int j = 0; j < names.length; j++) {
			}
			scores[i] = sc.nextInt();
			
			if(scores[i] > max) {
				max = scores[i];
			}
			if(scores[i] < min) {
				min = scores[i];
			}
			
			sum = sum + scores[i];
			avg = (double)sum/scores.length;
		}
		
		System.out.println(max);
		System.out.println(min);
		System.out.println(avg);
	}

}
