package d_array;

import java.util.Arrays;
import java.util.Random;

public class E_MultiDimensionalArray {

	public static void main(String[] args) {
		/*
		 * 다차원 배열
		 *  - 배열안에 배열이 저장되어있는 형태.
		 */
		//2차원배열
		int[][] array2;
		//3차원배열
		int[][][] array3;
		
		int[][] arr = new int[2][3];
		int arr2[][] = new int[][] {{1,2},{3,4}};
		int[] arr3[] = {{1,2},{3,4},{5,6}};
		int[][] arr4 = new int[3][]; //가변배열
		arr4[0] = new int[3];
		arr4[1] = new int[4];
		arr4[2] = new int[5];
		//2칸짜리 배열 각 칸마다 3칸짜리 배열이 생성된ㄷ.
		System.out.println(arr4[0][0]);
		System.out.println(arr4[2][3]);
		
//		arr4[0] = 10; 값을 저장할수 없음
		arr4[0] = new int [10]; //배열을 저장해야한다.
		arr4[1][1] = 10;
		
		System.out.println(arr4.length);
		// 2차원 배열에서 1차원 배열의 길이
		System.out.println(arr4[0].length);
		// 2차원 배열에서 2차원 배열의 길이
		
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[i].length; j++) {
				System.out.println(arr[i][j]);
			}
		}
		int[][] score = new int[3][5]; //int[학생수][과목수]
		int[] sum = new int[score.length]; //합계
		double[] avg = new double[score.length];
		for(int i = 0; i <score.length; i++) {
			for(int j = 0; j <score[i].length; j++) {
				score[i][j] = new Random().nextInt(101);
			}
			//System.out.println(Arrays.toString(score[i]));
			
		}
		// 문제
		// 각 학생의 점수 합계와 평균을 구하시오.
		sum[0] = score[0][0] + score[0][1] + score[0][2] + score[0][3] +score[0][4] ;
		avg[0] = sum[0] / 5.0;
	
//		for(int i = 0; i < score[0].length; i++) {
//			sum[0] += score[0][i];
//		}
		for(int j = 0; j <score.length; j++) {
			for(int i = 0; i < score[j].length; i++) {
				sum[j] += score[j][i];
			}
			System.out.println("총점 : " + sum[j] + ", 평균: " + (sum[j] * 1.0 / score[j].length));
		}
	
	}

}
