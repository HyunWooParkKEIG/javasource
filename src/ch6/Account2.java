package ch6;

public class Account2 {
	static final int MIN_BALANCE = 0;
	static final int MAX_BALANCE = 100000000;
	
	private int balance;
	
	public Account2() {
		// TODO Auto-generated constructor stub
	}
	
	public Account2(int balance) {
		this.balance = balance;
	}
	
	public void setBalance(int balance) {
		if(this.balance >= MIN_BALANCE && this.balance <= MAX_BALANCE) {
			this.balance = balance;
		}
	}
	
	public int getBalance() {
		return this.balance;
	}
	
	
}
