package org.joonzis.ex;

public class Ex03_exception {

	public static void main(String[] args) {
		
		String data1 = "100";
		String data2 = "100a";
		
		try {
			int d1 = Integer.parseInt(data1);
			System.out.println("첫번째 변환 된 값 : " + d1);
			int d2 = Integer.parseInt("두번재 변환 된 값" + data2);
			System.out.println(d2);
			
			
		} catch (NumberFormatException e) {
			e.printStackTrace();
			System.out.println("문자열을 숫자로 변환할 수 없습니다.");
		}

	}

}
