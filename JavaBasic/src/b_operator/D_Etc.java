package b_operator;

import java.util.Scanner;

public class D_Etc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		/* ref: tcpschool.com/java/intro */
		/* 비트연산자 
		 * - | , & , ^, ~ , << ,  >> ,  >>>
		 * - 비트 단위로 연산한다.
		 * */
		
		
		
		
		/* 참조연산자 
		 * - . : 특정 범위 내에 속해 있는 멤버를 지칭함.
		 * e.g. (System.out.println();)
		 * - (type) : 형변환
		 * e.g. float f = (float)d;
		 * - ? :  :삼항연산자(?:  >>이 두 개가 한 연산자)
		 * e.g. 조건식 ? true실행문         : false실행문
		 * */

		
		// 삼항연산자
		int x = 10;
		int y = 20;
		int result = (x > y) ? x : y;
		System.out.println(result);
		System.out.println((x > y) ? x : y); // if문으로는 4줄이 나오는데 삼항연산자로는 1줄이면 됨
		// 위랑 아래 둘이 같은 식
		
		// 주민등록번호 뒷자리의 첫 번째 숫자가 1이면 남자, 2면 여자
		int regNo = 1;
		String gender = (regNo == 1) ? "남자" : "여자";
		System.out.println(gender);
		
		regNo = 3;
		gender = (regNo == 1) ? "남자" : "여자";
		System.out.println(gender);
		// 삼항연산자의 한계: 모르는 수가 입력되면 무조건 뒤의 결과로 출력
		// 해결책ㄱ
		regNo = 3;
		gender = (regNo == 1) ? "남자" : (regNo == 2 ? "여자" : "확인 불가");
		System.out.println(regNo);
		
		// 2개의 숫자를 입력받고, 둘 중에 더 큰 숫자를 출력해 주세요.
		// 한 번에 (여러 개도)임포트하기: ctrl + shift + o
		Scanner sc = new Scanner(System.in);
		System.out.print("첫 번째 숫자를 입력해 주세요>> ");
		int a = Integer.parseInt(sc.nextLine());
		System.out.print("두 번째 숫자를 입력해 주세요>> ");
		int b = Integer.parseInt(sc.nextLine());
		int bigNo = (a > b) ? a : b;
		System.out.println(bigNo);
		// 혹은 이렇게도 쓸 수 있다!
		//Scanner sc = new Scanner(System.in); 
		//System.out.print("첫 번째 숫자를 입력해 주세요>> ");
		//int a = Integer.parseInt(sc.nextLine());
		//System.out.print("두 번째 숫자를 입력해 주세요>> "); 
		//int b = Integer.parseInt(sc.nextLine()); 
		//boolean b1 = (a > b);
		//System.out.println(b1 ? a : b);
		//System.out.println(b1);
		
		
		// 단축키!!!
		// line 복사 : ctrl + alt + 화살표 위아래
		// line 삭제 : ctrl + d
		// line 이동 : alt + 화살표 위아래
		// 화면 확대/축소 : ctrl + +/- 
		// 페이지 단위로 스크롤 : ctrl + 휠 위아래
		
		
		// 숫자를 입력받고, 그 숫자가 1이나 3이면 남자를, 2나 4면 여자를 출력해 주세요.
		// 그 외의 숫자를 입력하면 확인 불가를 출력해 주세요.
		Scanner sc1 = new Scanner(System.in);
		System.out.print("숫자를 입력해 주세요>> ");
//		int input = Integer.parseInt(sc.nextLine());  >> 굳이 int로 바꾸지 않아도 됨.
		String input = sc.nextLine();
		String ib = input.equals("1") || input.equals("3") ? "남자" :
			(input.equals("2") || input.equals("4") ? "여자" : "확인불가");
		System.out.println(ib);
		
					
						
		boolean gM = input.equals("1") || input.equals("3") ? true : false;
		boolean gW = input.equals("2") || input.equals("4") ? true : false;
		
		
	}

}
