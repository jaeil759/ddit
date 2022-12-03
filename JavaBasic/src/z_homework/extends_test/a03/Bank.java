package z_homework.extends_test.a03;


public class Bank {
	private Customer[] customers; // 은행의 고객목록
	private int numberOfCustomers; // 은행의 고객수
	
	public Bank() {
		customers = new Customer[10];
	}
	public void addCustomer(Customer customer) {
//방법1
//		for(int i = 0; i < customers.length; i++) {
//			if(customers[i] == null) {
//				customers[i] = customer;
//				break;
//			}
//		}
//		this.numberOfCustomers++;
//방법2
		customers[numberOfCustomers++] = customer; 
	}
	public Customer[] getCustomers() {
		return customers;
	}
	public int getNumberOfCustomers() {
		return numberOfCustomers;
	}
	public Customer getCustomer(int index) {
		return customers[index];
	}
		
}
	

