package z_homework.interface_test.a03;

public abstract class Book {
	private int number; //관리번호
	private String title,author; // 제목,저자
	private static int countOfBooks = 0; // 만들어진 book의 개수
	
	public Book(String title, String author) {
		this.title = title;
		this.author = author;
		this.number = ++countOfBooks;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}
	
	
	public abstract int getLateFee(int a);
	
	public boolean equals(Object o) {
		Book b = (Book)o;
		if(this.title.equals(b.getTitle())&& this.author.equals(b.getAuthor())) {
			return true;
		}else {
			return false;
		}
	}

	@Override
	public String toString() {
		return "관리번호 " + this.number + "번, 제목 : " + this.title + ", 저자 : " + this.author + "(일주일 연체료: " + String.format("%,d", this.getLateFee(7)) + "원)";
	}
		
	@Override
	public int hashCode() {
		return 0;
	}
}
