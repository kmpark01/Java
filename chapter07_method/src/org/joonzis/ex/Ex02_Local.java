package org.joonzis.ex;

public class Ex02_Local {
	
	String name;
	int age;
	String sn;
	boolean isKorean;
	
	void setLocalInfo(String name, int age, String sn) {
		this.name = name;
		this.age = age;
		this.sn = sn;
		
		String newSn = sn.substring(6,7);
		
		if(newSn.equals("1") || newSn.equals("2") || newSn.equals("3") || newSn.equals("4")) {
			isKorean = true;
		}
		
	}
	
	void setLocalInfo(String name, int age) {
		this.name = name;
		this.age = age;
	}
		
	
	void output() {
		System.out.println("이름 :" + name );
		System.out.println("나이 :" + age);
		System.out.println("주민번호 :" + sn);
		if(sn == null) {
			System.out.println("없음");
		}else {
			System.out.println(isKorean ? "한국인" : "외국인");			
		}
	}

}
