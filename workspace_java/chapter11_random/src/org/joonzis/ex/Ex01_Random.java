package org.joonzis.ex;

import java.util.Random;

public class Ex01_Random {

	public static void main(String[] args) {
		
		//Random클래스
		Random ran = new Random();
		
		//int 범위 내 랜덤 수
		System.out.println(ran.nextInt());
		//0~9
		System.out.println(ran.nextInt(10));
		//0~5
		System.out.println(ran.nextInt(6));
		//1~6
		System.out.println(ran.nextInt(6)+1);
		//0~0.999
		System.out.println(ran.nextDouble());
		//0~9.999
		System.out.println(ran.nextDouble()*10);
		//0~9
		System.out.println((int)(ran.nextDouble()*10));
		//1~6
		System.out.println((int)(ran.nextDouble()*6) + 1);
		
		
		//Math클래스
		int rnd = ((int)(Math.random()*6) + 1);
		System.out.println(rnd);

	}

}
