package day_03;

public class CheckingAccount extends BankAccount {
	
	
	private int balance;
	
	public CheckingAccount(long cardNum, String cardName, int balance) {
		super(cardNum, cardName);
		this.balance = balance;
		
	}


	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}
	

	@Override
	   public String toString() {
	       return  getCardName() + " CheckingAccount [balance=" + balance +   " | card number is "+ getCardNum()+ "  ]";
	   }


	@Override
	public void deposit(int amount1) {
		
		this.balance += amount1;
		
	}

	@Override
	public void withdraw(int amount2) throws RuntimeException {
		
		this.balance -= amount2 ;
        if(this.balance < 0){
            throw new RuntimeException("YOUR BALANCE DROPPED TO BELOW 0") ;
        }
		
		
	}
	
	

}
