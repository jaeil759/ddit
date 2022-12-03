package b_operator;

import java.util.Scanner;

public class SimpleCalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		// 두 개의 숫자와 연산자(+ - * /)를 입력받아 연산 결과를 알려주는 프로그램을 만들어 주세요.
		// 결과 예: "1 + 1 = 2 입니다."
		
		  Scanner sc = new Scanner(System.in); 
		  System.out.print("첫 번째 숫자를 입력해 주세요>> ");
		  int a = Integer.parseInt(sc.nextLine()); 
		  System.out.print("연산자를 입력해 주세요>> ");
		  String x = sc.nextLine(); 
		  System.out.print("두 번째 숫자를 입력해 주세요>> "); 
		  int b = Integer.parseInt(sc.nextLine());
		  int result = x.equals("+") ? a + b
				  	: x.equals("-") ? a - b
				  	: x.equals("*") ? a * b
				    : a / b;
		  System.out.println(a + " " + x + " " + b + " = " + result + " 입니다.");
		




		  
	}

}
