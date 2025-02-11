package org.joonzis.ex;

public class Ex01_Rect {
	
	private int width, height;
	private boolean isSquare;
	
	public Ex01_Rect() {
		this(1,1);
	}

	public Ex01_Rect(int side) {
		this(side, side);
	}
	
	public Ex01_Rect(int width, int height) {
		super();
		this.width = width;
		this.height = height;
	}
	
	private int calcArea() {
		return width * height;
	}
	
	public void output() {
		if(width == height) {
			isSquare = true;
		}
		System.out.println("너비 : " + width);
		System.out.println("높이 : " + height);
		System.out.println("크기 : " + calcArea());
		System.out.println(isSquare ? "정사각형" : "직사각형");
	}
}