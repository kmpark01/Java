package org.joonzis.ex;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Ex04_FIleInput {

	public static void main(String[] args) {
		
		File file = null;
		FileReader fr = null;
		BufferedReader br = null;
		
		try {
			file = new File("nationalAnthem.txt");
			fr = new FileReader(file);
			br = new BufferedReader(fr);
			
			String line = "";
			while(true) {
				line = br.readLine();
				
				if(line != null) {
					System.out.println(line);
				}else {
					break;
				}
			}
		} catch (IOException e) {
			e.printStackTrace();
			// TODO: handle exception
		} finally {
			try {
				if(br != null) {
					br.close();
				}
				if(fr != null) {
					fr.close();
				}
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
		// TODO 자동 생성된 메소드 스텁

	}

}
