package org.joonzis.ex;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Ex02_iterator {

	public static void main(String[] args) {
		
		List<Integer> list = new ArrayList<Integer>();
		
		for(int i = 10; i < 101; i += 10) {
			list.add(i);
		}
		
		System.out.println(list);
		
		//반복자 호출
		Iterator<Integer> itr = list.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}

}
