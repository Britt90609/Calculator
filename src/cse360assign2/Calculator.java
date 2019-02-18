package cse360assign2;

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
	 */
	public int getTotal () {
		return total;
	}
	/**
	 * Adds integers to get the total value 
	 * @param value holds the integer to be given be returned from the calculator.
	 */
	public void add (int value) {
		total = total + value;
	}
	/**
	 * Subtracts integers to get the total value 
	 * @param value holds the integer to be given be returned from the calculator.
	 */
	public void subtract (int value) {
		total = total - value;
	}
	/**
	 * Multiplies integers together to get the total value 
	 * @param value holds the integer to be given to the calculator.
	 */
	public void multiply (int value) {
		total = total * value;
	}
	/**
	 * Divides integers together to get the total value 
	 * @param value holds the integer to be given be returned from the calculator.
	 */
	public void divide (int value) {
		if (value == 0) {
			total = 0;
		}
		else {
			total = total / value;
		}		
	}
	
	/**
	 * This method will return a history of all actions of the functions. 
	 */
	public String getHistory () {
		return "";
	}
}