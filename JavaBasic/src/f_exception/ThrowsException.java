package f_exception;

public class ThrowsException {
	/*
	 * 메서드에 예외 선언하기
	 *  - 메서드 호출 시 발생할 수 있는 예외를 선언해줄 수 있다.
	 *  - 반환타입 method() throws Exception{}
	 *  - 메서드의 구현부 끝에 throrws 예약어와 예외 클래스명으로 예외를 선언할 수 있다.
	 *  - 예외를 선언하면 예외처리를 하지 않고 자식을 호출한 메서드로 예외처리를 넘겨준다.
	 */
	public static void main(String[] args) {
		try {
			method();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	private static void method() throws InterruptedException {
		Thread.sleep(1);
	}

}
