package chapter7;

import java.util.Scanner;

/*
 * (Assign grades) Write a program that reads student scores, gets the best score,
 *and then assigns grades based on the following scheme:
 *Grade is A if score is >= best - 10
Grade is B if score is >= best - 20;
Grade is C if score is >= best - 30;
Grade is D if score is >= best - 40;
Grade is F otherwise.
The program prompts the user to enter the total number of students, then prompts
the user to enter all of the scores, and concludes by displaying the grades. Here
is a sample run:
 */
public class Exercise7_1
{
	public static void main(String[] args)
	{
		//declare and initialize variables
		int numOfStudents = 0;
		int best = 0;
		Scanner input = new Scanner(System.in);
		
		
		//prompt user to enter the total number of students
		System.out.println("Enter the total number of students");
		numOfStudents = input.nextInt();
		
		//create array object for grades
		int[] grades = new int[numOfStudents];
		
		//prompt user to enter all scores
		System.out.println("Enter all scores");
		
		//place grades into grades array
		for(int i = 0; i < grades.length; i++)
		{
			grades[i] = input.nextInt();
		}
		
		//find best
		best = findBest(grades);
		
		//assign letter grade and display grades
		for(int i = 0; i < grades.length; i++)
		{
			System.out.println("Student " + i + "'s score is " + grades[i] + 
					" and their grade is " + assignLetter(best, grades[i]));
		}
		
		//display grades
	}
	
	public static int findBest(int[] grades)
	{
		int best = 0;
		
		//find best
		for (int i = 0; i < grades.length; i++)
		{
			if (grades[i] > best)
			{
				best = grades[i];
			}
		}
		
		return best;
	}
	
	public static char assignLetter(int best, int grade)
	{
		char letterGrade = ' ';
		
		//A
		if (grade >= best - 10)
		{
			letterGrade = 'A';
		}
		//B
		else if (grade >= best - 20)
		{
			letterGrade = 'B';
		}
		//C
		else if (grade >= best - 30)
		{
			letterGrade = 'C';
		}
		//D
		else if (grade >= best - 40)
		{
			letterGrade = 'D';
		}
		//E
		else
		{
			letterGrade = 'F';
		}
		
		return letterGrade;
	}
}