package chapter2;

import java.util.Scanner;
import java.text.DecimalFormat;
import java.math.RoundingMode;

/*
 * This class contains the main method of a 
 * program that calculates the account value that
 * begins saving a fixed amount of money per month and
 * is compounded with a fixed monthly interest rate of 0.00417.
 * @author Joe sparks
 */
public class Exercise2_13 
{
	/*
	 * This method prompts the user for a monthly
	 * savings amount. Then it calculates what the total
	 * savings would be after 6 months if the savings are 
	 * compounded at 0.00417 per month.
	 * 
	 * precondition: the user must enter a numeric value
	 * 
	 * postcondition: the final account value is displayed
	 */
	public static void main(String[] args)
	{
		//monthly savings 100
		//annual interest rate: 5%
		//monthly interest rate = 0.05/12 = 0.00417
		
		//declare fixed interest rate
		final double RATE = 0.05 / 12;
		
		//declare and initialize variables
		double accountValue = 0;
		double monthlySavings = 0;
		
		//prompt user to enter monthly savings
		System.out.println("Enter the ammount you save each month: ");
		Scanner input = new Scanner(System.in);
		monthlySavings = input.nextDouble();
		
		//test line
		System.out.println(monthlySavings);
		
		//compute account Value after 6th month
		accountValue = (monthlySavings * ((Math.pow((1 + RATE), 6)) - 1)) / RATE;
		
		//format
		DecimalFormat df = new DecimalFormat(".##");
		df.setRoundingMode(RoundingMode.DOWN);
		
		//display account value after 6th month
		System.out.println(df.format(accountValue));
	}
}
