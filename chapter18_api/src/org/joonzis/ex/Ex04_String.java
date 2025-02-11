package org.joonzis.ex;

public class Ex04_String {

	public static void main(String[] args) {
		
		//인스턴스는 다르지만 내부 데이터가 동일하므로 객체 1개만 저장
		String a = "apple";
		String b = "apple";
		System.out.println(a == b ? "사과 1개" : "사과 2개");
		
		String c = new String("banana");
		String d = new String("banana");
		System.out.println(c == d ? "바나나 1개" : "바나나 2개");
		
		//.split() - 특정 기호를 기주으로 분리하여 각각 배열에 저장
		String sn = "000000-0000000";
		String[] strArr = sn.split("-");
		for(String s : strArr) {
			System.out.println(s);
		}
		
		String today = "1980.10.21";
		String[] ymd = today.split("\\.");
		//몇몇 특수문자는 사용 시 앞에 역슬래시2개(\\)를 붙여줘야 함
		// |, ?, *, (, ), {, }, [, ], \
		for(String s : ymd) {
			System.out.println(s);
		}
		
		//.join()
		String today2 = String.join("-", ymd);
		System.out.println(today2);
		
		//.valueOf
		//정수 -> 문자열 : String.valueOf(10) -- "10"
		//실수 -> 문자열 : Strinf.valudOf(1.5) == "1.5"
		
		//.subString()
		//.subString(시작인덱스) : 시작인덱스 부터 끝까지 출력
		//.subString(시작인덱스, 종료인덱스) : 시작인ㄷ게스부터 종료 인덱스 전까지 출력
		
		String phone = "010-3044-1933";
		
		String p1 = phone.substring(0, 3);
		String p2 = phone.substring(4, 8);
		String p3 = phone.substring(9);
		
		System.out.println(p1);
		System.out.println(p2);
		System.out.println(p3);
		// TODO 자동 생성된 메소드 스텁

	}

}
