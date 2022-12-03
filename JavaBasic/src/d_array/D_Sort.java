package d_array;

import java.util.Arrays;
import java.util.Random;

public class D_Sort {

	public static void main(String[] args) {
		/*
		 * 정렬
		 * - 석차구하기 : 점수를 비교해 작은점수의 등수를 증가시키는 방식
		 * - 선택정렬 : 가장 작은 숫자를 찾아서 앞으로 보내는 방식
		 * - 버블정렬 : 바로 뒤의 숫자와 비교해서 큰수를 뒤로 보내는 방식
		 * - 삽입정렬 : 주 번째 숫자부터 앞의 숫자들과 비교해서 큰수는 뒤로 밀고 중간에 삽입하는 방식
		 * - 
		 */
		
		int[] arr = new int[10];
		for(int i = 0; i < arr.length; i++) {
			arr[i] = new Random().nextInt(100);
		}
		System.out.println(Arrays.toString(arr));
		System.out.println();
		
//		bubbleSort(arr); // 버블정렬
//		insertSort(arr); // 삽입정렬
//		selectSort(arr); //선택정렬
		printRank(arr); //석차구하기
		
		
	}

	private static void printRank(int[] arr) {
		// score ={5,3,4,1}
		// rank = {1,3,2,5}
		int[] rank = new int[arr.length];
		//순위를 나타내기 위한 배열을 선언함.
		//배열의 길이는 순위를 구하려는 배열의 길이와 같음
		for(int i = 0; i < rank.length; i++) {
			rank[i] = 1;
		}
		for(int i = 0; i <arr.length; i++) {
			// 순위를 구하려는 배열을 for문 작업
			for(int j = 0; j < arr.length; j++) {
				// 다른값들과 비교를 위해 순위를 구하려는 배열을 중첩for문 작업
				if(arr[i] < arr[j]) {
					rank[i]++;
					// arr = {50,100,80}
					// rank = {1,1,1} -> {2,1,1} -> {3,1,1}
				}
			}
			System.out.println(Arrays.toString(rank));
			}
		for(int i = 0; i < arr.length; i++) {
			System.out.println(arr[i] + " : " + rank[i] + "등");
			
		}
	}

	private static void selectSort(int[] arr) {
		for(int i = 0; i < arr.length - 1; i++) {
			int min = i; 
			// 비교한 대상이 가장 작은 수라는 가정으로 매 회전 시작
			for(int j = i + 1; j < arr.length; j++ ) {
				// 비교대상 다음 순서부터 끝 순서까지 비교대상과 크기를 비교함
				if(arr[j] < arr[min]) {
					//만약 비교대상보다 특정위치의 값이 더 작다면 
					min = j; // 가장 작은 값의 위치는 j 위치다.
				}
			}
			int tmp = arr[i];
			arr[i] = arr[min];
			arr[min] = tmp;
			System.out.println(Arrays.toString(arr));
		}
	}

	private static void insertSort(int[] arr) {
		// 반복횟수만을 위한 for문
		// 반복횟수는 배열의 길이 -1 만큼 버블정렬과 동일하나
		// 시작의 위치가 첫 번쨰(0) 위치가 아닌 두 번쨰 (1) 부터다.
		for(int i = 1; i < arr.length; i++) {
			int tmp = arr[i]; // 비교대상값을 임시저장한다.
			int j = 0;
			for(j = i - 1; j >= 0; j--) {
				//반복은 비교대상 앞 번호부터 앞으로 하나씩 비교한다.
				if(tmp < arr[j]) {
					arr[j + 1] = arr[j]; //현재 비교대상의 값을 뒤로 한칸 밀고 비교를 계속한다.
				}else { //else 상황이 발생한다면.
					break; // 해당회전을 종료한다.
				}
			}
			arr[j + 1] = tmp;
			// 값을 변경한 마지막위치( 값을 변경하지 않았다면 j의 마지막 번호)
			// 뒤에 복사한 값을 덮어씌운다.
			System.out.println(Arrays.toString(arr));
		}
	}

	private static void bubbleSort(int[] arr) {
		//반복횟수만을 위한 for문, 반복 횟수는 배열의 길이 -1 만큼
		for(int i = 0; i < arr.length - 1; i++) {
			boolean changed = false;
			//자리를 바꿧는지 체크하기위한 boolean 선언
			for(int j = 0; j < arr.length - i - 1; j++) {
				// 1회전씩 반복 될 수록 큰 숫자들이 맨 뒤로 자리가 옮겨져 있으므로 맨뒤에서 i 갯수만큼의 숫자는 비교할 필요가 없음
				if(arr[j] > arr[j+1]) {
					int tmp = arr[j]; //arr[j]의 값을 임시저장
					arr[j] = arr[j+1]; // arr[j] 에 arr[j+1]값을 덮어씌움
					arr[j+1] = tmp;// [arr[j+1]에 임시저장한 값을 덮어씌움
					changed = true;
				}
			}
			
			System.out.println(Arrays.toString(arr));
			if(!changed) { // 교환이 일어나지 않았다면
				break; // 반복을 종료해라
			}
		}
	}

}
