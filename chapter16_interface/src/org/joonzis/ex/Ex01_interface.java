package org.joonzis.ex;

interface Animal{
	public void move();
	public void eat(String food);
}
class Dog implements Animal{

	@Override
	public void move() {
		System.out.println("강아지 산책한다");
		
	}

	@Override
	public void eat(String food) {
		System.out.println(food + "먹는다");
	}
	
}

public class Ex01_interface {

	public static void main(String[] args) {
		Animal animal = new Dog();
		animal.eat("사료");
		animal.move();
	}
	
}
