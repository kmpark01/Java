package org.joonzis.test2;

public class Test04 {

	public static void main(String[] args) {
		
		for(int i = 1; i < 11; i++) {
			for(int q = 1; q < 11; q++) {
				if(q == 10) {
					System.out.println();
					continue;
				}
				System.out.print(i + "*" + q + "="  + i*q + " ");
			}
		}
		// TODO 자동 생성된 메소드 스텁

	}

}
