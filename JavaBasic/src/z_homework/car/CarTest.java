package z_homework.car;

public class CarTest {

	public static void main(String[] args) {
		Car c1 = new Car("red");
		System.out.println("c1의 색 : " + c1.getColor());
		System.out.println("차의 최대 속력 : " + Car.getMaxSpeed() + "km/h");
		
		System.out.print("첫 번째 speedUp(100.0km/h : ");
		if(c1.speedUp(100.0)) {
			System.out.println("속도 변경 가능,");
		}else {
			System.out.println("속도 변경 불가능,");
		}
		System.out.println(" 현재 차의 속력 : " + c1.getSpeed() + "km/h");
		
		System.out.print("두 번째 speedUp(90.0km/h : ");
		if(c1.speedUp(90.0)) {
			System.out.print("속도 변경 가능,");
		}else {
			System.out.print("속도 변경 불가능,");
		}
		System.out.println(" 현재 차의 속력 : " + c1.getSpeed() + "km/h");
		
		Car c2 = new Car("blue");
		System.out.println();
		System.out.println("c2의 색 : " + c2.getColor());
		System.out.println("차의 최대 속력 : " + Car.getMaxSpeed() + "km/h");
		
		System.out.print("첫 번째 speedUp(-100.0km/h : ");
		if(c2.speedUp(-100.0)) {
			System.out.print("속도 변경 가능,");
		}else {
			System.out.print("속도 변경 불가능,");
		}
		System.out.println(" 현재 차의 속력 : " + c2.getSpeed() + "km/h");
		
		System.out.print("두 번째 speedUp(210.0km/h : ");
		if(c2.speedUp(210.0)) {
			System.out.print("속도 변경 가능,");
		}else {
			System.out.print("속도 변경 불가능,");
		}
		System.out.println(" 현재 차의 속력 : " + c2.getSpeed() + "km/h");
		
		
	}

}
