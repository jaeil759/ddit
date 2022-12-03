package c_statement;

import java.util.Random;
import java.util.Scanner;

public class B_RepeatitiveStatement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/* 반복문
		 * - for 문
		 * - while 문
		 * - do-while 문
		 */
		
		
		/*  for 문
		 *  - for(초기화; 조건식; 증감식) {실행문}
		 *  - 초기화 : 조건식과 증감식에 사용할 변수를 초기화한다.
		 *  - 조건식 : 연산 결과가 true면 블럭({~}을 뜻함) 안의 내용을 수행한다.
		 *  - 증감식 : 변수를 증가/감소시켜 반복문을 제어한다.
		 *  - 실행문을 정해진 횟수만큼 반복하게 해 주는 문장
		 *  - i = for문 안에서 계속 도는? 숫자
		 */
		
//		for(int i = 1; i <= 10; i++) {        // 여기서 선언된 int는 for문 안에서만 사용함.
//			System.out.println(i + "번째 반복"); // 조건이 끝나면 반복도 끝남.
//		}
//		
//		// 규칙이 있는 문장들을 효율적으로 작성하기 위해 반복문을 사용한다.
		
		// 1부터 10까지의 합을 구하시오.
//		int sum = 0;
//		for(int i = 1; i <= 10; i++) {
//			sum += i;
//		}
//		System.out.println(sum);
//		
		
		
		
		
		
		
		// 1 ~ 100의 합을 구하시오.
//		int sum = 0;
//		for(int i = 100; i >= 1; i--) {
//			sum += i;
//		}
//		System.out.println(sum);
		
		
		
		
		
		
		
		// 1 ~ 100에서 짝수의 합을 구하시오.
		
		// 내 답. 틀린 답 나옴ㅠㅠ
//		int sum = 0;
//		for(int i = 1; i <= 100 && i % 2 == 0; i++) {
//			sum += i;
//		}
//		System.out.println(sum);
		
		
//		 선생님 답
//		int sum = 0;
//		for(int i = 100; i >= 1; i -= 2) {
//			sum += i;
//		}
//		System.out.println(sum);

		
		
		
		
		
		
		
	// 구구단 출력하기
	/* 출력 예시:
	 * 2 * 1 = 2 
	 * 2 * 2 = 4
	 * 2 * 3 = 6
	 * ...
	 * 2 * 9 = 18
	 */
		
		// 내 답
//		int mul = 1;
//		for(int i = 1; i <= 9; i++) {
//			mul = 2 * i;
//			System.out.println("2 * " + i + " = " + mul);
//		}
		
		
		// 선생님 답
//		for(int i = 1; i <= 9; i++) {
//		System.out.println("2 * " + i + " = " + (2 * i));
//	}

		
		
		
		
		
		
		// 1단 ~ 9단 구하기 (이중 for문)
//		for(int i = 2; i<= 9; i++) {         // 앞의 숫자(단) 변경
//			for(int j = 1; j <= 9; j++) {    // 뒤의 숫자 변경
//				System.out.println(i + " * " + j + " = " + (i * j));
//			}
//		}
		
		
		
		
		
		
		
		// 구구단 전체를 가로로 출력해 주세요.
		// 출력 예시
		/* 
		 * 2 * 1 = 2 	3 * 1 = 3	4 * 1 = 4 ...
		 * 2 * 2 = 4 	3 * 2 = 6	4 * 2 = 8 ...
		 * 2 * 3 = 6 	3 * 3 = 9	4 * 3 = 12 ...
		 */
		
//		for(int i = 1; i <= 9; i++) {
//			for(int j = 2; j <= 9; j++) {
//				System.out.print(j + " * " + i + " = " + (j * i) + "\t");
//			}
//			System.out.println();   // (바깥 for문 모든 단의 *1이 끝났으므로) 줄을 바꿔줌.
			
			// 안과 밖이 도는 과정을 잘 파악해야...
			
			
			
			
			
			
			
			
			
			
			/* while문
			 * - while(조건식){실행문}
			 * - 실행문을 조건식이 만족하는 동안 '계속' 반복하는 문장
			 * - 반복 횟수가 정확하지 않을 때 사용
			 */
			
		
	
		// a에 2씩 몇 번을 곱해야 1000 이상이 되는지 알고 싶다.
//		int a = 1;
//		int count = 0;       // 몇 번인지(=count), 그 변수를 초기화 시켜 놓음
//		while(a < 1000){         // 이 조건식이 true이면 계속 함
//			a *= 2;
//			count++;      // 여기 조건을 잘못 사용하면 이 자리에 멈춰 있으므로ㅠ 잘 정해야 함
//			System.out.println(count + " : " + a);
//		}
//		
		
		
		
		
		
		
		
		
		
		
		/* do-while 문
		 * - do{실행문}while(조건식)
		 * - 최소 한 번의 실행이 보장된다.
		 * - do-while문이 생각 안 나면 그냥 while문 써도 됨...
		 */
//		
//		do {                // 뭔가를 하고 나서 (=실행문)
//			
//		} while();          // 그게 맞게 돌아가는지 보자. (=조건식)
		
		
		
		// 숫자 맞추기 게임
//		Random rnd = new Random();
//		int qNum = rnd.nextInt(100);       // 0~99까지의 정수
//		int input = 0;
//		Scanner sc = new Scanner(System.in);
//		do {
//			System.out.print("0부터 99까지의 정수를 입력해 주세요.");
//			input = Integer.parseInt(sc.nextLine());
//			if(input > qNum) {
//				System.out.println(input + " 보다 작습니다.");
//			} else if(input < qNum) {
//				System.out.println(input + " 보다 큽니다.");
//			} else {
//				System.out.println("정답입니다.");
//			}
//		} while(input != qNum);
//		
//		fuck:
//			for(int i = 1; i<=10; i++) {
//				for(int j = 1; j<=10; j++) {
//					if(j == 5) {
//						continue;
//					}
//					System.out.println(i + " : " + j);
//					break fuck;
//					//break; : 가장 가까운 반복문 하나를 빠져나간다.
//					//break fuck : fuck 라는 이름의 반보문을 빠져나간다.
//					//continue; : 가장 가까운 반복문의 현재 반복 회차를 빠져나간다.
//					//continue fuck out fuck 라는 이름의 현재 난보
//					
//					
//				}
//				System.out.println("");
				
				
			//}
			
			for(int i = 1; i<=5; i++) {
				for(int j = 1; j <=1; j++) {
					
					System.out.print("*");
				}
				System.out.println();
				
			}
		
		
		
		
	}

}
