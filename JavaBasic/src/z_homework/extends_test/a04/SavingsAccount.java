package z_homework.extends_test.a04;

public class SavingsAccount extends BankAccount {
	private double interestRate; //이자율
	
	public SavingsAccount(int a, double interestRate) {
		super(a);
		this.interestRate = interestRate;
	}
	
	public void updateBalance(int a) {
		this.balance = (int)(this.balance * this.interestRate * a) + this.balance;
	}
}
