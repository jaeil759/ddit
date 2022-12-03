package e_oop2;

public abstract class SampleAbstratParent {
	void method() {
		
	}
	abstract void abstractMethod();
		
	
}
class SampleAbstractChild extends SampleAbstratParent{
	//추상클래스를 상속받으면 추상클래스 안에 있는추상 메서드를 반드시 오버라이드 해야한다.
	@Override
	void abstractMethod() {
		
	}
}