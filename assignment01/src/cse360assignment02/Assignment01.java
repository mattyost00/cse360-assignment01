// Assignment #1
// Name: Matthew Yost
// Lecture: CSE 360 Th 9:00 A.M
// Description: This is the main method that is used to 
// test the AddingMachine class and to show that the all of the methods
// are working properly. The toString() method performs the correct operation

package cse360assignment02;

public class Assignment01 {
	
	public static void main(String[] args) {
		AddingMachine myCalculator = new AddingMachine();
		myCalculator.add(4);
		myCalculator.subtract(2);
		myCalculator.add(5);
		System.out.println(myCalculator.toString());
	}

}
