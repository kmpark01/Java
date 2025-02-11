package org.joonzis.ex;

class Animal{
	public void move() {
		
	}
}

class Dog extends Animal{
	
	@Override
	public void move() {
		System.out.println("강아지 걷는다");
	}
	
}

class Dolphin extends Animal{
	
	@Override
	public void move() {
		System.out.println("돌고래 헤엄친다");
	}
}

class Eagle extends Animal{
	
	@Override
	public void move() {
		System.out.println("독수리 움직이고");
	}
	
	public void fly() {
		System.out.println("난다");
	}
}

public class Ex03_polymorphism {

	public static void main(String[] args) {
		
		Animal[] animal = new Animal[3];
		
		//업케스팅
		animal[0] = new Dog();
		animal[1] = new Dolphin();
		animal[2] = new Eagle();
		
		for(int i = 0; i < animal.length; i++) {
			animal[i].move();
		}

		//다운케스팅
		if(animal[2] instanceof Eagle) {
			//1. Eagle 객체 생성
			Eagle eagle = (Eagle)animal[2];
			eagle.fly();
			
			//2.객체 생성 없이 사용
			((Eagle)animal[2]).fly();
		}
		// TODO 자동 생성된 메소드 스텁

	}

}
