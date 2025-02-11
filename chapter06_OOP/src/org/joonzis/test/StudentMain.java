package org.joonzis.test;

import java.util.Scanner;

class Student{
	
	Scanner sc = new Scanner(System.in);
	
	String name;
	String dept;
	String score1;
	String score2;
	double average;
	boolean isPass;
	
	void input() {
		System.out.println("이름을 입력하세요 : ");
		name = sc.nextLine();
		System.out.println("부서를 입력하세요 : ");
		dept = sc.nextLine();
		System.out.println("점수를 입력하세요 : ");
		score1 = sc.nextLine();		
		System.out.println("점수를 입력하세요 : ");
		score2 = sc.nextLine();
		
		double s1 = Double.parseDouble(score1);
		double s2 = Double.parseDouble(score2);
		
		average = (s1 + s2)/2;
		
		if(average >= 80) {
			isPass = true;
		}
		
	}
	
	void output() {
		System.out.println("이름 :" + name);
		System.out.println("학과 :" + dept);
		System.out.println("평균 :" + average);
		System.out.println(isPass ? "합격" : "불합격");
	}
}

public class StudentMain {

	public static void main(String[] args) {
		
		Student student = new Student();
		
		student.input();
		student.output();
	}

}
