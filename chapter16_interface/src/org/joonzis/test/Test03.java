package org.joonzis.test;

class Dog implements Animal{
	@Override
	public void move() {
		System.out.println("강아지와 산책");
	}
}

public class Test03 {

	public static void main(String[] args) {
		Animal animal = new Dog();
		animal.move();
	}
}
