package z_homework;

import java.util.Random;
import java.util.Scanner;

public class A0712 {

	public static void main(String[] args) {
		
		/*
		 * 문제1 다음 배열에서 최댓값과 최솟값을 구하시오.
		 * {38, 94, 16, 3, 76, 94, 82, 47, 59, 8}
		 */
		
//		int[] arr1 = {38, 94, 16, 3, 76, 94, 82, 47, 59, 8};
//		int max = arr1[0], min = arr1[0];
//		for(int i = 1; i < arr1.length; i++) {
//			if(arr1[i] > max ) {
//				max = arr1[i];
//			}
//			if(arr1[i] <min) {
//				min = arr1[i];
//			}
//			System.out.println("최댓값 : " + max + "최솟값 : " + min );
//		}
		
		
		/*
		 * 문제2 로또번호 생성프로그램(1~45) 중복x
		 */
		
//		int[] lottopool = new int[45];
//		for(int i = 0; i < lottopool.length; i++) {
//			lottopool[i] = i+1;
//		}
//		//lottopool index : 0~44 -> 1~44
//		for(int i = 1; i < 10; i++) {
//			int r = new Random().nextInt(44) + 1;
//			int tmp = lottopool[0];
//			lottopool[0] = lottopool[r];
//			System.out.println(i + "회차 : " + Arrays.toString(lottopool));
//			
//		}
//		for(int i = 0; i < 6; i++) {
//			if(i > 0) {
//				System.out.print( ", ");
//				
//			}
//			System.out.print(lottopool[i]);
//		}
		/*
		 * 문제3 인공지능 컴퓨터와 사람이 가위바위보 게임을 할수 있도록 프로그램하시오.
		 */
//		Scanner sc = new Scanner(System.in);
//		String input = sc.nextLine(); //가위 바위보
//		String[] pool = {"가위", "바위", "보"};
//		String computer = pool[new Random().nextInt(pool.length)];
//		System.out.println("게이머 : " + input);
//		System.out.println("컴퓨터 : " + computer);
//		
//		if(input.equals(computer)) {
//			System.out.println("비겼습니다.");
//		}else if(input.equals("가위")) {
//			if(computer.equals("가위")) {
//				System.out.println("비겼습니다");
//			}
//		}else if(input.equals("바위")) {
//			
//		}else if(input.equals("보")) {
//			
//		}else{
//			System.out.println("잘못입력하셨습니다.");
//	
//		}
		
		/*
		 * 주사위를 던져 
		 */
		int[] dice = new int[6];
		for(int i = 1; i <=10000; i++) {
			int r = new Random().nextInt(6)+1;
			dice[r - 1]++;
		}
		System.out.println("-----------------------------------------");
		System.out.println("면\t빈도");
		System.out.println("-----------------------------------------");
		for(int i = 0; i <dice.length; i++) {
			System.out.println((i + 1) + "\t" + dice[i]);
		}
	}

}
