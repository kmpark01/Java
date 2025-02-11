package org.joonzis.ex;

class Sample{
	
	@Override
	public String toString() {
		return "sample";
	}
}

public class Ex01_Object {

	public static void main(String[] args) {
		
		Object object = new Object();
		System.out.println(object);
		
		object = 10;
		System.out.println(object);
		
		object = "hello";
		System.out.println(object);
		
		object = new Sample();
		//객체만 출력해도 자동으로 toString()반환
		System.out.println(object.toString());
		System.out.println(object);
		// TODO 자동 생성된 메소드 스텁

	}

}
