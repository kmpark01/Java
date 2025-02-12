package org.joonzis.test;

import java.util.Random;

class Student{
	private String no, name;
	private int[] scores = new int[3];
	private double avg;
	private char grade;
	public final static int COURSE_COUNT = 3;
	
	public Student(String no, String name) {
		this.no = no;
		this.name = name;
	}

	public void setScores(int[] scores) {
		this.scores = scores;
		setAvg();
		setGrade();
	}

	public void setAvg() {
		int sum = 0;
		
		for(int i = 0; i < scores.length; i++) {
			sum = sum + scores[i];
		}	
		this.avg = (double)sum / COURSE_COUNT;
	}

	public void setGrade() {
		
		if (avg >= 90) {
            this.grade = 'A';
        } else if (avg >= 80) {
            this.grade = 'B';
        } else if (avg >= 70) {
            this.grade = 'C';
        } else if (avg >= 60) {
            this.grade = 'D';
        } else {
            this.grade = 'F';
        }
	}

	@Override
	public String toString() {
		return "학번 : " + no + ", 이름 : " + name + ", 평균 : " + avg + ", 학점 : " + grade;
	}

	@Override
	public boolean equals(Object obj) {
		if(obj != null && obj instanceof Student) {
			Student another = (Student)obj;
			return no.equals(another.no);
		}else {
			return false;
		}
	}
}

public class Test04 {

	public static void main(String[] args) {
		
		Random ran = new Random();
		
		int r1 = ran.nextInt(101);
		int r2 = ran.nextInt(101);
		int r3 = ran.nextInt(101);
		
		Student std1 = new Student("1", "박경민");
		Student std2 = new Student("2", "김");
		
		std1.setScores(new int[] {10, 20, 30});
		std2.setScores(new int[] {r1, r2, r3});
		
		System.out.println(std1);
		System.out.println(std2);
		
		if(std1.equals(std2)) {
			System.out.println("같은 학생");
		}else {
			System.out.println("다른 학생");
		}
		

	}

}
