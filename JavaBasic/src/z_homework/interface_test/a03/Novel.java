package z_homework.interface_test.a03;

public class Novel extends Book {

	public Novel(String title, String author) {
		super(title, author);
	}

	@Override
	public int getLateFee(int a) {
		return a * 300;
	}

}
