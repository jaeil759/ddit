package f_exception;

public class ExceptionHandling {

		/*
		 * 에러 
		 *  - 컴파일 에러 : 컴파일시에 발생되는 에러(빨간줄)
		 *  - 논리적 에러 : 실행은 되지만, 의도와 다르게 동작하는 것(버그)
		 *  - 런타임 에러 : 실행시에 발생되는 에러
		 * 런타임에러
		 * - 런타임 : 에러 발생 시 발생한 위치에서 프로그램이 비정상적으로 종료된다.
		 * - 에러 : 프로그램 코드에 의해 수습될 수 없는 심각한 오류(처리불가)
		 * - 예외 : 프로그램 코드에 의해서 수습될 수 있는 다소 미약한 오류(처리가능)
		 * 
		 * 예외
		 *  - 모든 예외는 Exception 클래스의 자식 클래스이다.
		 *  - RuntimeException 클래스와 그 자식들은 예외처리가 강제되지 않는다.
		 *    (예 : Thread.sleep(millisecond))
		 *    [RuntimeException 클래스와 그 자식들을 제외한]
		 *    Exception 클래스의 자식들은 예외처리가 강제된다.
		 * 
		 * 예외처리(try-catch)
		 *  - 예외처리를 통해 프로그램이 비정상적으로 종료되는 것을 방지할 수 있다.
		 *  - try{} catch(Exception e){}
		 *  - try 블럭 안의 내용을 실행 중 예외가 발생하면 catch로 넘어간다.
		 *  - catch의 ()의 안에는 처리할 예외를 지정해 줄 수 있다.
		 *  - 여러종류의 예외를 처리할 수 있도록 catch는 하나이상 올 수 있다.
		 *  - 발생한 예외와 일치하는 catch블럭안의 내용이 수행된 후 try-catch를 빠져나간다.
		 *  - 발생한 예외와 일치하는 catch가 없을 경우 예외는 처리되지 않는다.
		 */
	public static void main(String[] args) {
		try {
			Thread.sleep(1);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} //예외처리 필수
		int a = 0;
	
	try {
		int result = 10 / 0;
		System.out.println(result);
	}catch(ArrayIndexOutOfBoundsException | ArithmeticException e) { //여러개의 예외를 동일하게 처리할 때
		e.printStackTrace(); // 에러 메세지 출력
		System.out.println("숫자를 0으로 나눌수 없습니다.");
		}catch(NullPointerException e) {
			//아무조치도 하지 않지만 프로그램이 종료되지 않는다.
		}catch(Exception e) {
			//예상하지 못한 모든 예외 처리
			e.printStackTrace();
		}
	}
}
