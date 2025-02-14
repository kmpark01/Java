package org.joonzis.test;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Test01 {

    public static void main(String[] args) {
        File inputFile = new File("nationalAnthem.txt");
        File outputFile = new File("nationalAnthem2.txt");

        BufferedReader br = null;
        BufferedWriter bw = null;

        try {

            br = new BufferedReader(new FileReader(inputFile));

            bw = new BufferedWriter(new FileWriter(outputFile));

            String line;

            while ((line = br.readLine()) != null) {
                System.out.println(line);  // 콘솔에 출력
                bw.write(line);            // 새 파일에 저장
                bw.newLine();              // 줄바꿈 추가
            }

            System.out.println("파일 복사가 완료되었습니다!");

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (br != null) {
                	br.close();
                }
                if (bw != null) {
                	bw.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
