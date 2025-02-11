package org.joonzis.test;

import java.util.Random;
import java.util.Scanner;

class Divied{
	
	int k;
	int divNum;
	int ranNum;
	Scanner sc;
	Random ran;
	
	public void scan() throws LowNumException {
		sc = new Scanner(System.in);
		System.out.println("정수를 입력하세요 >>");
		k = sc.nextInt();	
		
		if(k < 10) {
			throw new LowNumException("10 이상의 정수를 입력하세요");
		}
	}
	
	public void diviedNum() throws DiviedException {
		ran = new Random();
		ranNum = ran.nextInt(10);
		
		if(ranNum == 0) {
			throw new DiviedException("0으로 나눌 수 없습니다");
		}
		divNum = k / ranNum;
	}
}

class LowNumException extends Exception{
	private static final long serialVersionUID = 1L;
	public LowNumException(String msg) {
		super(msg);
	}
	
}

class DiviedException extends Exception{
	private static final long serialVersionUID = 1L;
	public DiviedException(String msg) {
		super(msg);
	}
	
}


public class Test01 {

	public static void main(String[] args) {
		Divied divied = new Divied();
		
		try {
			divied.scan();
			divied.diviedNum();
			System.out.println("입력한 정수 : " + divied.k);
			System.out.println("랜덤 생성된 정수 : " +divied.ranNum);
			System.out.println("나눈 몫 : " + divied.divNum);
		} catch (LowNumException e) {
			System.out.println("에러 메세지 : " + e.getMessage());
		} catch (DiviedException e) {
			System.out.println("에러 메세지 : " + e.getMessage());			
		}

	}

}
