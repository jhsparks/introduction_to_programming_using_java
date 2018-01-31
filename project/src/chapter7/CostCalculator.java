package chapter7;

import java.util.Scanner;

/*
 * This class represents the instance of an object that
 * prints the total cost, number of sale items, and number
 * of luxury items entered. 
 * @author Joe sparks
 */

public class CostCalculator
{
	/*
	 * This is the main method of the program. 
	 * Precondition: user must enter an integer greater than 0
	 * Postcondition: total cost, number of sale/luxury items is printed
	 * 
	 */
	public static void main(String[] args)
	{
		//declare and initialize variables
		int luxuryCount = 0;
		int saleCount = 0;
		int totalCost = 0;
		Scanner input = new Scanner(System.in);
		boolean loop = true;
		
		//prompt user
		System.out.println("enter the price of each item. When finished, enter 0");
		
		for(;;)
		{//loop ends when user enters 0
			int itemCost = input.nextInt();
			if(itemCost % 10 == 0 && itemCost > 500)
			{
				//sale and luxury
				System.out.println("luxury item on sale");
				luxuryCount++;
				saleCount++;
				totalCost = totalCost + itemCost;
			}
			else if(itemCost % 10 == 0 && itemCost != 0)
			{
				//sale item
				System.out.println("sale item");
				saleCount++;
				totalCost = totalCost + itemCost;
			}
			else if(itemCost > 500)
			{
				//luxury item
				System.out.println("Luxury item");
				luxuryCount++;
				totalCost = totalCost + itemCost;
			}
			else if(itemCost > 0)
			{
				//regular item
				totalCost = totalCost + itemCost;
			}
			else if(itemCost == 0)
			{
				break;
			}
			else
			{
				System.out.println("invalid input. goodbye");
				System.exit(1);
			}
		}
		
		System.out.println("Total Cost: $" + totalCost);
		System.out.println("Number of Sale items: " + saleCount);
		System.out.println("Number of Luxury items: " + luxuryCount);
		
		input.close();
	}
}