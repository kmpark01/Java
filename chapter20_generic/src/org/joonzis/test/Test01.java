//Q1. Test01.java
//문자열/정수/실수 타입의 배열을 전달하고 데이터 타입을 체크하여
//해당 데이터 타입과 해당 배열의 데이터들을 출력
//class TypeCheckClass - 필드 : T[] arr
//   					  메소드 : String checkType(T[] arr)
//   					  -> 타입에 따라서 "문자형 입니다.", "정수형 입니다" 등등 리턴
//   					  , 
//   					  toString()
//   					  -> 배열 데이터, 데이터 형태 출력
package org.joonzis.test;

class TypeCheckClass<T>{
	private T[] arr;
	
	public TypeCheckClass(T[] arr) {
		this.arr = arr;
	}
	
	public String checkType() {
		if(arr[0] instanceof Integer) {
			return "정수형 입니다";			
		}else if(arr[0] instanceof Double || arr[0] instanceof Float) {
			return "실수형 입니다";
		}else if(arr[0] instanceof String) {
			return "문자열 입니다";
		}else {
			return null;
		}
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
        sb.append(checkType()).append("\n");
        sb.append("배열 데이터: ");
        
        for (T item : arr) {
            sb.append(item).append(" ");
        }
        return sb.toString();
	}
}

public class Test01 {

	public static <T> void main(String[] args) {
		
		String[] strArr = {"Hello", "world"};
		TypeCheckClass<String> strCheck = new TypeCheckClass<>(strArr);
		System.out.println(strCheck);

		Integer[] intArr = {1,2,3,4,5};
		TypeCheckClass<Integer> intCheck = new TypeCheckClass<>(intArr);
		System.out.println(intCheck);
		
		Double[] douArr = {1.0, 2.1};
		TypeCheckClass<Double> douCheck = new TypeCheckClass<>(douArr);
		System.out.println(douCheck);
		// TODO 자동 생성된 메소드 스텁

	}

}
