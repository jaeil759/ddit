package e_oop.foodcourt;

public class Main {
	//실제 키오스크 사용자
	Kiosk k = new Kiosk();
	int input,orderNumber;
	public static void main(String[] args) {
		new Main().start();
		
	}
	private void start() {
		System.out.println("========================FOOD COURT KIOSK========================");
		main:
			while(true) {
				System.out.println("---------- 사용자 목록----------");
				System.out.println(" 1. 일반 사용자   2. 관리자");
				System.out.println("--------------------------------");
				System.out.println("선택 >> ");
				input = ScanUtil.nextInt();
				switch(input) {
				case 1: 
					userInterface();
					break;
				case 2:
					adminInterface();
					break;
				}
			}
	}
	private void adminInterface() {
		System.out.println("==========키오스크 관리===========");
		admin:
			while(true) {
				System.out.println("----------관리자 목록----------");
				System.out.println("1.식당추가 2.메뉴추가 3.종료");
				System.out.println("-------------------------------");
				System.out.println("선택 >> ");
				input = ScanUtil.nextInt();
				switch(input) {
				case 1: 
					k.insertRestaurant();
					break;
				case 2:
					k.insertMenu();
					break;
					default:
						break admin;
				}
			}
		
	}
	private void userInterface() {
		System.out.println("===========식사 주문하기==========");
		user:
			while(true) {
				Restaurant r = k.showRestaurantList();
				if(r == null) {
					break user;
				}
				System.out.println("메뉴 선택으로 이동합니다..");
				Menu m = k.showMenuList(r);
				if(m == null) {
					break user;
				}
				orderNumber++;
				r.order(m,orderNumber);
				System.out.println("\n\n");
			}
	}

}
