package z_homework.interface_test.a03;

public class ScienceFiction extends Book {

	public ScienceFiction(String title, String author) {
		super(title, author);
		// TODO Auto-generated constructor stub
	}

	@Override
	public int getLateFee(int a) {
		return a * 600;
	}

}
