package org.joonzis.ex;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Ex03_LinkedList {

	public static void main(String[] args) {
		
		/*
		 * ArrayList와 성느ㅇ 비교
		 * 1000개의 객체를 0번 인덱스에 삽입하는데에 걸리는 시간 측정
		 */
		
		List<String> list1 = new ArrayList<String>();
		List<String> list2 = new LinkedList<String>();
		
		long startTime;
		long endTime;
		
		//ArrayList
		startTime = System.nanoTime();
		for(int i = 0; i < 10000; i ++) {
			list1.add(0, String.valueOf(i));
		}
		endTime = System.nanoTime();
		System.out.println("ArrayList 걸린시간 : " + (endTime - startTime) + "ns");
		// TODO 자동 생성된 메소드 스텁
		
		//LinkedList
		startTime = System.nanoTime();
		for(int i = 0; i < 10000; i ++) {
			list2.add(0, String.valueOf(i));
		}
		endTime = System.nanoTime();
		System.out.println("LinkedList 걸린시간 : " + (endTime - startTime) + "ns");

	}

}
