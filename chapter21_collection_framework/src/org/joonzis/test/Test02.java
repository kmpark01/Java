package org.joonzis.test;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Random;
import java.util.Scanner;
import java.util.Set;

class Bingo {
    int[][] bingo = new int[5][5];

    public Bingo() {
        Set<Integer> num = new LinkedHashSet<Integer>();
        Random ran = new Random();

        // 1부터 25까지의 중복되지 않는 번호를 Set에 랜덤하게 추가
        while (num.size() < 25) {
            num.add(ran.nextInt(25) + 1); // 1 ~ 25 범위의 숫자 생성
        }
        
        Iterator<Integer> itr = num.iterator();

        for (int i = 0; i < bingo.length; i++) {
            for (int j = 0; j < bingo[i].length; j++) {
            	bingo[i][j] = itr.next();
            }
        }
    }
    
    public void check() {
    	Scanner sc = new Scanner(System.in);
    	
    	int myNum;
    	
    	do {
    		System.out.print("빙고 번호를 입력하세요 >>");
    		myNum = sc.nextInt();
    		
    		for(int i = 0; i < bingo.length; i++) {
    			for(int k = 0; k < bingo[i].length; k++) {
    				if(myNum == bingo[i][k]) {
    					bingo[i][k] = 0;
    				}
    			}
    		}
    		System.out.println(this);
		} while (myNum != 0);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("빙고판:\n");
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                sb.append(bingo[i][j] == 0 ? "*" + "\t" : bingo[i][j] + "\t");
            }
            sb.append("\n");
        }
        return sb.toString();
    }
}

public class Test02 {

    public static void main(String[] args) {
        Bingo bin = new Bingo();
        
        System.out.println(bin);
        bin.check();
        //System.out.println(bin);
    }
}
