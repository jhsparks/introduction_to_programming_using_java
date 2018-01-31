package chapter7;

import java.util.Random;

public class Exercise7_7
{
	public static void main(String[] args)
	{
		//generate 100 random numbers between 0 and 9
		
		//display the count for each number
		
		//declare and initialize variables
		int[] counts = new int[10]; //holds the counts
		
		for(int i = 1; i <= 100; i++)
		{
			int randomNum = getRandom(0, 9);
			counts[randomNum] = counts[randomNum] + 1;
		}
		
		//display count for each number
		for(int i = 0; i < counts.length; i++)
		{
			System.out.println(counts[i] + " " + i + "'s");
		}
	}
	
	public static int getRandom(int min, int max)
	{
		int randomNum;
		
		if(min == 0)
		{
			randomNum = (int)(Math.random() * (max + 1));
		}
		else
		{
			randomNum = (int)(min + Math.random() * max);
		}
		
		return randomNum;
	}
}