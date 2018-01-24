package chapter8;

import java.util.Scanner;
/*
 * This class contains the main method for a program that compares two matrices
 * @author: joe sparks
 */
public class Exercise8_29
{
	/*
	 * This method is a test method for the class to call the equals method
	 * 
	 */
	public static void main(String[] args)
	{
		//declare and initialize matrices
		int[][] m1 = new int[3][3];
		int[][] m2 = new int[3][3]; 
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter List 1: ");
		for(int r = 0; r < m1.length; r ++)
		{
			for(int c = 0; c < m1[r].length; c++)
			{
				m1[r][c] = input.nextInt();
			}
		}
		
		System.out.println("Enter List 2: ");
		for(int r = 0; r < m2.length; r ++)
		{
			for(int c = 0; c < m2[r].length; c++)
			{
				m2[r][c] = input.nextInt();
			}
		}
		
		System.out.println(equals(m1, m2));
		
		input.close();
	}
	
	/*
	 * This program compares two matrices and turns false if they are 
	 * not equal
	 * precondition: two matrices must be passed as arguments
	 * postcondition: a boolean value is returned.
	 */
	public static boolean equals(int[][] m1, int[][] m2)
	{
		boolean equals = true;
		
		//compare 1 row at a time, if different, break and change to false
		//i will be the column number
		//j will be row number
		//outer loop looks at one row per iteration
		//inner loop looks at one index per iteration
		for(int j = 0; j < m1.length; j++)
		{
			for(int i = 0; i < m1[j].length; i++)
			{
				if(m1[j][i] != m2[j][i])
				{
					equals = false;
					break;
				}
			}
		}
		
		return equals;
	}
}