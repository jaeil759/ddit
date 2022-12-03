package b_operator;

import java.util.Random;

public class A_ArithmeticOperator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/* 산술연산자 
		 * - 사칙연산 : +, -, *, /, %(나머지)
		 * - 복합 연산자 : +=, -=, *=, /=, %=
		 * - 증감 연산자 : ++, --
		 * */
		
		int result = 10 + 20 - ((30 * 40) / 50) % 60;
		// 곱하기와 나누기가 더하기 빼기보다 우선순위가 높다.
		// 웬만하면 괄호로 묶는 게 보기 좋고, 계산 속도도 차이남.
		
		// 나머지 연산
		result = 10 / 3;    // 3.333...
		System.out.println(result); 
		// int는 정수여서 소수점이 없으므로 나머지를 버리고 출력함. 반올림도 X
		result = 10 % 4;
		System.out.println(result);
		
		// 5개의 산술 연산자를 사용해서 5개의 연산을 수행해 보자.
		result = 10 - 20;
		System.out.println(result);
		result = 10 * 20;
		System.out.println(result);
		result = 10 / 20;
		System.out.println(result);
		result = 10 % 20;
		System.out.println(result);
		result = 10 + 20;
		System.out.println(result);
		
		// 복합 연산자
		// 변수에 저장되어 있는 값에 연산을 수행할 때
		// 수행할 연산자와 대입 연산자를 결합해 사용할 수 있다.
		result = result + 10;
		result += 10;
		System.out.println(result);
		
		result -= 10;
		result *= 2;
		result /= 2;
		result %= 10;
		
		result = result - 2 * 5;
		result -= 2 * 5; // 위와 같음

		
		// 증감연산자
		// 증가연산자(++): 변수의 값을 1 증가시킨다.
		// 감소연산자(--): 변수의 값을 1 감소시킨다.
		int i = 0;
		++i; // 전위형: 변수의 값을 읽어오기 전에 1 증가
		i++; // 후위형: 변수의 값을 읽어오고 나서 1 증가
		--i;
		i--;
		i = 0;
		System.out.println("++i = " + (++i)); // 증가를 시키고 더함
		i = 0;
		System.out.println("i++ = " + (i++)); // 더하고 증가를 시킴
		System.out.println("i = " + i);
		
		int _int = 10;
		double _double = 3.14;
		double result2 = _int + _double;
		// 표현 범위가 더 큰 타입으로 행변환된다.
		
		byte _byte = 5;
		short _short = 10;
		int result3 = _byte + _short;
		// int보다 작은 타입은 정수의 기본형인 int로 행변환된다.
		
		char _char1 = 'a';
		char _char2 = 'b';
		_int = _char1 + _char2;
		System.out.println(_int);
		// char타입은 문자지만 더할 때는 int처럼 쓸 수 있음.
		
		// 오버플로우, 언더플로우
		// 표현범위를 벗어나는 값을 표현할 때 발생하는 현상
		byte b = 127;
		b++; // 오버플로우
		System.out.println(b);
		b--; // 언더플로우
		System.out.println(b);
		// 타입을 선택할 때 연산의 범위를 고려해야 한다.
		
		
		
		// 다음을 한 줄씩 계산해서 최종 결과값을 출력해 주세요.
		// 1. 123456 + 654321
		// 2. 1번의 결과값 * 123456
		// 3. 2번의 결과값 / 123456
		// 4. 3번의 결과값 - 654321
		// 5. 4번의 결과값 % 123456
		
		
//		long a1 = 123456 + 654321;
//		System.out.println(a1);
//		long a2 = a1 * 123456;
//		System.out.println(a2);
//		long a3 = a2 / 123456;
//		System.out.println(a3);
//		long a4 = a3 - 654321;
//		System.out.println(a4);
//		long a5 = a4 % 123456;
//		System.out.println(a5);  > 내가 쓴 답
		
		long r = 123456;
		r += 654321; // 1
		r *= 123456; // 2
		r /= 123456; // 3
		r -= 654321; // 4
		r %= 123456; // 5
		System.out.println(r);  // > 선생님 답
		
		// 3개의 int형 변수를 선언 및 초기화 후에 합계와 평균을 구하세요.
		int num1 = 15;
		int num2 = 34;
		int num3 = 49;
		int sum = num1 + num2 + num3;
		System.out.println("합계: " + sum);
		double avg = sum / 3.0;  
		// float avg = sum / 3.0f; // int끼리는 소수점 표현x, double이나 float로 사용
		System.out.println("평균: " + avg);
		
		// 반올림, 올림, 버림
		// 반올림: Math.round(실수);
		// 올림: Math.ceil(실수);
		// 버림: Math.flood(실수);
		avg = Math.ceil(avg);
		System.out.println(avg);
		
		// 랜덤
		// Math.random(): 0.0~1.0 미만 (0.99999...)
		// 보안문제로 사용하지 않는다.
		// Random rnd = new Random();
		// rnd.nextInt(); >>int 범위 내(아마도 미만)의 int가 랜덤으로 출력
		// rnd.nextInt(45); >>범위 내의 int가 랜덤으로 출력
		Random rnd = new Random();
		System.out.println(rnd.nextInt(2));
		
	}

}
