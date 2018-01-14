package chapter7;

import java.util.Scanner;

/*
 * this class contains represents a program
 * that counts the occurrence of numbers
 * @author Joe
 */
public class Exercise7_3
{
	public static void main(String[] args)
	{
		//declare and initialize variables
		int inputCount = 0;
		int nextInt = 0;
		int[] hundred = new int[101];
		int[] tally = new int[101];
		
		//populate hunred array
		for(int i = 0; i < 101; i++)
		{
			hundred[i] = i;
		}
		
		
		//prompt user for input, end with 0
		Scanner input = new Scanner(System.in);
		System.out.println("enter numbers from 1 to 100, input ends with 0");
		
		do
		{
			nextInt = input.nextInt();
			if(nextInt > 0 && nextInt <= 100)
			{
				for(int i = 0; i < hundred.length; i++)
				{
					if(nextInt == hundred[i])
					{
						tally[i]++;
					}
				}
				inputCount++;
			}
			else if(nextInt < 0 || nextInt > 100)
			{
				System.out.println("invalid input, goodbye");
				System.exit(1);
			}
			else if(inputCount == 0 && nextInt == 0)
			{
				System.out.println("you've only entered zero, goodbye");
				System.exit(1);
			}
		}
		while(nextInt != 0);
		
		//print report
		for(int i = 0; i < tally.length; i++)
		{
			if(tally[i] > 1)
			{
				System.out.println(i + " occurs " + tally[i] + " times");
			}
			else if(tally[i] == 1)
			{
				System.out.println(i + " occurs " + tally[i] + " time");
			}
		}
		
	}
}