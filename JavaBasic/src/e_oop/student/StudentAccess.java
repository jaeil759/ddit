package e_oop.student;

public class StudentAccess {
	private int kor, eng, math, sum;
	private double avg;
	private String name;
	
	public void setKor(int kor) {
		//로그인 체크 로직
		this.kor = kor;
		calcSum();
		
	}
	public int getKor() {
		return this.kor;
	}
	public int getEng() {
		return eng;
	}
	public void setEng(int eng) {
		this.eng = eng;
		calcSum();
	}
	public int getMath() {
		return math;
	}
	public void setMath(int math) {
		this.math = math;
		calcSum();
	}
	private void calcSum() {
		this.sum = this.kor + this.eng + this.math;
	}
	public int getSum() {
		return sum;
	}
	public void setSum(int sum) {
		this.sum = sum;
	}
	public double getAvg() {
		return avg;
	}
	public void setAvg(double avg) {
		this.avg = avg;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void sortByToAsc() {
		
	}
	@Override
	public String toString() {
		return "StudentAccess [kor=" + kor + ", eng=" + eng + ", math=" + math + ", sum=" + sum + ", avg=" + avg
				+ ", name=" + name + "]";
	}
	
	
	
}
