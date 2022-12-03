package e_oop.foodcourt;

import java.util.concurrent.TimeUnit;

public class Restaurant {
	//푸드코트에 입점한 식당
	Menu[] menuList; // 차림표
	String name, type; // 상호명, type
	
	public Restaurant(String name, String type) {
		this.name = name;
		this.type = type;
	}
	public String toString() {
//		return String.format("[%s] %2", this.type, this.name);
		return "["+this.type+"]" + this.name;
				
	}
	public void order(Menu m, int orderNumber) {
		System.out.println(m.name + "을(를) 요리합니다...");
		for(int i = 0; i<3; i++) {
			
			try {
				TimeUnit.SECONDS.sleep(1);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println(i+1);
		}
		System.out.printf("[%03d]번 고객님, 주문하신 %s이(가) 완성되었습니다.\n",orderNumber,m.name);
		System.out.printf("%s에서 받아가세요 :D",this.name);
		System.out.println();
	}
}
