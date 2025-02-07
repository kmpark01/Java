package org.joonzis.test;

public class Grade {
	
	int kor, eng, mat;
	double avg;
	char grade;

	public Grade(int kor, int eng, int mat) {
		super();
		this.kor = kor;
		this.eng = eng;
		this.mat = mat;
	}
	
	double getAverage() {
		avg = (kor + eng + mat)/3;
		return avg;
	}
	
	char getGrade() {
		if(avg >= 90) {
			grade = 'A';
		} else if(avg >= 80) {
			grade = 'B';
		}else if(avg >= 70) {
			grade = 'C';
		}else if(avg >= 60) {
			grade = 'D';
		} else {
			grade = 'F';
		}
		return grade;
	}
	
	

}
