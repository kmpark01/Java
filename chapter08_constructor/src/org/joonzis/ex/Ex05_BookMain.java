package org.joonzis.ex;

public class Ex05_BookMain {

	public static void main(String[] args) {
		
		Ex05_Book book1 = new Ex05_Book();
		book1.setSalesVolume();
		book1.output();
		
		System.out.println("---------------------------");
		
		Ex05_Book book2 = new Ex05_Book("딥러닝 Express", 12000);
		book2.setSalesVolume();
		book2.output();
		
		System.out.println("---------------------------");
		
		Ex05_Book book3 = new Ex05_Book("아프니까 청춘이다", "김난도", 11000);
		book3.setSalesVolume();
		book3.output();
		// TODO 자동 생성된 메소드 스텁

	}

}
