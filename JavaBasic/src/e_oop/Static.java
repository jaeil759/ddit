package e_oop;

public class Static {

		/*
		 *  - static 을 붙이면 프로그램 실행시 메모리에 올라간다
		 *  - 객체생성을 하지 않아도 사용할 수 있다
		 *  - static을 붙인 변수는 객체간에 변수의 값을 공유한다.
		 *  - static이 붙은 멤버의 명칭 : 클래스 변수, 클래스 메서드
		 *  - static이 붙지 않은 멤버의 명칭 : 인스턴스 변수, 인스턴스 메서드
		 *  
		 */
		//값을 공유하기위해 static을 붙인다
		static int var;
		public static void main(String[] args) {
		Human 철수 = new Human();
		Human 영희 = new Human();
		
		철수.saveMoney(100000);
		철수.saveMoney(200000);
		
		철수.saveCoupleMoney(50000);
		System.out.println(영희.coupleAccount);
		영희.saveCoupleMoney(60000);
		System.out.println(철수.coupleAccount);
		
		Human 아이유 = new Human();
		아이유.saveCoupleMoney(10);
		
	}

}
class Human{
	int account; //잔고
	public void saveMoney(int money) {
		this.account += money;
		System.out.println("통장잔고 : " + this.account);
	}
	
	static int coupleAccount;
	
	
	public void saveCoupleMoney(int money) {
		this.coupleAccount +=money;
		System.out.println("커플통장 잔고 : " + coupleAccount);
	}
}