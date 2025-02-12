package org.joonzis.test;

class Score{
	int kor, eng, mat;

	public Score(int kor, int eng, int mat) {
		super();
		this.kor = kor;
		this.eng = eng;
		this.mat = mat;
	}

	@Override
	public String toString() {
		return "국어 : " + kor + "영어 : " + eng + "수학 : " + mat;
	}
	
	@Override
	public boolean equals(Object obj) {
		
		if(obj != null & obj instanceof Score) {
			Score another = (Score)obj;
			return kor == another.kor && eng == another.eng && mat == another.mat;
		}else {
			return false;
		}
	}
}

public class Test01 {

	public static void main(String[] args) {
		
		Score score1 = new Score(50, 20, 30);
		Score score2 = new Score(50, 50, 30);
		
		if(score1.equals(score2)) {
			System.out.println("동등");
		}else {
			System.out.println("다름");
		}
	}

}
