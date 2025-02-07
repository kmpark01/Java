package org.joonzis.ex;

public class Ex05_casting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(1 + 1.5);
		
		double a = 10;
		System.out.println(a);
		
		int b = (int)20.9;
		System.out.println(b);
		
		int c = 1;
		int d = 2;
		double e =  (double)c/d;
		System.out.println(e);
		
		int kor = 70;
		int eng = 42;
		int mat = 96;
		double result = ((double)kor + eng + mat)/3;
		
		System.out.println(result);

	}

}
