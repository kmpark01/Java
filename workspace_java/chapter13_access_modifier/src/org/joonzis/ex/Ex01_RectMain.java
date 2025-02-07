package org.joonzis.ex;

public class Ex01_RectMain {

	public static void main(String[] args) {
		Ex01_Rect rect1 = new Ex01_Rect();
		rect1.output();
		
		System.out.println("---------------------");
		
		Ex01_Rect rect2 = new Ex01_Rect(5);
		rect2.output();

		System.out.println("---------------------");
		
		Ex01_Rect rect3 = new Ex01_Rect(2, 5);
		rect3.output();
	}

}
