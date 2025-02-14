//Q1. Test01.java
//
//게시물을 저장하는 Board 클래스를 정의하고, ArrayList를 이용하여 3개의 게시물을 저장하시오.
//1~3번 게시물번호 중 하나를 입력 받아 해당 게시물을 삭제하시오.
//
//class Board			필드 : String title, String content, Date register
//							register -> 현재 날짜 자동 삽입
//					메소드 : 생성자, toString()

package org.joonzis.test;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

class Board{
	String title, content;
	
	Date register = new Date();
	SimpleDateFormat sdf = new SimpleDateFormat("yyyy년 MM월 dd일 E요일");

	public Board(String title, String content) {
		this.title = title;
		this.content = content;
	}

	@Override
	public String toString() {
		return "제목 : " + title + ", 내용 : " + content + ", " + sdf.format(register);
	}
	
	
}

public class Test01 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		List<Board> list = new ArrayList<Board>();
		
		list.add(new Board("자바", "ArrayList"));
		list.add(new Board("자료구조", "Dijkstra"));
		list.add(new Board("파이썬", "Tensorflow"));
		
		for(int i = 0; i < list.size(); i++) {
			System.out.println((i+1) + "번 게시물 : " + list.get(i));
		}
		
		System.out.println("-------------");
		
		System.out.print("삭제할 게시물의 번호를 입력하세요 >>");
		int dNum = sc.nextInt();
		
		list.remove(dNum-1);
		
		for(int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		// TODO 자동 생성된 메소드 스텁

	}

}
