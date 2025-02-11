package org.joonzis.ex;

public class Ex06_parsing {

	public static void main(String[] args) {
		String strAge = "20";
		String strHeight = "180.5";
		
		int age = Integer.parseInt(strAge);
		double height = Double.parseDouble(strHeight);
		
		System.out.println("나이 :" + (age + 1) + ", " + "키 :" + height);
		
		// TODO 자동 생성된 메소드 스텁
		
		String s1 = "aaa";
		String s2 = s1;
		String s3 = new String("aaa");
		
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		
		int a = 1;
		int b = 2;
		
		if(s1.equals(s3)) {
			System.out.println(true);
		} else {
			System.out.println(false);
		}

	}

}
