package org.joonzis.ex;

public class Ex02_LocalMain {

	public static void main(String[] args) {
		
		Ex02_Local local  = new Ex02_Local();
		
		local.setLocalInfo("박경민", 26, "0001013083229");
		local.output();
		
		System.out.println("--------------------");
		
		
		Ex02_Local local2 = new Ex02_Local();
		
		local2.setLocalInfo("박민", 27);
		local2.output();
		// TODO 자동 생성된 메소드 스텁

	}

}
