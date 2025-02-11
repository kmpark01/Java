package org.joonzis.ex;

class Product{
	
	void info() {
		System.out.println("Product");
	}
}

class Computer extends Product{

	@Override
	void info() {
		System.out.println("Computer");
	}
	
}

class Notebook extends Computer{

	@Override
	void info() {
		System.out.println("Notebook");
	}
	
}


public class Ex01_polymorphism {

	public static void main(String[] args) {
		Product[] product = new Product[20];
		
		product[0] = new Computer();
		product[1] = new Notebook();
		
		product[0].info();
		product[1].info();
	}

}
