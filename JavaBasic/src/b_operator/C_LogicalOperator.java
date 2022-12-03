package b_operator;

public class C_LogicalOperator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/* 논리연산자
		 * - &&(AND), ||(OR)(Shift + \), !(NOT), ^(XOR)(잘 안 씀)
		 * - 피연산자로 boolean만 허용된다. 
		 *  */
		
		boolean b = 5 < 10 && 15 % 2 == 0 || 9 > 5;
		// 실행 순서:  사칙연산 > && > || 의 순서대로 연산
		
		// 효율적 연산 
		b = true && true; // true
		b = true && false; // false
		b = false && true; // false
		b= false && false; // false
				
		b = true || true; // true >앞의 조건이 true면 뒤는 안 봄. 이미 하나가 true니까 true임.
		b = true || false; // true
		b = false || true; // true
		b = false || false; // false
		// 왼쪽의 피연산자에서 결과가 정해지면 오른쪽은 수행하지 않는다.(e.g.첫 번째 예시)
		int d = 0;
		System.out.println(d == 0 || 0 == ++d);
		System.out.println(d);
		
		// int타입의 x와 y변수를 만들고 다음의 문장들을 코드로 작성해 주세요.
		int x = 10,  y = 20;
		// 1. x가 y보다 크고, x가 10보다 작다.
		b = x > y && x < 10;
		System.out.println(b);
		// 2. x가 짝수이고, x가 y의 배수이다.
		b = (x % 2 == 0) && (x % y == 0);
		System.out.println(b);
		// 3. x가 3의 배수이거나, x가 5의 배수이다.
		b = (x % 3 == 0) || (x % 5 == 0);
		System.out.println(b);
		
		
		
	}

}
