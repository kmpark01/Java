package org.joonzis.test;

import java.math.BigInteger;

//Q6.Test06.java
//1! ~ 99! 까지 전체 결과를 출력하시오.
//1! (1 팩토리얼) = 1
//2! (2 팩토리얼) = 1 * 2 = 2
//3! (3 팩토리얼) = 1 * 2 * 3 = 6
//4! (4 팩토리얼) = 1 * 2 * 3 * 4 = 24
//...
//n!: (n-1) * n


public class Test06 {

	public static void main(String[] args) {
		BigInteger pac = BigInteger.ONE;
		
		for(int i = 1; i < 100; i++) {
			pac = pac.multiply(BigInteger.valueOf(i));
			
			System.out.print(i + "!" + " =");
			for(int k = 1; k <= i; k++) {
				if(k > 1) {
					System.out.print(" * ");
				}
				System.out.print(k);
			}
			System.out.println(" = " + pac);
		}
	}

}
