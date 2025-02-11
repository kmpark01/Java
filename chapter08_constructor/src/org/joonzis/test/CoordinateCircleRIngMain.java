package org.joonzis.test;

public class CoordinateCircleRIngMain {

	public static void main(String[] args) {
		
		Coordinate c1 = new Coordinate(3,3);
		Coordinate c2 = new Coordinate(3,8);
		
		Circle innerCircle = new Circle(2.0, c1);
		Circle outerCircle = new Circle(7.0, c2);
		
		Ring ring = new Ring(innerCircle, outerCircle);
		
		ring.output();
		// TODO 자동 생성된 메소드 스텁

	}

}
