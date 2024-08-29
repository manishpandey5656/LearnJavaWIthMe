package homework;

public class BankAccount {
	
	private double balance;
	
	public BankAccount() {
	this.balance = 0.0;
	}
	public void deposit(double amount) {
		this.balance += amount;
		System.out.println("Deposited amount ="+ amount);
	
	}
	public void deposit(double amount, String description) {
		this.balance += amount;
		System.out.println("Deposited amount = " + amount);
	}
	public void deposit(BankAccount fromAccount, double amount) {
		if(fromAccount.balance >= amount) {
			fromAccount.balance -= amount;
			this.balance += amount;
			System.out.println("Transffered " + amount + "from aacount1");
			
		}
		else {
			System.out.println("Insufficient balance in account");
		}
		 
		 
	}
	public double getBalance() {
		return balance;
	}
	public static void main(String args[]){
		BankAccount account1 = new BankAccount();
		account1.deposit(100);
		System.out.println("account1 balance = " + account1.getBalance());
		
		BankAccount account2 = new BankAccount();
		account2.deposit(50,"cashback");
		System.out.println("Account2 balance = " + account2.getBalance());
		
		
		BankAccount account3 = new BankAccount();
		account3.deposit(100);
		account2.deposit(account3, 50);
		
		System.out.println("account 2 balance after transfer " + account2.getBalance());
        System.out.println("account 3 balance after transfer " + account3.getBalance());
		
	}
}



