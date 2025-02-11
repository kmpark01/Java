package org.joonzis.ex;

import java.util.Scanner;

public class Ex02_Student {
	
	String name, dept, score1, score2;
	double avg;
	boolean isPass;
	
	public Ex02_Student(String name, String dept) {
		this.name = name;
		this.dept = dept;
		// TODO 자동 생성된 생성자 스텁
	}
	
	void input() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("점수를 입력하세요 >>");
		score1 = sc.nextLine();
		System.out.println("점수를 입력하세요 >>");
		score2 = sc.nextLine();
		
	}
	
	private double getAverage() {
		double s1 = Double.parseDouble(score1);
		double s2 = Double.parseDouble(score2);
		avg = (s1 + s2)/2;
		return avg;
	}
	
	private boolean isPass() {
		if(getAverage() >= 80) {
			isPass = true;
		}
		return isPass;
	}
	
	void output() {
		System.out.println("이름 : " + name);
		System.out.println("학과 : " + dept);
		System.out.println("평균 : " + getAverage());
		System.out.println(isPass() ? "합격" : "불합격");
	}

}