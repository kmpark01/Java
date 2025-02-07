package org.joonzis.ex;

public class Ex06_parsing {

	public static void main(String[] args) {
		
		String strAge = "20";
		String strHeight = "180.5";
		
		int age = Integer.parseInt(strAge);
		double height = Double.parseDouble(strHeight);
		
		System.out.println("나이 : " + (age + 1) + "," + "키 : " + height);
		
		String s1 = "aaa";
		String s2 = s1;
		String s3 = new String("aaa");
		
		if(s1.equals(s2)) {
			System.out.println(true);
		} else {
			System.out.println(false);
		}
		
	
		for (int a = 1; a < 10; a++) {
			int sum = 0;
			sum = a + a;
			System.out.println(sum);
		}
		
		// TODO 자동 생성된 메소드 스텁

	}

}
