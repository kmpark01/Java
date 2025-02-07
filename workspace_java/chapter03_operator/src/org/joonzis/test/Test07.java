package org.joonzis.test;

import java.util.Scanner;

public class Test07 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("섭씨 온도를 입력하세요");
		double degree = sc.nextDouble();
		
		double fDegree = degree*9/5+32;
		
		System.out.println("화씨 온도는 :" + fDegree);
		// TODO 자동 생성된 메소드 스텁

	}

}
