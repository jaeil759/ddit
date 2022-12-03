package z_homework.extends_test.a04;

public class CheckingAccount extends BankAccount{
	private SavingsAccount protectedBy;
	
	public CheckingAccount(int a) {
		super(a);
	}
	public CheckingAccount(int a, SavingsAccount sa) {
		super(a);
		this.protectedBy = sa;
	}
	@Override
	public boolean withdraw(int a) {
		if(this.balance < a) {
			if(a > protectedBy.balance + this.balance) {
				System.out.println("잔액이 부족합니다.");
				return false;
			}else { // 인출하려는 금액 - this.balance(현재금액) <= protectedBy.balance(sa잔액)
				a -=this.balance;
				this.balance = 0;
				protectedBy.balance -= a;
				return true;
			}
		}else { // 인출하려는 금액 <= 현재잔액
			this.balance -= a;
			return true;
			
		}
		
	}
}
