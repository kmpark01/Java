package org.joonzis.ex;

class Mother{
	public Mother() {
		System.out.println("Mother 객체 생성");
		// TODO 자동 생성된 생성자 스텁
	}
}

class Son extends Mother{
	public Son() {
		System.out.println("Son 객체 생성");
	}
	
	void doSon() {
		System.out.println("doSon() 호출");
	}
	
}
public class Ex03_Constructor {

	public static void main(String[] args) {
		
		Son son = new Son();
		son.doSon();
		// TODO 자동 생성된 메소드 스텁

	}

}

