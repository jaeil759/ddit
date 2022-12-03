package e_oop.foodcourt;

public class Kiosk {
	//키오스크
	//주문의 모든 행위가 이뤄짐
	
	Restaurant[] restaurantList;
	int input;
	public void insertRestaurant() {
		System.out.println("-----식당 추가-----");
		System.out.println("식당 종류 >>");
		String type = ScanUtil.nextLine();
		System.out.println("식당 이름 >>");
		String name = ScanUtil.nextLine();
		if(restaurantList == null) {
			restaurantList = new Restaurant[1];
			restaurantList[0] = new Restaurant(name, type); 
		}else {
			Restaurant[] temp = new Restaurant[this.restaurantList.length +1];
			for(int i = 0; i <this.restaurantList.length; i++) {
				temp[i] = this.restaurantList[i];
			}
			temp[temp.length - 1] = new Restaurant(name, type);
			this.restaurantList = temp;
			
		}
		System.out.printf("[%s %s 식당이 추가되었습니다.]",type,name);
		System.out.println();
	}
	public Restaurant showRestaurantList() {
		if(this.restaurantList == null || this.restaurantList.length <=0) {
			System.out.println("등록된 식당이 없습니다.");
			return null;
		}
		list:
			while(true) {
				System.out.println("----------식당 목록----------");
				for(int i = 0; i <this.restaurantList.length; i++) {
					System.out.printf("%2d. %s", i + 1,this.restaurantList[i]);
					System.out.println();
				}
				System.out.println("------------------------");
				System.out.println("선택 >> ");
				input = ScanUtil.nextInt();
				if(input > restaurantList.length || input < 1) {
					System.out.println("잘못 입력하였습니다.");
				}else {
					System.out.println(restaurantList[input - 1].name + "을 선택하였습니다.");
					break list;
				}
			}
		return restaurantList[input - 1];
		
	}
	public void insertMenu() {
		Restaurant r = showRestaurantList();
		System.out.println("----------메뉴 추가----------");
		System.out.println("메뉴 이름 >>");
		String name = ScanUtil.nextLine();
		System.out.println("메뉴 가격 >> ");
		int price = ScanUtil.nextInt();
		if(r.menuList == null) {
			r.menuList = new Menu[1];
			r.menuList[0] = new Menu(name, price);
		}else {
			Menu[] temp = new Menu[r.menuList.length + 1];
			for(int i = 0; i < r.menuList.length; i++) {
				temp[i] = r.menuList[i];
			}
			temp[temp.length - 1] = new Menu(name, price);
			r.menuList = temp;
		}
		System.out.println(name + "메뉴가 추가되었습니다.");
	}
	public Menu showMenuList(Restaurant r) {
		if(r.menuList == null || r.menuList.length < 1 ) {
			System.out.println(r.name + "에 등록된 메뉴가 없습니다..");
			return null;
		}
		list:
			while(true) {
				System.out.println("-----" + r.name + "차림표 ------");
				for(int i = 0; i < r.menuList.length; i++) {
					System.out.printf("%2d. %s", +1, r.menuList[i]);
				}
				System.out.println("-------------------------");
				System.out.println("선택 >>");
				input = ScanUtil.nextInt();
				if(input > r.menuList.length || input <0) {
					System.out.println("잘못 입력하셨습니다.");
				}else {
					System.out.println(r.menuList[input - 1].name + "을(를 선택하셨습니다.");
					System.out.println("가격은" + r.menuList[input - 1].price + "원 입니다.");
					break list;
				}
			}
		return r.menuList[input -1];
	}
}
