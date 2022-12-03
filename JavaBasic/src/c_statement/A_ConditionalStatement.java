package c_statement;

import java.util.Scanner;

public class A_ConditionalStatement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		/* 조건문 
		 * - if문
		 * - switch문
		 * 
		 * if문
		 * - if(조건식) { 실행문 } : 조건식의 결과가 true면 블럭 안의 문장을 수행한다.
		 * - else if(조건식) { 실행문 } : 다수의 조건이 필요할 때 if 뒤에 추가한다.
		 * - else { 실행문 } : 결과가 true 조건이 하나도 없을 때 추가한다.
		 */
		
		
//		int a = 1;
//		if(a == 1) {
//			System.out.println("조건식의 연산 결과가 true면 수행된다.");
//		}
//		if(a == 0) {
//			System.out.println("조건식의 연산 결과가 false면 수행되지 않는다.");
//		}
		
		
		
		
		
		
//		if (a == 1) {
//			System.out.println("a가 1일 때 하고 싶은 것");
//		} else if(a == 2) {
//			System.out.println("a가 2일 때 하고 싶은 것");
//		} else if(a == 3) {
//			System.out.println("a가 3일 때 하고 싶은 것");
//		} else {
//			System.out.println("위 조건이 모두 false일 때 하고 싶은 것");
//		}
//		
		
		
		
		
		// 조건을 한 묶음으로 사용하기 위해서는 반드시 else if를 사용해야 한다.
		// 위의 조건에 걸리면 아래 조건들까지 가지도 않음.(아래 조건에 해당이 되더라도)
//		if(a < 10) {
//			System.out.println("a가 10보다 작다");
//		} else if(a < 20) {
//			System.out.println("a가 20보다 작다");
//		}
//		
		
		// 시험 점수가 60점 이상이면 합격, 아니면 불합격
//		int score = 60;
//		if(score >= 60) {
//			System.out.println("합격");
//		} else {
//			System.out.println("불합격");
//		}
		
		
		// 성적 등급을 부여하는 프로그램을 작성하세요. (ver.1)
		// 0 ~ 59 : F
		// 60 ~ 69 : D
		// 70 ~ 79 : C
		// 80 ~ 89 : B
		// 90 ~ 100 : A
		// 출력 예제 : "80점에 해당하는 등급은 B입니다."
		
		// 내 답
//		Scanner sc = new Scanner(System.in);
//		System.out.print("점수를 입력하세요>> ");
//		int score = Integer.parseInt(sc.nextLine());
//		
//		if(score > 0 && score <= 59) {
//			System.out.println("F");
//		} else if(score >= 60 && score <= 69) {
//			System.out.println("D");
//		}  else if(score >= 70 && score <= 79) {
//			System.out.println("C");
//		}  else if(score >= 80 && score <= 89) {
//			System.out.println("B");
//		}  else {
//			System.out.println("A");
//		}
//		  >> 이게 내가 짠 코드인데 별로인 듯...
//		  >> 범위가 누적되므로 굳이 이렇게 나눌 필요 없다.
//	  	  >> grade 변수를 지정을 안 해 놔서 출력값이 달라진다. 
		
		// 팁! 정렬 : ctrl + shift + f
		
		
		// 정답!
//		Scanner sc = new Scanner(System.in);
//		System.out.print("점수를 입력해 주세요>> ");
//		int score = Integer.parseInt(sc.nextLine());
//		String grade = ""; // String타입을 담을 grade라는 변수를 선언하고 초기화함. 여기에 아무거나 넣을 수 있다는 뜻.
//		if(score >= 90) {
//			grade = "A";
//		} else if(score >= 80) {
//			grade = "B";
//		} else if(score >= 70) {
//			grade = "C";
//		} else if(score >= 60) {
//			grade = "D";
//		} else {
//			grade = "F";
//		}
//		System.out.println(score + "점에 해당하는 등급은 " + grade + "입니다.");
		
		
		// 이렇게도 쓸 수 있음.
//		int score = 69;
//		String grade = ""; // String타입을 담을 grade라는 변수를 선언하고 초기화함. 여기에 아무거나 넣을 수 있다는 뜻.
//		if(score >= 90) grade = "A";
//		else if(score >= 80) grade = "B";
//		else if(score >= 70) grade = "C";
//		else if(score >= 60) grade = "D";
//		else grade = "F";
//		System.out.println(score + "점에 해당하는 등급은" + grade + " 입니다.");
		// 이렇게 괄호를 없애고 쓸 순 있는데, 이럴 땐 나중에 수정하기 어렵다는 단점이 있다.
		
		
		
		
		
		
		
	
		
		// 성적 등급을 부여하는 프로그램을 작성하세요. (ver.2)
		// 0 ~ 59 : F
		// 60 ~ 69 : D
		// 70 ~ 79 : C
		// 80 ~ 89 : B
		// 90 ~ 100 : A
		// 0 ~ 3 : -    ,     6 ~ 9 : +
		// 출력 예제 : "80점에 해당하는 등급은 B입니다."
		// "문자열" + "문자열"
		// grade += "+"
		// 68 % 10 = 8
		// 73 % 10 = 3
		
		
		// 내 답 (좀 지저분함...)
