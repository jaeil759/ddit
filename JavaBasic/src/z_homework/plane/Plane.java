package z_homework.plane;

public class Plane {
	private String manufacture; //제작사
	private String model; // 비행기 모델명
	private int maxNumberOfPassengers; // 최대승객수
	private static int numberOfPlanes; // 지금까지 생성된 비행기의 객체수, 
									   //객체가 생성될때마다 생성자에서 증가시켜줌
	
	Plane(){
		numberOfPlanes++;
		this.manufacture = "";
		this.model = "";
		this.maxNumberOfPassengers = 0;
	}
	Plane(String manufacture, String model, int maxNumberOfPassengers){
	numberOfPlanes++;
	
	this.manufacture = manufacture;
	this.model = model;
	setMaxNumberOfPassengers(maxNumberOfPassengers);
	}

	public String getManufacture() {
		return manufacture;
	}
	public void setManufacture(String manufacture) {
		this.manufacture = manufacture;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public int getMaxNumberOfPassengers() {
		return maxNumberOfPassengers;
	}
	public void setMaxNumberOfPassengers(int maxNumberOfPassengers) {
		this.maxNumberOfPassengers = maxNumberOfPassengers < 0 ? 0 : maxNumberOfPassengers;
	}
	public static int getNumberOfPlanes() {
		return numberOfPlanes;
	}
	public static void setNumberOfPlanes(int numberOfPlanes) {
		Plane.numberOfPlanes = numberOfPlanes;
	}
	public String toString() {
		return "";
	}
}