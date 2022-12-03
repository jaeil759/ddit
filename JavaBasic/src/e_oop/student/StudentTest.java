package e_oop.student;

import java.util.Arrays;
import java.util.Collections;
import java.util.Random;

public class StudentTest {

	public static void main(String[] args) {
		// StudentAccess 클래스를 이용하여
		// 우리반 404호 점수를 저장하는 StudentAccess[] scoreBook을 만든뒤 출력하세요
		// 단 점수는 50~100점사이입니다.
		StudentScore[] score  = new StudentScore[25];
		Random rnd = new Random();

		score[0] = new StudentScore(rnd.nextInt(51) + 50,rnd.nextInt(51) + 50,rnd.nextInt(51) + 50,rnd.nextInt(51) + 50,
				rnd.nextInt(51) + 50,rnd.nextInt(51) + 50,rnd.nextInt(51) + 50,"조은혁");
		score[1] = new StudentScore(rnd.nextInt(51) + 50,rnd.nextInt(51) + 50,rnd.nextInt(51) + 50,rnd.nextInt(51) + 50,
				rnd.nextInt(51) + 50,rnd.nextInt(51) + 50,rnd.nextInt(51) + 50,"허소영");
		score[2] = new StudentScore(rnd.nextInt(51) + 50,rnd.nextInt(51) + 50,rnd.nextInt(51) + 50,rnd.nextInt(51) + 50,
				rnd.nextInt(51) + 50,rnd.nextInt(51) + 50,rnd.nextInt(51) + 50,"안승주");
		score[3] = new StudentScore(rnd.nextInt(51) + 50,rnd.nextInt(51) + 50,rnd.nextInt(51) + 50,rnd.nextInt(51) + 50,
				rnd.nextInt(51) + 50,rnd.nextInt(51) + 50,rnd.nextInt(51) + 50,"배지영");
		score[4] = new StudentScore(rnd.nextInt(51) + 50,rnd.nextInt(51) + 50,rnd.nextInt(51) + 50,rnd.nextInt(51) + 50,
				rnd.nextInt(51) + 50,rnd.nextInt(51) + 50,rnd.nextInt(51) + 50,"남지현");
		score[5] = new StudentScore(rnd.nextInt(51) + 50,rnd.nextInt(51) + 50,rnd.nextInt(51) + 50,rnd.nextInt(51) + 50,
				rnd.nextInt(51) + 50,rnd.nextInt(51) + 50,rnd.nextInt(51) + 50,"배영호");
		score[6] = new StudentScore(rnd.nextInt(51) + 50,rnd.nextInt(51) + 50,rnd.nextInt(51) + 50,rnd.nextInt(51) + 50,
				rnd.nextInt(51) + 50,rnd.nextInt(51) + 50,rnd.nextInt(51) + 50,"정종은");
		score[7] = new StudentScore(rnd.nextInt(51) + 50,rnd.nextInt(51) + 50,rnd.nextInt(51) + 50,rnd.nextInt(51) + 50,
				rnd.nextInt(51) + 50,rnd.nextInt(51) + 50,rnd.nextInt(51) + 50,"최중호");
		score[8] = new StudentScore(rnd.nextInt(51) + 50,rnd.nextInt(51) + 50,rnd.nextInt(51) + 50,rnd.nextInt(51) + 50,
				rnd.nextInt(51) + 50,rnd.nextInt(51) + 50,rnd.nextInt(51) + 50,"전재한");
		score[9] = new StudentScore(rnd.nextInt(51) + 50,rnd.nextInt(51) + 50,rnd.nextInt(51) + 50,rnd.nextInt(51) + 50,
				rnd.nextInt(51) + 50,rnd.nextInt(51) + 50,rnd.nextInt(51) + 50,"김슬기");
		score[10] = new StudentScore(rnd.nextInt(51) + 50,rnd.nextInt(51) + 50,rnd.nextInt(51) + 50,rnd.nextInt(51) + 50,
				rnd.nextInt(51) + 50,rnd.nextInt(51) + 50,rnd.nextInt(51) + 50,"오지형");
		score[11] = new StudentScore(rnd.nextInt(51) + 50,rnd.nextInt(51) + 50,rnd.nextInt(51) + 50,rnd.nextInt(51) + 50,
				rnd.nextInt(51) + 50,rnd.nextInt(51) + 50,rnd.nextInt(51) + 50,"박민지");
		score[12] = new StudentScore(rnd.nextInt(51) + 50,rnd.nextInt(51) + 50,rnd.nextInt(51) + 50,rnd.nextInt(51) + 50,
				rnd.nextInt(51) + 50,rnd.nextInt(51) + 50,rnd.nextInt(51) + 50,"양지윤");
		score[13] = new StudentScore(rnd.nextInt(51) + 50,rnd.nextInt(51) + 50,rnd.nextInt(51) + 50,rnd.nextInt(51) + 50,
				rnd.nextInt(51) + 50,rnd.nextInt(51) + 50,rnd.nextInt(51) + 50,"조현수");
		score[14] = new StudentScore(rnd.nextInt(51) + 50,rnd.nextInt(51) + 50,rnd.nextInt(51) + 50,rnd.nextInt(51) + 50,
				rnd.nextInt(51) + 50,rnd.nextInt(51) + 50,rnd.nextInt(51) + 50,"윤영현");
		score[15] = new StudentScore(rnd.nextInt(51) + 50,rnd.nextInt(51) + 50,rnd.nextInt(51) + 50,rnd.nextInt(51) + 50,
				rnd.nextInt(51) + 50,rnd.nextInt(51) + 50,rnd.nextInt(51) + 50,"한상훈");
		score[16] = new StudentScore(rnd.nextInt(51) + 50,rnd.nextInt(51) + 50,rnd.nextInt(51) + 50,rnd.nextInt(51) + 50,
				rnd.nextInt(51) + 50,rnd.nextInt(51) + 50,rnd.nextInt(51) + 50,"김혜진");
		score[17] = new StudentScore(rnd.nextInt(51) + 50,rnd.nextInt(51) + 50,rnd.nextInt(51) + 50,rnd.nextInt(51) + 50,
				rnd.nextInt(51) + 50,rnd.nextInt(51) + 50,rnd.nextInt(51) + 50,"박형기");
		score[18] = new StudentScore(rnd.nextInt(51) + 50,rnd.nextInt(51) + 50,rnd.nextInt(51) + 50,rnd.nextInt(51) + 50,
				rnd.nextInt(51) + 50,rnd.nextInt(51) + 50,rnd.nextInt(51) + 50,"한단비");
		score[19] = new StudentScore(rnd.nextInt(51) + 50,rnd.nextInt(51) + 50,rnd.nextInt(51) + 50,rnd.nextInt(51) + 50,
				rnd.nextInt(51) + 50,rnd.nextInt(51) + 50,rnd.nextInt(51) + 50,"채진영");
		score[20] = new StudentScore(rnd.nextInt(51) + 50,rnd.nextInt(51) + 50,rnd.nextInt(51) + 50,rnd.nextInt(51) + 50,
				rnd.nextInt(51) + 50,rnd.nextInt(51) + 50,rnd.nextInt(51) + 50,"김진호");
		score[21] = new StudentScore(rnd.nextInt(51) + 50,rnd.nextInt(51) + 50,rnd.nextInt(51) + 50,rnd.nextInt(51) + 50,
				rnd.nextInt(51) + 50,rnd.nextInt(51) + 50,rnd.nextInt(51) + 50,"송서영");
		score[22] = new StudentScore(rnd.nextInt(51) + 50,rnd.nextInt(51) + 50,rnd.nextInt(51) + 50,rnd.nextInt(51) + 50,
				rnd.nextInt(51) + 50,rnd.nextInt(51) + 50,rnd.nextInt(51) + 50,"고재일");
		score[23] = new StudentScore(rnd.nextInt(51) + 50,rnd.nextInt(51) + 50,rnd.nextInt(51) + 50,rnd.nextInt(51) + 50,
				rnd.nextInt(51) + 50,rnd.nextInt(51) + 50,rnd.nextInt(51) + 50,"김보미");
		score[24] = new StudentScore(rnd.nextInt(51) + 50,rnd.nextInt(51) + 50,rnd.nextInt(51) + 50,rnd.nextInt(51) + 50,
				rnd.nextInt(51) + 50,rnd.nextInt(51) + 50,rnd.nextInt(51) + 50,"허나훔");
		
		
		// 내점수 < 너의점수 -> 내순위 +=1;
//		if(score[0].getSum() < score[1].getSum()) {
//			int r = score[0].getRank();
//			r += 1;
//			score[0].setRank(r);
//		}
//		
//		for(int i = 2; i < score.length; i++) {
//			if(score[0].getSum() < score[i].getSum()) {
//				int r = score[0].getRank();
//				r += 1;
//				score[0].setRank(r);
//		}
//	}
	
		for(int i  = 0; i < score.length; i++ ) {
			for(int j = 0; j <score.length; j++) {
				if(score[i].getSum() < score[j].getSum()) {
					score[i].setRank(score[i].getRank() + 1 );
				}
			}
		}
		
		int[] subjectSum = new int[7];
		
		for(int i = 0; i < score.length; i++) {
			//for문을 작성할 수 있도록 배열을 반환시켜주는 메소드를 이요앟ㄴ다.
			int[] temp = score[i].getSubjectsScore();
			for(int j = 0; j < temp.length; j++) {
				subjectSum[j] += temp[j];
			}
			
//			subjectSum[0] += score[i].getOracle();
//			subjectSum[1] += score[i].getJavaBasic();
//			subjectSum[2] += score[i].getWebbasic();
//			subjectSum[3] += score[i].getJavaHigh();
//			subjectSum[4] += score[i].getJsp();
//			subjectSum[5] += score[i].getSpring();
//			subjectSum[6] += score[i].getPython();
		}
		double[] subjectAvg = new double[7];
		for(int i = 0; i < subjectSum.length; i++) {
			subjectAvg[i] = subjectSum[i] / score.length;
		}
		
		for(int i = 0; i < score.length; i++) {
			System.out.println(i + "\t" + score[i]);
		}

		System.out.println(Arrays.toString(subjectSum));
		System.out.println(Arrays.toString(subjectAvg));
	}

}
