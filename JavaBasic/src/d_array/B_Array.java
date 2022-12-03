package d_array;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class B_Array {

	public static void main(String[] args) {
		/*배열
		 *  - 여러개의 값을 하나의 변수에 저장하여 사용하는 것ㅇ치다.
		 *  - 참조형 타입이다.
		 *  - 인덱스로 값을 구분한다.
		 *  - 길이를 변경할수 없다.
		 * 
		 */
		
		int[] intArray; //배열의 주소를 저장함
		intArray = new int[5]; // 배열이 선언되고 그 주소가 저장된다.
		System.out.println(intArray[0]);
		//배열의 순서는 0부터 시작이다.
		/*타입별 기본값
		 * char : '/u000
		 * byte, short, int : 0
		 * long : 0L
		 * float : 0f
		 * double : 0.0
		 * boolean : false(0)
		 * 참조형변수(String) : null (""X)
		 * */
		
		intArray = new int[] {1, 2, 3, 4};
		int a = 0;
		int[] intArray2 = {1, 2, 3};
		System.out.println(intArray2[0]);
		System.out.println(intArray2[1]);
		System.out.println(intArray2[2]);
		intArray2[1] = 4;
		System.out.println(intArray2[1]);
		
//		int[] array = {10, 20, 30, 40, 50};
		int[] array;
		array = new int[] {10, 20, 30, 40, 50};
		array = new int[5];
		array[0] = 10;
		array[1] = 20;
		array[2] = 30;
		array[3] = 40;
		array[4] = 50;
		
		int sum = 0;
		for(int i = 0; i < array.length; i++) {
			sum += array[i];
		}
		System.out.println(sum);
		//예제1 : 10개의 정수를 저장할수 있는 배열을 선언 및 초기화 해주세요
		

		int[] arr = new int[10];
		//예제2 : 배열의 모든 인덱스에 1~100사이의 랜덤한 값을 저장해주세요
		Random rnd = new Random();
		for(int i = 0; i <arr.length; i++) {
			arr[i] = rnd.nextInt(100) + 1;
		}
		System.out.println(Arrays.toString(arr));
		// 3. 배열에 저장된 모든값을 합계와 평균을 구하시오
		sum = 0;
		double avg = 0.0;
		for(int i = 0; i < arr.length; i++) {
			sum += arr[i];
			
		}
		avg = (sum * 1.0) / arr.length;
		System.out.println("총점 : " + sum);
		System.out.println("평균 : " + avg);
		
		
		//예제 4 : 배열에 저장된 값들중 최소값과 최대값을 출력해주세요
		int max = arr[0];
		int min = arr[0];
		for(int i = 0; i <arr.length; i++) {
			if(arr[i] > max) max = arr[i]; {
			if(arr[i] < min) min = arr[i]; {
			}
			}
		} 
		System.out.println("최댓값 : " + max);
		System.out.println("최솟값 : " + min);
		 
		// 배열의 값을 섞는방법
		String[] class404 = {
				"홍길동", "이순신", "유관순", "김유신", "아이유"
		};
		System.out.println(Arrays.toString(class404));
		
		for(int i = 0; i < 500; i++) {
			int rndI = rnd.nextInt(class404.length);
			String tmp = class404[0];
			class404[0] = class404[rndI];
			class404[rndI] = tmp;
			System.out.println(Arrays.toString(class404));
		}
		//shuffle
		
		//1~10 사이의 랜덤값을 500번 생성하고,
		//각 숫자가 생성된 횟수를 출력해주세요.
		int[] counter = new int[10];
		for(int i = 0; i < 500; i++) {
			int r = rnd.nextInt(10) + 1 ;
//			if(r == 1) {
//				counter[0]++;
//			}
//			if(r == 2){
//				counter[1]++;
//			}
//			if(r == 3) {
//				counter[2]++;
//			}
			counter[r-1]++;
		}
		System.out.println(Arrays.toString(counter));
		for(int i = 0; i < counter.length; i++) {
			System.out.println(i + 1 + " : " + counter[i]);
		}
		
		//예제 : 21~50 사이의 랜덤값을 650번 생성하고
		// 각 숫자가 생성된 횟수를 출력해주세요
		counter = new int[30];
		for(int i = 1; i <= 650; i++) {
			int r = rnd.nextInt(30) + 21;
//		if(r == 21) {
//			counter[0]++;
//		}
//		if(r == 22) {
//			counter[1]++;
//		}
			counter[r-21]++;
		}
		for(int i = 0; i <counter.length; i++) {
			System.out.println(i + 21 + " : " + counter[i]);
			sum += counter[i];
		}
		System.out.println(sum);
		
		// 예제6 : 위 문제에서 최솟값, 최댓값, 반복횟수를 각각 입력받아 각 숫자가 생성된 횟수를 출력해주세요.
		
		Scanner sc = new Scanner(System.in);
		System.out.print("최소 >> ");
		int mini = Integer.parseInt(sc.nextLine());
		System.out.print("최대 >> ");
		int maxi = Integer.parseInt(sc.nextLine());
		System.out.print("횟수 >> ");
		int cnt = Integer.parseInt(sc.nextLine());

		
		
		counter = new int[maxi - mini + 1];
		for(int i = 0; i <cnt; i++) {
			int r = rnd.nextInt(maxi - mini + 1) + mini;
			counter[r - mini] ++;
		}
		for(int i = 0; i <counter.length; i++) {
			System.out.println(i + mini + " : " + counter[i]);
		}
	}
}
