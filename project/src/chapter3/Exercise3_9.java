package chapter3;

import java.util.Scanner;

/*
 * This class contains the main method of a program
 * that calculates the 10th digit if an ISBN 10 code
 * given the first 9
 * @author: joe Sparks
 */
public class Exercise3_9 
{	
	/*
	 * 
	 */
	public static void main(String[] args)
	{
		//declare variables
		Scanner input = new Scanner(System.in);
		int[] firstNineArray = new int[9];
		int tenth = 0;
		
		//prompt user for input of first 9 digits
		System.out.println("Enter the first 9 digits of an ISBN");
		
		//place each digit from user input into an array and print them
		input.useDelimiter("");
		for(int i = 0 ; i <= 8 ; i++)
		{
			firstNineArray[i] = Integer.parseInt((input.next()));
			
			//print first 9
			System.out.print(firstNineArray[i]);
		}
		
		//close input
		input.close();
		
		//compute 10th digit using formula
		//(d1 * 1 + d2 * 2 + d3 * 3 + d4 * 4 + d5 * 5 + d6 * 6 + d7 * 7 + d8 * 8 + d9 * 9) % 11
		tenth = (firstNineArray[0] * 1 + firstNineArray[1] * 2 + firstNineArray[2] * 
				3 + firstNineArray[3] * 4 + firstNineArray[4] * 5 + firstNineArray[5] * 
				6 + firstNineArray[6] * 7 + firstNineArray[7] * 8 + firstNineArray[8] * 9) % 11;
		
		//display the 10th digit ISBN
		if(tenth == 10)
		{
			System.out.print("X");
		}
		else
		{
			System.out.print(tenth);
		}
	}
}