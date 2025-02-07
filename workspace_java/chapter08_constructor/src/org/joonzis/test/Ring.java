package org.joonzis.test;

public class Ring {
	
	Circle inner, outer;
	
	public Ring(Circle inner, Circle outer) {
		
		this.inner = inner;
		this.outer = outer;
		
	}
	void output() {
		System.out.println("내원 :");
		inner.output();
		System.out.println("외원 :");
		outer.output();
		// TODO 자동 생성된 생성자 스텁
	}
}
