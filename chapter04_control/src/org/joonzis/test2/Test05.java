package org.joonzis.test2;

public class Test05 {

	public static void main(String[] args) {
		
		int sum = 0;
		int oddSum = 0;
		int evenSum = 0;
		
		/*
		for(int i = 0; i < 101; i++) {
			sum = sum + i;
		}
		System.out.println(sum);
		*/
		
		for(int i = 0; i < 101; i++) {
			if(i % 2 == 0) {
				evenSum = evenSum + i;
			}else {
				oddSum = oddSum + i;
			}
		}
		System.out.println(evenSum);
		System.out.println(oddSum);					
			
		// TODO 자동 생성된 메소드 스텁

	}

}
