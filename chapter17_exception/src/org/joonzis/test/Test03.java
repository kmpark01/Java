package org.joonzis.test;

import java.util.Scanner;

class JnumInput{
	Scanner sc;
	String jNum;

	public void input() {
		sc = new Scanner(System.in);
		System.out.println("주민번호를 입력하세요 ex) 000000-0000000 >>");
		jNum = sc.next();
	}
	
	public void jnumCheck() throws PerIDException {
		if(jNum.length() != 14) {
			throw new PerIDException("주민번호(하이픈포함) 14자리를 입력하세요");
		}
		System.out.println(jNum);
	}
}

class PerIDException extends  Exception{
	private static final long serialVersionUID = 1L;
	
	public PerIDException(String msg) {
		super(msg);
	}
}

public class Test03 {

	public static void main(String[] args) {
		
		JnumInput jnum = new JnumInput();
		
		try {
			jnum.input();
			jnum.jnumCheck();
		} catch (PerIDException e) {
			System.out.println("에러 메시지 : " + e.getMessage());

		}
	}

}
