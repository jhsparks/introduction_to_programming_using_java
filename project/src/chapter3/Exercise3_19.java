package chapter3;

import java.util.Scanner;

/*
 * This class contains the main method of a program that
 * computes the parimeter of a triangle
 * @author Joe Sparks
 */
public class Exercise3_19 
{
	/*
	 * Precondition: the user must input 3 integers separated by a space
	 * post condition: the perimeter of the triangle is displayed
	 * 
	 * This method prompts the user for the length of each side of a triangle,
	 * then validates input, and displays the perimeter of the triangle
	 */
	public static void main(String[] args)
	{
		//prompt user for the length of all edges of a triangle
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the length of each edge of a triange separated by a space");
		int edge1 = input.nextInt();
		int edge2 = input.nextInt();
		int edge3 = input.nextInt();
		input.close();
		
		//validate input: the sum of every pair of edges must be greater than the remaining edge
		if(edge1 + edge2 >= 3 && edge1 + edge3 >= edge2 && edge2 + edge3 >= edge1)
		{
			System.out.println("perimeter: " + (edge1 + edge2 + edge3));
		}
		else
		{
			System.out.println("invalid input");
			System.exit(1);
		}
		
	}
}
