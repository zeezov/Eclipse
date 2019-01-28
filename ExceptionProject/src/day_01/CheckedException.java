package day_01;

import java.io.FileNotFoundException;

public class CheckedException {

	public static void main(String[] args) {

		// FileNotFoundException --- checked exception

		/*
		 * Unchecked Exception: - We do not have to handle at the compile time -
		 * Anything that IS-A RunTimeException can be called as unchecked exception
		 * 
		 * Checked Exception: - We have to handle at the compile time or it will not
		 * compile. - Anything that IS-A Exception
		 */

		// FileNotFoundException -- checked exception
		System.out.println("ABC");
		NullPointerException e = new NullPointerException();
		// FileNotFoundException e = new FileNotFoundException();
		try {
			System.out.println("doing dangerous action");
			throw e;
		} catch (RuntimeException e1) {
			// TODO Auto-generated catch block
			System.out.println("handled the exception");
		}

	}

}
