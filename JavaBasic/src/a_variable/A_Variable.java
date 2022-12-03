package a_variable;

import java.util.Scanner;

public class A_Variable {
	public static void main(String[] args) { // 메소드 : 이거를 해야 뭐가... 됨
		// 클래스에 대해 배우기 전까지 모든 코드는 이곳에 작성된다.
		
		// 주석 : 프로그램 코드로 인식하지 않는 문장 (주로 코드를 설명하는 데에 사용한다.)
		
//			한줄 주석: ctrl + shift + c ///////
//			한줄 주석
//			한줄 주석
		
		/*범위 주석: ctrl + shift + / (해제: \)*/
		/*범위 주석
		* 범위 주석
		* 범위 주석 */
		/*데이터의 종류
		* - 정수 : 10, -10
		* - 실수 : 3.14, -1.8
		* - 문자 : 'a', '3', '가'
		* - 논리 : true, false
		* 
		* 프로그래밍 언어의 기준으로 데이터의 종류를 나눠 놓은 것 : 자료형 (data type)
		* 
		* 기본형 타입(괄호 안에는 자료형의 크기)
		* -정수 : byte(1), short(2), int(4), long(8)
		* -실수 : float(4), double(8)
		* -문자 : char(2)
		* -논리 : boolean(1)
		* 
		* 변수를 만들 때 타입을 사용한다
		* 데이터를 다룰 때 일반적으로 변수라는 그릇에 담아서 사용한다.
		* */
		
		// 변수 : 하나의 데이터를 담을 수 있는 그릇
		int age; // 변수 선언 : 변수를 만드는 곳
		double pi; // 한 블럭 안에서 변수의 이름은 중복될 수 없다.
//		float pi;
//		double pi;
		// 다른 블럭 안에서는 같은 이름을 사용할 수 있다.
//		int 국어, 영어, 수학;  >변수명에 한글 절대 쓰지 말 것!
		int kor, eng, math;	// >변수명은 소문자로 시작
		int scoreAvg;	// 낙타표기법: 두 단어 이을 떄 대문자 사용
		int score_total;	// 뱀표기법: 두 단어 이을 때 _ 사용
		
		//  = (대입연산자) : 오른쪽의 값을 왼쪽 변수에 저장
		age = 20; // 초기화 : 변수에 처음으로 값을 입력함
		//age = "20"; // 변수의 타입에 맞는 값을 저장해야 한다. > age는 int형인데 ""써서 오류남.
		
		int abc = 10; //보통 선언과 동시에 초기화를 한다.
		long l = 40L; //접미사 L을 붙여야 long 타입이 된다. *숫자는 int, 숫자에 .이 들어가면 double*
		float f = 5.5f; //접미사 f를 붙여야 float 타입이 된다.
		char c = '한'; // 단따옴표 안에 한 글자만 넣어야 한다.
		boolean b = true; // true, false 이 둘 중 하나만 들어감.
		
		// 8가지 기본형 타입을 사용해서 8개의 변수를 선언 및 초기화 해주세요.
		byte _byte = 10;
		short _short = 20;
		int _int = 30;
		long _long = 50L; //byte, short는 잘 사용 안 함.
		float _float = 1.1f;
		double _double = 2.2; //float보다는 double을 사용하는 편
		char _char = '안'; //한글이든 영어든 소문자든 두 글자는 안 됨. 한 글자만 됨.
		boolean _boolean = false;
		int vA=0, vB=1, vC=2; //이렇게 여러 변수를 한 번에 선언과 초기화 할 수 있다.
		
		System.out.println(_char); //콘솔에 출력할 때 이렇게 괄호에 해당 변수 넣어서 '저장(ctrl+s) > ctrl+F11' 눌러서 함.
		
		// 형변환
		int small = 10;
		long big = 10L;
		small = (int)big; // int가 long보다 큰 그릇이므로 int를 long에 담을 수 없지만 괄호를 쓰면 바꿀 수 잇음.
		big = small; // 표현 범위가 작은 쪽에서 큰 쪽으로의 형변환은 생략이 가능하다.
		
		/* (변수의) 명명규칙
		 * - 영문자 대소문자, 한글, 숫자, 특수문자(_ , $)를 사용할 수 있다.
		 * - 숫자로 시작할 수 없다. (int v123;) <이런 식으로 앞에 문자를 써 주면 변수명에 숫자도 입력 가능
		 * - 예약어는 사용할 수 없다. (int double;) <double이 예약어이기 때문에 변수명으로 사용 불가 (int vInt;) <이렇게 앞에 뭐 쓰면 가능?
		 * */
		
		/* 상수
		 * - 처음 담긴 값을 변경할 수 없는 그릇
		 * - 리터럴에 의미를 부여하기 위해 사용한다
		 * - 상수는 변하지 않는 값
		 * */
		final int MAX_NUMBER; // 변수명은 보통 소문자, 상수명은 보통 대문자(변하면 안 되므로)
		MAX_NUMBER = 10;
//		MAX_NUMBER = 20; // 컴파일 에러 발생
		
		// 출력
		System.out.print("'줄바꿈'을 하지 않는다.\n");
		System.out.print("\"줄바꿈\"을 하지 \\않는다.");
		System.out.println("줄바꿈을\t\t한다");
		System.out.print("나이 : " + age); // 문자열 뒤에 다른 걸(e.g. int) 넣으면 모두  같이 문자열로 인식
		System.out.println(); // 줄바꿈
		System.out.print("나이는 " + age + " 입니다.");
		System.out.println(); // 줄바꿈
		System.out.printf("나이는 %08d 입니다. \t _char: %s", age, _char); // 출력 포멧을 지정한다.
		System.out.println(); // 줄바꿈
		System.out.println(5 + 4 + "문자"); // 숫자+문자는 '숫자+문자'형
		System.out.println("문자" + 5 + 4); // 문자+숫자는 전부 문자가 됨
		
		
//		// 입력
//		Scanner sc = new Scanner(System.in);
//		System.out.print("아무거나 입력해주세요>>");  // 입력값을 안내하는 곳
//		String str = sc.nextLine(); // 실제로 입력받는 곳
//		System.out.println(str);
//		
		//  syso + ctrl + space ('System.out.println()'의 단축어)
//		// 입력을 받게 되면 사용자가 입력할 때 프로그램이 멈추게 된다.
//		// 내용을 입력 후 엔터를 치면 입력이 종료되고 프로그램이 다시 진행된다.
//		
//		int nextInt = sc.nextInt();
//		double nextDouble = sc.nextDouble();
////		// >이런 것들이 있지만 버그로 인해 사용하지 않는다.
//		
//		System.out.print("int 입력 >> "); >숫자를 입력해야 한다는 의미로 int 사용
//		String input = sc.nextLine(); // 문자열을 받아서
//		int iInput = Integer.parseInt(input); // 문자열을 정수로 변환, 한글로 쓰면 오류남(?)
//				
		
		
		
		// 자신의 이름과 나이를 입력받아 변수를 선언 및 초기화하고 출력하시오.
		// 출력 예) 이름: 홍길동, 나이: 20세
		
//		Scanner sc = new Scanner(System.in); // 시스템으로부터 입력받기
//		System.out.print("이름을 입력해 주세요>> "); // 이름 입력 안내
//		String name = sc.nextLine(); // 줄이 바뀔 때까지 이름 입력받음
//		System.out.print("나이를 입력해 주세요>> "); // 나이 입력
//		String age2 = sc.nextLine(); // 줄이 바뀔 때까지 나이 입력받음
//		System.out.println("이름: " + name + ", 나이: " + age2 + "세");
		
		
		
		
		// 자신의 이름과 나이를 입력받아 변수를 선언 및 초기화하고 출력하세요.
		// 출력 예) 이름: 홍길동, 현재 나이: 20세, 내년 나이: 21세
		
//		Scanner sc = new Scanner(System.in);
//		System.out.print("이름을 입력해 주세요>> ");
//		String myName = sc.nextLine();
//		System.out.print("나이를 입력해 주세요>> ");
//		String myAge = sc.nextLine();
//		int nextAge = Integer.parseInt(myAge) + 1;
//		System.out.printf("이름: %s, 나이: %s, 내년 나이: %d", myName, myAge, nextAge);
		
		// 혹은
		
//		  Scanner sc = new Scanner(System.in); System.out.print("이름을 입력해 주세요>> ");
//		  String myName = sc.nextLine(); System.out.print("나이를 입력해 주세요>> "); String
//		  myAge = sc.nextLine(); int nextAge = Integer.parseInt(myAge) + 1;
//		  System.out.println("이름: " + myName + ", 현재 나이: " + myAge + "세, 내년 나이: " +
//		  nextAge + "세");
		 
		
		
		
		
//		Integer.parseInt(myAge);
//		Float.parseFloat(myAge);
//		Double.parseDouble(myAge);
		
		
	}

}
