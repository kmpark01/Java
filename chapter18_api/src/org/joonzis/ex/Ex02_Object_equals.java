package org.joonzis.ex;

class Computer{
	private String model;
	private int price;
	public Computer(String model, int price) {
		this.model = model;
		this.price = price;
	}
	
	@Override
	public String toString() {

		return "모델 : " + model + ", 가격" + price;
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj != null && obj instanceof Computer) {
			Computer another = (Computer)obj;
			return model.equals(another.model) && price == another.price;
		}else {
			return false;
		}
	}
}
public class Ex02_Object_equals {

	public static void main(String[] args) {
		
		Computer com = new Computer("LG그램", 1000);
		Computer com2 = new Computer("LG그램", 1000);
		
		//1. == 찹조 비교(주소값)
		if(com == com2) {
			System.out.println("같은 컴퓨터");
		}else {
			System.out.println("다른 컴퓨터");
		}
		
		//2. equals비교
		if(com.equals(com2)) {
			System.out.println("같은 컴퓨터");
		}else {
			System.out.println("다른 컴퓨터");
		}
		System.out.println(com);
	}

}
