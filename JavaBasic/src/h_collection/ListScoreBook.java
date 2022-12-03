package h_collection;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ListScoreBook {

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
		학생명	국어	수학	영어	과학	코딩	합계	평균	석차
		홍길동	74		91		86		97		72					
		이순신	82		77		72		97		89					
		김유신	92		81		85		97		100					
		유관순	87		76		100		90		81					
		사임당	99		88		88		99		94					
		아이유	79		92		98		77		77					
		과목합계
		과목평균	
		======================================================

		 * */
		
		List<List<Object>> scoreBook = new ArrayList<>();
		
		
		List<Object> unitScore = new ArrayList<>();
		unitScore.add("홍길동"); //이름
		unitScore.add(new Random().nextInt(31)+70); // 국어
		unitScore.add(new Random().nextInt(31)+70); // 영어
		unitScore.add(new Random().nextInt(31)+70); // 수학
		unitScore.add(new Random().nextInt(31)+70); // 과학
		unitScore.add(new Random().nextInt(31)+70); // 코딩
		
//		System.out.println(unitScore);
		scoreBook.add(unitScore); // 주소값 추가
		
//		unitScore.clear();// 주소값 초기화
		
		unitScore = new ArrayList<>();
		unitScore.add("김유신"); //이름
		unitScore.add(new Random().nextInt(31)+70); // 국어
		unitScore.add(new Random().nextInt(31)+70); // 영어
		unitScore.add(new Random().nextInt(31)+70); // 수학
		unitScore.add(new Random().nextInt(31)+70); // 과학
		unitScore.add(new Random().nextInt(31)+70); // 코딩
//		System.out.println(unitScore);
		scoreBook.add(unitScore);
		
		unitScore = new ArrayList<>();
		unitScore.add("이순신"); //이름
		unitScore.add(new Random().nextInt(31)+70); // 국어
		unitScore.add(new Random().nextInt(31)+70); // 영어
		unitScore.add(new Random().nextInt(31)+70); // 수학
		unitScore.add(new Random().nextInt(31)+70); // 과학
		unitScore.add(new Random().nextInt(31)+70); // 코딩
//		System.out.println(unitScore);
		scoreBook.add(unitScore);
		
		unitScore = new ArrayList<>();
		unitScore.add("유관순"); //이름
		unitScore.add(new Random().nextInt(31)+70); // 국어
		unitScore.add(new Random().nextInt(31)+70); // 영어
		unitScore.add(new Random().nextInt(31)+70); // 수학
		unitScore.add(new Random().nextInt(31)+70); // 과학
		unitScore.add(new Random().nextInt(31)+70); // 코딩
//		System.out.println(unitScore);
		scoreBook.add(unitScore);
		
		unitScore = new ArrayList<>();
		unitScore.add("사임당"); //이름
		unitScore.add(new Random().nextInt(31)+70); // 국어
		unitScore.add(new Random().nextInt(31)+70); // 영어
		unitScore.add(new Random().nextInt(31)+70); // 수학
		unitScore.add(new Random().nextInt(31)+70); // 과학
		unitScore.add(new Random().nextInt(31)+70); // 코딩
//		System.out.println(unitScore);
		scoreBook.add(unitScore);
		
		unitScore = new ArrayList<>();
		unitScore.add("아이유"); //이름
		unitScore.add(new Random().nextInt(31)+70); // 국어
		unitScore.add(new Random().nextInt(31)+70); // 영어
		unitScore.add(new Random().nextInt(31)+70); // 수학
		unitScore.add(new Random().nextInt(31)+70); // 과학
		unitScore.add(new Random().nextInt(31)+70); // 코딩
//		System.out.println(unitScore);
		scoreBook.add(unitScore);
		
		System.out.println(scoreBook);
		for(List<Object> item : scoreBook) {
			int sum = 0;
			double avg = 0.0;
			for(int i = 1; i < item.size(); i++) {
				sum+=Integer.parseInt(item.get(i).toString());
			}
			avg = sum * 100.0 / (item.size() * 100.0);
			item.add(sum);
			item.add(avg);
		}
		System.out.println(scoreBook);
	}

}
