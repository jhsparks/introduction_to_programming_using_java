package chapter3;

import java.util.Random;

/*
 * This class contains the main method for a program
 * that displays a random month name
 * @author: joe sparks
 */
public class Exercise3_4 
{	
	/*
	 * This method generates a random int between 1
	 * and 12. Then is displays the corresponding month name
	 * precondition: none
	 * postcondition: a month is displayed
	 */
	public static void main(String[] args)
	{
		//generate random number between 1 and 12
		int randomNum = 1 + (int)(Math.random() * 11);
		String monthName = "";
		
		//determine month name from number
		switch(randomNum)
		{
		case 1: 
		{
			monthName = "January";
			break;
		}
		case 2: 
		{
			monthName = "Feb";
			break;
		}
		case 3: 
		{
			monthName = "Mar";
			break;
		}
		case 4: 
		{
			monthName = "Apr";
			break;
		}
		case 5: 
		{
			monthName = "May";
			break;
		}
		case 6: 
		{
			monthName = "Jun";
			break;
		}
		case 7: 
		{
			monthName = "jul";
			break;
		}
		case 8: 
		{
			monthName = "aug";
			break;
		}
		case 9: 
		{
			monthName = "sep";
			break;
		}
		case 10: 
		{
			monthName = "oct";
			break;
		}
		case 11: 
		{
			monthName = "nov";
			break;
		}
		case 12: 
		{
			monthName = "dec";
			break;
		}
		default: 
		{
			System.out.println("Invalid month");
			System.exit(1);
		}
		}
		
		//display month name and number
		System.out.println("The random number is " + randomNum + "\n" + monthName);
	}
}
