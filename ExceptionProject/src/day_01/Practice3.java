package day_01;

public class Practice3 {
	
	public static void main(String[] args) {
		
		System.out.println("program started");

		try {

			System.out.println("inside try");
			String a = null;
			System.out.println(a.length()); // will throw NullPointerException

		} catch (ArrayIndexOutOfBoundsException | NullPointerException e) { // we can use it this way as well. 
			//Connection multiple exceptions using pipe
			
			System.out.println("caught Exception Fish");
			System.out.println(e.getMessage()); // will print null
			e.printStackTrace(); // will print the RED error message
			// Finally keyword is just like default of switch statement. It will run no matter if you have exception or not
		} finally {
			System.out.println("program came to finally block");
		}
		
		

		System.out.println("program ended");
		
	}

}
