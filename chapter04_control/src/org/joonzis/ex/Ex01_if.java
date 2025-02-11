package org.joonzis.ex;

public class Ex01_if {

	public static void main(String[] args) {
		
		int num = 20;
		
		if (num > 0) {
			System.out.println("양수");
		}else if(num == 0) {
			System.out.println("0");
		}else {
			System.out.println("음수"); 
		}
		
		double avg = 92;
		
		if(avg >= 90) {
			System.out.println("A");
		} else if(avg >= 80) {
			System.out.println("B");
		} else if(avg >= 70) {
			System.out.println("C");
		} else if(avg >= 60) {
			System.out.println("D");
		} else {
			System.out.println("F");
		}
		// TODO 자동 생성된 메소드 스텁

	}

}
