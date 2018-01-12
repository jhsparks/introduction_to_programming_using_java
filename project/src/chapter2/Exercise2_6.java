package chapter2;

import java.util.Scanner;

/*
 * This class contains the main method of a program
 * that add together digits of an integer between 0 and 1000
 * @Joe Sparks
 */
public class Exercise2_6 
{
	/*
	 * This method prompts the user to input an number
	 * from 0 to 1000. Then it adds the digits together
	 * and displays the sum.
	 * Precondition; the input must be a whole number between
	 * 0 and 1000
	 * postcondition; the sum of the digits is displayed
	 */
	public static void main(String[] args)
	{
		//declare variable
		int digit = 0;
		
		//prompt user
		System.out.println("Enter a whole number between 0 and 1000");
		
		//store user input as variable
		Scanner input = new Scanner(System.in);
		if(input.hasNextInt() == false)
		{
			System.out.println("This is not a whole number");
			System.exit(1);
		}
		
		int operand = input.nextInt();
		
		//validate input
		if(operand > 1000)
		{
			System.out.println("You entered a value greater than 1000");
			System.exit(1);
		}
		else if(operand < 0)
		{
			System.out.println("You entered a value less than 0");
			System.exit(1);
		}
		
		//extract and remove digits
		for(int i = 0 ; operand != 0; i++)
		{
			//extract digit and add to digit variable
			digit = operand % 10 + digit;
			
			//remove digit
			operand /= 10;
			
		}
		
		//print sum total
		System.out.println(digit);
		
		
	}
}
