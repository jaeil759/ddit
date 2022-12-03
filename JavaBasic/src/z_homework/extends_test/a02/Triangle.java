package z_homework.extends_test.a02;

public class Triangle extends Shape{
	private double side;
	
	public Triangle(double side){
		this.side = side;
	}
	
	
	
	@Override
	public double area() {
		return (Math.sqrt(3) * Math.pow(this.side, 2)) /4;
	}
	@Override
	public double perimeter() {
		return this.side * 3;
	}
	@Override
	public String toString() {
		return "도형의 종류는 : 삼각형, 둘레 : " + this.perimeter() + "㎠" + "넓이 : " + this.area() + "㎠";
	}
	
	
}
