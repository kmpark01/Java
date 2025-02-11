package org.joonzis.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Test01 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Random rnd = new Random();
		
		int[] lottoNum = new int[6];
		int[] myNum = new int[6];
		
		//정답 수에 따른 동적 배열 생성
		ArrayList<Integer> crrNum = new ArrayList<>();

		//내 로또 번호 입력
		for(int i = 0; i < myNum.length; i++) {
			System.out.println((i + 1) + "번째 로또 번호를 입력하세요 >>");
			myNum[i] = sc.nextInt();
		}
		System.out.println("내 번호" + Arrays.toString(myNum));
		
		//당첨 번호 생성
		for(int i = 0; i < lottoNum.length; i++) {
			lottoNum[i] = rnd.nextInt(45)+1;
			//중복제거
			for(int k = 0; k < i; k++) {
				if(lottoNum[i] == lottoNum[k]) {
					i--;
				}
			}	
		}
		System.out.println("당첨 번호" + Arrays.toString(lottoNum));
		
		//정답비교
		int count = 0;
		
		for(int i = 0; i < lottoNum.length; i++) {
			for(int k = 0; k < myNum.length; k++) {
				if(lottoNum[i] == myNum[k]){
					crrNum.add(myNum[k]);
					count++;				
				}
			}
		}
		System.out.println("맞은 번호는 :" + crrNum + "\n" + count + "개 맞았습니다");
		
		sc.close();
	}

}
