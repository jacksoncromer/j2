package cse360assign2;
/**
 * @author Jackson Cromer
 * Class ID:85141
 * Assignment 2
 * https://github.com/jacksoncromer/j2
 * AddingMachine.java
 * Adding machine will be used to learn version control.
 *
 */

public class AddingMachine {
/**
 * String his will add the operators and the numbers onto the string keeping a history 
 * of operations used.
 */
	
	private int total;
	private String his;
	//history string.
	
	/**
	 * total is a variable representing the total
	 */
	public AddingMachine () {
		//total;  // not needed - included for clarity
		his = "0"; //constructors 
		
	}
	/**
	 * 
	 * @return total is updated
	 */
	public int getTotal () {
		return total;
	}
	/**
	 * Updates the String his with the + operator and then the value parameter
	 * @param value is the number being added to the total and put onto the string
	 */
	public void add (int value) {
		total = total + value;
		String val = Integer.toString(value);
		his = his + " + "+val;
		
	} 
	/**
	 * Updates the String his with the - operator and then the value parameter
	 * @param value is the number being subtracted from the total and put onto the string
	 */
	public void subtract (int value) {
		total = total - value;
		String val = Integer.toString(value);
		his = his + " - "+val; 
		
	}
	
	/**
	 * returns the history string, operators with added and subtracted integers 
	 * put onto the string
	 */
	public String toString () {
		
		return his;
		
	}
	/**
	 * clear will reset total to 0;
	 */
	public void clear() {
		total = 0;
	}
}
