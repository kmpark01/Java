package org.joonzis.ex;

public class Ex02_ManMain {

	public static void main(String[] args) {
		
		Ex02_Man man = new Ex02_Man("박경민", 26);
		man.output();
		
		System.out.println(man.name);
		System.out.println(man.age);
		System.out.println(man.GENDER);
		System.out.println(Ex02_Man.GENDER);
		// TODO 자동 생성된 메소드 스텁

	}

}
