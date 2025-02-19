package org.joonzis.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {
	
	public static Connection getConnection() throws ClassNotFoundException, SQLException{
		//1. Connection 객체
		Connection conn = null;
		
		//2. Oracle jdbc 드라이버 로드
		Class.forName("oracle.jdbc.driver.OracleDriver");
		
		//3. 정보생성
		String user = "scott";
		String password = "tiger";
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		
		//4. DriverManager : 자바 오라클 jdbc에 연결 시켜 주는 클래스
		conn = DriverManager.getConnection(url, user, password);
		return conn;
	}
}
