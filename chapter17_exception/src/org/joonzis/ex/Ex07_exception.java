package org.joonzis.ex;

class MyException extends Exception{
	private static final long serialVersionUID = 1L;
	
	public MyException(String msg) {
		super(msg);
	}
}

public class Ex07_exception {

	public static void main(String[] args) {
		try {
			throw new MyException("내가 만든 예외");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		// TODO 자동 생성된 메소드 스텁

	}

}
