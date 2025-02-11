package org.joonzis.ex;

class Animal{
	String name;
	public Animal() {
		// TODO 자동 생성된 생성자 스텁
	}
	
	public Animal(String name) {
		this.name = name;
		// TODO 자동 생성된 생성자 스텁
	}
	
}

class Dog extends Animal{
	String personName;
	public Dog() {
		// TODO 자동 생성된 생성자 스텁
	}

	public Dog(String personName) {
		super();
		this.personName = personName;
		// TODO 자동 생성된 생성자 스텁
	}

	public Dog(String personName, String name) {
		super(name);
		this.personName = personName;
		// TODO 자동 생성된 생성자 스텁
	}
	
	void whoAmI() {
		System.out.println("내 이름은 " + name + "이고 , 주인은 " + personName + "입니다");
	}
	
}
public class Ex04_Constructor {

	public static void main(String[] args) {
		
		Dog dog1 = new Dog();
		dog1.whoAmI();
		
		Dog dog2 = new Dog("김씨");
		dog2.whoAmI();
		
		Dog dog3 = new Dog("이씨", "푸들");
		dog3.whoAmI();
		
		// TODO 자동 생성된 메소드 스텁

	}

}
