package z_homework;

import java.util.Scanner;

public class A0707 {

	public static void main(String[] args) {
		// 입력된 정수가 홀수인지 짝수인지를 출력하는 프로그램
		// if문으로 작성해보자.
/*		int num;
		Scanner sc = new Scanner(System.in);
		//한번에 임포트하기 ctrl shift o
		System.out.println("정수를 입력해주세요.>>");
		num = Integer.parseInt(sc.nextLine());
		if(num % 2 == 0) {
			System.out.println("입력하신 숫자는 짝수입니다.");
		}else {
			System.out.println("입력하신 숫자는 홀수입니다.");
		}
		*/
		/*
		 * 두 정수를 입력받아 큰 수를작은수로 나눈 몫과
		 * 나머지를 출력하는 프로그램을 만들어보자
		 * 임의의 두 정수는 어떤수를 0 으로나누는 것은 수학적으로 성립하지 않으므로 0 을 
		 * 입력하지 않는다고 가정하고 프로그램을 작성하자
		 *  */
		/*int num1, num2;
		Scanner sc = new Scanner(System.in);
		System.out.print("정수를 입력하세요(1) >> ");
		num1 = Integer.parseInt(sc.nextLine());
		System.out.print("정수를 입력하세요(2) >> ");
		num2 = Integer.parseInt(sc.nextLine());
		int num3, num4;
		if(num1 > num2) {
			System.out.print(num1 + "을" + num2 + "로");
			num3 = num1 / num2;
			num4 = num1 % num2;
		}else if(num2 > num1) {
			System.out.print(num2 + "을" + num1 + "로");
			num3 = num2 / num1;
			num4 = num2 % num1;
		}else {
			System.out.print("같은 두 수를");
			num3 = 1;
			num4 = 0;
		}
		System.out.println("나눈 몫은" + num3 + "이며, 나머지는" + num4 + "입니다.");
	}
	*/
	
		/*
		int num1 = 0, num2 = 0, num3 = 0;
		Scanner sc = new Scanner(System.in);
		System.out.print("수도입니까 (1:yes, 0:no");
		num1 = Integer.parseInt(sc.nextLine());
		System.out.print("총인구는? (단위: 만");
		num2 = Integer.parseInt(sc.nextLine());
		System.out.print("연소득은 1억이상인 인구? >> ");
		num3 = Integer.parseInt(sc.nextLine());
		
		if((num1 == 1 && num2 > 100) || (num3 > 50)){
			System.out.println("메트로폴리스");
			
		}else {
			System.out.print("이 도시는 메트로폴리스가 아닙니다.");
		}
		
		
		
		*/
		
//		int year = 0;
//		Scanner sc = new Scanner(System.in);
//		System.out.print("윤년인지를 확인할 연도를 입력하세요");
//		year = Integer.parseInt(sc.nextLine());
//		if (year % 4==0 && year%100!=0 || year%400==0) {
//			System.out.printf("%d 는 윤년입니다. \n", year);
//		} else {
//			System.out.printf("%d 는 윤년이 아닙니다. \n", year);
//		}
		//별트리
		for(int i = 6; i >= 1; i--) {

			 for(int j = 1; j <= i - 1 ; j++) {

				System.out.print(" ");

			 }for(int k = 11; k >= i*2-1 ; k --) {

				System.out.print("*"); 

			 }

			 	System.out.println();

		 	 }
		
	}
}
