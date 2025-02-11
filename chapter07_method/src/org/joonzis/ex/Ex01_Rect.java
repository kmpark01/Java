package org.joonzis.ex;

public class Ex01_Rect {
	
	int width, height;
	boolean isSquare; //정사각형 유무
	
	void setFeilds(int w, int h) {
		
		width = w;
		height = h;
		
		if(w == h) {
			isSquare = true;
		}
		
	}
	
	void setFeilds(int side) {
		width = side;
		height = side;
		isSquare = true;
		
	}
	
	int calcArea() {
		return width*height;
	}
	
	void output() {
		System.out.println("너비 :" + width);
		System.out.println("높이 :" + height);
		System.out.println("넓이 :" + calcArea());
		System.out.println(isSquare ? "정사각형" : "직사각형");		
	}

}
