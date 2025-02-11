package org.joonzis.test;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

class Game {
    private Random ran;
    private Scanner sc;
    
    private int myNum;
    private int crrNum;
    private int count = 0;

    public Game() {
        ran = new Random();
        sc = new Scanner(System.in);
    }

    public void checkNum() throws NumberOutOfBoundsException {
        crrNum = ran.nextInt(100) + 1; // 1~100 사이의 난수 생성

        while (true) {
            try {
                System.out.print("정수를 입력하세요 >> ");
                myNum = sc.nextInt();

                if (myNum < 1 || myNum > 100) {
                    throw new NumberOutOfBoundsException("1~100 사이의 정수를 입력하세요");
                }

                count++;

                if (myNum > crrNum) {
                    System.out.println("Down!");
                } else if (myNum < crrNum) {
                    System.out.println("Up!");
                } else {
                    System.out.println("정답입니다! 정답: " + crrNum);
                    System.out.println(count + "번 만에 맞췄습니다.");
                    break; // 정답을 맞추면 while 루프 종료
                }

            } catch (InputMismatchException e) {
                System.out.println("잘못된 입력입니다. 정수를 입력하세요.");
                sc.next(); // 입력 버퍼 비우기
            }
        }
    }

    public void closeScanner() {
        if (sc != null) {
            sc.close();
        }
    }
}

class NumberOutOfBoundsException extends Exception {
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
            System.out.println("에러 메시지: " + e.getMessage());
        } finally {
            game.closeScanner(); // Scanner 닫기
        }
    }
}
