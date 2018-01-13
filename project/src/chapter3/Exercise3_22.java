package chapter3;

import java.util.Scanner;

/*
 *This program determines if a user supplied point
 *is within a circle of radius 10
 *@authorJoe 
 */
public class Exercise3_22
{	
	/*
	 * This method prompts the user for the input of a point, and displays
	 * whether or not the point is located within a circle of radius 10.
	 * Precondition: the user must supply two coordinates separated by a space
	 * postcondition: The relative location of the point to the circle is displayed
	 */
	public static void main(String[] args)
	{
		//prompt user for two coordinates of a point
		Scanner input = new Scanner(System.in);
		System.out.println("Enter two coordinates of one point: ");
		double x = input.nextDouble();
		double y = input.nextDouble();
		input.close();
		
		//compute distance
		double distance = Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2));
		
		//display output
		if(distance <= 10)
		{//in circle
			System.out.println("The point is in the circle");
		}
		else
		{
			System.out.println("the point is not in the circle");
		}		
	}
}
