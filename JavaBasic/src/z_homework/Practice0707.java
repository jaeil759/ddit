package z_homework;

import java.util.Random;
import java.util.Scanner;

public class Practice0707 {

	public static void main(String[] args) {
		//삼각형
//		Scanner sc = new Scanner(System.in);
//		System.out.print("삼각형의 첫번째 변의 길이를 입력하세요:" + "\t");
//		int a = sc.nextInt();
//		System.out.print("삼각형의 두번째 변의 길이를 입력하세요:" + "\t");
//		int b = sc.nextInt();
//		System.out.print("삼각형의 세번째 변의 길이를 입력하세요:" + "\t");
//		int c = sc.nextInt();
//		if((a+b<c) && (a+c<b) && (b+c<a)) {
//			System.out.println("삼각형을 만들 수 있습니다");
//		}else {
//			System.out.println("삼각형을 만들 수 없습니다.");
//		}
		
//		Scanner sc = new Scanner(System.in);
//		System.out.print("월을 입력하세요(1~12)  ");
//		int month = sc.nextInt();
//		if (month == 3 || month <=5) {
//			System.out.println(month + "월은 봄입니다. ");
//		}else if(month == 6 || month <=8){
//			System.out.println(month + "월은 여름입니다. ");
//		}else if(month == 9 || month <=11){
//			System.out.println(month + "월은 가을입니다. ");
//		}else if(month == 12 || month <=2){
//			System.out.println(month + "월은 겨울입니다. ");
//		}
//		int tot = 0;
//        int subject1 = 0;
//        int subject2 = 0;
//        int subject3 = 0;
//        int subject4 = 0;
//        int subject5 = 0;
//        double avg = 0.0;
//        char grade;
//        
//        System.out.println("점수를 입력하세요.");
//        Scanner scanner = new Scanner(System.in);
//        System.out.print("프로그래밍 기초 : ");
//            subject1 = scanner.nextInt();
//            System.out.print("데이터베이스 : ");
//            subject2 = scanner.nextInt();
//            System.out.print("화면 구현 : ");
//            subject3 = scanner.nextInt(); 
//            System.out.print("애플리케이션 구현 : ");
//            subject4 = scanner.nextInt(); 
//            System.out.print("머신러닝 : ");
//            subject5 = scanner.nextInt(); 
//            tot = (subject1 + subject2 + subject3 + subject4 + subject5);
//            avg = (double)((double)tot/5);
//            
//        
//            if (avg >= 90) {
//                grade = 'A';
//            
//            } else if (avg >= 80 && avg <90){
//                grade = 'B';
//                
//            } else if (avg >= 70 && avg <80) {
//                grade = 'C';
//            
//            } else if (avg >= 60 && avg <70) {
//                grade = 'D';
//                
//            } else {
//                grade = 'F';
//            }
//            
//            System.out.println("총점: " + tot);
//            
//            System.out.println("평균: " + avg); 
//            
//            System.out.println("학점: " + grade);
           

//	String CheolSu;
//	String YoengHee; 
//
//	Scanner in = new Scanner(System.in);
//		System.out.println("가위 바위 보 게임");
//		System.out.print("철수 : "); 
//		CheolSu = in.nextLine();
//		System.out.print("영희 : ");
//		YoengHee = in.nextLine();
//		
//		if(CheolSu.equals("가위")) {
//		if(YoengHee.equals("가위"))
//			System.out.println("비겼습니다!");
//				else if(YoengHee.equals("바위"))
//					System.out.println("결과 : 영희 승리!");
//				else if(YoengHee.equals("보"))
//					System.out.println("결과 : 철수 승리!");
//		}
//	
//		if(CheolSu.equals("바위")) { 
//		if(YoengHee.equals("가위"))
//			System.out.println("결과 : 철수 승리!");
//				else if(YoengHee.equals("바위"))
//					System.out.println("비겼습니다!");
//				else if(YoengHee.equals("보"))
//					System.out.println("결과 : 영희 승리!");
//		}
//		
//		
//		if(CheolSu.equals("보")) {
//			if(YoengHee.equals("가위"))
//				System.out.println("결과 : 영희 승리!");
//					else if(YoengHee.equals("바위"))
//				System.out.println("결과 : 철수 승리!");
//					else if(YoengHee.equals("보"))
//				System.out.println("비겼습니다!");
//		
//		}
		Random rnd = new Random();
		int qNum = rnd.nextInt(100);       // 0~99까지의 정수
		int input = 0;
		Scanner sc = new Scanner(System.in);
		do {
			System.out.print("1부터 100까지의 정수를 입력해 주세요.");
			input = Integer.parseInt(sc.nextLine());
			if(input > qNum) {
				System.out.println(input + " 보다 작습니다.");
			} else if(input < qNum) {
				System.out.println(input + " 보다 큽니다.");
			} else {
				System.out.println("정답입니다.");
			}
		} while(input != qNum);
		
		outLine:
			for(int i = 1; i<=10; i++) {
				for(int j = 1; j<=10; j++) {
					if(j == 5) {
						continue;
					}
					System.out.println(i + " : " + j);
					break outLine;
					
					
				}
				System.out.println("");
				
				
			}
//		
        
        
     
        
        
        
        
 
    }
 
}
	
	

