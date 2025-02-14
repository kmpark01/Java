package org.joonzis.ex;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Ex01_Fileoutput {

	public static void main(String[] args) {
		
		//바이트 기반 스트림
		FileOutputStream fos = null;
		BufferedOutputStream bos = null;
		
		try {
			/*
			 * FileOutputStream(생성할 파일의 경로 및 이름)
			 * -경로 지정을 안하면 현재 디렉토리에 파일 생성(상대경로)
			 * -C://dev/file/alphabet.txt(절대경로
			 */
			
			fos = new FileOutputStream("alphabet.txt");
			bos = new BufferedOutputStream(fos);
			
			char ch = 'A'; //아스키 코드 시작 문자
			while(true) {
				bos.write(ch);
				if(ch == 'z') {
					break;
				}
				ch++; //아스키 코드표 상 다음 문자로 이
			}
			bos.flush(); //버퍼 비우기
			System.out.println("alphabet.txt 파일 생성");
			
		} catch (IOException e) {
			e.printStackTrace();
			// TODO: handle exception
		} finally {
			//버퍼를 사용한 클래스는 close()를 통해 메모리 관리를 할 수 있다
			try {
				if(bos != null) {
					bos.close();					
				}
				if(fos != null) {
					fos.close();
				}
			}catch (Exception e2) {
				e2.printStackTrace();
				// TODO: handle exception
			}
		}
	}
}
