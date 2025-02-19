package org.joonzis.ex;

import java.sql.Connection;
import java.sql.PreparedStatement;

import org.joonzis.db.DBConnection;

public class Ex03_delete {

	public static void main(String[] args) {
		
		// 김씨의 나이를 100살로, 지역을 '마포'로 변경
				Connection conn = null;
				PreparedStatement ps = null;
				
				try {
					conn = DBConnection.getConnection();
					
					//주의!! 띄어쓰기, 세미콜론(삭제)
					String sql = "delete from person " + "where name = ?";
					
					ps = conn.prepareStatement(sql);
					
					ps.setString(1,  "김씨");
					int result = ps.executeUpdate();
				
					if(result > 0) {
						System.out.println("데이터 삭제 성공");
					}else {
						System.out.println("데이터 삭제 실패");
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
