package org.joonzis.ex;

public class Ex02_RectMain {

	public static void main(String[] args) {
		
		Ex02_Rect rect = new Ex02_Rect();
		rect.output();
		
		System.out.println("---------------------");
		
		Ex02_Rect rect2 = new Ex02_Rect(5);
		rect2.output();
		
		System.out.println("---------------------");
		
		Ex02_Rect rect3 = new Ex02_Rect(10, 7);
		rect3.output();
		// TODO 자동 생성된 메소드 스텁

	}

}
