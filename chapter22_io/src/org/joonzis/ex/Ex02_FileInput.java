package org.joonzis.ex;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class Ex02_FileInput {

	public static void main(String[] args) {
		
		FileInputStream fis = null;
		BufferedInputStream bis = null;
		
		try {
			fis = new FileInputStream("alphabet.txt");
			bis = new BufferedInputStream(fis);
			
			int ch = 0; //char ch가 아님! 읽을 때에는 int
			while(true) {
				ch = bis.read();
				//read로 읽을 데이터가 없으면 -1을 리턴
				if(ch == -1) {
					break;
				}
				System.out.print((char)ch);
			}
		} catch (IOException e) {
			e.printStackTrace();
			// TODO: handle exception
		} finally {
			try {
				if(bis != null){
					bis.close();
				}
				if(fis != null) {
					fis.close();
				}
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
		// TODO 자동 생성된 메소드 스텁

	}

}
