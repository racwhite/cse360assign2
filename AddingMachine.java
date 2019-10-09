/**
 * Rachel White
 * CSE360 85141 
 * Assignment #2
 * 
 * This class adds and subtracts integers from a private int total.
 * 
 * package cse360assign2;
 * @author Rachel White
 *
 */
package cse360assign2;
public class AddingMachine {

	private int total;
	private String history = "0";
	
	/**
	 * Constructs an AddingMachine
	 */
	public AddingMachine () {
		total = 0;  // not needed - included for clarity
	}
	
	/**
	 * Returns the current total.
	 * @return total
	 */
	public int getTotal () {
		return total;
	}
	
	/**
	 * Adds the parameter value to the total.
	 * @param value
	 */
	public void add (int value) {
		total += value;
		history = history + " + " + value;
	}
	
	/**
	 * Subtracts the parameter value from the total.
	 * @param value
	 */
	public void subtract (int value) {
		total -= value;
		history = history + " - " + value;
	}
	
	/**
	 * Returns the history of calulations done in the form of a string.
	 * @return
	 */
	public String toString () {
		return history;
	}
	
	/**
	 * Clears total and resets the history string.
	 */
	public void clear() {
		total = 0;
		history = "0";
	}
}
