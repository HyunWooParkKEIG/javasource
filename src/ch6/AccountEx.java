package ch6;

public class AccountEx {

	public static void main(String[] args) {
		Account2 acc = new Account2();
		
		acc.setBalance(10000);
		System.out.println(acc.getBalance());

		acc.setBalance(-100);
		System.out.println(acc.getBalance());
		
		acc.setBalance(300000);
		System.out.println(acc.getBalance());
	}

}
