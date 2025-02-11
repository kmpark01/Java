package org.joonzis.ex;

class Person{
	String food;
	public void eat(String food) {
			System.out.println(food + "먹는다");
		}
	
	public void sleep() {
		System.out.println("잔다.");
	}
}

class Student extends Person{
	public void study() {
		System.out.println("공부한다");
	}
	}

class Worker extends Person{
	public void work() {
		System.out.println("일한다");
	}
}

public class Ex04_polymorphism {

	public static void main(String[] args) {
		
		Person[] person = new Person[2];
		
		person[0] = new Student();
		person[1] = new Worker();
		
		for(int i = 0; i < person.length; i++) {
			person[i].eat("밥");
			person[i].sleep();
		}
		
		if(person[0] instanceof Student) {
			Student std = (Student)person[0];
			std.study();
		}
		
		if(person[1] instanceof Worker) {
			Worker worker = new Worker(); 				
			worker.work();	
		}
	}

}
