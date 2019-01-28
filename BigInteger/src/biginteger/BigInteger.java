/**
 * Java's primitive data types int and long can represent the numbers 
 * in the following range. 
 * 
 * 			Integer: (-2147483648, 2147483647)
 * 			Long Integer: (-9223372036854775808, 9223372036854775807)
 *
 * We want to represent numbers that larger than 9223372036854775807. 
 * One idea is to use an array to store each digit of the big number. 
 * For example: 9223372036854775807 is stored in an array as 
 * [9,2,2,3,3,7,2,0,3,6,8,5,4,7,7,5,8,0,7]. 
 * 
 * 
 * In this project, you will implement the BigInteger class, which can 
 * store any size integer and perform basic arithmetic operations on the 
 * number. 
 */
package biginteger;

import java.util.Arrays;
import java.util.Collections;

public class BigInteger {

	private static final boolean POSITIVE = true;
	private static final boolean NEGATIVE = false;

	/**
	 * // this array stores the number. Each digit of the number is an element of
	 * the array
	 */
	private final int[] number;
	/**
	 * sign of this BigInteger. POSITIVE or NEGATIVE
	 */
	private final boolean sign;

	/**
	 * Default constructor, creates a BigInteger object whose value is 0. and whose
	 * sign is positive
	 * 
	 * This constructor will assign sign of the BigInteger and will assign
	 * BigInteger array called number to 0
	 */
	public BigInteger() {
		// TODO
		// replace assignments for number and sign with accordance to constructor
		// description
		number = new int[1];
		number[0] = 0;
		this.sign = POSITIVE;
	}

	/**
	 * Constructor, creates a BigInteger object with given sign and given array of
	 * numbers
	 * 
	 * @param sign  of a number
	 * @param array of integers This constructor will assign sign of the BigInteger
	 *              and will copy all elements of the given array into BigInteger
	 *              array called number
	 */
	public BigInteger(boolean sign, int[] val) {
		// TODO
		// replace assignments for number and sign with accordance to constructor
		// description
		number = new int[val.length];
		for (int i = 0; i < val.length; i++) {
			number[i] = val[i];
		}

		this.sign = sign;
	}

	/**
	 * Create a BigInteger object using the number given as string. If the string
	 * starts with "-", it indicates, the number is negative. in this case assign
	 * sign to negative and store all numbers from a String in number array If the
	 * string starts with "+", or a digit, the number is positive. in this case
	 * assign sign to positive and store all numbers from a String in number array
	 * If the string is null or empty, the number is zero. zero is a positive
	 * number. in this case assign sign to positive and store 0 in number array If
	 * string contains non-digit characters, throw IllegalArgumentException in this
	 * case use the following syntax to throw an exception: throw new
	 * IllegalArgumentException();
	 * 
	 * 
	 * 
	 * @param n: the number in string format. For example: BigInteger b1 = new
	 *        BigInteger("1234567890"); b1 is a BigInteger with value of 1234567890
	 *        stored in number array BigInteger b2 = new BigInteger("-1234567"); b1
	 *        is a BigInteger with value of -1234567 stored in number array
	 *        BigInteger b3 = new BigInteger("+123"); b3 is a BigInteger with value
	 *        of +123 stored in number array BigInteger b3 = new
	 *        BigInteger("+123xyz"); throw IllegalArgumentException
	 */
	public BigInteger(String strNumber) {
		// this(); //use to call the default constructor

		// TODO
		// replace assignments for number and sign with accordance to constructor
		// description

		if (strNumber.isEmpty() || strNumber.equals(null)) {
			number = new int[] { 0 };
			this.sign = POSITIVE;
		} else {
			if (strNumber.startsWith("-")) {
				strNumber = strNumber.substring(1);
				this.sign = NEGATIVE;
			} else if (strNumber.startsWith("+")) {
				strNumber = strNumber.substring(1);
				this.sign = POSITIVE;
			} else {
				this.sign = POSITIVE;
			}
			String[] arr = strNumber.split("");
			number = new int[arr.length];

			for (int i = 0; i < arr.length; i++) {
				if (!Character.isDigit(strNumber.charAt(i))) {
					throw new IllegalArgumentException();
				}
				number[i] = Integer.parseInt(arr[i]);
			}
		}

	}

