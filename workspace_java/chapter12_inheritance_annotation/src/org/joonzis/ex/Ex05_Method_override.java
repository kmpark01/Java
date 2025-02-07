package org.joonzis.ex;

class Espresso{
	String origin;
	public Espresso() {
		// TODO 자동 생성된 생성자 스텁
	}

	public Espresso(String origin) {
		this.origin = origin;
		// TODO 자동 생성된 생성자 스텁
	}
	
	void taste() {
		System.out.println("쓰다");
	}
}

class Latte extends Espresso{
	String milk;
	public Latte() {
		// TODO 자동 생성된 생성자 스텁
	}

	public Latte(String milk, String origin) {
		super(origin);
		this.milk = milk;
		// TODO 자동 생성된 생성자 스텁
	}

	@Override
	void taste() {
		System.out.println("원산지 : " + origin + "," + "우유 : " + milk);
		System.out.println("부드럽다");
	}
	
	

}

public class Ex05_Method_override {

	public static void main(String[] args) {
		
		Latte latte1 = new Latte();
		latte1.taste();
		
		Latte latte2 = new Latte("서울우유", "콜롬비아");
		latte2.taste();
		// TODO 자동 생성된 메소드 스텁

	}

}
