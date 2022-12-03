package i_jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;

import h_collection.ScanUtil;

public class JDBCTEST {

		/*
		 *  MEMBER 테이블에 새로운 사용자를 추가해보자
		 *  (단, MEM_ID, MEM_PASS, MEM_NAME 만 입력)
		 *  
		 */
	public static void main(String[] args) {
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String user = "KJI95";
		String password = "java";

		Connection conn =null;
		ResultSet rs = null;
		PreparedStatement ps = null;
		try {
			conn = DriverManager.getConnection(url, user, password);
			
//			String sql = " INSERT INTO MY_MEMBER VALUES ('a001', '1234', '아이유')  ";
//			ps = conn.prepareStatement(sql);
//			rs = ps.executeQuery();
			System.out.println("아이디입력 >> ");
			String id = ScanUtil.nextLine();
			System.out.println("비밀번호입력 >> ");
			String pwd = ScanUtil.nextLine();
			System.out.println("이름입력 >> ");
			String name = ScanUtil.nextLine();
			
			String sql = " INSERT INTO MY_MEMBER VALUES ( ?, ?, ? )";
			ps = conn.prepareStatement(sql);
			ps.setString(1, id);
			ps.setString(2, pwd);
			ps.setString(3, name);
			int result = ps.executeUpdate();
			if(result > 0){
				System.out.println(result + "개 등록완료!");
			}else {
				System.out.println("등록 실패!");
			}
		
			
//			String sql1 = " SELECT * FROM MY_MEMBER ";
//			Statement stmt = conn.createStatement();
//			rs = stmt.executeQuery(sql1);
//			while(rs.next()) {
//				String id = rs.getString("MEM_ID");
//				String pass = rs.getString("MEM_PASS");
//				String name = rs.getString("MEM_NAME");
//				System.out.println(id + "\t" + pass + "\t" + name + "\t");
	
			
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
		
		
		
		
		try {
			conn = DriverManager.getConnection(url, user, password);
			String sql = "SELECT * FROM MY_MEMBER";
			ps = conn.prepareStatement(sql);
			rs = ps.executeQuery();
			ResultSetMetaData rsmd = rs.getMetaData();
			int columnCount = rsmd.getColumnCount();
			for(int i = 1; i <columnCount; i++) {
				System.out.print(rsmd.getColumnName(i));
				
			}
			while(rs.next()) {
				for(int i = 1; i <=columnCount; i++) {
					System.out.print(rs.getObject(i) + "\t");
				}
				System.out.println();
			}
		}catch(SQLException e) {
			e.printStackTrace();
		}finally {
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
