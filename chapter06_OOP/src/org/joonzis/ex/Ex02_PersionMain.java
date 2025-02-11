package org.joonzis.ex;

class Person{
	char gender;
	int age;
	double height;
	String name;
	
	void info() {
		System.out.println("성별 : " + gender);
		System.out.println("나이 : " + age);
		System.out.println("키 : " + height);
		System.out.println("이름 : " + name);
	}
}

public class Ex02_PersionMain {

	public static void main(String[] args) {
		
		Person person = new Person();
		Person person2 = new Person();
		
		person.gender = '남';
		person.age = 27;
		person.height = 178;
		person.name = "박경민";
		
		person2.gender = '여';
		person2.age = 21;
		person2.height = 160;
		person2.name = "ㅇ";
		
		person.info();
		person2.info();
		
		System.out.println(person);
	}

}
