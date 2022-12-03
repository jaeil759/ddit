package b_operator;

public class B_ComparingOperator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/* 비교연산자 
		 * - > ,  < ,  >= ,  <= (방향 주의) , == (같다) , != (같지 않다)
		 * - 문자열 비교: equals()
		 * */
		
		
		// 비교연산자의 연산 결과는 boolean이다. (=참 or 거짓 밖에 없음.)
		boolean b = 10 < 20;
		System.out.println("10 < 20 : " + b);
		b = 10 <= (20 - 15);  // 한 줄 안에 연산 가능. 복잡한 건 괄호처리 가능
		System.out.println("10 <= (20 - 15) : " + b);
		
		String str1 = "abc";
		String str2 = "abc";
		b = str1 == str2;
		// 문자열의 내용이 아닌 주소를 비교함.
		System.out.println(b);
		
		
		// 참조형 타입 String
		String s1 = "java";
		String s2 = "java"; // s1과 s2의 주소는 같다(=참조하고 있는 메모리의 주소는 같다)
		System.out.println(s1 == s2);
		String s3 = new String("java");
		System.out.println(s1 == s3);
		System.out.println(s1.contentEquals(s3));
		//앞글자가 소문자인 타입들은 '=='으로 크기 비교 가능
		//앞글자가 대문자인 것들은 'System.out.println(s1.contentEquals(s3));' 이렇게 비교해야 함.
		
		System.out.println(true); // =true
		System.out.println(!true); // =false
		
		
		
		
		
		
	}

}
