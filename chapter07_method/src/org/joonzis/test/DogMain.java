package org.joonzis.test;

public class DogMain {

	public static void main(String[] args) {
		
		Dog dog = new Dog();
		
		dog.setDog("쿠키", 4);
		dog.info();
		
		System.out.println("---------------");
		
		dog.setDog("두부", 3, "비숑");
		dog.info();
		// TODO 자동 생성된 메소드 스텁

	}

}
