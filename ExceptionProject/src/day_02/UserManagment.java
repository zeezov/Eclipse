package day_02;

public class UserManagment {
	/*
	 * // Task 1 Exception : create a class called UserManagement create main method
	 * create static method called CreateUserName take one string as name and return
	 * nothing the logic : print first letter of the name print 10th letter of the
	 * name turn your name into char[] then access 10th character turn first letter
	 * into Integer hint -> you can use Integer.parseInt(arg) call your method in
	 * main -- by passing few different arguments // and try to create multi try
	 * catch block inside method to catch exceptions at run time and print sth
	 * useful
	 * 
	 */

	public static void main(String[] args) {
		
		createUserName("Nazim");
		createUserName("6 Ibrahim CyberTek");		
		String str = null ; 
		createUserName(str);

	}

	public static void createUserName(String name) {

		try {
			System.out.println(name.charAt(0));
			System.out.println(name.charAt(11));
			
			char[] charArr = name.toCharArray();
			System.out.println(charArr[9]);
			
			String[] arrName = name.split("");
			Integer i = Integer.parseInt(arrName[0]);
			System.out.println(i);
			
		} catch (NullPointerException e) {
			System.out.println("Caught Null Pointer Exception");
		} catch (StringIndexOutOfBoundsException e) {
			System.out.println("Caugth StringIndexOutOfBoundsException");
		} catch (NumberFormatException e1) {
			System.out.println("Caugth NumberFormatException");
		} catch (ArrayIndexOutOfBoundsException e1) {
			System.out.println("Caugth ArrayIndexOutOfBoundsException");
		} finally {
			System.out.println("This is finnally block");
		}

		

	}

}
