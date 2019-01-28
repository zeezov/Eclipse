/**
 * This course project is copyright of CyberTek ©CyberTek[2017]. All rights reserved. 
 * Any redistribution or reproduction of part or all of the contents in any form is 
 * prohibited without the express consent of CyberTek.
 */

package date;

import java.util.Calendar;

public class Date implements Comparable<Date> {

	private static final int[] DAYS = { 0, 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
	protected final int month;
	protected final int day;
	protected final int year;

	/*
	 * Initialized a new date from the month, day and year.
	 * 
	 * @param month the month (between 1 and 12)
	 * 
	 * @param day the day (between 1 and 28-31, depending on the month)
	 * 
	 * @param year the year
	 * 
	 */

	public Date(int month, int day, int year) {
		if (!isValid(month, day, year)) {
			System.out.println("Invalid Date");
			throw new IllegalArgumentException();
		}
		this.year = year;
		this.month = month;
		this.day = day;
	}

	/*
	 * @return month of that month
	 */
	public int getMonth() {
		return this.month;
	}

	/*
	 * @return day of that day
	 */
	public int getDay() {
		return this.day;
	}

	/*
	 * @return year of that year
	 */
	public int getYear() {
		return this.year;
	}

	/**
	 * This method checks if a given date is a valid calendar date
	 * 
	 * @param m month (1-12)
	 * @param d day (1-31)
	 * @param y year. (A year is no less than 1900, and no greater than 2100)
	 * @return true if the given date is a valid calendar date. false otherwise
	 */
	public static boolean isValid(int m, int d, int y) {
		// TODO

		if (m >= 1 && m <= 12 && d >= 1 && d <= 31 && y >= 1900 && y <= 2100) {
			return true;
		}

		return false;
	}

	/**
	 * @param year
	 * @return true if the given year is a leap year. false otherwise.
	 */
	public static boolean isLeapYear(int year) {
		// TODO

		if (year % 400 == 0 || year % 4 == 0 && year % 100 != 0) {
			return true;
		}

		return false;
	}

	/**
	 * Compare this date to that day.
	 * 
	 * @return {a negative integer or zero or a positive integer}, depending on
	 *         whether this date is {before, equal to, after} that date if this date
	 *         is before that date - return -1 if this date is equal to that date -
	 *         return 0 if this date is after that date - return 1
	 */

	public int compareTo(Date that) {
		// TO DO
		if (this.getYear() == that.getYear() && this.getMonth() == that.getMonth() && this.getDay() < that.getDay()) {
			return -1;
		} else if (this.getYear() == that.getYear() && this.getMonth() < that.getMonth()) {
			return -1;
		} else if (this.getYear() < that.getYear()) {
			return -1;
		} else if (this.getYear() == that.getYear() && this.getMonth() == that.getMonth()
				&& this.getDay() == that.getDay()) {
			return 0;
		} else {
			return 1;
		}

	}

	/**
	 * Return a string representation of this date.
	 * 
	 * @return the string representation in the format MM/DD/YYYY
	 * 
	 */
	public String toString() {
		// TO DO
		return this.month + "/" + this.day + "/" + this.year;
	}

	/**
	 * 
	 * @return the word representation of the date. Example: (new
	 *         Date(12,1,2017)).dateToWords() returns "December One Two Thousand
	 *         Seventeen"
	 */
	public String dateToWords() {
		String[] monthWords = { "January", "February", "March", "April", "May", "June", "July", "August", "September",
				"October", "November", "December" };
		String[] numbersLessThanTen = { "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten" };
		String[] numbersBetweenTenAndTwenty = { "Eleven", "Twelve", "Thirteen", "Fourteen", "Fifteen", "Sixteen",
				"Seventeen", "Eighteen", "Nineteen" };
		String[] multiplesOfTen = { "Ten", "Twenty", "Thirty", "Forty", "Fifty", "Sixty", "Seventy", "Eighty",
				"Ninety" };
		String[] yearWords = { "Hundred", "Thousand" };

		String dateInWords = monthWords[this.getMonth() - 1] + " ", strYear = "" + this.getYear();
		if (this.getDay() <= 10) {
			dateInWords += numbersLessThanTen[this.getDay() - 1] + " ";
		} else if (this.getDay() > 10 && this.getDay() < 20) {
			dateInWords += numbersLessThanTen[(this.getDay() - 10) - 1] + " ";
		} else {
			String day = "" + this.getDay();
			dateInWords += multiplesOfTen[Integer.parseInt(day.substring(0, 1)) - 1] + " "
					+ numbersLessThanTen[Integer.parseInt(day.substring(1)) - 1] + " ";
		}
		// At this point we have => MONTH DAY // below we are taking care of the year
		if (strYear.equals("2000")) {
			return dateInWords += numbersLessThanTen[1] + " " + yearWords[1];
		}
		if (strYear.charAt(0) == '2') {
			if (strYear.charAt(1) == '0') {
				dateInWords += numbersLessThanTen[1] + " " + yearWords[1] + " ";
				if (strYear.charAt(2) == '1') {
					dateInWords += numbersBetweenTenAndTwenty[Integer.parseInt(strYear.substring(3, 4)) - 1];
				} else {
					dateInWords += multiplesOfTen[Integer.parseInt(strYear.substring(2, 3)) - 1] + " "
							+ numbersLessThanTen[Integer.parseInt(strYear.substring(3, 4)) - 1];
				}
			} else
				return dateInWords += numbersLessThanTen[1] + " " + yearWords[1] + " " + numbersLessThanTen[0] + " "
						+ yearWords[0];// This covers 2100

		} else if (!strYear.contains("0")) { // If year doesn't contain 0
			dateInWords += numbersLessThanTen[0] + " " + yearWords[1] + " " + numbersLessThanTen[8] + " " + yearWords[0]
					+ " "; // One thousand nine hundred
			if (strYear.charAt(2) == '1') {
				dateInWords += numbersBetweenTenAndTwenty[Integer.parseInt(strYear.substring(3)) - 1];
			} else {
				dateInWords += multiplesOfTen[Integer.parseInt(strYear.substring(2, 3)) - 1] + " "
						+ numbersLessThanTen[Integer.parseInt(strYear.substring(3, 4)) - 1];
			}
		} else if (strYear.charAt(3) == '0') {
			dateInWords += numbersLessThanTen[0] + " " + yearWords[1] + " " + numbersLessThanTen[8] + " " + yearWords[0]
					+ " " + multiplesOfTen[Integer.parseInt(strYear.substring(2, 3)) - 1];
		} else
			dateInWords += numbersLessThanTen[0] + " " + yearWords[1] + " " + numbersLessThanTen[8] + " " + yearWords[0]
					+ " " + numbersLessThanTen[Integer.parseInt(strYear.substring(3, 4)) - 1];

		return dateInWords;
	}

	

	public int age() {
		Calendar cal = Calendar.getInstance();
		int d = cal.get(Calendar.DAY_OF_MONTH);
		int m = cal.get(Calendar.MONTH); // starts from 0 to 11
		int y = cal.get(Calendar.YEAR);

		int age = 0;
		// TO DO

		int n = y - this.getYear();
		age = n;

		return age;
	}

}
