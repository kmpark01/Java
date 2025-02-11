package org.joonzis.test;

import java.util.Scanner;

public class Test06 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("키를 입력하세요 >> ex) 1.78m");
		double height = sc.nextDouble();
		
		System.out.println("몸무게를 입력하세요 >>");
		double weight = sc.nextDouble();
		
		double bmi = weight/(Math.pow(height,2));
		
		if(bmi >= 25) {
			System.out.println("bmi : " + bmi + " 과체중");
		} else if(bmi >= 20) {
			System.out.println("bmi : " + bmi + " 정상");
		} else {
			System.out.println("bmi : " + bmi + " 저체중");
		}
		
		sc.close();
	}

}
