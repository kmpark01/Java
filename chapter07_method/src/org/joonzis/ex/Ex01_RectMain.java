package org.joonzis.ex;

public class Ex01_RectMain {

	public static void main(String[] args) {
		
		Ex01_Rect rect = new Ex01_Rect();
		
		rect.setFeilds(5, 7);
		rect.output();
		
		System.out.println("-----------------");
		
		Ex01_Rect rect2 = new Ex01_Rect();
		
		rect2.setFeilds(10);
		rect2.output();
		// TODO 자동 생성된 메소드 스텁

	}

}
