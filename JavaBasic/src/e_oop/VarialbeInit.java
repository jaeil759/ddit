package e_oop;

public class VarialbeInit {
	
	//명시적 초기화
	int var = 10;
	static int staticVar = 20;
	
	// 초기화블럭
	{
		var = 20;
	}
	
	static{
		staticVar = 30;
//		var = 30; // 스태틱 블럭에서 초기화 할수 없다.
	}
	/*
	 * 생성자
	 * - 클래스와 같은 이름의 메서도
	 * - 인스턴스 변수를 초기화 하기 위해 사용된다
	 * - 클래스에 생성자는 반드시 하나 이상 존재해야한다.
	 * - 직접 선언해주지 않으면 컴파일러가 기본 생성자를 만들어준다.
	 * - 생성자는리턴타입이 없아
	 * 
	 */
	VarialbeInit(){
		var = 40;
		
		//생성자 사용이유
		// 초기화에 에려줄의 코드가 필요할때
		// 초기화에 파라미터가 필요할때
		
	}
	

	public static void main(String[] args) {
		//	Init i1 = new Init();
		//	System.out.println(i1.a);
			DditClass c404 = new DditClass();
			System.out.println(c404.컴퓨터);
			System.out.println(c404.담임);
			c404.담임 = "이철희";
			System.out.println(c404.담임);
			
			DditClass c501 = new DditClass();
			c501.컴퓨터 = 50;
			c501.학생 = 50;
			c501.담임 = "아이유";
			
			DditClass c502 = new DditClass(50,50,"이지은");
			System.out.println(c502.담임);
			
			
	}

}
class DditClass{
	int 컴퓨터;
	int 학생;
	String 담임;
	
	// 오버로딩 : 같은 이름의 메서드를 여러개 정의하는것.
	DditClass(int 컴퓨터, int 학생, String 담임){
		//this : 인스턴스 변수와 지역변수의 이름이 같을때 둘을 구분하기 위해 사용
		this.컴퓨터 = 컴퓨터;
		this.학생 = 학생;
		this.담임 = 담임;
	}
	//파라미터의 형식과 갯수를 비교하여 다르다면 오버로딩이 가능하다.
	DditClass(int 컴퓨터){
		
	}
//	DditClass(int 학생){
//		
//	}
	DditClass(){
//		컴퓨터 = 25;
//		학생 = 25;
		this(25, 25, null);
		//this() : 생성자를의미
	}
	
	
}
