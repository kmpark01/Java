package org.joonzis.test;

class Recursive{
	int count = 0;
	
	void recursive(int a) {
		if(count == a) {
			return;
		}else {
			System.out.println("Hello");
			count++;			
		}
		
		recursive(a);
	}
}


public class RecursiveCall {
	/*
	static int count = 0;
	
	static void recursive(int a) {
		if(count >= a) {
			return;
		}else {
			System.out.println("Hello");
			count++;			
		}
		
		recursive(a);
	}
	*/

	public static void main(String[] args) {
		
		Recursive re = new Recursive();
		// TODO 자동 생성된 메소드 스텁
		re.recursive(5);

	}

}
