package org.joonzis.ex;

public class Ex04_exception {

	public static void main(String[] args) {
		
		try {
			String name = "김씨";
			System.out.println("이름 : " + name.toString());
		}catch(Exception e) {
			System.out.println("예외발생");
			System.out.println(e.getMessage());
			System.out.println("---------------");
			e.printStackTrace();
		}
		// TODO 자동 생성된 메소드 스텁

	}

}
