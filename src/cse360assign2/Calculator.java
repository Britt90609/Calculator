package cse360assign2;

import java.util.ArrayList;

/**
 * Author: Brittany Epstein (371) 
 * Date: 2/18/2019 
 * Description: Goal is to make calculator. This assignment gives practice with
 * a version control system.
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
		NumList.add("0");
	}

	/**
	 * Gets the totals from the functions below.
	 */
	public int getTotal() {
		return total;
	}

	/**
	 * Adds integers to get the total value and adds the value being added to 
	 * the array list
	 * @param value holds the integer to be given be returned from the 
	 * calculator.
	 */

	public void add(int value) {
		total = total + value;
		NumList.add(" plus ");
		NumList.add(value + "");

	}

	/**
	 * Subtracts integers to get the total value and adds the value 
	 * being subtracted to the array list.
	 * 
	 * @param value holds the integer to be given be returned from the
	 *  calculator.
	 */
	public void subtract(int value) {
		total = total - value;
		NumList.add(" subtract ");
		NumList.add(value + "");
	}

	/**
	 * Multiplies integers together to get the total value and adds the value 
	 * being multiplied to the array list.
	 * 
	 * @param value holds the integer to be given to the calculator.
	 */
	public void multiply(int value) {
		total = total * value;
		NumList.add(" multiply ");
		NumList.add(value + "");
	}

	/**
	 * Divides integers together to get the total value and adds the value 
	 * being divided to the array list
	 * 
	 * @param value holds the integer to be given be returned from the
	 * calculator.
	 */
	public void divide(int value) {
		if (value == 0) {
			total = 0;
		} else {
			total = total / value;
		}
		NumList.add(" divide ");
		NumList.add(value + "");
	}

	/**
	 * /** This method will return a history of all actions of the functions.
	 *  ex. 2 + 3 - 5 * 9 / 2
	 *  By iterating through the list and where ever it sees the word
	 *  for the operator it will replace it with the symbol.
	 */
	public String getHistory() {
		String history = "";
		for (int index = 0; index < NumList.size(); index++) {
			if (NumList.get(index) == " plus ") {
				history = history + " + ";
			} else if (NumList.get(index) == " subtract ") {
				history = history + " - ";
			} else if (NumList.get(index) == " multiply ") {
				history = history + " * ";
			} else if (NumList.get(index) == " divide ") {
				history = history + " / ";
			} else {
				history = history + NumList.get(index);
			}
		}
		return history;
	}
}