package org.joonzis.test;

class Coordinate{
	int x, y;
	
	public Coordinate(int x, int y) {

		this.x = x;
		this.y = y;
	}

	@Override
	public boolean equals(Object obj) {
		if(obj != null && obj instanceof Coordinate) {
			Coordinate another = (Coordinate)obj;
			return x == another.x && y == another.y;
		}else {
			return false;
		}
	}
}

class Circle{
	Coordinate center;
	double radius;
	public Circle(int x, int y, double radius) {
		this.center = new Coordinate(x, y);
		this.radius = radius;
	}
	@Override
	public boolean equals(Object obj) {
		if(obj != null && obj instanceof Circle) {
			Circle another = (Circle)obj;
			return center.equals(another.center) && radius == another.radius;
		}else {
			return false;
		}

	}
}

public class Test03 {

	public static void main(String[] args) {
		
		Circle circle = new Circle(0, 0, 1.5);
		Circle circle2 = new Circle(0, 0, 1.5);
		Circle circle3 = new Circle(0, 0, 1.0);
		
		System.out.println(circle.equals(circle2));
		System.out.println(circle.equals(circle3));
	}

}
