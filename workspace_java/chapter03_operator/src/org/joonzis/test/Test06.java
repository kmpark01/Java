package org.joonzis.test;

import java.util.Scanner;

public class Test06 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("키를 입력하세요 >> ex) 1.78");
		double height = sc.nextDouble();
		
		System.out.println("몸무게를 입력하세요 >>");
		double weight = sc.nextDouble();
		
		double bmi = (weight/(height*height));
		
		if(bmi >= 25) {
			System.out.println("bmi : " + bmi + " 과체중");
		} else if(bmi < 25 && bmi >= 20) {
			System.out.println("bmi : " + bmi + " 정상");
		} else {
			System.out.println("bmi : " + bmi + " 저체중");
		}
		

	}

}
