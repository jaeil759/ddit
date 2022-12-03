package z_homework;

import java.util.Random;

public class Practice0713 {

	public static void main(String[] args) {
		/*
		 홍길동 및 이순신, 김유신, 유관순, 사임당, 아이유 총 여섯 명의 
		 국어/수학/영어/과학/코딩 점수를 각각 70~100까지의 랜덤 값으로 
		 입력하고,학생별 평균, 과목별 평균, 전체 평균을 구하고 출력합니다.


		=================== 원점수 ===================
		학생명	국어	    수학	    영어	    과학	   코딩
		홍길동	74	  91	  86	  97	  72	
		이순신	82	  77	  72	  97	  89	
		김유신	92	  81	  85	  97	  100	
		유관순	87	  76	  100	  90	  81	
		사임당	99	  88	  88	  99	  94	
		아이유	79	  92	  98	  77	  77	
		==============================================
		
		====================== 평균점수 ======================
		학생명	국어		수학		영어		과학		코딩		평균
		홍길동	74		91		86		97		72		84.0	
		이순신	82		77		72		97		89		83.4	
		김유신	92		81		85		97		100		91.0	
		유관순	87		76		100		90		81		86.8	
		사임당	99		88		88		99		94		93.6	
		아이유	79		92		98		77		77		84.6	
		평균		85.5	84.2    88.2	92.8	85.5	87.2	
		======================================================

		 * */
		
		
		String[] name= {"고재일", "고재이", "고재삼", "고재사", "고재오", "고재육"};
		String[] subjects = {"국어", "수학", "영어", "과학", "코딩"};
		int max = 100;
		int min = 70;
		int[][] score = new int[name.length][subjects.length];
			for(int i = 0; i < score.length; i++) {
				for(int j = 0; j < score[i].length; j++) {
					score[i][j]=(int)(Math.random()*(max-min) + min);
				}
			}
			 int[] nameSum = new int[score.length]; 
		        double[] nameAvg = new double[score.length];
		        for(int i = 0; i < score.length; i++){
				for(int j = 0; j < score[i].length; j++){
					nameSum[i] += score[i][j]; 
				}
				nameAvg[i] = Math.round((double)nameSum[i] / subjects.length * 100) / 100.0;
				
			}
			int[] subSum = new int[subjects.length];
			double[] subAvg = new double[score.length];
			for(int i = 0; i < subjects.length; i++) {
				for(int j = 0; j < score.length; j++) {
					subSum[i] += score[j][i];
				}
				subAvg[i] = Math.round((double)subSum[i] / score.length * 100) / 100.0;
			}
			System.out.print("학생명");
			for(int i = 0; i < subjects.length; i++){
				System.out.print("\t" + subjects[i]);
		}
			
			System.out.println("\t평균");
			for(int i = 0; i < score.length; i++){
				System.out.print(name[i] + "\t"); 
				for(int j = 0; j < score[i].length; j++){ 
					System.out.print(score[i][j] + "\t"); 
				}
				
				System.out.println(nameAvg[i] + "\t"); 
			}
			System.out.print("과목평균\t");
			
			for(int i = 0; i < subAvg.length; i++){
				System.out.print(subAvg[i] + "\t"); 
			}
			
	}
	
}

