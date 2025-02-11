package org.joonzis.test;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

class Game{
	Random ran;
	Scanner sc;
	
	int myNum;
	int crrNum;
	
	public Game() {
		ran = new Random();
		sc = new Scanner(System.in);
	}

	public void checkNum() throws NumberOutOfBoundsException {
		
		crrNum = ran.nextInt((100)+1);
		
		while(myNum != crrNum) {
			System.out.print("정수를 입력하세요 >> ");
			myNum = sc.nextInt();
			if(myNum < 1 || myNum > 100) {
				throw new NumberOutOfBoundsException("1~100 사이의 정수를 입력하세요");
			}
			
			if(myNum > crrNum) {
				System.out.println("Down!");
			}else if(myNum < crrNum) {
				System.out.println("Up");
			} else {
				System.out.println("정답입니다 \n" + crrNum );
			}			
		}
	}
}

class NumberOutOfBoundsException extends Exception{
	private static final long serialVersionUID = 1L;
	public NumberOutOfBoundsException(String msg) {
		super(msg);
	}
}

public class Test04 {

	public static void main(String[] args) {
		
		Game game = new Game();
		
		try {
			game.checkNum();
		} catch (NumberOutOfBoundsException e) {
			System.out.println("에러 메시지 : " + e.getMessage());
			// TODO: handle exception
		} catch (InputMismatchException e) {
			System.out.println("잘못된 입력입니다. 정수를 입력하세요");
		}
	}
}
