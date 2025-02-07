package org.joonzis.test;

import java.util.Scanner;

public class WeekScheduler {
	
	Day[] days;
	Scanner sc;
	String[] week = {"일", "월", "화", "수", "목", "금", "토"};
	int menuNum;
	int i = 0;
	
	public WeekScheduler() {
		days = new Day[7];
		for(int i = 0; i < 7; i++) {
			days[i] = new Day();
		}	
		sc = new Scanner(System.in);
	}
	
	void menu() {
		System.out.println("1. 스케줄 생성");
		System.out.println("2. 삭제");
		System.out.println("3. 수정");
		System.out.println("4. 보기");
		System.out.println("0. 종료");
		System.out.println("원하는 작업을 선택하세요 >>");
	}
	
	void makeSchedule() {
		System.out.println("스케줄을 추가할 요일을 입력하세요 >>");
		String day = sc.next();
		int dayIndex = getDayIndex(day);
		
		if(dayIndex != -1) {
			System.out.println("스케줄을 입력하세요 >>");
			sc.nextLine();
			String schedule = sc.nextLine();
			days[dayIndex].setSchedule(schedule);
			System.out.println(day + "에 스케출이 추가되었습니다");
		}else {
			System.out.println("잘못된 입력입니다");
		}
	}
	
	void removeSchedule() {
		System.out.println("스케줄을 삭제할 요일을 입력하세요");
		String day = sc.next();
		int dayIndex = getDayIndex(day);
		
		if(dayIndex != -1) {
			days[dayIndex].setSchedule("");
			System.out.println(day + "의 스케줄이 삭제되었습니다");
		}else {
			System.out.println("잘못된 입력입니다.");
		}
		
	}
	
	void modifySchedule() {
		System.out.println("스케줄을 삭제할 요일을 입력하세요");
		String day = sc.next();
		int dayIndex = getDayIndex(day);
		
		if(dayIndex != -1) {
			System.out.println("수정할 스케줄을 입력하세요");
			sc.nextLine();
			String schedule = sc.nextLine();
			days[dayIndex].setSchedule(schedule);
			System.out.println(day + "의 스케줄이 수정되었습니다");
		}else {
			System.out.println("잘못된 입력입니다");
		}
		
	}
	
	void output() {
		System.out.println("<<일주일 스케줄>>");
		for(int i = 0; i < 7; i++) {
			days[i].output(week[i]);
		}
		
	}
	
	void exit() {
		System.out.println("프로그램을 종료합니다");
	}
	
	int getDayIndex(String day) {
		switch(day) {
		case "일":
			return 0;
		case "월":
			return 1;
		case "화":
			return 2;
		case "수":
			return 3;
		case "목":
			return 4;
		case "금":
			return 5;
		case "토":
			return 6;
		default:
			return -1;
		}
	}
	
	void run() {
		while(true) {
			menu();
			menuNum = sc.nextInt();
			
			switch(menuNum) {
			case 1:
				makeSchedule();
				break;
			case 2:
				removeSchedule();
				break;
			case 3:
				modifySchedule();
				break;
			case 4:
				output();
				break;
			case 0:
				exit();
				return;
			default:
				System.out.println("잘못된 입력입니다.");
			}
		}
		
	}
}
