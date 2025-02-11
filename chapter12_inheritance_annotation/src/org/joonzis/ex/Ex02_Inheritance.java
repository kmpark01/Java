package org.joonzis.ex;

class Person{
	void sleep() {
		System.out.println("잔다");
	}
	
	void eat(String food) {
		System.out.println(food + "먹는다");
	}
}

class Student extends Person{
	void study() {
		System.out.println("공부한다");
	}
}

class Worker extends Person{
	void work() {
		System.out.println("일한다");
	}
	
}

public class Ex02_Inheritance {

	public static void main(String[] args) {
		
		Student student = new Student();
		
		student.eat("급식 ");
		student.study();
		student.sleep();
		
		System.out.println("------------------");
		
		Worker worker = new Worker();

		worker.eat("점심 ");
		worker.work();
		worker.sleep();
		// TODO 자동 생성된 메소드 스텁

	}

}
