package h_collection;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

import e_oop.foodcourt.ScanUtil;

public class Board {
	/*
	 * List와 Map을 사용해 게시판 테이블을 만들고
	 * 조회, 등록, 수정, 삭제가 가능한 게시판을 만들어주세요.
	 * 
	 * 번호(PK), 제목, 내용, 작성자, 작성일시
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

	static int input;
	static List<Map<String, Object>> boardList = new ArrayList<>();
	static SimpleDateFormat sdf;
	static int SEQ_NUMBER;

	public static void main(String[] args) {

		Map<String, Object> user = new HashMap<>();
		// 번호(PK), 제목, 내용, 작성자, 작성일시
		// NUMBER	TITLE	CONTENT		WRITER		DATETIME

		sdf = new SimpleDateFormat("MM-dd HH:mm");
		user.put("NUMBER", ++SEQ_NUMBER);
		user.put("TITLE", "안녕하세요");
		user.put("CONTENT", "안녕안녕");
		user.put("WRITER", "홍길동");
		user.put("PWD", "1234");
		try {
			user.put("DATETIME", sdf.parse("08-01 15:26"));
		} catch (ParseException e) {
			e.printStackTrace();
		}
		boardList.add(user);

		user = new HashMap<>();
		user.put("NUMBER", ++SEQ_NUMBER);
		user.put("TITLE", "반갑습니다");
		user.put("CONTENT", "반갑반갑");
		user.put("WRITER", "이순신");
		user.put("PWD", "1234");
		try {
			user.put("DATETIME", sdf.parse("08-02 20:20"));
		} catch (ParseException e) {
			e.printStackTrace();
		}
		boardList.add(user);

		user = new HashMap<>();
		user.put("NUMBER", ++SEQ_NUMBER);
		user.put("TITLE", "가입인사");
		user.put("CONTENT", "가입가입");
		user.put("WRITER", "아이유");
		user.put("PWD", "1234");
		try {
			user.put("DATETIME", sdf.parse("08-03 13:31"));
		} catch (ParseException e) {
			e.printStackTrace();
		}
		boardList.add(user);

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

	private static void updateRow() {
		System.out.print("게시물 번호 입력 >> ");
		input = ScanUtil.nextInt();
		boolean check = false;
		Map<String,Object> row = null;
		for(int i = 0; i < boardList.size(); i++) {
			if(Integer.parseInt(boardList.get(i).get("NUMBER").toString()) == input) {
				check = true;
				row = boardList.get(i);
				break;
			}
		}
		if(!check) {
			System.out.println("잘못입력하였습니다");
		}
		// 없는 번호 일때 상황
		// 상황 1: check == false;
		// 상황 2: row == null;
		if(row !=null) {
			System.out.print("1.제목수정 2.내용수정 3.작성자수정");
			input = ScanUtil.nextInt();
			switch(input) {
			case 1:
				System.out.println("현재 제목 : " + row.get("TITLE"));
				System.out.println("수정 입력 >>");
				String title = ScanUtil.nextLine();
				row.put("TITLE", title);
				break;
			case 2:
				System.out.println("현재 제목 : " + row.get("CONTENT"));
				System.out.println("수정 입력 >>");
				String content = ScanUtil.nextLine();
				row.put("CONTENT", content);
				break;
			case 3:
				System.out.println("현재 제목 : " + row.get("WRITER"));
				System.out.println("수정 입력 >>");
				String writer = ScanUtil.nextLine();
				row.put("WRITER", writer);
				break;
			}
		}
	}

	private static void showDetail() {
		System.out.print("게시물 번호 입력 >> ");
		input = ScanUtil.nextInt();
		boolean check = false;
		for(int i = 0; i < boardList.size(); i++) {
			Map<String, Object> row = boardList.get(i);
			if(Integer.parseInt(row.get("NUMBER").toString()) == input) {
				check = true;
				System.out.println();
				System.out.println("**** 내용 : " + row.get("CONTENT"));
				System.out.println();
				break;
			}
		}

		if(!check) {
			System.out.println();
			System.out.println("**** 해당하는 게시물이 없습니다.");
			System.out.println();
		}
	}

	private static void showList() {
		System.out.println("-----------------------------------------------");
		System.out.printf("%s\t%6s\t%4s\t%8s", "번호", "제목", "작성자", "작성일시");
		System.out.println();
		System.out.println("-----------------------------------------------");
		for(int i = 0; i < boardList.size(); i++) {
			Map<String, Object> item = boardList.get(i);
			System.out.printf("%2d\t%6s\t%4s\t%14s", item.get("NUMBER"), item.get("TITLE")
					, item.get("WRITER"), sdf.format((Date)(item.get("DATETIME"))));
			System.out.println();
		}
		System.out.println("-----------------------------------------------");
	}
	private static void insertRow() {
		Map<String, Object> row = new HashMap<>();
		System.out.println("제목 입력 >> ");
		String title = ScanUtil.nextLine();
		System.out.println("내용 입력 >> ");
		String content = ScanUtil.nextLine();
		System.out.println("작성자 입력 >> ");
		String writer = ScanUtil.nextLine();
		System.out.println("비밀번호 입력");
		String pwd = ScanUtil.nextLine();
		row.put("TITLE",title);
		row.put("CONTENT",content);
		row.put("WRITER",writer);
		Map<String, Object> lastRow = boardList.get(boardList.size()-1);
		int number = Integer.parseInt(lastRow.get("NUMBER").toString())+1;
		// SQL : SELECT MAX(NUMBER)+1 FROM BOARD
		// INSERT INTO BOARD (TITLE, CONTENT, WRITER, NUMBER, DATETIME)
		//		VALUES('{TITLE}','{CONTENT}','{WRITER}',(SELECT MAX(NUBER)+1 FROM BOARD),SYSDATE)

		// 시퀀스
		// SEQ_NUMBER.NEXTVAL
		//	 row.put("NUMBER", number); //MAX를 이용한 방법
		row.put("NUMBER", ++SEQ_NUMBER); //시퀀스를 이용한 방법
		row.put("DATETIME", new Date()); 
		System.out.println("등록이 완료되었습니다.");

		boardList.add(row);
	}
	private static void deleteRow() {
		System.out.println("번호입력 >> ");
		input = ScanUtil.nextInt();
		boolean check = false;
		for(int i = 0; i < boardList.size(); i++) {
			if(Integer.parseInt(boardList.get(i).get("NUMBER").toString()) == input) {
				check = true;

				for(int j = 1; j <=3; j++) {

					System.out.println("삭제 비밀번호 >> ");
					String pwd = ScanUtil.nextLine();
					if(boardList.get(i).get("PWD").toString().equals(pwd)) {
						boardList.remove(i);
						System.out.println("삭제되었습니다.");
						break;
					}else {
						System.out.println("비밀번호가 틀렸습니다.");
					}
				}
				break;
			}
		}
		if(!check) { 
			System.out.println("잘못 입력 하였습니다.");
		}
	}

}
