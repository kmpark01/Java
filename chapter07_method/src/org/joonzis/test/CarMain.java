package org.joonzis.test;

public class CarMain {

	public static void main(String[] args) {
		
		Car car = new Car();

		car.setFields("BMW X7", "회색");
		car.output();
		
		
		
		System.out.println("--------------------");
		
		car.setFields("K7", "검정색", 2027);
		car.output();
		// TODO 자동 생성된 메소드 스텁

	}

}
