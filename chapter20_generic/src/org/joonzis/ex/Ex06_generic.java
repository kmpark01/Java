package org.joonzis.ex;

import java.util.Arrays;

class Basket<T>{
private T[] foods;
	
	//명확하지 않은 타입 체크이지만, 더이상 경고하지 말라는 어노테이션
	@SuppressWarnings("unchecked")
	public Basket(int capacity) {
		foods = (T[])(new Object[capacity]);
	}
	
	public void add(T food) {
		for(int i = 0; i < foods.length; i++) {
			if(foods[i] == null) {
				foods[i] = food;
				break;
			}
		}
	}
	
	public T[] getItems() {
		return foods;
	}
}

class Food{
	private String model;
	public Food(String model) {
		this.model = model;
	}
	
	@Override
	public String toString() {
		return model;
	}
	
}

class Apple extends Food{

	public Apple(String model) {
		super(model);
		// TODO 자동 생성된 생성자 스텁
	}
	
}

class Banana extends Food{
	public Banana(String model) {
		super(model);
		// TODO 자동 생성된 생성자 스텁
	}
}

class Bread extends Food{
	public Bread(String model) {
		super(model);
		// TODO 자동 생성된 생성자 스텁
	}
}

class Computer{
	
}

public class Ex06_generic {

	public static void main(String[] args) {
		Basket<Food> basket = new Basket<>(10);
		
		basket.add(new Apple("사과"));
		basket.add(new Banana("바나나"));
		basket.add(new Bread("빵"));
		
		System.out.println(Arrays.toString(basket.getItems()));
	}

}
