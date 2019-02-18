package cse360assign2;

import java.util.ArrayList;

/**
 * Author: Brittany Epstein (371) Date: 2/18/2019 Description: Goal is to make
 * calculator. This assignment gives practice with a version control system.
 * Class: CSE360
 */

public class Calculator {
	private int total;

	private static ArrayList<String> NumList = new ArrayList<String>();

	/**
	 * Constructor for the calculator.
	 */
	public Calculator() {
		total = 0; // not needed - included for clarity
	}

	/**
	 * Gets the totals from the functions below.
	 * 
	 */
	public int getTotal() {
		return total;

	}

	/**
	 * Adds integers to get the total value.
	 * 
	 * @param value holds the integer to be given be returned from the calculator.
	 */
	public void add(int value) {
		total = total + value;
		NumList.add("plus");
		NumList.add(value);

	}

	/**
	 * Subtracts integers to get the total value.
	 * 
	 * @param value holds the integer to be given to the calculator
	 */
	public void subtract(int value) {
		total = total - value;
		NumList.add("subtract");
		NumList.add(value);

	}

	/**
	 * Multiplies integers together to get the total value.
	 * 
	 * @param value holds the integer to be given to the calculator.
	 */
	public void multiply(int value) {
		total = total * value;
		NumList.add("multiply");
		NumList.add(value);

	}

	/**
	 * Divides integers together to get the total value.
	 * @param value holds the integer to be given to the calculator
	 */
	public void divide (int value) {
		if (value == 0) {
			total == 0;
		}	
		else {
		total = total / value;
		}
		NumList.add("divide");
		NumList.add(value);
	}

	/**
	 * This method will return a history of all actions of the functions. 
	 * Gets all the values that were returned from the functions above. 
	 * 
	 */
	public String getHistory () {
		string history = "";
		for (int index = 0; index < NumList.size(); index++) {
			history = NumList.get(index);
			if (NumList.get(index) = " plus ") {
				history = history + " + ";
			}
			else if {
				NumList.get(index) = " subtract ";
					history = history + " - ";
				}
				else if {
					NumList.get(index) = " multiply ";
						history = history + " * ";
				}
					else {
						NumList.get(index) = " divide ";
						history = history + " / ";
					}
		}
	}
	return"";
}
}
