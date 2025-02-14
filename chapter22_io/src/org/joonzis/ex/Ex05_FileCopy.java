package org.joonzis.ex;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Ex05_FileCopy {

	public static void main(String[] args) throws IOException {
		
		File file = new File("cat.jpg");
		
		if(file.exists()) {
			BufferedInputStream bis = new BufferedInputStream(new FileInputStream(file));
			BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("cat2.jpg"));
			
			byte[] buffer = new byte[1024];
			long start = System.currentTimeMillis();
			while(bis.read(buffer) != -1) {
				bos.write(buffer);
			}
			long end = System.currentTimeMillis();
			System.out.println("복사 시간 :" + (end - start) + "ms");
			
			//File 클래스 사용 메소드
			System.out.println("파일명 : " + file.getName());
			System.out.println("파일경로1 : " + file.getAbsolutePath()); //절대 경로
			System.out.println("파일경로2 : " + file.getPath()); //상대 경로
		}else {
			System.out.println("해당 파일을 찾을 수 없습니다");

		}

	}
}