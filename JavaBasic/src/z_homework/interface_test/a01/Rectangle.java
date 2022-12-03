package z_homework.interface_test.a01;

public class Rectangle extends Shape{
	private double width, height;
	
	
	
	public Rectangle(double width,double height){
		this.width = width;
		this.height = height;
	}

	@Override
	public double area() {
		return this.width * this.height;
	}
	@Override
	public double perimeter() {
		return (this.width+this.height)*2;
	}




	@Override
	public String toString() {
		return "도형의종류 : 사각형, 둘레 : " + this.perimeter() + "㎠" + ",넓이는 : " + this.area() +"㎠" ;
	}
	
}