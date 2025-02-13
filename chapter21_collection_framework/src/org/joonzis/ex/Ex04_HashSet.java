package org.joonzis.ex;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Ex04_HashSet {

	public static void main(String[] args) {
		
		Set<String> set = new HashSet<String>();
		
		set.add("DB");
		set.add("JAVA");
		set.add("SPRING");
		set.add("JSP");
		set.add("WEB");
		set.add("NODE");
		set.add("JAVA");
		
		System.out.println(set);
		
		Iterator<String> itr = set.iterator();
		while(itr.hasNext()){
			String str = itr.next();
			if(str.equals("JAVA")) {
				itr.remove();
			}
		}
		
		System.out.println(set);
		// TODO 자동 생성된 메소드 스텁

	}

}
