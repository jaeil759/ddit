package z_homework.interface_test.a01;

public class Circle extends Shape {
	private double radius;
	
	public Circle(double radius){
		this.radius = radius;
	}

	@Override
	public double area() {
		return Math.pow(radius, Math.PI);
	}
	@Override
	public double perimeter() {
		return 2 * Math.PI * radius;
	}




	@Override
	public String toString() {
		return "도형의 종류 : 원 , 둘레 : " + this.perimeter() + "㎠" + "넓이는 : " + this.area() + "㎠";
	}
}
