package chapter2;

import java.util.Scanner;

/*
 * This class contains the main method for an application
 * that computes the gratuity for a transcation.
 * @author Joe Sparks
 */
public class Exercise2_5 
{
	/*
	 * This method prints the gratuity and total cost after 
	 * a user inputs the subtotal and gratuity rate.
	 * precondition: the subtotal must be enter first and the 
	 * gratuity rate must be entered second in the form of a percentage
	 * 
	 * postcondition: the gratuity and total is displayed
	 */
	public static void main(String[] args)
	{
		//declare variables
		double subtotal = 0;		//the subtotal in dollars
		double gratuityRate = 0;	//the gratuity rate as a percent
		double gratuity = 0;		//The gratuity in dollars
		double total = 0; 			//the total cost including gratuity
		
		//prompt user to enter the subtotal and gratuity rate
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the subtotal followed by the gratuity rate: ");
		
		//read subtotal
		subtotal = input.nextDouble();
		
		//read gratuity rate
		gratuityRate = input.nextDouble();
		
		//compute gratuity
		gratuity = subtotal * (gratuityRate / 100.0);
		
		//compute total cost
		total = gratuity + subtotal;
		
		//display gratuity and total
		System.out.println("The gratuity is $" + gratuity + " and the total is $" + total);
	}
}
