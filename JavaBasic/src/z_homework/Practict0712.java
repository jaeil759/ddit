package z_homework;

import java.util.Arrays;
import java.util.Random;

public class Practict0712 {

	public static void main(String[] args) {
		/*
		 * 문제4 
		 * 1~100까지의 랜덤한 숫자 100개를 갖는 배열을 만들고 
		 * 2~5사이의 랜덤한 수로 나누어 떨어지는 숫자로만 이루어진 배열을 정렬하여 출력
		 * [1,57,84,38,15,10,57,68,48,13....]
		 * 
			int target = 5;
			[5, 10, 15, 20 ,...]
		 */
		Random rnd = new Random();
		int[] pool = new int[100];
		for(int i=0; i<pool.length; i++) {
			pool[i] = rnd.nextInt(100)+1;
		}
		System.out.println(Arrays.toString(pool));
		
		int[] tmp = new int[100];
		int target = rnd.nextInt(4) + 2;
		System.out.println("target : " + target);
		int count = 0;
		for(int i = 0; i < pool.length; i++) {
			if(pool[i] % target == 0) {
				// pool 에서 하나씩 꺼내 target으로 나눈 나머지가 0 인지 확인한다.
				tmp[count++] = pool[i];
				// 나머지가 0 이라면 임시저장배열(tmp) 에 하나씩넣고 몇개가들어가는지 count한다.
//				System.out.println(Arrays.toString(tmp));
			}
		}
		int[] result = new int[count];
		//임시저장배열(tmp)의 길이만큼 새로운 배열을 생성한다.
		for(int i = 0; i < count; i++) {
			result[i] = tmp[i];
		}
		System.out.println(Arrays.toString(result));
	}

}
