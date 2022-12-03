package e_oop;

public class ClassMaker {
	//1. 전역변수 하나를 선언 및 초기화 해주세요.
	int a = 10;
	//2. 리턴타입과 파라미터가 없는 메서드를 하나 만들어주세요.
	//	- 메서드 안에서 전역변수를 출력해 주세요.
	public void method1() {
		System.out.println(a);
	}
	// 3. 전역변수와 동일한 타입의 리턴타입이 있고, 파라미터없는 메서드를 하나 만들어주세요
	// - 메서드 안에서 전역변수를 리턴해주세요
	public int method2() {
		return this.a;
	}
	// 4. 리턴타입은 없고 파라미터가 있는 메서드를 하나를 만들어주세요
	// - 메서드 안에서 파라미터를 출력해 주세요.
	public void method3(String str) {
		System.out.println(str);
	}
	// 5. int 타입의 리턴타입과 int 타입의 파라미터 두개가 있는 메서드를 하나 만들어 주세요
	// - 메서드 안에서 두 파라미터를 곱한 결과를 리턴해주세요.
	public int method4(int a, int b) {
		
		return a * b;
		
	}
}
