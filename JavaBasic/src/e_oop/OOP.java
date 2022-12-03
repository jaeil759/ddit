package e_oop;

public class OOP {

	public static void main(String[] args) {
		/*
		 * 객체지향 프로그래밍(ObjectOriented Programming)
		 * - 프로그램을 단순히 코드의 연속으로 보는것이 아니라
		 * 		객체간의 상호작용으로 보는것
		 * - 코드의 재사용성이 높고 유지보수가 용이하다.것
		 */
		
		// 객체 : 클래스를 이용하여 만든 것
		SampleClass sc1 = new SampleClass();
		SampleClass sc2 = new SampleClass();
		SampleClass sc3 = new SampleClass();
		
		 
		System.out.println(sc1.classNumber);
		sc2.classNumber = "405";
		System.out.println(sc2.classNumber);
		
		sc3.flowTest3();
		sc3.method2("param");
		
		
		System.out.println("--------------------------------------------------------------------");
		// 방금만든 클래스의 객체를 생성하고 변수에 저장해주세요.
		// 객체가 저장된 변수를 통해 메서드를 호출해주세요
		// 파라미터가 있는데 메서드는 타입에 맞는 값을 넘겨주고,
		// 리턴타입이 있는 메서드는 리턴받은 값을 출력해주세요.
		ClassMaker cm = new ClassMaker();
		
		
		cm.method1();
		int a = cm.method2(); // 리턴받은 결과값을 다음에도 사용하고 싶을때
		System.out.println(a);
		System.out.println(cm.method2()); // 리턴값을 재사용할 필요가 없을때
		cm.method3("abcd");
		int b = cm.method4(2, 5);
		System.out.println(b);
		
		
		System.out.println("-----------------------------------------------------");
		// 다음을 한 줄씩 계산해서 최종 결과값을 출력해 주세요
		// Calculator 클래스를 만들고 각 번호별 메소드를 만들어주세요.
		// 1. 123456 + 654321
		// 2. 1번의 결과값 * 123456
		// 3. 2번의 결과값 / 123456
		// 4. 3번의 결과값 - 654321
		// 5. 4번의 결과값 % 123456
		Calculator c = new Calculator();
		double result = c.add(123456,654321);
		result = c.multiply(result,123456);
		result = c.divide(result, 123456);
		result = c.subract(result, 654321);
		System.out.println(c.remainder(result, 123456));
		
		
		
		
	}

}
