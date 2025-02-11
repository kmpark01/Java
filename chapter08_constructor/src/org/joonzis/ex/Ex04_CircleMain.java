package org.joonzis.ex;

public class Ex04_CircleMain {

	public static void main(String[] args) {
		
		Ex04_Circle cir1 = new Ex04_Circle();
		cir1.output();
		
		System.out.println("------------------");
		
		Ex04_Circle cir2 = new Ex04_Circle(5);
		cir2.output();
		
		System.out.println("------------------");
		
		Ex04_Circle cir3 = new Ex04_Circle(4, 1, 4);
		cir3.output();
		
		// TODO 자동 생성된 메소드 스텁

	}

}