//		Scanner sc = new Scanner(System.in);
//		System.out.print("점수를 입력해 주세요>> ");
//		int score = Integer.parseInt(sc.nextLine());
//		String grade = "";
//		if(score >= 90) {
//			grade = (score < 93) ? "A-" : (score < 95 ? "A" : "A+");
//		} else if(score >= 80) {
//			grade = (score < 83) ? "B-" : (score < 85 ? "B" : "B+");
//		} else if(score >= 70) {
//			grade = (score < 73) ? "C-" : (score < 75 ? "C" : "C+");
//		} else if(score >= 60) {
//			grade = (score < 63) ? "D-" : (score < 65 ? "D" : "D+");
//		} else {
//			grade = "F";
//		}
//		System.out.println(score + "점에 해당하는 등급은 " + grade + "입니다.");
		
		
		// 선생님 답! (세상 간단함...)
//		Scanner sc = new Scanner(System.in);
//		System.out.print("점수를 입력해 주세요>> ");
//		int score = Integer.parseInt(sc.nextLine());
//		String grade = ""; // String타입을 담을 grade라는 변수를 선언하고 초기화함. 여기에 아무거나 넣을 수 있다는 뜻.
//		if(score >= 90) {
//			grade = "A";
//		} else if(score >= 80) {
//			grade = "B";
//		} else if(score >= 70) {
//			grade = "C";
//		} else if(score >= 60) {
//			grade = "D";
//		} else {
//			grade = "F";
//		}
//		if(!grade.equals("F")) {
//			if(score % 10 <= 3) {
//				grade += "-";
//			} else if(score % 10 >= 6) {
//				grade += "+";
//			}
//		}
//		System.out.println(score + "점에 해당하는 등급은 " + grade + "입니다.");
		
		
		
		
		
		
		
		
		/* switch문 
		 * 
		 * switch (int/String) { 
		 * case 1: 
		 * 
		 * 			break; 
		 * }
		 * 
		 * - 조건식의 결과는 정수와 문자열(jdk 1.7~)만 허용된다.
		 * - 조건식과 일치하는 case문 이후의 문장을 수행한다. (break 안 걸면 끝까지 다 수행)
		 * - 넘어올 값이 완벽하게 예상이 될 때 사용함. 주로 if문을 많이 사용.
		 * */
		
//		a = 4;
//		switch(a) {
//		case 1:
//			System.out.println("a가 1인 경우에 하고 싶은 것");
//			break;
//		case 2:
//		case 3:
//			System.out.println("a가 2 혹은 3인 경우에 하고 싶은 것");
//			break;
//		case 4:
//			System.out.println("a = 4");
//		case 5:
//			System.out.println("a = 5");
//			break;
//		}
		
		
		
		// 주어진 월에 해당하는 계절을 출력해 봅시다. (switch 사용)
//		int month = 3;
//		String season = ""; // String season = null; >> 이렇게 써도 같은 의미
//		switch(month) {
//			case 3: case 4: case 5:
//				season = "봄";
//				break;
//			case 6: case 7: case 8:
//				season = "여름";
//				break;
//			case 9: case 10: case 11:
//				season = "가을";
//				break;
//			case 12: case 1: case 2:
//				season = "겨울";
//				break;
//			default:  // else if('그게 아니면')이라는 의미, 웬만해선 잘 안 씀. 목적을 갖고 쓰는 게 아니라 예외를 위해 쓰는 것 뿐.
//				season = "월 이상함";
//				break;
//		}
//		System.out.println(month + "월은 " + season + "입니다.");
		
		
		// 위에서 작성한 점수별 등급표를 switch로 작성해 주세요.
		// 성적 등급을 부여하는 프로그램을 작성하세요. (ver.2)
		// 0 ~ 59 : F
		// 60 ~ 69 : D
		// 70 ~ 79 : C
		// 80 ~ 89 : B
		// 90 ~ 100 : A
		// 출력 예제 : "80점에 해당하는 등급은 B입니다."
//		int score = 33;
//		String grade = "";
//		switch(score / 10) {        // int 혹은 String만 가능
//		case 10: case 9:
//			grade = "A";
//			break;
//		case 8:
//			grade = "B";
//			break;
//		case 7:
//			grade = "C";
//			break;
//		case 6:
//			grade = "D";
//			break;
//		case 0: case 1: case 2: case 3: case 4: case 5:
//			grade = "F";
//			break;
//		}
//		System.out.println(score + "점에 해당하는 등급은 " + grade + "입니다.");
		
		
		
		// 숫자 3개를 입력 받아 내림차순으로 출력해 주세요. (정렬 문제)
		// if문 사용
		// 입력 예 : 85 97 14
		// 출력 예 : "97 > 85 > 14"
//		int a = 1;
//		Scanner sc = new Scanner(System.in);
//		System.out.print("첫 번째 숫자를 입력해 주세요>> ");
//		int x = Integer.parseInt(sc.nextLine());
//		System.out.print("두 번째 숫자를 입력해 주세요>> ");
//		int y = Integer.parseInt(sc.nextLine());
//		System.out.print("세 번째 숫자를 입력해 주세요>> ");
//		int z = Integer.parseInt(sc.nextLine());
//		
//		if(x < y) {
//			int temp = x;   // temp라는 임시저장소를 만들어서 보관해 놓음.
//			x = y;
//			y = temp;
//		}
//		if(x < z) {
//			int temp = x;
//			x = z;
//			z = temp;
//		}
//		if(y < z) {
//			int temp = y;
//			y = z;
//			z = temp;
//	}
//	System.out.println(x + " > " + y + " > " + z);
	// 값들의 자리를 바꾸기 위해 어딘가에 자료를 넣어 놨다가 다시 빼서 쓰는 부분이 포인트!
		
		
		
		
		
		
	}

}
