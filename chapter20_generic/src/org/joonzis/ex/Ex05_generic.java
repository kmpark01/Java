package org.joonzis.ex;

import java.util.Arrays;

class Container<T>{
	private T[] items;
	
	//명확하지 않은 타입 체크이지만, 더이상 경고하지 말라는 어노테이션
	@SuppressWarnings("unchecked")
	public Container(int capacity) {
		items = (T[])(new Object[capacity]);
	}
	
	public void add(T item) {
		for(int i = 0; i < items.length; i++) {
			if(items[i] == null) {
				items[i] = item;
				break;
			}
		}
	}
	
	public T[] getItems() {
		return items;
	}
}

class Gun{
	private String model;
	public Gun(String model) {
		this.model = model;
	}
	
	@Override
	public String toString() {
		return model;
	}
	
}

public class Ex05_generic {

	public static void main(String[] args) {
		
		Container<Gun> con = new Container<>(10);
		
		con.add(new Gun("K2"));
		con.add(new Gun("K1"));
		con.add(new Gun("K5"));
		
		System.out.println(Arrays.toString(con.getItems()));
	}
}
