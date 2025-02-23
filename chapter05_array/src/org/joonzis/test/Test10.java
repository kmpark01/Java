package org.joonzis.test;

import java.util.Scanner;

public class Test10{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[][] classroom = new int[5][];

        for (int i = 0; i < classroom.length; i++) {
            System.out.print((i + 1) + "번째 줄의 학생 수를 입력하세요: ");
            int studentCount = sc.nextInt(); 
            classroom[i] = new int[studentCount];

            for (int j = 0; j < classroom[i].length; j++) {
                classroom[i][j] = 1;
            }
        }

        System.out.println("\n할당된 2차원 배열:");
        for (int i = 0; i < classroom.length; i++) {
            System.out.print((i + 1) + "번째 줄: ");
            for (int j = 0; j < classroom[i].length; j++) {
                System.out.print(classroom[i][j] + " ");
            }
            System.out.println();
        }
    }
}
