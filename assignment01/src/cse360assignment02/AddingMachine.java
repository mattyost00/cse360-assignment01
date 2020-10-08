//Assignment #1
// Name: Matthew Yost
// Lecture CSE 360 Th 9:00
// Description: This program gives full functionality
// to the AdderMachine class
/**
 *  Full functionality to the AddingMachine class is given.
 *  Two attributes are maintained: String history and int total.
 *  total will store the result of repeatedly performing an addition or 
 *  subtractions. history will record each of the additions
 *  and subtractions and will be used to display to the user. There
 *  is a constructor that initializes the attributes to their default values
 *  and a clear method to reset the attributes to their default values.
 *  The method int getTotal() is a getter method and String toString() returns the
 *  history attribute. The methods: void add(int value), void subtract(int value)
 *  help make the attributes maintain their proper values.
 *  
 *  @author Matthew Yost
 *  @version 2.0
 *  @since 2020-10-07
 */
package cse360assignment02;

public class AddingMachine {
  private int total;
  private String history;
  
  /*
   * Constructor initializes the attribute total to 0
   * and the history attribute to "0".
   */
  public AddingMachine () {
	  total = 0;
	  history = "0";
  }
  
  /*
   * This method is a getter method
   * that just returns the attribute total
   * @return int
   */
  public int getTotal () {
    return total;
  }
  
  /*
   * This method takes a single parameter
   * and sets the history attribute with history + " + " + value
   * It also updates the total by adding value to total
   * @param value
   */ 
  public void add (int value) {
	  
	  total = value + total;
	  String newHistory = history + " + " + value;
	  history = newHistory;
  }
 
  /*
   * This method takes an integer value
   * and sets the history attribute with
   * history + " - " + value
   * It also updates the total by setting total to be 
   * total - value
   * @param value
   */
  public void subtract (int value) {
	  total = total - value;
	  String newHistory = history + " - " + value;
	  history = newHistory;
  }
  
  /*
   * This method will be used to display output to the user
   * Hence, it returns the history string value that keeps
   * tracking of all additions/subtractions.
   * @return string
   */
  public String toString () {
    return history;
  }
  
  /*
   * This method clears the attributes:
   * history and value to be set to their
   * default values. That is, history = ""
   * and total = 0.
   */
  public void clear() {
	  history = "";
	  total = 0;
  }
}