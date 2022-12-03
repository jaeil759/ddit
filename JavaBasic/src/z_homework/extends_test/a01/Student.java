package z_homework.extends_test.a01;

public class Student extends Human{
	private String major;
	
	public Student(String name, int age, String major) {
		super.setName(name);
		super.setAge(age);
		//Human 의 name, age 변수가 private 로 선언되어이으므로 직접접근불가
//		super.name = name;
//		super.age = age;
		this.major = major;
	}
	
	public String getMajor() {
		return major;
	}
	
	public void setMajor(String major) {
		this.major = major;
	}

	@Override
	public String toString() {
		return super.toString() + ",전공 : " + major;
	}
	
	
}

