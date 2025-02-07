package org.joonzis.test;

public class StudentGradeMain {
	public static void main(String[] args) {
		
		Grade grade = new Grade(85, 90, 100);
		Student std1 = new Student("박경민", "컴퓨터공학과", grade);
		std1.output();
	}

}
