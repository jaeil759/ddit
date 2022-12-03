package e_oop;

public class Calculator {
	// 1. 123456 + 654321
	// 2. 1번의 결과값 * 123456
	// 3. 2번의 결과값 / 123456
	// 4. 3번의 결과값 - 654321
	// 5. 4번의 결과값 % 123456
	
	public double add(double a, double b){
		return a+b;
	}
	public double multiply(double a, double b) {
		return a*b;
	}
	public double divide(double a, double b) {
		return a/b;
	}
	public double subract(double a, double b) {
		return a-b;
	}
	public double remainder(double a, double b) {
		return a%b;
	}
}
