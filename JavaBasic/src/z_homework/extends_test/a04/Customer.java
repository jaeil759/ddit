package z_homework.extends_test.a04;

public class Customer {
	private String firstName;
	private String lastName;
	private BankAccount[] accounts;
	private int numberOfAccounts;
	
	Customer(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
		accounts = new BankAccount[5];
	}

	
	public BankAccount getAccount(int i) {
		return accounts[i];
	}

	public void addAccount(BankAccount ba) {
		accounts[numberOfAccounts++] = ba;
	}
	public int getNumberOfAccounts() {
		return numberOfAccounts;
	}
	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	@Override
	public String toString() {
		return "이름 : " + this.firstName + " " + this.lastName + ", 계좌의 갯수 : " + this.numberOfAccounts;
	}
	
	
	
}
