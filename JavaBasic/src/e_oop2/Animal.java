package e_oop2;

public abstract class Animal {
	void run() {
		System.out.println("달린다!");
	}
	abstract void sound();
}
class Dog extends Animal{

	@Override
	void sound() {
		System.out.println("멍멍");
	}
	
}
class Cat extends Animal{

	@Override
	void sound() {
		System.out.println("야옹");
	}
	
}