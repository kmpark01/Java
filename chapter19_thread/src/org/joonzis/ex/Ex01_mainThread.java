package org.joonzis.ex;

public class Ex01_mainThread {

	public static void main(String[] args) {
		
		for(int i = 0; i < 10; i++) {
			try {
				Thread.sleep(500);
				System.out.println("Main Thread" + (i + 1) + "번 출력");
			} catch (InterruptedException e) {
				// TODO 자동 생성된 catch 블록
				e.printStackTrace();
			}
		}
		// TODO 자동 생성된 메소드 스텁

	}

}
