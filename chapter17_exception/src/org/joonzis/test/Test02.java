package org.joonzis.test;

import java.util.Scanner;

class AgeInput{
	Scanner sc;
	int age;
	
	int getAge() {
		sc = new Scanner(System.in);
		System.out.println("나이를 입력하세요 >");
		age = sc.nextInt();
		
		return age;
	}
	
	/*
	public void input() {
		sc = new Scanner(System.in);
		System.out.println("나이를 입력하세요 >");
		age = sc.nextInt();
	}
	*/
	
	public void ageMatch() throws AgeException {
		if(age < 0 || age > 150) {
			throw new AgeException("나이는 0~150입니다");
		}
	}
}

class AgeException extends Exception{
	private static final long serialVersionUID = 1L;
	public AgeException(String msg) {
		super(msg);
	}
}

public class Test02 {

	public static void main(String[] args) {
		
		AgeInput age = new AgeInput();
		
		try {
			age.getAge();
			age.ageMatch();
			System.out.println(age.age);
		} catch (AgeException e) {
			System.out.println("에러 메세지 :" + e.getMessage());
		}
		// TODO 자동 생성된 메소드 스텁

	}

}
