package org.joonzis.ex;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Ex03_FileOutput {

	public static void main(String[] args) {
		
		String msg = "가나다라마바사아자차카타파하";
		
		//문자 기반 스트리ㅁ(파일 작성시 주로 사용)
		File file = null;
		FileWriter fw = null;
		BufferedWriter bw = null;
		//저용량의 파일 시 FileWriter만 사용해도 무방
		
		try {
			file = new File("hangeul.txt");
			fw = new FileWriter(file, false);
			//true : 이어쓰기, false : 덮어쓰기
			//옵션 미선택 시 기본 값 false
			bw = new BufferedWriter(fw);
			bw.write(msg);
			bw.flush();
			System.out.println("hangeul.txt 파일 생성");
		}catch (IOException e) {
			e.printStackTrace();
			// TODO: handle exception
		} finally {
			try {
				if(bw != null) {
					bw.close();
				}
				if(fw != null){
					fw.close();
				}
			}catch (IOException e2) {
				e2.printStackTrace();
			}
		}
		// TODO 자동 생성된 메소드 스텁

	}

}
