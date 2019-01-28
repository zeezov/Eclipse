package day_03;

public class CustomException {
	
	public static void main(String[] args) throws PocketOutOfMoneyException  {
		
		PocketOutOfMoneyException e = new PocketOutOfMoneyException("Some Custome Exception");
		
		throw e;
		
	}

}

class PocketOutOfMoneyException extends Exception {
	
	
	public PocketOutOfMoneyException() {
		
		System.out.println("No Arg");
		
	}
	
	public PocketOutOfMoneyException(String s) {
		
		super(s);
		
	}
	
	
	
}
