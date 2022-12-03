package e_oop2;

public class MultiExtends extends ExtendsA{
	// 클래스 Extends A와 Extends B에 있는 메서드를 사용하기 위해
	// 두 클래스를 상속받고 싶다.
	
	@Override
	public void methodA() {
		// TODO Auto-generated method stub
		super.methodA();
	}
	
	private void methodB() {
		// TODO Auto-generated method stub

	}
}
 
class ExtendsA{
	public void methodA() {}
	
}

class ExtendsB{
	public void methodB() {}
	
}
