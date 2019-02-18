package cse360assign2;

/**
 * Author: Brittany Epstein (371)
 * Date: 2/18/2019
 * Description: Goal is to make a calculator. This assignment gives practice
 * with a version control system. 
 * Class: CSE360
*/

public class Calculator {

	private int total;
	 /**
	  * Constructor for the calculator.
	  */
	public Calculator () {
		total = 0;  // not needed - included for clarity
	}
	/**
	 * Gets the totals from the functions below.
	 * 
	 */
	public int getTotal () {
		return total;

	}
	
	/**
	 * Adds integers to get the total value.
	 * @param value holds the integer to be given be returned from the calculator.
	 */
	public void add (int value) {
		int sum = total + value;
	}
	/**
	 * Subtracts integers to get the total value.
	 * @param value holds the integer to be given to the calculator
	 */
	public void subtract (int value) {
		int minus = total - value;
	}
	
	/**
	 * Multiplies integers together to get the total value.
	 * @param value holds the integer to be given to the calculator.
	 */
	public void multiply (int value) {
		int mult = total * value;
		
		
	}
	
	/**
	 * Divides integers together to get the total value.
	 * @param value holds the integer to be given to the calculator
	 */
	public void divide (int value) {
		int divide2 = total / value;
		if (value == 0) {
			total == 0;
		}
		
	}
	
	/**
	 * This method will return a history of all actions of the functions. 
	 * Gets all the values that were returned from the functions above. 
	 * 
	 */
	public String getHistory () {
		return "";
	}
}