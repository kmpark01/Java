package org.joonzis.test;

class Product <T1, T2>{
	private T1 category;
	private T2 model;
	
	@Override
	public String toString() {
		StringBuffer sb = new StringBuffer();
		sb.append(category).append(", ").append(model);
		return sb.toString();
	}
	
	public void setCategory(T1 category) {
		this.category = category;
	}

	public void setModel(T2 model) {
		this.model = model;
	}
}

class Tv{
	private String brand;
	
	public Tv(String brand) {
		this.brand = brand;
	}

	@Override
	public String toString() {
		// TODO 자동 생성된 메소드 스텁
		return brand + " TV";
	}
}

class Elec{

	@Override
	public String toString() {
		// TODO 자동 생성된 메소드 스텁
		return "전자제품";
	}
}

public class Test03 {

	public static void main(String[] args) {
		Product<Elec, Tv> product1 = new Product<>();
		//Product<Life, Cup> product2 = new Product<>();

		product1.setCategory(new Elec());
		product1.setModel(new Tv("LG"));
		
		System.out.println(product1);

	}

}
