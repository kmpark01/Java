package org.joonzis.ex;

public class Ex03_Person {
	
	int age;
	String name;
	double height;
	char gender;
	
	public Ex03_Person() {}

//	풀생성자 단축키 alt + shift + s -> 필드 생성자 생성
	public Ex03_Person(int age, String name, double height, char gender) {
		super();
		this.age = age;
		this.name = name;
		this.height = height;
		this.gender = gender;
	}
	
	void output() {
		System.out.println("이름 :" + name);
		System.out.println("나이 :" + age);
		System.out.println("키 :" + height);
		System.out.println("성별 :" + gender);
	}
}
