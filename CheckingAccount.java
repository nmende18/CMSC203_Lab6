
public class CheckingAccount extends BankAccount{
	final static  double FFE = 15.0;
	
	public CheckingAccount(String name, double amount) {
		super(name, amount);
		setAccountNumber(getAccountNumber() + "-10");
		
	}
	
	@Override
	public boolean withdraw(double amount) {
		
		double total;
		total = amount + FFE;
		return super.withdraw(total);
		
	}

}
