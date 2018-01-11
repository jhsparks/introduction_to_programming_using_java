package chapter1;

import java.util.Scanner;
import java.util.regex.*;

/*
 * this class contains methods to solve a 2x2 equation
 * for x and y using crammer's rule
 * @author Joe Sparks
 */
public class Exercise1_13 
{
	/*
	 * Main method used to find x and y given two equations 
	 * from the user. 
	 */
	public static void main(String[] args)
	{
		//initialize variables
		int a = 0;
		int b = 0;
		int c = 0;
		int d = 0;
		int e = 0;
		int f = 0;
		String equation;			//Two equations
		String pattern = "\\d+";	//the regex pattern to find digits in the equations
		
		//set up scanner for input
		Scanner input = new Scanner(System.in);
		
		//prompt the user to enter 2 equeations
		System.out.println("Enter both equations in the format ax + by = e"
				+ " separated by a space");
		equation = input.nextLine();
		
		//create pattern object using regex pattern
		Pattern r = Pattern.compile(pattern);
		
		//create matcher object from pattern object and equations
		Matcher m = r.matcher(equation);
		
		//array to hold the cofactors
		int[] intArray = new int[6];
		
		
      	for (int i = 0; m.find(); i++) 
      	{//search for digits, assign to array
         intArray[i] = Integer.parseInt(m.group(0));
      	}
      	
      	//assign the cofactors from the array to letter variables
      	a = intArray[0];
      	b = intArray[1];
      	e = intArray[2];
      	c = intArray[3];
      	d = intArray[4];
      	f = intArray[5];
      	
      	//call two method and print final answer
      	System.out.println("x = " + solveForX(a, b, c, d, e, f));
      	System.out.println("y = " + solveForY(a, b, c, d, e, f));
	}
	
	/*
	 * This method returns the value of x int form.
	 * preconditions: must have a, b, c, d, e, and f variables
	 * postcondition: int x is returned
	 */
	public static int solveForX(int a, int b, int c, int d, int e, int f)
	{
		int x;
		x = (e * d - b * f) / (a * d - b * c);
		return x;
	}
	
	/*
	 * this method returns the value of y in int form
	 * precondition: must have a, b, c, d, e, and f params
	 * postcondition: int y is returned
	 */
	public static int solveForY(int a, int b, int c, int d, int e, int f)
	{
		int y;
		y = (a * f - e * c) / (a * d - b * c);
		return y;
	}
	
}