	/**
	 * Create a BigInteger object using another another BigInteger. This constructor
	 * will take another BigInteger as a parameter and will copy all the values into
	 * this BigInteger and assign the sign
	 * 
	 * @param another: BigInteger object BigInteger b = new BigInteger("1234567890")
	 * 
	 *        Create a new BigInteger object using b BigInteger b2 = new
	 *        BigInteger(b)
	 */
	public BigInteger(BigInteger another) {
		// TODO
		// replace assignments for number and sign with accordance to constructor
		// description
		number = new int[another.number.length];
		this.sign = another.sign;

		for (int i = 0; i < another.length(); i++) {
			number[i] = another.number[i];
		}
	}

	/**
	 * Adds two BigIntegers, and creates a new BigInteger with the result of the
	 * addition
	 * 
	 * IMPORTANT: Pay attention to the integer sign and length When two positive
	 * values are added, the result is positive (2+2=4) When one positive and one
	 * negative numbers are added, the result can be negative (-4 + 2 = -2) or
	 * positive (-2 + 3 = 1) When two negative values are added, the result is
	 * negative (-2 + -2 = -4) When both numbers are zeroes, the result is zero as
	 * well
	 * 
	 * Two add two big integers, we cad add each digit at the same index from the
	 * two arrays. For example: a:[1,2,3,4] b:[5,6,7,8] a+b is [6,9,1,2]
	 * 
	 * @param b: BigInteger to be added to this BigInteger Object
	 * @return: a new BigInteger object, whose value is the sum of this and b, two
	 *          BigInteger objects
	 */
	public BigInteger add(BigInteger b) {

		// TO DO
		boolean retSign;
		int[] retArr;

		// ======compare two arrays to see which one is bigger
		// ignore the sign at this time, but store it
		boolean thisSign = sign;
		boolean bSign = b.sign;

		int checkForBigger = new BigInteger(true, number).compareTo(new BigInteger(true, b.number));

		// check if the arrays are the same and signs are opposite
		// which means, check if the arrays are going to sum up to 0
		// and return a positive array with one element of 0 without going any further
		if (checkForBigger == 0 && thisSign != bSign) {
			return new BigInteger(POSITIVE, new int[] { 0 });
		}

		// verifying what my return sign is going to be
		// within this code, I am looking at the result of the comparison above
		// whichever array is bigger, I am automatically assigning its sign to my return
		// sign
		// also, if one or the other array is NEGATIVE,
		// I am making the smallest array's sign NEGATIVE
		// (because, if there is a negative sign involved, we will technically handle
		// subtraction)
		if (checkForBigger == -1) {
			if ((thisSign != bSign)) {
				for (int i = 0; i < number.length; i++)
					number[i] *= -1;
			}
			retSign = bSign;
		} else {
			retSign = thisSign;
			if ((thisSign != bSign)) {
				for (int i = 0; i < b.number.length; i++)
					b.number[i] *= -1;
			}
		}

		// creating an array that I will do my calculations on
		// since I am going to implement removal of 0 (zeros) before the end,
		// at this point I just assign this array's length 1 more than the biggest
		// array's
		int[] basicAdd = new int[Math.max(number.length, b.number.length) + 1];

		// looping in reverse order through all 3 arrays
		// this.number[] and b.number[] and basicAdd[]
		for (int i = basicAdd.length - 1, nIndex = number.length - 1, bIndex = b.number.length
				- 1; i >= 0; i--, nIndex--, bIndex--) {
			int thisNumEl = 0;
			int bNumEl = 0;

			if (nIndex >= 0)
				thisNumEl = number[nIndex];

			if (bIndex >= 0)
				bNumEl = b.number[bIndex];

			basicAdd[i] += thisNumEl + bNumEl;

			if (basicAdd[i] >= 10) {
				basicAdd[i] -= 10;
				basicAdd[i - 1]++;
			}

			if (basicAdd[i] < 0) {
				basicAdd[i] += 10;
				basicAdd[i - 1]--;
			}
		}

		// initiating elimination of zeros from the beginning of basicAdd
		// and assigning the basicAdd[] to the retArr[]
		if (basicAdd[0] == 0) {
			int zeroCounter = 0;
			for (int i = 0; i < basicAdd.length; i++) {
				if (basicAdd[i] == 0)
					zeroCounter++;
				else
					break;
			}

			retArr = new int[basicAdd.length - zeroCounter];

			for (int i = zeroCounter, index = 0; i < basicAdd.length; i++, index++)
				retArr[index] = basicAdd[i];

		} else {
			retArr = basicAdd;
		}

		return new BigInteger(retSign, retArr);
	}

