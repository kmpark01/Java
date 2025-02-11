package org.joonzis.ex;

public class Ex03_TeamMain {

	public static void main(String[] args) {
		
		Ex03_Team team1 = new Ex03_Team("김씨");
		team1.output();
		Ex03_Team team2 = new Ex03_Team("이씨");
		team2.output();
		Ex03_Team team3 = new Ex03_Team("박씨");
		team3.output();
		
		System.out.println("전체 팀원 :" + Ex03_Team.count + "명");
		// TODO 자동 생성된 메소드 스텁

	}

}
