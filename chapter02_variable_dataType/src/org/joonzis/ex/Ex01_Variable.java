package org.joonzis.ex;

public class Ex01_Variable {
	public static void main(String[] args) {
		
		// 주석 : 실행과 상관없이 코드에 설명을 붙이는 것
		// 1. // : // 이후 라인 끝까지 주석으로 인지
		// 2. /**/ : 사이에 있는 모든 범위를 주석으로 인지
		
		// 1. 변수 선언( 선언과 초기화 동시 진행 )
		int num = 0;
		float num2 = 0f;
		double num3 = 0;
		char ch = 0;
		char ch2 = 'a';
		int ch3 = 'a';
		String str1 = null;
		String str2 = "hi";
		
		System.out.println(num);
		System.out.println(num2);
		System.out.println(num3);
		System.out.println(ch);
		System.out.println(ch2);
		System.out.println(ch3);
		System.out.println(str1);
		System.out.println(str2);
		
		num = 100;
		num2 = 1.5f;
		num3 = 1.5;
		ch = '한';
		str1 = "Hello";
		str2 = "Java";
		
		System.out.println(num);
		System.out.println(num2);
		System.out.println(num3);
		System.out.println(ch);
		System.out.println(str1);
		System.out.println(str2);
		
		//char k = 65;
		
		System.out.println("Hello" + " Java");
		
		
		//3. 스포크 (범위)
		// 1) 지역변수 : 코드블록 {} 내에서만 접근 가능, 벗어나면 소멸
		// 2) 전역변수 : 모든 지역에서 사용 가능
		
		{
			int a = 10;
			System.out.println("코드 내 a = " + a);
		}
		
		// 이미 블록 범위 안에 있는 변수가 소멸되어씩 때문에 접근 불가
//		System.out.println("코드 내 a = " + a);
				
	}

}





