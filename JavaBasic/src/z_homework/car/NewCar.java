package z_homework.car;

public class NewCar {
	private double speed; // 현재 속도
	private String color; // 자동차 색상
	private static final double MAX_SPEED = 200; // 차의 엔진이 허용하는 최대 속력(상수)
	
	NewCar(){}
	NewCar(String color){
	this.color = color;
	}
	public double getSpeed() {
		return speed;
	}
	public void setSpeed(double speed) {
		this.speed = speed;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public boolean speedUp(double speed) {
//		this.speed += speed;
		boolean flag = false;
		if(this.speed + speed < 0 || this.speed + speed > MAX_SPEED) {
			//return false;
			flag = true;
		}else {
			this.speed += speed;
			//return true;
		}
		return flag;
	}
	public static double getMaxSpeed() {
		return MAX_SPEED;
	}
	public String toString() {
		return "";
	}
}
