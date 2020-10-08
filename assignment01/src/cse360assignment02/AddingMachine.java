//Assignment #1
// Name: Matthew Yost
// Lecture Th 9:00
// Description: This program has the declarations of methods
// that have yet to be defined for an adding machine. The methods
// will be modified in a later date
/**
 *  This program contains methods for the
 *  class AddingMachine in which most of them
 *  don't return anything. Specifically,the methods 
 *  int getTotal() returns 0 and String toString() returns an
 *  empty string. The methods add(int value) subtract(int value)
 *  and clear() do not return anything. The class has one
 *  attribute named private int total. In a future version, all of the
 *  above methods will be updated to give AddingMachine correct functionality.
 *  
 *  @author Matthew Yost
 *  @version 1.0
 *  @since 2020-10-07
 */
package cse360assignment02;

public class AddingMachine {
  private int total;
  
  /*
   * Constructor initializes the attribute total to 0.
   */
  public AddingMachine () {
    total = 0;  // not needed - included for clarity
  }
  
  /*
   * This method takes no parameters;
   * will be given correct functionality in later version
   * @return int
   */
  public int getTotal () {
    return 0;
  }
  
  /*
   * This method just takes a single parameter
   * and currently has no functionality implemented
   * @param value
   * 
   */ 
  public void add (int value) {
  }
 
  /*
   * This method just takes a single parameter
   * and currently has no functionality implemented
   * @param value
   * 
   */ 
  public void subtract (int value) {
  }
  
  /*
   * This method does not take any parameter
   * and returns an empty string; it will
   * be given more functionality given in later version
   * @return string
   */
  public String toString () {
    return "";
  }
  
  /*
   * This method takes no parameters and currently
   * does not do any functionality; in a later version
   * this method will be given functionality.
   * @param unused
   * @return nothing
   */
  public void clear() {
  }
}