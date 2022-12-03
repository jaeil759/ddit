package d_array;

import java.util.Arrays;
import java.util.Random;

public class C_Quiz {

	public static void main(String[] args) {
		/*
		 * 문제1 
		 * 거스름돈(1000~5000)이 동전의 단위마다 몇개의 동전이 필요한지 출력하시오.
		 * 예시)
		 * 거스름돈 : 2860원
		 * 500원 : 5개
		 * 100원 : 3개
		 * 50원 : 1개
		 * 10원 : 1개
		 * 거스름돈은 입력받을거고,,,, 거기에 
		 */
//		Random rnd = new Random();
//		//1000~5000 -> 100~500 * 10 => (0~400 + 100) * 10
//		int change = (rnd.nextInt(400) + 100) * 10;
//		int[] coin = {500, 100, 50, 10};
////		for(int i = 0; i < coin.length; i++) {
////			int tmp1 = change / 500;
////			change %= 500;
////			tmp1 = change / 100;
////			change %= 100;
////			tmp1 = change / 50;
////			change %= 50;
////			tmp1 = change / 10;
////			change %= 10;
//		System.out.println("거스름돈 : " + change + "원");
//		
//			for(int i = 0; i < coin.length; i++) {
//				int tmp = change / coin[i];
//				change %= coin[i];
//				System.out.println(coin[i] + "원 : " + tmp + "개");
//			}
		
		/*
		 * 문제 2 
		 * 1~5의 숫자가 발생(10번)된 만큼 * 을 사용해 그래프를 그려주세요
		 * 1 : *** 3
		 * 2 : **** 4
		 * 3 : ** 2 
		 * 4 : ***** 5
		 * 5 : * 1
		 */
		
//		Random rnd = new Random();
//		int[] arr = new int[5];
//	//	rnd.nextInt(5) + 1;
//		
//		for(int i = 1; i < 10; i++) {
//			int r = rnd.nextInt(5) + 1;
//			arr[r - 1] ++;
//	//		System.out.println(r + " : " + Arrays.toString(arr));
//		}
//		System.out.println(Arrays.toString(arr));
////		System.out.print(1 + " : ");
////		for(int i = 0; i < arr[0]; i++) {
////			System.out.print("*");
////		}
////		System.out.println(" " + arr[0]);
////		
////		System.out.print(2 + " : ");
////		for(int i = 0; i <arr[1]; i++) {
////			System.out.print("*");
////		}
////		System.out.println(" " + arr[1]);
//		
//		for(int j = 0; j < arr.length; j++) {
//			System.out.print((j+1) + " : ");
//			for(int i = 0; i < arr[j]; i++) {
//				System.out.print("*");
//			}
//			System.out.println(" " + arr[j]);
//		}
//		
		/*
		 * 문제3
		 * 1~10사이의랜덤한 값이 10개 저장된 배열에서 중복값이 제거된 배열을 만들어주세요
		 * 배열의 특징 : 배열의 길이를 변경할수 없다
		 * 
		 */
//		Random rnd = new Random();
//		int[] ar = new int[10];
//		for(int i = 0; i < ar.length; i++) {
//			ar[i] = rnd.nextInt(10) + 1;
//			for(int j = 0; j < i; j++) {
//				if(ar[i] == ar[j])
//					j--;
//			}
//
//			System.out.print(Arrays.toString(ar));
//			
//			}
		Random rnd = new Random();
		int[] pool = new int[10];
		for(int i = 0; i < pool.length; i++) {
			pool[i] = rnd.nextInt(10) + 1;
		}
		int[] a = new int[] {pool[0]};
		for(int i = 1; i < pool.length; i++) {
			int pick = pool[i];
			boolean duple = false;
			for(int j = 0; j< a.length; j++) {
				if(pick == a[j]) {
					duple = true;
					
				}
			}
			if(!duple) {
				int[] b = new int[a.length + 1];
				for(int j = 0; j < a.length; j++) {
					b[j] = a[j];
				}
				b[b.length -1] = pick;
				a = b;
			}
		}
			System.out.println(Arrays.toString(a));
		}
	}


