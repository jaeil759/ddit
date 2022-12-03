package z_homework.extends_test.a03;

public class BankAccount {
	private int balance;
	
	public BankAccount(int balance) {//잔액
		this.balance = balance;
	}

	public int getBalance() {
		return balance;
	}
	public void deposit(int amount) { //입금메소드
		this.balance += amount;
	}
	public boolean withdraw (int amount) { //출금메소드
		if(this.balance < amount) {
			return false;
		}else {
			this.balance-=amount;
			return true;
		}
		
	}
	public boolean transfer(int amount,BankAccount otherAccount) {
//방법1
//		if(this.balance < amount) {
//			return false;
//		}else {
//			this.balance -= amount;
//			otherAccount.deposit(amount);
//			return true;
//		}
		//방법2
		boolean b = this.withdraw(amount);
		if(b) {
			otherAccount.deposit(amount);
			//return true;
		}
		return b;
		}
	}

