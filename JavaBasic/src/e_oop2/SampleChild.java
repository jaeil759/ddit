package e_oop2;

public class SampleChild extends SampleParent{
	
	String var2;
	
	public void childMethod() {
		// 상속받은 변수와 메서드를 사용할 수 있다.
		System.out.println(var);
		System.out.println(method(1,2));
	}
	
	
	// 오버라이딩(Overriding) : 상속받은 메서드의 내용을 재정의 하는것.
	@Override // 어노테이션 : 클래스, 변수, 메서드 등에 표시해놓는것
	public int method(int a, int b) {
		// 재정의하기 위해서는 리턴타입 및 파라미터의 갯수와 종류가 동일해야함
		return 0;
	}
	
	
	int var;
	public void testMethod(double var) {
		System.out.println(var); // 지역변수(파라미터)
		System.out.println(this.var); // 자식클래스의 전역변수
		System.out.println(super.var); // 부모클래스의 전역변수
		// super : 부모클래스의 멤버와 자식클래스의멤버가 이름이 중복될때 둘을 구분하기 위해 사용함.
		System.out.println(this.method(1, 2));
		System.out.println(super.method(1, 2));
	}
	SampleChild(){
		super();
		//super() 를 통해 클래스의 생성자를 호출하고 부모클래스의 인스턴스 변수도 초기화한다.
		//super() 가 없으면 컴파일러가 자동으로 super()를 넣어준다.
		System.out.println("자식클래스 생성");
	}
	public static void main(String[] args) {
		SampleChild sc = new SampleChild();
		sc.method(1, 1);
		
		// 다형성
		// 부모탑의 변수로 자식타입의 객체를 사용하는것.
	//	SampleParent sp = new SampleChild();
		SampleParent sp = (SampleParent)(new SampleChild());
		
		sc = (SampleChild)(new SampleParent());
		
		SampleParent sp1 = (SampleParent) new Object();
	}

}
