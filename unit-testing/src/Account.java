
public class Account {

	private double balance;

	public Account() {
		super();
	}

	public Account(double balance) {
		super();
		this.balance = 1000;
	}
	
	public double deposit(double amount) throws NumberFormatException
	{
		if(amount<0)
			throw new NumberFormatException("negative balance not allowed");
		balance+=amount;
		return balance;
	}
	
	public double withdrawl(double amount) throws BalanceException,NumberFormatException
	{
		if(amount<0)
			throw new NumberFormatException("negative nmber impossible");
		if(balance<amount)
			throw new BalanceException("balance too low");
		balance-=amount;
		return balance;
	}
	
}
