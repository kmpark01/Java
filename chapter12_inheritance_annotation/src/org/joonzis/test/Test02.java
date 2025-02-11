package org.joonzis.test;

class Computer{
	String model;
	int price;
	
	public Computer(String model, int price) {
		super();
		this.model = model;
		this.price = price;
	}
	
	void output() {
		System.out.println("모델 : " + model);
		System.out.println("가격 : " + price);
	}
}

class Notebook extends Computer{
	int battery;

	public Notebook(String model, int price, int battery) {
		super(model, price);
		this.battery = battery;
	}
	
	@Override
	void output() {
		super.output();
		System.out.println("배터리 : " + battery);
	}
}

class Tablet extends Computer{
	String pen;
	int battery;
	
	public Tablet(String model, int price, String pen, int battery) {
		super(model, price);
		this.pen = pen;
		this.battery = battery;
	}

	@Override
	void output() {
		super.output();
		System.out.println("배터리 : " + battery);
		System.out.println("펜 : " + pen);
	}
}

public class Test02 {

	public static void main(String[] args) {
		
		Notebook notebook = new Notebook("LG그램", 1000000, 80);
		notebook.output();
		
		System.out.println("------------------");
		
		Tablet tablet = new Tablet("애플패드", 2000000, "애플팬슬", 25);
		tablet.output();
	}

}