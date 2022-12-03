package f_exception;

public class UserException extends Exception{
	@Override
	public void printStackTrace() {
		System.out.println("예외 발생!");
	}
}
