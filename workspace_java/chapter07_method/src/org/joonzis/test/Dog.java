package org.joonzis.test;

public class Dog {
	String name, breed;
	int age;
	
	void setDog(String name, int age){
		setDog(name, age, "푸들");
//		this.name = name;
//		this.age = age;
//		this.breed = "푸들";
	}
	
	void setDog(String name, int age, String breed) {
		this.name = name;
		this.age = age;
		this.breed = breed;
	}
	
	void info() {
		System.out.println("이름 :" + name);
		System.out.println("나이 :" + age);
		System.out.println("품종 :" + breed);
	}
}
