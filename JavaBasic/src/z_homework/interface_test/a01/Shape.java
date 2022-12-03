package z_homework.interface_test.a01;

public abstract class Shape implements Comparable{
	
	public Shape() {}
	
	public abstract double area();
	
	

	public abstract double perimeter();
		
	
	@Override
	public int compareTo(Object o) {
		this.area();
		double oArea = ((Shape) o).area();
		if(this.area() > oArea) {
			return 1;
		}else if(this.area() == oArea) {
			return 0;
		}else {
			return -1;
		}
	}
	
}
