package org.joonzis.ex;

public class Ex04_operator {

	public static void main(String[] args) {
		// TODO 자동 생성된 메소드 스텁
		int a = 10;
		System.out.println(a == 10 && a < 100);
		System.out.println(a != 10 || a == 10);
		System.out.println(!(a == 10));
		
		int b = 10;
		boolean result = (a == 100) && (++b > 10);
		System.out.println("result : " + result + ", " + "b : " + b);
		
		int age = 18;
		boolean isAdult = (age >= 20) ? true : false;
		System.out.println(isAdult);

	}

}
