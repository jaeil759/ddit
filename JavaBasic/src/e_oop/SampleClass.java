package e_oop;

public class SampleClass {
	
	public static void main(String[] args) {
		int local = 10;
		// 지역변수 : 메서드안에서만 사용가능
		new SampleClass().flowTest1();
	}
	/*
	 * field
	 * 
	 * 
	 */ 
	boolean field = false;
	// 전역변수 : 클래스 전체영역에서 사용가능
	// 초기화 하지 않아도 기본값으로 초기화
	
	String classNumber = "404";
	
	/*
	 *  - 메서드(method) : 변수를 가지고 하는 직업(일)
	 *  - 선언방법 : 접근제한자 리턴타입 메서드명(파라미터){} 
	 *  - 파라미터(매개변수) : 실행에 필요한 정보
	 *  - 리턴타입(반환타입) : 실행 후 돌려줘야하는 결과물
	 */
	
	public void method1() {
		// void : 메서드가 종료 후  반환하는 결과물이 없음
		// 파라미터가 없음
		System.out.println("리턴타입도 파라미터도 없음");
	}
	public void method2(String  parameter) {
		// String 타입의 파라미터가 필요하다.
		System.out.println(parameter + " : 파라미터를 받아 명령을 수행함");
	}
	public String method3() {
		//메서드가 종료후 반환하는 결과물이 String 타입이다.
		String str = "";
		return str;  // return 메서드를 종료한다.
//		System.out.println("메서드 종료"); 도달할수없는코드
	}
	//flowTest1() 호출 시 출력되는 문장에 번호를 붙여주세요.
	public void flowTest1() {
		System.out.println("flowTest1 시작 : 1 ");
		flowTest3();
		System.out.println("flowTest1 종료 : 6");
	}
	public void flowTest2() {
		System.out.println("flowTest2 시작 : 3");
		//flowTest1();
		System.out.println("flowTest2 종료 : 4");
	}
	public void flowTest3() {
		System.out.println("flowTest3 시작 : 2");
		flowTest2();
		System.out.println("flowTest3 종료 : 5");
	}
}



