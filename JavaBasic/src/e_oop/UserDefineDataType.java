package e_oop;

public class UserDefineDataType {

	public static void main(String[] args) {
		/*
		 *  사용자 정의 데이터 타입
		 *  - 데이터의 최종진화 형태 (변수->배열->클래스)
		 *  - 서로 다른 타입의 데이터를 묶어서 사용하는 것이다.
		 *  - 변수와 메서드를 구성할 수 있다.
		 */
		//1차형 데이터 관리
		int kor;
		int eng;
		int math;
		int sum;
		double avg;
		String name;
		
		//2차옇 데이터 관리
		
		
		int[] score;
		int sum2;
		double avg2;
		String name2;
		
		Student student;
		student = new Student();
		
		student.name = "홍길동";
		student.kor = 90;
		
		System.out.println(student.name);
		System.out.println(student.kor);
		System.out.println(student);
		
		
		
		
	}

}

class Student {
	int kor, eng, math, sum;
	double avg;
	String name;
	// alt shit s
	@Override
	public String toString() {
		return "Student [kor=" + kor + ", eng=" + eng + ", math=" + math + ", sum=" + sum + ", avg=" + avg + ", name="
				+ name + "]";
	}
	
}
//	@Override //재정의
//	public String toString() {
//		return"주소값";
//	}
//}
