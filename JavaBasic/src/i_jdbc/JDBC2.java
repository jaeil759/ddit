package i_jdbc;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;

public class JDBC2 {

	public static void main(String[] args) {
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String user = "KJI95";
		String password = "java";

		Connection conn =null;
		ResultSet rs = null;
		PreparedStatement ps = null;

		try {
			conn = DriverManager.getConnection(url, user, password);
			
			String sql = "SELECT * "
					+ " FROM CART "
					+ " WHERE CART_MEMBER= ? ";
			ps = conn.prepareStatement(sql);
			ps.setString(1, "a001"); // setString 이기에 자동으로 ''로 감싸짐
			// ps.setString(parameterIndex, x);
			// 단, parameter Index는 1부터 시작
			// ps.setInt(parameterIndex, x);
			// ps.setObject(parameterIndex, x);
			// ps.setDate(parameterIndex, x);
			// ps.setDate(parameterIndex, new Date());
			//setDate(parameterIndex, java.sql.Date);
//			ps.setDate(1,new Date(java.util.Date().getTime()));
			
			rs = ps.executeQuery();
			
			ResultSetMetaData rsmd = rs.getMetaData(); 
			// 메타데이터 : 데이터에 대한 데이터
			int columnCount = rsmd.getColumnCount();
			
			for(int i = 1; i <=columnCount; i++) {
				System.out.println(rsmd.getColumnName(i) + "\t");
			}
			while(rs.next()) {
				for(int i = 1; i <= columnCount; i++) {
//					Object o = rs.getObject(i); // index로 받기
					Object o = rs.getObject(rsmd.getColumnName(i)); // columnName 으로 받기
					System.out.print(o + "\t");
				}
				System.out.println();
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
