package chapter5;

import java.util.Scanner;

public class Exercise5_1
{
	public static void main(String[] args)
	{
		//read an unspecified number of integers
		Scanner input = new Scanner(System.in);
		System.out.println("Enter integers, the input ends if the integer is 0");
		
		int nextInt = 0;
		int positiveCount = 0;
		int negativeCount = 0;
		double total = 0;
		double average = 0;
		
		do
		{
			nextInt = input.nextInt();
			//determine how many positive and negative integers have been read
			if(nextInt < 0)
			{
				negativeCount++;
			}
			else if(nextInt > 0)
			{
				positiveCount++;
			}
			//compute the sum of the input values
			total += nextInt;
		}
		//end input when 0 is read
		while(nextInt != 0);
		
		//close input
		input.close();
		
		
		
		//Display report
		if(positiveCount == 0 && negativeCount == 0)
		{
			System.out.println("zero was the only entered value");
		}
		else
		{
			//compute the average of the input values (ignoring 0) as a floating point number
			average = total/(positiveCount + negativeCount);
			
			System.out.println("the number of positive integers is " + positiveCount);
			System.out.println("the number of negative integers is " + negativeCount);
			System.out.println("The total is " + total);
			System.out.printf("the average is %.2f", average);
		}
	}
}