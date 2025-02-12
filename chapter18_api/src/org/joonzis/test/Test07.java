package org.joonzis.test;

import java.util.Calendar;

//Q7.Test07.java
//현재 날짜를 StringBuffer, Calendar 클래스를 이용하여
//"2019년 10월 21일 월요일 오후 1시 10분" 과 같은 형식으로 완성하고 출력하시오.
//StringBuffer.append() 이용
//String[] weeks = {"","일","월","화","수","목","금","토"};

public class Test07 {

	public static void main(String[] args) {
		
		Calendar cal = Calendar.getInstance();
		
		String[] weeks = {"","일","월","화","수","목","금","토"};
		
		StringBuffer day = new StringBuffer();
		
		int year = cal.get(Calendar.YEAR);
		int month = cal.get(Calendar.MONTH) + 1;
		int date = cal.get(Calendar.DATE);
		int am_pm = cal.get(Calendar.AM_PM);
		int hour = cal.get(Calendar.HOUR);
		int minute = cal.get(Calendar.MINUTE);
		String week = weeks[cal.get(Calendar.DAY_OF_WEEK)];
		String am_pm_str = (am_pm == 0) ? "오전" : "오후";
		
		day.append(year).append("년 ").append(month).append("월 ").append(date).append("일 ")
		.append(week).append("요일 ").append(am_pm_str).append(" ").append(hour).append("시 ").append(minute).append("분");
		
		System.out.println(day);
	}

}
