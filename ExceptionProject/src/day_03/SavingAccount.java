package day_03;

public class SavingAccount extends BankAccount {
	
	private int balance;
	private double penalty;

	public SavingAccount(long cardNum, String cardName, int balance) {
		super(cardNum, cardName);
		this.balance = balance;
		
		if(balance < 0) {
            throw new RuntimeException("CAN NOT CREATE SAVING ACCOUNT WITH MINUS BALANCE");
    }
		
	}

	@Override
	   public String toString() {
	       return getCardName() + " SavingAccount [balance = " + balance
	                   + ", penaltyPercentage = " + penalty +" | " + getCardNum() + " ]";
	   }


	@Override
	public void deposit(int amount1) {
		
		this.balance = (int)(amount1 + 1.1) + this.balance;
		
	}

	@Override
	public void withdraw(int amount2) throws RuntimeException {
		
		this.balance = (int)(this.balance - 1.1 * (amount2));
		
	}

	public double getPenatly() {
		return penalty;
	}

	public void setPenatly(double penatly) {
		this.penalty = penatly;
	}

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}
	
	
	
	

}
