package z_homework;

import java.util.Random;
import java.util.Scanner;

public class Z_Baseball {

	public static void main(String[] args) {
		/*
		 * 세 자리 랜덤한 숫자를 맞추는 게임을 만들어보자.
		 * 세 자리 숫자는 다음과 같은 규칙을 갖는다.
		 * 1. 중복되는 숫자가 없음 (예: 133 X, 333 X, ...)
		 * 2. 0 이 없다. (예: 130 X, 907 X, ...)
		 * 
		 * 랜덤으로 만들어진 숫자를 저장해두고, 
		 * 사용자에게 세 자리 숫자를 입력받아 다음과 같이 표기한다.
		 * 1. 같은 숫자이면서 위치가 같을 경우 S
		 * 2. 같은 숫자는 존재하지만 위치가 다를경우 B
		 * 3. 같은 숫자가 없는 경우 O
		 * 
		 * 맞을때까지 계속한다.
		 * ....
		 * 세 자리 숫자 입력 >> 571
		 * 6차 시도(571) : 2S 0B 1O
		 * --------------------
		 * 세 자리 숫자 입력 >> 671
		 * 7차 시도(671) : 3S 0B 0O
		 * --------------------
		 * 정답입니다 !!
		 * */
//		Random rnd = new Random();
//		int num1, num2, num3;
//		num1 = rnd.nextInt(9) +1;
//		do {
//			num2 = rnd.nextInt(9)+1;
//		}while(num1 == num2);
//		do {
//			num3 = rnd.nextInt(9)+1;
//		}while(num3 == num1||num3 == num2);
//		
//		Scanner sc = new Scanner(System.in);
//		int input = 0;
//		int count = 0;
//		
//		while(true) {
//			System.out.print("자리 숫자 입력");
//			input = Integer.parseInt(sc.nextLine());
//			int i1 = input % 10;
//			input /= 10;
//			int i2 = input % 10;
//			input /= 10;
//			int i3 = input;
//			int strike = 0, ball = 0, out = 0;
//			
//			if(num1 == i1) {
//				strike++;
//			}
//			if(num2 == i2) {
//				strike++;
//			}
//			if(num3 == i3) {
//				strike++;
//			}
//			if(i1 == num2 || i1 == num3) {
//				ball++;
//			}
//			if(i2 == num1 || i2 == num3) {
//				ball++;
//			}
//			if(i3 == num1 || i3 == num2) {
//				ball++;
//			}
//			out = 3 - strike - ball;
//			System.out.println(++count + "차시도("+ i1 + i2 + i3 + ") : " + strike + "S" + ball + "B" + out + "0");
//			
//			
//			if(strike == 3) {
//				System.out.println("정답입니다!!");
//				break;
//			}
//			
//			
//			
//		}
		
		//로또를 만들어라.1~45 숫자 오름차순으로 중복x
		int LottoNumber[] = new int[6];
		Random rnd = new Random();
		
		int min = 1;
		int max = 45;
		
		for (int i = 0; i < LottoNumber.length; i++) {
         
            LottoNumber[i] = (rnd.nextInt((max - min) + 1) + min);
         //   System.out.println("LottoNumber --> " + LottoNumber[i]);
            
        
            for (int j = 0; j < i; j++) {
                if (LottoNumber[i] == LottoNumber[j]) {
             //       System.out.println("중복된 숫자가 있어요 --> "+LottoNumber[i]);
                    i--;
                }
            }
        }
        for (int i = 0; i < LottoNumber.length; i++) {
            System.out.println("LOTTO NUMBER  ------->      " + LottoNumber[i]);
        }

	}

}
