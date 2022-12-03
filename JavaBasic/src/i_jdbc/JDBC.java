package i_jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class JDBC {

	/*
	 * JDBC(Java Database Connectivity
	 * - 자바와 데이터베이스를 연결해주는 라이브러리
	 * - ojdbc : 오라클 JDBC
	 * 
	 *  JDBC 작성단계
	 *  1. Connection 생성
	 *  2. Statement 생성 (쿼리 query)
	 *  3. Statement 실행
	 *  4. ResultSet 에서 결과 추출(select경우)
	 *  5. ResultSet, Statement, Connection 닫기 
	 */


	public static void main(String[] args) {
		// 0. 데이터베이스 접속 정보 입력
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String user = "KJI95";
		String password = "java";

		Connection conn =null;
		ResultSet rs = null;
		PreparedStatement ps = null;
		try {
			// 1.Connection생성
			// DriverManager : 데이터베이스에 접속하기 위한 드라이버를 관리해주는 클래스
			conn = DriverManager.getConnection(url, user, password);
			// getConnection 에서 드라이버 자동 로드

			// 2. Statement 생성 (쿼리 query)
			String sql = "SELECT * FROM MEMBER";
			ps = conn.prepareStatement(sql);
			// 3. Statement 실행
			// select 
			rs = ps.executeQuery(); // rows, 일회성(휘발성)
			
			
			
			
			// update, delete, insert
			// int result = ps.executeUpdate(); // 업데이트의 결과가 정상이면 양수를 받아냄
			
			
			
			// 4. ResultSet 에서 결과 추출(select경우)
			// 최초 rs의 index는 -1
			while(rs.next()) {
				// rs -> row
				//				String memId = rs.getString("MEM_ID"); // 컬럼명을 이용하는 방식
				String memId = rs.getString(1); // 컬럼순서를 이용하는 방식
				String memPass = rs.getString("MEM_PASS");
				System.out.println("MEM_ID : " + memId + ", MEM_PASS : " + memPass);
				// rs.getInt("{COLUMN_NAME}");
				// rs.getData("{COLUMN_NAME}");
				// rs.getObject("{COLUMN_NAME}");
			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			// 5. ResultSet, Statement, Connection 닫기 
			if(rs !=null) {
				try{ 
					rs.close();
				} catch (Exception e) {

				} 


			}
			if(ps !=null) {
				try{ 
					ps.close();
				} catch (Exception e) {

				} 


			}
			if(conn !=null) {
				try{ 
					conn.close();
				} catch (Exception e) {

				} 


			}

		}

	}

}


