package org.joonzis.test;

public class CarMain {

	public static void main(String[] args) {
		
		Car car1 = new Car();
		car1.output();
		
		System.out.println("---------------------");
		
		Car car2 = new Car("K7", "흰색");
		car2.output();

		System.out.println("---------------------");
		
		Car car3 = new Car("소나타", "회색", 2025);
		car3.output();
		// TODO 자동 생성된 메소드 스텁

	}

}
