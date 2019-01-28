package day_01;

public class Practice2 {

	public static void main(String[] args) {

		System.out.println("program started");

		try {

			System.out.println("inside try");
			String a = null;
			System.out.println(a.length()); // will throw NullPointerException

		} catch (ArrayIndexOutOfBoundsException e) { // this will give error without the next catch block that is correct Exception for this code
			
			System.out.println("An exception happened");
			System.out.println(e.getMessage()); // will print null
			e.printStackTrace(); // will print the RED error message
			
		} catch(NullPointerException e) {
			System.out.println("Caught Null Pointer Exception Fish");
		}

		System.out.println("program ended");

		/*
		 * 
		 * TASK 2 try to create a code that might throw ArrayOutOfBoundException and try
		 * to end your program gracefully without seeing error codes in consule
		 * 
		 * try to fix the code to make sure it does not throw an exception and run the
		 * program again and see what you get,
		 *
		 */
		
		System.out.println("========================================");

		System.out.println("try- catch block");

		try {
			String[] arr = new String[2];
			arr[0] = "java";
			arr[1] = "selenium";
			arr[2] = "maven";
		} catch (ArrayIndexOutOfBoundsException e) {
			
			System.out.println("I caught an exception");
			System.out.println(e.getMessage()); // printing 2 what is the error
			e.printStackTrace();
		}

		System.out.println("yeah , I am reachable");
		
		System.out.println("========================================");
		
		System.out.println("Starting");
		
		try {
			
            String[] str = { "One", "Two", "Three" };
            System.out.println(str[3]);
        } catch (ArrayIndexOutOfBoundsException e) {
        	
            System.out.println("Wrong index");
        }
		
        System.out.println("After array");

	}

}
