package org.joonzis.ex;

class Shape{
	//의미 없는 메소드(자식 클래스에서 사용하기 위해 만듬)
	public double calcArea() {
		return 0;
	}
}

class Rect extends Shape{
	private int width, height;

	public Rect(int width, int height) {
		this.width = width;
		this.height = height;
	}

	@Override
	public double calcArea() {
		return width * height;
	}
}

class Triangle extends Shape{
	private int width, height;

	public Triangle(int width, int height) {
		this.width = width;
		this.height = height;
	}

	@Override
	public double calcArea() {
		return (width * height)/2.0;
		}
	}	


class Circle extends Shape{
	private double radius;

	public Circle(double radius) {
		this.radius = radius;
	}

	@Override
	public double calcArea() {
		return Math.PI*Math.pow(radius,2);
	}
}

public class Ex02_polymorphism {

	public static void main(String[] args) {
		
		Shape[] shape = new Shape[3];
		
		shape[0] = new Rect(5 ,5);
		shape[1] = new Triangle(3, 3);
		shape[2] = new Circle(3);
		
		for(int i = 0; i < shape.length; i++) {
			System.out.println(shape[i].calcArea());
		}
	}

}
