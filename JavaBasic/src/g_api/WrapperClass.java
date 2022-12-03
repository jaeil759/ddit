package g_api;

import java.util.ArrayList;
import java.util.List;

public class WrapperClass {
	/*
	 * Wrapper 클래스 : 기본형 타입을 객체로 사용해야 할 때 대신 사용하는 클래스
	 * - boolean : Boolean
	 * - char    : Character
	 * - byte    : Byte
	 * - short   : Short
	 * - int     : Integer
	 * - long    : Long
	 * - float   : Float
	 * - double  : Double
	 */
	public static void main(String[] args) {
		int i = 20;
		
		Integer iw = new Integer(20); // 박싱
		Integer iw2 = 20; // 박싱
		Integer iw3 = new Integer("20");
		
		int a = 10;
		
		int sum = a + iw; //언박싱
		
		System.out.println(Integer.TYPE + " / " + Integer.SIZE + "bit");
		System.out.println(Integer.MIN_VALUE + " ~ " + Integer.MAX_VALUE);
		
		List<Integer> list = new ArrayList<Integer>();
		// 컬렉션프레임워크에는 객체만 담을수 있다.
		
		int[] b = new int[1];
		String[] c = new String[1];
	}

}
