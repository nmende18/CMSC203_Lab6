
public class SavingsAccount extends BankAccount{
	
	private double rate = 0.025;
	private int savingsNumber = 0;
	private String accountNumber;
	
	public SavingsAccount(String name, double amount) {
		super(name, amount);
		this.accountNumber = super.getAccountNumber() + "-" + savingsNumber;
		savingsNumber++;
		
		
	}
	
	public void  postInterest() {
		double balance;
		balance = getBalance() * rate/12;
		deposit(balance);
	}
	public String getAccountNumber() {
		return accountNumber;
	}
	
	public SavingsAccount(SavingsAccount otherAccount, double totalBalance) {
		super(otherAccount, totalBalance);
		this.rate = otherAccount.getBalance();
		this.accountNumber = super.getAccountNumber() + "-" + savingsNumber;
		savingsNumber++;
	}

}
