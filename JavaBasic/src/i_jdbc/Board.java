package i_jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Board {
	/*
	 * JAVA_BOARD 테이블을 만들고 JDBC를 사용해
	 * 조회, 등록, 수정, 삭제가 가능한 게시판을 만들어주세요.
	 * 
	 * NUMBER(PK), TITLE, CONTENT, WRITER, DATETIME
	 * 
	 * 실행 예)
	 * --------------------------------------------
	 * 번호		제목		작성자		작성일시
	 * --------------------------------------------
	 * 1	안녕하세요		홍길동		08-01 15:26
	 * 2	반갑습니다		이순신		08-02 20:20
	 * 3	가입인사		아이유		08-03 13:31
	 * --------------------------------------------
	 * 1.조회	2.등록	3.삭제	4.수정 0.종료
	 * 원하는 메뉴 입력 >> 
	 * */

	static final String URL = "jdbc:oracle:thin:@localhost:1521:xe";
	static final String USER = "KJI95";
	static final String PASSWORD = "java";
	static final SimpleDateFormat SDF = new SimpleDateFormat("MM-dd");

	static Connection conn = null;
	static ResultSet rs = null;
	static PreparedStatement ps = null;
	static int input;
	static String sql;

	static JDBCUtil jdbc = JDBCUtil.getInstance();




	public static void main(String[] args) {

		//	      JDBCUtil jdbc = new JDBCUtil();  // 외부에서 생성자를 호출할 수 없음. private으로 설정해놔서.
		//	      JDBCUtil jdbc = JDBCUtil.getInstance();
		//	      jdbc.method();



		//	      try {
		//
		//	         conn = DriverManager.getConnection(URL, USER, PASSWORD);
		//
		//	         sql = "CREATE TABLE JAVA_BOARD ( "
		//
		//	               + " BOARD_NUMBER NUMBER NOT NULL, "
		//
		//	               + " TITLE VARCHAR2(100), "
		//
		//	               + " CONTENT VARCHAR2(100), "
		//
		//	               + " WRITER VARCHAR2(100), "
		//
		//	               + " DATETIME DATE, "
		//
		//	               + " CONSTRAINT PK_BOARD_NUMBER PRIMARY KEY(BOARD_NUMBER)) ";
		//
		//	         ps = conn.prepareStatement(sql);
		//
		//	         ps.executeUpdate();
		//
		//	      }catch(SQLException e) {
		//
		//	         e.printStackTrace();
		//
		//	      }finally {
		//
		//	         if(rs != null) try {  rs.close();  } catch (Exception e) { }
		//
		//	         if(ps != null) try {  ps.close();  } catch (Exception e) { }
		//
		//	         if(conn != null) try { conn.close(); } catch (Exception e) { }
		//
		//	      }




		main:

			while(true) {

				System.out.println("================= 자유 게시판 =================");

				showList();

				System.out.println("1.조회 2.등록 3.삭제 4.수정 0.종료");

				System.out.print("메뉴 선택 >> ");

				input = ScanUtil.nextInt();

				switch(input) {

				case 1:

					showDetail();

					break;

				case 2:

					insertRow();

					break;

				case 3:

					deleteRow();

					break;

				case 4:

					updateRow();

					break;

				case 0: default:

					System.out.println("프로그램을 종료합니다..");

					break main;

				}

			}

	}









	private static void insertRow() {
		// 1. JDBC를 직접 이용하는 방법
		//		      try {
		//
		//		         conn = DriverManager.getConnection(URL, USER, PASSWORD);
		//
		//		         sql = "INSERT INTO JAVA_BOARD "
		//
		//		               + " (BOARD_NUMBER, CONTENT, TITLE, WRITER, DATETIME) " 
		//
		//		               + " VALUES (SEQ_NUMBER.NEXTVAL, ?, ?, ?, SYSDATE)";
		//
		//		         ps = conn.prepareStatement(sql);
		//
		//		         
		//
		//		         System.out.print("내용 입력 >> ");
		//
		//		         String content = ScanUtil.nextLine();
		//
		//		         ps.setString(1, content);
		//
		//		        
		//
		//		         System.out.print("제목 입력 >> ");
		//
		//		         ps.setString(2, ScanUtil.nextLine());
		//		         
		//
		//		         
		//		         System.out.print("작성자 입력 >> ");
		//
		//		         ps.setString(3, ScanUtil.nextLine());
		//
		//		         
		//
		//		         int result = ps.executeUpdate();
		//		         if(result > 0) {
		//		            System.out.println(result + "개 등록완료 !");
		//		         }else {
		//		            System.out.println("등록 실패!");
		//		         }
		//
		//		         
		//
		//		      }catch(SQLException e) {
		//
		//		         e.printStackTrace();
		//
		//		      }finally {
		//
		//		         if(rs != null) try {  rs.close();  } catch (Exception e) { }
		//
		//		         if(ps != null) try {  ps.close();  } catch (Exception e) { }
		//
		//		         if(conn != null) try { conn.close(); } catch (Exception e) { }
		//
		//		      }


		// 2. JDBCUtill을 이용하는 방법
		sql = "INSERT INTO JAVA_BOARD "
				+ " (BOARD_NUMBER, CONTENT, TITLE, WRITER, DATETIME) " 
				+ " VALUES (SEQ_NUMBER.NEXTVAL, ?, ?, ?, SYSDATE)";
		List<Object> param = new ArrayList<>();

		System.out.print("내용 입력 >> ");
		param.add(ScanUtil.nextLine());
		System.out.print("제목 입력 >> ");
		param.add(ScanUtil.nextLine());
		System.out.print("작성자 입력 >> ");
		param.add(ScanUtil.nextLine());
		// sql문의 물음표의 순서와 입력받는 순서가 같아야 함.

		int result = jdbc.update(sql, param);
		// 0이면 등록x, 0 이상이면 등록o
		if(result > 0) {
			System.out.println("등록되었습니다!");
		} else {
			System.out.println("등록 실패!");
		}


	}



	private static void showList() {
		// 1. jdbc를 직접 이용하는 방법
		//		      try {
		//
		//		         conn = DriverManager.getConnection(URL, USER, PASSWORD);
		//
		//		         sql = "SELECT * FROM JAVA_BOARD";
		//
		//		         ps = conn.prepareStatement(sql);
		//
		//		         rs = ps.executeQuery();
		//
		//		         
		//
		//		         System.out.println("-----------------------------------------------");
		//
		//		         System.out.printf("%s\t%6s\t%4s\t%6s", "번호", "제목", "작성자", "작성일");
		//
		//		         System.out.println();
		//
		//		         
		//
		//		         while(rs.next()) {
		//
		//		            System.out.printf("%2d\t%6s\t%4s\t%9s", rs.getInt("BOARD_NUMBER")
		//
		//		                  , rs.getString("TITLE"), rs.getString("WRITER")
		//
		//		                  , SDF.format(rs.getDate("DATETIME")));
		//
		//		            System.out.println();
		//
		//		         }
		//
		//		         
		//
		//		         System.out.println("-----------------------------------------------");
		//
		//		      }catch(SQLException e) {
		//
		//		         e.printStackTrace();
		//
		//		      }finally {
		//
		//		         if(rs != null) try {  rs.close();  } catch (Exception e) { }
		//
		//		         if(ps != null) try {  ps.close();  } catch (Exception e) { }
		//
		//		         if(conn != null) try { conn.close(); } catch (Exception e) { }
		//
		//		      }
		//
		//		      
		//
		//   }

		//2. JDBCUtill을 이용하는 방법
		sql = "SELECT * FROM JAVA_BOARD ORDER BY BOARD_NUMBER ASC";
		List<Map<String, Object>> list = jdbc.selectList(sql);

		System.out.println("-----------------------------------------------");
		System.out.printf("%s\t%6s\t%4s\t%6s", "번호", "제목", "작성자", "작성일");
		System.out.println();

		if(list == null || list.size() == 0) {
			System.out.println("           게시글 없음");
		} else {

			//for(int i = 0; i < list.size(); i++) { // => list.get(i).get("{COLUMN_NAME}")
			for(Map<String, Object> item : list) {  // => item.get("{COLUMN_NAME}")
				System.out.printf("%2d\t%6s\t%4s\t%9s", 
						Integer.parseInt(item.get("BOARD_NUMBER").toString()),
						item.get("TITLE"), 
						item.get("WRITER"), 
						SDF.format(item.get("DATETIME")));
				System.out.println();
			}
			System.out.println("-----------------------------------------------");
		}
	}













	private static void showDetail() {
		// 1. JDBC를 직접 연결하는 방법
		//		      try {
		//		           conn = DriverManager.getConnection(URL, USER, PASSWORD);
		//		            sql = " SELECT * FROM JAVA_BOARD WHERE BOARD_NUMBER = ? ";
		//		            ps = conn.prepareStatement(sql);
		//		            System.out.print("번호 입력 >> ");
		//		            ps.setInt(1, ScanUtil.nextInt());
		//		            rs = ps.executeQuery();
		//		            
		//		            boolean check = rs.next();   // 첫 번째행에는 컬럼 외에 값이 없으므로 값이 있는 다음 행으로 넘어가라는 뜻
		//		            if(check) {  // 값이 있다 -> 1개의 row라도 존재한다.
		//		               System.out.println("+++내용 :: " + rs.getString("CONTENT")) ;
		//		            } else { // 값이 없다 -> row가 조회되지 않았다.
		//		               System.out.println("잘못 입력했습니다.");
		//		            }
		//		            
		//   } catch (Exception e) {
		//		      e.printStackTrace();
		//   }    finally {
		//		      
		//		      if(rs != null) try{ rs.close(); } catch (Exception e) {}
		//		      if(ps != null) try{ ps.close(); } catch (Exception e) {}
		//		      if(conn != null) try{ conn.close(); } catch (Exception e) {}
		//   }

		// 2. JDBCUtil을 이용하는 방법
		sql = "SELECT * FROM JAVA_BOARD WHERE BOARD_NUMBER = ?";
		System.out.print("번호 입력 >> ");
		List<Object> param = new ArrayList<>();
		param.add(ScanUtil.nextInt());
		Map<String, Object> row = jdbc.selectOne(sql, param);
		//		      System.out.println(row);
		if(row == null) {
			System.out.println("잘못 입력했습니다.");
		} else {
			System.out.println("+++ 내용 :: " + row.get("CONTENT"));
		}



	}









	private static void updateRow() {
		sql = "UPDATE JAVA_BOARD SET";
		System.out.print("수정할 글의 번호 입력 >> ");
		int boardNumber = ScanUtil.nextInt();
		System.out.println("1. 제목   2. 내용   3. 작성자");
		System.out.print("번호 입력 >> ");
		switch(ScanUtil.nextInt()) {
		case 1:
			sql += " TITLE = ";
			break;
		case 2:
			sql += " CONTENT = ";
			break;
		case 3:
			sql += " WRITER = ";
			break;
		case 0:
		default:
			return;  // break 아니고 return : 메서드를 끝낸다는 의미
		}
		System.out.print("수정 내용 >> ");
		sql += " '" + ScanUtil.nextLine() + "' ";
		// 수정 내용이 문자열이라서? 아무튼 홑따옴표를 꼭 붙여줘야 함. 그래서 이렇게 씀.
		sql += " WHERE BOARD_NUMBER = " + boardNumber;
		// sql => "UPDATE JAVA_BOARD SET TITLE = '값값' WHERE BOARD_NUMBER = 1"
		int result = jdbc.update(sql);
		if(result > 0) {
			System.out.println("수정 성공!");
		} else {
			System.out.println("수정 실패!");
		}
	}
















	private static void deleteRow() {
		System.out.print("삭제할 번호 입력 >> ");
		sql = "DELETE FROM JAVA_BOARD WHERE BOARD_NUMBER = " + ScanUtil.nextInt();
		// sql => DELETE FROM JAVA_BOARD WHERE BOARD_NUMBER = 1    
		// -> 입력받은 걸 더하면 이런 모양이 됨. 그래서 ?가 필요없어졌음.
		jdbc.update(sql);
		int result = jdbc.update(sql);
		if(result > 0) {
			System.out.println("삭제되었습니다!");
		} else {
			System.out.println("삭제 실패!");
		}
	}



}