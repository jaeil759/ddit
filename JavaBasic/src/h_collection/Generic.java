package h_collection;

public class Generic {
	Student<Integer> s1 = new Student();
	Student<Double> s2 = new Student();
	
}

class Student<T>{
	String name;
	T kor, eng, math;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public T getKor() {
		return kor;
	}
	public void setKor(T kor) {
		this.kor = kor;
	}
	public T getEng() {
		return eng;
	}
	public void setEng(T eng) {
		this.eng = eng;
	}
	public T getMath() {
		return math;
	}
	public void setMath(T math) {
		this.math = math;
	}
}