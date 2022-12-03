package z_homework;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Practice0711 {

	public static void main(String[] args) {
		
//		int Array[] = new int[] {38, 94, 16, 3, 76, 94, 82, 47, 59, 8};
//		
//		int max = Array[0];
//		int min = Array[0];
//		for(int i = 0; i < Array.length; i++) {
//			if(Array[i] > max) max = Array[i];{
//			if(Array[i] < min) min = Array[i]; {
//					
//				}
//			}
//		}
//		System.out.println("최댓값은 : " + max);
//		System.out.println("최송값은 : " + min);
//		
		
//		
//		int lottoNum[] = new int[6];	
//		Random r = new Random();	
//		
//		
//		for(int i=0;i<6;i++) {
//			lottoNum[i] = r.nextInt(45) + 1;
//		
//			for(int j=0;j<i;j++) {			
//				if(lottoNum[i] == lottoNum[j])
//					i--;				
//			}
//		}
//			
//		Arrays.sort(lottoNum);
//		
//		for(int i=0;i<6;i++)
//			System.out.println("로또번호는 : " + lottoNum[i]);
		
//		Scanner sc = new Scanner(System.in);
//		String[] a= {"가위","주먹","보"};
//		System.out.println(Arrays.toString(a));
//		
//		for(int i=0;i<10;i++) {
//			int num= (int)(Math.random()*3);
//			System.out.println("가위,바위,보 중 하나를 선택");
//			System.out.print(">>>");
//			String b=sc.next();
//			System.out.println();
//			if(b.equals("가위")) {
//				if(num==0) {
//					System.out.println("나:가위");
//					System.out.println("상대편:바위");
//					System.out.println("졌습니다");
//				}
//				if(num==1) {
//					System.out.println("나:가위");
//					System.out.println("상대편:보");
//					System.out.println("이겼습니다");
//				}
//				if(num==2) {
//					System.out.println("나:가위");
//					System.out.println("상대편:가위");
//					System.out.println("비겼습니다");
//				}
//				System.out.println();
//			}
//			if(b.equals("바위")) {
//				if(num==0) {
//					System.out.println("나:바위");
//					System.out.println("상대편:바위");
//					System.out.println("비겼습니다");
//				}
//				if(num==1) {
//					System.out.println("나:바위");
//					System.out.println("상대편:보");
//					System.out.println("졌습니다");
//				}
//				if(num==2) {
//					System.out.println("나:바위");
//					System.out.println("상대편:가위");
//					System.out.println("이겼습니다");
//				}
//				System.out.println();
//			}
//			if(b.equals("보")) {
//				if(num==0) {
//					System.out.println("나:보");
//					System.out.println("상대편:바위");
//					System.out.println("이겼습니다");
//				}
//				if(num==1) {
//					System.out.println("나:보");
//					System.out.println("상대편:보");
//					System.out.println("비겼습니다");
//				}
//				if(num==2) {
//					System.out.println("나:보");
//					System.out.println("상대편:가위");
//					System.out.println("졌습니다");
//				}
//				System.out.println();
//			}
//			
//		}
		Random rnd = new Random();
		int[] counter = new int[6];
		for(int i = 0; i < 10000; i++) {
			int r = rnd.nextInt(6) + 1 ;
			counter[r-1]++;
		}
		System.out.println(Arrays.toString(counter));
		for(int i = 0; i < counter.length; i++) {
			System.out.println(i + 1 + " : " + counter[i]);
		}
	}
}