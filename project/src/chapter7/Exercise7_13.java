package chapter7;

import java.util.Scanner;
import java.util.Random;

/*
 * This program is modified from the book. I want the user to enter
 * 2 numbers and the method will print a random number between them.
 * @author joe sparks
 */
public class Exercise7_13
{
	/*
	 * This is the main method that prompts the user for min and max
	 * in the range and then calls the getRandom method
	 * 
	 */
	public static void main(String[] args)
	{
		//declare and initialize variables
		int min = 0;
		int max = 0;
		Scanner input = new Scanner(System.in);
		
		//prompt user
		System.out.println("Enter the min and max in the range you want");
		
		min = input.nextInt();
		max = input.nextInt();
		input.close();
		
		//validate input
		if(max < min)
		{
			System.out.println("the min must be entered first");
			System.exit(1);
		}
		
		
		System.out.println("your random number is " + getRandom(min, max));
	}
	
	/*
	 * This method generates a random number within a range
	 * @param min: the lowest number in the range
	 * @param max: the highest number in the range
	 * precondition: a min and max are passed
	 * precondition: the min is lower than the max
	 * post condition: a random int is returned
	 * 
	 */
	public static int getRandom(int min, int max)
	{
		double ranDouble = (min + Math.random() * max);
		int randomInt = (int)(ranDouble);
		return randomInt;
	}
}