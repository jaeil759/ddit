package g_api;

import java.util.Arrays;

public class StringClass {
	
	/*
	 * String 
	 * - 여러개의 문자를 사용하기 쉽게 만들어놓은 클래스
	 * 
	 * String의 주요 메서드
	 * - equals() : 문자열의 내용이 같은지 반환한다.
	 * - length() : 문자열의 길이를 반환한다.
	 * - charAt() : 특정 인덱스에 위치한 문자를 반환한다.
	 * - substring() : 문자열의 특정 부분을 잘라서 반환한다.
	 * - indexOf() : 문자열내의 특정 문자의 인덱스를 반환한다.
	 * - contains() : 문자열이 특정 문자열을 포함하고 있는지 반환한다.
	 * - split() : 문자열을 특정 문자를 기준으로 나누어 배열형태로 반환한다.
	 * - trim() : 문자열 앞뒤 공백을 제거해 반환한다.
	 * - valueOf() : 다른 타입의 데이터를 문자열로 변환해 반환한다.
	 * 
	 */
	
	public static void main(String[] args) {
		String s1 = "문자열";
		String s2 = new String("문자열");	
		
		//equals();
		System.out.println(s1.equals(s2));
		
		//length();
		System.out.println(s1.length());
		
		//charAt();
		for(int i = 0; i < s1.length(); i++) {
			char charAt = s1.charAt(i); // '문','자','열'
			System.out.println(s1.charAt(i));
		}
		//문자열 뒤집기
		String rev = "";
		for(int i = s1.length() - 1; i>=0; i--) {
			rev +=s1.charAt(i);
		}
		System.out.println(rev);
		//substring();
		s1 = "abcdefghij";
		String sub1 = s1.substring(3); // 3번 인덱스 부터 끝까지
		System.out.println(sub1);
		String sub2 = s1.substring(5,8); // 5번 인덱스부터 8번인덱스까지
		System.out.println(sub2);
		
		//indexOf"();
		int indexOf = s1.indexOf("e");
		System.out.println(indexOf);
		indexOf = s1.indexOf("z");
		System.out.println(indexOf); // 찾으려는 문자열이 없으면 -1 반환함
		//예제) substring 과 indexOf 를 조합해서 가격만 int[]에 저장해주세요
		String[] menu = {
				"수박 20000원", 
				"오렌지 10000원", 
				"귤 500원", 
				"블루베리 3000원"
		};
		int[] price = new int[menu.length];
		for(int i = 0; i < menu.length; i++) {
			String name = menu[i].substring(0,menu[i].indexOf(" "));
			System.out.println(name);
			price[i] = Integer.parseInt(menu[i].substring(menu[i].indexOf(" ") +1, menu[i].indexOf("원")));
			
		}
		System.out.println(Arrays.toString(price));
		
		//contains();
		boolean contains = s1.contains("c"); // s1 = "abcdefghij";
		System.out.println(contains);
		//split();
		String[] split = s1.split("e"); // s1 = "abcdefghij";
		System.out.println(Arrays.toString(split));
		s1 = "a/b/c";
		split = s1.split("/");
		System.out.println(Arrays.toString(split));
		split = s1.split("@");
		System.out.println(Arrays.toString(split));
		//포함되지 않는 문자열로 나누면 길이 1을 갖는 문자열 배열로 전체 문자가 반환된다.
		for(int i = 0; i < menu.length; i++) {
			split = menu[i].split(" ");
			System.out.println("메뉴명 : " + split[0] + " / 가격 : " + split[1]);
		}
		//trim();
		s1 = " 문 자 열 ";
		String trim = s1.trim();
		System.out.println("[" + s1 + "] -> [" + trim + "]");
		//문자열의 앞 뒤 공백을 제거함
		// 사용자의 실수로 아이디나 비밀번호 뒤에 공백이 들어가는 것을 방지할 수 있음
		
		//valueOf();
		int number = 10;
		s1 = number + "";
		s1 = String.valueOf(number);
		System.out.println(s1);
	}
		
}
