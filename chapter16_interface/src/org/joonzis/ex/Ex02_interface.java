package org.joonzis.ex;

interface Shape{
	public double PI = Math.PI;
	public double calcArea();
	public void output();
}

class Rect implements Shape{
	private int width, height;

	public Rect(int width, int height) {

		this.width = width;
		this.height = height;
	}

	@Override
	public double calcArea() {
		// TODO 자동 생성된 메소드 스텁
		return width * height;
	}

	@Override
	public void output() {
		System.out.println("사각형 넓이 : " + calcArea());
	}
	
}

class Circle implements Shape{
	
	private double radius;
	
	public Circle(double radius) {
		this.radius = radius;
	}

	@Override
	public double calcArea() {
		// TODO 자동 생성된 메소드 스텁
		return PI*Math.pow(radius, 2);
	}
	
	@Override
	public void output() {
		System.out.println("원의 넓이 : " + calcArea());
		
	}
}
public class Ex02_interface {

	public static void main(String[] args) {
		
		Shape[] shape = new Shape[2];
		
		shape[0] = new Rect(10, 5);
		shape[1] = new Circle(4);
		
		for(int i = 0; i < shape.length; i++) {
			shape[i].output();
		}
		// TODO 자동 생성된 메소드 스텁

	}

}
