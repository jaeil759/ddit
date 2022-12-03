package z_homework;

public class Circle {
	double x, y, radius;

	
	public double getX() {
		return x;
	}

	public void setX(double x) {
		this.x = x;
	}

	public double getY() {
		return y;
	}

	public void setY(double y) {
		this.y = y;
	}

	public double getRadius() {
		if(this.radius < 0) {
			this.radius = 0;
		}
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}
	public double getArea() {
		return 3.14159*radius*radius;
		
	}
	
}
