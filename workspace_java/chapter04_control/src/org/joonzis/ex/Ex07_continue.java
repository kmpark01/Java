package org.joonzis.ex;

public class Ex07_continue {

	public static void main(String[] args) {
		
		int a = 0;
		while(a < 10) {
			a++;
			if(a % 3 ==0) {
				continue;
			}
			System.out.println(a);
		}
		
		
		/*
		for(int a = 0; a < 11; a++) {
			if(a % 3 ==0) {
				continue;
			}
			System.out.println(a);
		}
		*/
	}

}
