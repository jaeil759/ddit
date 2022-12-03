package z_homework.plane;

public class PlaneTest {

	public static void main(String[] args) {
		Plane p1 = new Plane("보잉", "보잉747", 450);
		System.out.println("제조사 : " + p1.getManufacture());
		System.out.println("모델명 : " + p1.getModel());
		System.out.println("최대 승객수 : " + p1.getMaxNumberOfPassengers());
		System.out.println();
		
		Plane p2 = new Plane("보잉", "보잉 777", 500);
		System.out.println("제조사 : " + p2.getManufacture());
		System.out.println("모델명 : " + p2.getModel());
		System.out.println("최대 승객수 : " + p2.getMaxNumberOfPassengers());
		System.out.println();
		
		Plane p3 = new Plane();
		p3.setManufacture("록히드마틴");
		p3.setModel("F-22");
		p3.setMaxNumberOfPassengers(-10);
		
		System.out.println("제조사 : " + p3.getManufacture());
		System.out.println("모델명 : " + p3.getModel());
		System.out.println("최대 승객수 : " + p3.getMaxNumberOfPassengers());
		System.out.println();
		
		
		System.out.println("생산된 비행기의 수 : " + Plane.getNumberOfPlanes());
		
	}
	

}
