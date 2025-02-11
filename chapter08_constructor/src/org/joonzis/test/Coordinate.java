package org.joonzis.test;

public class Coordinate {
	
	int x, y;

	public Coordinate(int x, int y) {
		
		this.x = x;
		this.y = y;
		// TODO 자동 생성된 생성자 스텁
	}
	
	void output() {
		System.out.println("좌표 : (" + x + "," + y + ")" );
	}
}