	/**
	 * Subtracts BigInteger b from this BigInteger, and creates a new BigInteger
	 * with the result of the subtraction.
	 * 
	 * @param b: BigInteger to be subtracted from this BigInteger Object
	 * @return: a new BigInteger object
	 */
	public BigInteger sub(BigInteger b) {
		// TODO
		
		if ( sign && !b.sign )
			return new BigInteger(POSITIVE, this.number).add(new BigInteger(POSITIVE, b.number));
		else if ( sign && b.sign )
			return new BigInteger(POSITIVE, this.number).add(new BigInteger(NEGATIVE, b.number));
		else if ( !sign && b.sign )
			return new BigInteger(NEGATIVE, this.number).add(new BigInteger(NEGATIVE, b.number));
		else
			return new BigInteger(NEGATIVE, this.number).add(new BigInteger(POSITIVE, b.number));
		
		
	}
	
	public boolean equals(BigInteger b) {
		if ( (new BigInteger(sign, number).compareTo(b)) == 0 )
			return true;
		
		return false;
	}

	/**
	 * Compares this BigInteger with the specified BigInteger.
	 * 
	 * @param b: BigInteger to which this BigInteger is to be compared.
	 * @return: -1, 0 or 1 as this BigInteger is numerically less than, equal to, or
	 *          greater than b
	 * 
	 */
	public int compareTo(BigInteger b) {
		// TODO

//		if(this.sign == NEGATIVE && b.sign == POSITIVE ) {
//			return -1;
//		}
//		
//		if(this.sign == POSITIVE && b.sign == NEGATIVE) {
//			return 1;
//		}
//		
//		if(this.number.length > b.number.length) {
//			if(this.sign == POSITIVE) {
//				return 1;
//			} else {
//				return -1;
//			}
//		}
//		
//		return 0;

		if (this.sign == NEGATIVE && b.sign == POSITIVE) {
			return -1;
		}
		if (this.sign == POSITIVE && b.sign == NEGATIVE) {
			return 1;
		}

		if (this.number.length > b.number.length) {
			if (this.sign == POSITIVE) {
				return 1;
			} else {
				return -1;
			}
		}

		if (this.number.length < b.number.length) {
			if (this.sign == POSITIVE && b.sign == POSITIVE) {
				return -1;
			} else if (this.sign == POSITIVE && b.sign == NEGATIVE) {
				return 1;
			} else if (this.sign == NEGATIVE && b.sign == POSITIVE) {
				return -1;
			} else {
				return 1;
			}
		}

		for (int i = 0; i < this.number.length; i++) {
			if (this.sign == POSITIVE) {
				if (this.number[i] > b.number[i]) {
					return 1;
				} else if (this.number[i] < b.number[i]) {
					return -1;
				} else {
					continue;
				}
			}

			if (this.sign == NEGATIVE) {
				if (this.number[i] > b.number[i]) {
					return -1;
				} else if (this.number[i] < b.number[i]) {
					return 1;
				} else {
					continue;
				}
			}
		}

		return 0;

	}

	/**
	 * Returns an int array containing this BigInteger. The array will contain each
	 * digit of this BigInteger as an element
	 * 
	 * @return: an int array containing this BigInteger, ignore the sign
	 */
	public int[] toArray() {
		// TODO
//		
//		int[] arr = new int[number.length];
//		arr = Arrays.copyOf(number, number.length);
//		
//		return arr;

		return this.number;
	}

	/**
	 * Check if the BigInteger is zero
	 * 
	 * @return true if BigInteger value is zero. False otherwise
	 */
	public boolean isZero() {
		// TODO

//		for (int i = 0; i < number.length; i++) {
//			if(number[i] == 0) {
//			return true;
//			}
		// }

		return this.number.length == 0 || this.number[0] == 0;
	}

	/**
	 * Returns the length of this BigInteger. length is the number of digits in a
	 * BigInteger
	 * 
	 * @return: length of this integer
	 */
	public int length() {
		// TODO
		return this.number.length;
	}

	/**
	 * Returns the sign of this BigInteger.
	 * 
	 * @return: sign of this integer
	 */
	public boolean sign() {
		return sign;
	}

	/**
	 * returns the the BigInteger in string format. If the number is negative,
	 * return string must start with a "-"
	 * 
	 * @return BigInteger in a String format
	 */
	public String toString() {
		// TODO

		String str = "";

		if (!this.sign)
			str += "-";

		for (int i = 0; i < number.length; i++) {
			str += number[i];
		}

//		StringBuilder sb = new StringBuilder();
//		
//		if(!this.sign) 
//			sb.append("-");
//		
//		for(int i = 0; i < number.length; i++) {
//			sb.append(number[i]);
//		}

		return str;
	}

}
