package chapter3;

import java.util.Random;

/*
 * This program simulates the picking of a random card
 * from a 52 card deck
 */
public class Exercise3_24
{
	/*
	 * precondition: none
	 * Postcodition: a random card is displayed
	 */
	public static void main(String[] args)
	{
		
		//pick rank
		int rank = (int)(1 + Math.random() * 13);
		
		//pick suit
		int suit = (int)(1 + Math.random() * 4);
		
		//display the picked card
		String rankStr = "";
		String suitStr = "";
		
		switch(rank)
		{
		case 1:
		{
			rankStr = "ace";
			break;
		}
		case 11:
		{
			rankStr = "jack";
			break;
		}
		case 12:
		{
			rankStr = "queen";
			break;
		}
		case 13:
		{
			rankStr = "king";
			break;
		}
		default:
		{
			rankStr = String.valueOf(rank);
		}
		}
		
		switch(suit)
		{
		case 1:
		{
			suitStr = "clubs";
			break;
		}
		case 2:
		{
			suitStr = "hearts";
			break;
		}
		case 3:
		{
			suitStr = "spades";
			break;
		}
		case 4:
		{
			suitStr = "diamonds";
			break;
		}
		}
		
		//testlin
		System.out.println("You pick a " + rankStr + " of " + suitStr);
		
		
	}
}