package org.joonzis.test;

import java.util.Scanner;

public class Test02 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		double score1;
		double score2;
		
		System.out.println("필기 점수를 입력하세요");
		score1 = sc.nextDouble();
		
		System.out.println("실기 점수를 입력하세요");
		score2 = sc.nextDouble();
		
		double sum = score1 + score2;
		double avg = (score1 + score2)/2;
		
		
		if(avg >= 80) {
			System.out.println("합격");
		}else if(score1 >= 70 && score2 >= 70){
			System.out.println("합격");
		}else {
			System.out.println("불합격");
		}
	}

}
