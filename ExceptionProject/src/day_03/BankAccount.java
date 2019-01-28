package day_03;


/*
 * Create abstarct class called BankAccount 
    private instance fields 
        cardNum : long 
        cardName : String 
    create 2 args constructor to set the field value 
    creare getters and setters 
    override toString method of Object 
            to return something useful 
    abstact methods : 
        deposit -- take one int and return nothing; 
        withdraw -- take one int and return nothing 
            might throw RuntimeException  
Create 2 subclasses called  CheckingAccount , SavingAccount
     
     CheckingAccount : 
            private instance fields : 
                balance : int 
            a constructor to set all fields value 
            getters and setters 
            implements the abstract methods 
            override toString method you impelemted 
            
     SavingAccount : 
	 		private instance fields : 
	 			balance : int
	 			penaltyPercentage : double 
	 		a constructor to set all fields value 
	 		getters and setters 

	 		implements the abstract methods 
	 			 if you withdraw from saving account 10% 
	 			 penalty 
	 		override toString method you impelemted
	 		
class with Main method : 
        Create List of bank account 
        create 4 different objects of Checking and Saving 
        withdraw 100$ from all of them .  
 */



public abstract class BankAccount {
	
	private long cardNum;
	private String cardName;
	
	public BankAccount(long cardNum, String cardName) {
	
		this.cardNum = cardNum;
		this.cardName = cardName;
		
	}
	
	public abstract void deposit(int amount);
	
	public abstract void withdraw(int amount) throws RuntimeException;
	
	@Override
	public String toString() {
		
		return "Card number: " + cardNum + " Card Name: " + cardName;
		
	}

	public long getCardNum() {
		return cardNum;
	}

	public void setCardNum(long cardNum) {
		this.cardNum = cardNum;
	}

	public String getCardName() {
		return cardName;
	}

	public void setCardName(String cardName) {
		this.cardName = cardName;
	}
	
	
	
	

}
