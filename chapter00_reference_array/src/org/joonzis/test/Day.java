package org.joonzis.test;

public class Day {
	String schedule;

	public Day() {
		super();
		this.schedule = "";
	}
	
	void setSchedule(String schedule) {
		this.schedule = schedule;
		
	}
	
	String getSchedule() {
		return schedule;
	}
	
	void output(String day) {
		System.out.println("오늘의 스케줄은 : " + schedule + "입니다");
	}
}
