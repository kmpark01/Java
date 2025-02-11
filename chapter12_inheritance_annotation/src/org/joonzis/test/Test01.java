package org.joonzis.test;

class Human{
	String name;
	int age;
	
	public Human(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	
	void output() {
		System.out.print("이름 : " + name +  " " + "나이 : " + age + " ");
	}
}

class Student extends Human{
	String school;
	
	public Student(String name, int age,String school) {
		super(name, age);
		this.school = school;
		// TODO 자동 생성된 생성자 스텁
	}

	@Override
	void output() {
		super.output();
		System.out.println("학교 : " + school);
	}
}

class Worker extends Human{
	String job;

	public Worker(String name, int age, String job) {
		super(name, age);
		this.job = job;
	}

	@Override
	void output() {
		super.output();
		System.out.println("직장 : " + job);
	}
}

public class Test01 {

	public static void main(String[] args) {
		
		Student std = new Student("박", 25, "가천대");
		std.output();
		
		Worker worker = new Worker("김", 40, "SK하이닉스");
		worker.output();
		// TODO 자동 생성된 메소드 스텁

	}

}