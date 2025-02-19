package org.joonzis.ex;

import java.sql.Connection;
import java.sql.PreparedStatement;

import org.joonzis.db.DBConnection;

public class Ex02_update {

	public static void main(String[] args) {
		
		// 김씨의 나이를 100살로, 지역을 '마포'로 변경
		Connection conn = null;
		PreparedStatement ps = null;
		
		try {
			conn = DBConnection.getConnection();
			
			//주의!! 띄어쓰기, 세미콜론(삭제)
			String sql = "update person set age = ? " + "where name = ?";
			
			ps = conn.prepareStatement(sql);
			
			ps.setInt(1,  100);
			ps.setString(2,  "김씨");
			int result1 = ps.executeUpdate();
			ps.close();
		
			String sql2 = "update person set region = ? " + "where name = ?";
			ps = conn.prepareStatement(sql2);
			ps.setString(1, "마포");
			ps.setString(2, "김씨");
			
			int result2 = ps.executeUpdate();
		
			if(result1 > 0 && result2 > 0) {
				System.out.println("데이터 업데이트 성공");
			}else {
				System.out.println("데이터 업데이트 실패");
			}
			
			conn.commit();
		} catch (Exception e) {
			try {
				if(conn != null) {
					conn.rollback();
				}
			} catch (Exception e2) {
				e2.printStackTrace();
			}
			e.printStackTrace();
		} finally {
			try {
				if(ps != null) {
					ps.close();
				}
				
				if(conn != null) {
					conn.close();
				}
			} catch (Exception e2) {
				// TODO: handle exception
			}
		}
	}

}
